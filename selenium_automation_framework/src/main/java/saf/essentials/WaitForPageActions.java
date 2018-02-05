package saf.essentials;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import saf.util.CustomizedTimeOuts;

/******************************************************************************
 ******************************************************************************
 * This class contains all Time and wait related actions
 * Which waits for certains condition to occur
 * 
 * @author Panchdev Chauhan
 ******************************************************************************
 ******************************************************************************/
public abstract class WaitForPageActions extends PageJavaScriptAndAjaxActions {

	/**
	 * Constructor
	 * 
	 * @param pageDriver
	 */
	public WaitForPageActions(WebDriver pageDriver) {
		super(pageDriver);
	
	}

	/********************************************************
	 ********************************************************
	 * WaitForWebdriverPageMethods
	 ******************************************************** 
	 ********************************************************/
	
	/**
	 * Waits for given text to be displayed on current page
	 *
	 * @param by
	 * @param text
	 */
	public final void waitForText(By by, String text) {
		List<WebElement> _elements = pageDriver.findElements(by);
		if (_elements == null) {
			// throw new Error("Element not found > " + by);
		} else {
			for (WebElement _ele : _elements) {
				if (_ele.getText().equals(text)) {
					return;
				}
			}
			// new Error("Expected element > " + by + " having text [" + text + "] not found
			// on page!");
		}
	}
	
	/**
	 * Waits for given text to be displayed on current page
	 *
	 * @param _eleElement
	 * @param text
	 */
	public final void waitForElementDisplayed(WebElement _eleElement, String text) {
		if (_eleElement.isDisplayed()) {
			if (_eleElement.getText().equals(text)) {
			} else {
				// throw new Error("Element with text["+text+"] not found.");
			}
		} else {
			// throw new Error("Element not displayed.");
		}
	}
	
	
	/**
	 * Wait for element to be displayed/loaded on current page
	 *
	 * @param by
	 *
	 * @return boolean
	 */
	public final boolean waitForElementDisplayed(By by) {
		for (int sec = 1; sec <= WAIT_FOR_TIME_0; sec++) {
			try {
				if (pageDriver.findElement(by).isDisplayed()) {
					CustomizedTimeOuts.pauseMilis(__500);
					return true;
				}
			} catch (Exception e) {
			}
			// pause(1);
			//CustomizedTimeOuts.pauseMilis(__500);
		}
		// analyzeBrowserLogs();
		return false;
	}
	
	/**
	 * Waits given number of seconds for by locator element untill it displayed and returns true if elment displayed
	 * If given by locator does not display, returns false
	 * 
	 * @param by
	 * @param seconds
	 * @return
	 */
	public final boolean waitForElementDisplayed(By by, int seconds) {
		for (int sec = 1; sec <= seconds; sec++) {
			if (ENABLE_DEBUG_MESSAGES) {
				System.out.println(">>>>>>>WAIT FOR ELEMENT[" + by + "] DISPLAYED:" + sec + " seconds");
			}
			try {
				if (pageDriver.findElement(by).isDisplayed()) {
					CustomizedTimeOuts.pauseMilis(LARGE);
					return true;
				}
			} catch (Exception e) {
			}
			// pause(1);
			// pauseMilis(__500);
		}
		// analyzeBrowserLogs();
		return false;
	}
	
	
	/**
	 * Wait for element to be disappear on current page
	 *
	 * @param by
	 *
	 * @return boolean
	 */
	public final boolean waitForElementToDisappear(By by) {
		for (int sec = 1; sec <= WAIT_FOR_TIME_1; sec++) {
			try {
				if (pageDriver.findElement(by).isDisplayed()) {
					// --pause(1);
					CustomizedTimeOuts.pauseMilis(100);
					continue;
				}
			} catch (NoSuchElementException nse) {
				CustomizedTimeOuts.pauseMilis(200);
				return true;
			} catch (StaleElementReferenceException sere) {
				// Still try to check for element
			}
		}
		// analyzeBrowserLogs();
		return false;
	}

	/**
	 * Wait for element to be displayed/loaded on current page
	 *
	 * @param element
	 * @param by
	 *
	 * @return boolean
	 */
	public final boolean waitForElementDisplayed(WebElement element, By by) {
		for (int sec = 1; sec <= WAIT_FOR_TIME_0; sec++) {
			try {
				boolean status = element.findElement(by).isDisplayed();
				if (status) {
					return true;
				}
			} catch (Exception e) {
			}
			CustomizedTimeOuts.pause(1);
		}
		// analyzeBrowserLogs();
		return false;
	}

	
}
