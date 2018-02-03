package saf.essentials.eventHandlers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.WebDriverEventListener;
import org.testng.Reporter;


/**
 * 
 * HowToUse: First create an EventFiringWebDriver(webDriver), 
 *           Then, Create an EventHandler() instance
 *           Then, register eventHandler to eventFiringWebDriver 
 * 
 * // Method1: Use System property for gecko driver
 *    System.setProperty("webdriver.gecko.driver", "C:\\testing\\geckodriver.exe");
      FirefoxDriver driver = new FirefoxDriver();
      EventFiringWebDriver eventDriver = new EventFiringWebDriver(driver);

      EventHandler handler = new EventHandler();
      eventDriver.register(handler);
      eventDriver.get("http://toolsqa.wpengine.com/automation-practice-switch-windows/");
		
 * @author Panchdev Chauhan
 *
 */
public class EventHandler implements WebDriverEventListener{

	/*
	 Driver.executeScript("document.getElementById('text-4').style.borderColor = 'Red'");
	 */
	public void beforeAlertAccept(WebDriver arg0) {
		// TODO Auto-generated method stub
		System.out.println("Just before alert accept element " + arg0.toString());
	}

	public void afterAlertAccept(WebDriver arg0) {
		// TODO Auto-generated method stub
		System.out.println("Just after alert accept element " + arg0.toString());
	}

	public void afterAlertDismiss(WebDriver arg0) {
		// TODO Auto-generated method stub
		System.out.println("Just after alert dismiss element " + arg0.toString());
	}


	public void beforeAlertDismiss(WebDriver arg0) {
		// TODO Auto-generated method stub
		System.out.println("Just before alert dismiss element " + arg0.toString());
	}

	public void beforeNavigateTo(String arg0, WebDriver arg1) {
		// TODO Auto-generated method stub
		System.out.println("Just before beforeNavigateTo " + arg0);
	}

	public void afterNavigateTo(String arg0, WebDriver arg1) {
		// TODO Auto-generated method stub
		System.out.println("Inside the afterNavigateTo to " + arg0);
	}

	public void beforeNavigateBack(WebDriver arg0) {
		// TODO Auto-generated method stub
		System.out.println("Just before beforeNavigateBack " + arg0.getCurrentUrl());

	}

	public void afterNavigateBack(WebDriver arg0) {
		// TODO Auto-generated method stub

		System.out.println("Inside the after navigateback to " + arg0.getCurrentUrl());
	}

	public void beforeNavigateForward(WebDriver arg0) {
		// TODO Auto-generated method stub
		System.out.println("Just before beforeNavigateForward " + arg0.getCurrentUrl());

	}

	public void afterNavigateForward(WebDriver arg0) {
		// TODO Auto-generated method stub
		System.out.println("Inside the afterNavigateForward to " + arg0.getCurrentUrl());
	}

	public void beforeNavigateRefresh(WebDriver arg0) {
		// TODO Auto-generated method stub
		System.out.println("Before navigate refresh");
	}
	
	
	public void afterNavigateRefresh(WebDriver arg0) {
		// TODO Auto-generated method stub
		System.out.println("Just after navigate refresh element " + arg0.toString());
	}

	public void beforeFindBy(By arg0, WebElement arg1, WebDriver arg2) {
		// TODO Auto-generated method stub
		System.out.println("Just before finding element [" + arg1.toString() + "] which By is [" + arg0.toString() + "]"
				+ "and webdriver is [" + arg2.toString() + "]");
		
		/*Reporter.log("Just before finding element [" + arg1.toString() + "] which By is [" + arg0.toString() + "]"
				+ "and webdriver is [" + arg2.toString() + "]");*/
		
	}

	public void afterFindBy(By arg0, WebElement arg1, WebDriver arg2) {
		// TODO Auto-generated method stub
		//System.out.println("Find happened on " + arg1.toString() + " Using method " + arg0.toString());
	}

	public void beforeClickOn(WebElement arg0, WebDriver arg1) {
		// TODO Auto-generated method stub
		System.out.println("About to click on the " + arg0.toString());

	}

	public void afterClickOn(WebElement arg0, WebDriver arg1) {
		// TODO Auto-generated method stub
		System.out.println("inside method afterClickOn on " + arg0.toString());
	}

	
	public void beforeChangeValueOf(WebElement arg0, WebDriver arg1) {
		// TODO Auto-generated method stub

		System.out.println("Inside the beforeChangeValueOf method");
	}

	public void afterChangeValueOf(WebElement arg0, WebDriver arg1, CharSequence[] arg2) {
		// TODO Auto-generated method stub
		System.out.println("Just after change value of element " + arg1.toString()+ "to " + arg2.toString() );
	}

	public void beforeScript(String arg0, WebDriver arg1) {
		// TODO Auto-generated method stub
		System.out.println("Just before beforeScript " + arg0);
	}

	public void afterScript(String script, WebDriver driver) {
		// TODO Auto-generated method stub
		System.out.println("Just afterScript()" );
	}

	public void onException(Throwable arg0, WebDriver arg1) {
		// TODO Auto-generated method stub
		System.out.println("Exception occured at " + arg0.getMessage());

	}

	public void beforeChangeValueOf(WebElement arg0, WebDriver arg1, CharSequence[] arg2) {
		// TODO Auto-generated method stub
		System.out.println("Just before change value of element " + arg1.toString() + " to " + arg2.toString() );
	}

	

}