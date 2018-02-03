package saf.essentials;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.logging.LogEntries;
import org.openqa.selenium.logging.LogEntry;
import org.openqa.selenium.logging.LogType;

public abstract class BrowserActions extends PageActionsAdvanced {

	public BrowserActions(WebDriver pageDriver) {
		super(pageDriver);
	}

	/********************************************************
	 ********************************************************
	 * HandleBrowserMethods
	 ******************************************************** 
	 ********************************************************/
	
	/**
	 * Set browser position to bottom-right-corner
	 */
	public void minimizeBrowser() {
		JavascriptExecutor executor = (JavascriptExecutor) pageDriver;
		int screenWidth = Integer.parseInt(executor.executeScript("return screen.width").toString());
		int screenHeight = Integer.parseInt(executor.executeScript("return screen.height").toString());
		Point bottomRightCorner = new Point(screenWidth, screenHeight);
		pageDriver.manage().window().setPosition(bottomRightCorner);
		//CustomizedTimeOuts.pause(1);
	}

	/**
	 * Reset browser position
	 */
	public void resetBrowserPosition() {
		maximizeBrowser();
		/*
		 * JavascriptExecutor executor= (JavascriptExecutor) page; Point topLeftCorner =
		 * new Point( 0 , 0 ); page.manage().window().setPosition(topLeftCorner);
		 * pause(1);
		 */
	}

	public void maximizeBrowser() {
		pageDriver.manage().window().maximize();
		
	}
	
	
	/**
	 * Analyze browser console logs (warning and error)
	 *
	 * Test will fail if there is any error logs in browser console Else it will
	 * continue
	 */
	public void analyzeBrowserLogs() {

		LogEntries logEntries = getWebDriver().manage().logs().get(LogType.BROWSER);
		int error_counter = 0;
		List<String> logs = new ArrayList<String>();
		for (LogEntry entry : logEntries) {

			/*
			 * if ( entry.getLevel().toString().contains( "WARNING" ) ) {
			 *
			 * //Do not track warning messages anymore //logs.add( getWarningLog(
			 * "WARNING[BROWSER]:" + entry.getMessage() ) );
			 *
			 * } else
			 */if (entry.getLevel().toString().contains("ERROR")) {

				logs.add(getErrorLog("ERROR[BROWSER]:" + entry.getMessage()));
				error_counter++;

			}
			// System.out.println(new Date(entry.getTimestamp()) + " " + entry.getLevel() +
			// " " + entry.getMessage());
		}

		// VisyondLogging.printBrowserLogsCollapsableExpandeble("LOGS[BROWSER]", logs );

		if (error_counter >= 1) {
			checkpoint("THERE ARE (#" + error_counter + ") ERROR(S) IN [BROWSER] CONSOLE");
		}
	}

}
