package saf.essentials;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;

/****************************************************************************************
 ****************************************************************************************
 * This class contains all advance Javascript based actions
 * Which required to executed javascript snippets
 *  
 * @author Panchdev Chauhan
 ****************************************************************************************
 ****************************************************************************************/
public abstract class PageJavaScriptAndAjaxActions extends ConfigurationAndReporting {

	/**
	 * Construtor
	 * 
	 * @param pageDriver
	 */
	public PageJavaScriptAndAjaxActions(WebDriver pageDriver) {
		super(pageDriver);
		
	}

	/********************************************************
	 ********************************************************
	 * HandleJavaScriptAndAjax
	 ******************************************************** 
	 ********************************************************/
	
	/**
	 * Waits until there is no Ajax calls in progress
	 *
	 * @param expectedAjaxCount
	 */
	public final void waitForAjax(int expectedAjaxCount) {
		JavascriptExecutor js = (JavascriptExecutor) pageDriver;
		for (int seconds = 1; seconds <= WAIT_FOR_TIME_1; seconds++) {
			try {
				int actualAjaxCount = new Integer(js.executeScript("return jQuery.active").toString()).intValue();
				if (ENABLE_DEBUG_MESSAGES) {
					System.out.println(
							"AJAX COUNT: [ACTUAL:" + actualAjaxCount + "]<>[EXPECTED:" + expectedAjaxCount + "]");
				}
				if (actualAjaxCount == expectedAjaxCount) {
					// pause(1);
					//CustomizedTimeOuts.pauseMilis(100);
					break;
				}
			} catch (Exception e) {
				//CustomizedTimeOuts.pause(1);
			}
		}
	}
	
	
	/**
	 * Waits until page loads completely in browser
	 */
	public final void waitForPageToLoad() {
		JavascriptExecutor js = (JavascriptExecutor) pageDriver;
		for (int seconds = 1; seconds <= WAIT_FOR_TIME_3; seconds++) {
			try {
				if (js.executeScript("return document.readyState").equals("complete")) {
					break;
				}
			} catch (Exception e) {
			}
			// pause(1);
		}
		//CustomizedTimeOuts.pause(5);
	}
	
	
	/**
	 * Executes given script on page
	 * 
	 * @param sScript
	 */
	public final void highlightElement(WebDriver webDriver, WebElement element) {
		
			try {
				JavascriptExecutor js = (JavascriptExecutor) webDriver;
				
				js.executeScript("arguments[0].style.border='3px solid red'", element );
			} catch (Exception e) {
				
				Reporter.log(e.toString());
			}
			
			
			/* WebElement elem = driver.findElement(by);
			    // draw a border around the found element
			    if (driver instanceof JavascriptExecutor) {
			        ((JavascriptExecutor)driver).executeScript("arguments[0].style.border='3px solid red'", elem);
			    }
		*/
	}
	
}
