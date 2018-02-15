package saf.essentials;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;

import saf.util.CustomizedTimeOuts;

/**
 * 
 * @author Panchdev Chauhan
 *
 */
public abstract class PageActions extends WaitForPageActions{

	/**
	 * Constructor
	 * 
	 * @param pageDriver
	 */
	public PageActions(WebDriver pageDriver) {
		super(pageDriver);
	}

	/********************************************************
	 ********************************************************
	 * CommonPageMethods
	 ******************************************************** 
	 ********************************************************/
	
	/**
	 * Open given URL
	 *
	 * @param url
	 */
	public final void openUrl(String url) {
		Reporter.log("Open url[" + url + "]");
		pageDriver.get(url);
	}

	/**
	 * Return web-driver reference to current visible page
	 *
	 * @return webDriver
	 */
	public final WebDriver getWebDriver() {
		return pageDriver;
	}

	/**
	 * Returns current webdriver ( Page )
	 * 
	 * @return
	 */
	public final WebDriver getPage() {
		return getWebDriver();
	}
	
	/**
	 * Returns current-visible-page title
	 *
	 * @return pageTitle
	 */
	public final String getTitle() {
		return pageDriver.getTitle();
	}


	/**
	 * Returns text inside given By locator
	 * 
	 * @param by
	 * @return
	 */
	public String getText(By by) {
			return getText(findElement(by));
	}
	
	
	/**
	 * 
	 * Returns text inside given By locator
	 * 
	 * 
	 * @param element
	 * @return
	 */
	public String getText(WebElement element) {
		return element.getText();
	}
	
	
	/**
	 * Types in given text in text field
	 * 
	 * @param by
	 *            locator of text field
	 * @param text
	 *            Text to be entered
	 */
	public final void type(By by, String text) {
		/*
		 Driver.executeScript("document.getElementById('text-4').style.borderColor = 'Red'");
		 */
		try {
			WebElement element = getWebDriver().findElement(by);
			type(element, text);
						
		} catch (Exception e) {
			if (ENABLE_DEBUG_MESSAGES) {
				log("EXCEPTION: " + e.getMessage(), METHOD);
			}
		}
	}

	/**
	 * Type in Given Text in Given PageElement
	 * 
	 * @param element Given PageElement
	 * @param Given Text
	 */
	public final void type(WebElement element, String text) {
		try {
			//highlightElement(getWebDriver(), element);
			element.sendKeys(text);
		} catch (Exception e) {
			if (ENABLE_DEBUG_MESSAGES) {
				log("EXCEPTION: " + e.getMessage(), METHOD);
			}
		}
	}

	
	
	/**
	 * Clicks on given [by] element
	 *
	 * @param by
	 */
	public final void click(By by) {
		WebElement element = null;
		try {
			element = pageDriver.findElement(by);
			
		} catch (Exception e) {
			if (ENABLE_DEBUG_MESSAGES) {
				System.out.println("Element not found:" + by);
			}
			return;
		}
		click(element);
	}

	/**
	 * Clicks on given [element] element
	 *
	 * @param element
	 */
	public final void click(WebElement element) {
			try {
				//highlightElement(getWebDriver(), element);
				element.click();
				return;
			} catch (Exception e) {
				if (ENABLE_DEBUG_MESSAGES) {
					System.out.println("Element not found:" + element);
				}
			}
		
	}
	
	
	/**
	 * Returns page-element from given [by] element found on page else returns null
	 *
	 * @param by
	 *
	 * @return WebElement
	 */
	public final WebElement element(By by) {
		try {
			return pageDriver.findElement(by);
		} catch (NoSuchElementException nse) {
			return null;
		}
	}
	
	
	
	/**
	 * Return true if given element is displayed else returns false
	 *
	 * @param element
	 *
	 * @return boolean
	 */
	public boolean isDisplayed(WebElement element) {
		try {
			if (element.isDisplayed()) {
				return true;
			} else {
				return false;
			}
		} catch (Exception e) {
			return false;
		}
	}

	/**
	 * Returns true if given element is displayed on page else returns false
	 *
	 * @param by
	 *
	 * @return boolean
	 */
	public boolean isDisplayed(By by) {
		try {
			return isDisplayed(pageDriver.findElement(by));
		} catch (Exception nse) {
			if (ENABLE_DEBUG_MESSAGES) {
				System.out.println("EXCEPTION FROM IS_DISPLAYED:" + nse.getMessage());
			}
			return false;
		}
	}

	
	/**
	 * Selenium wrapper method for findElement Returns expected element
	 *
	 * @param by
	 * @return WebElement
	 */
	public WebElement findElement(By by) {
		try {
			return getWebDriver().findElement(by);
		} catch (NoSuchElementException nse) {
			return null;
		}
	}
	
	
	/**
	 * Selenium wrapper method for findElements Returns list of elements
	 *
	 * @param by
	 *
	 * @return List<WebElement>
	 */
	public List<WebElement> findElements(By by) {
		try {
			return getWebDriver().findElements(by);
		} catch (NoSuchElementException nse) {
			return null;
		}
	}

	
	/**
	 * Refresh current page
	 */
	public void refreshPage() {
		pageDriver.navigate().refresh();
		
		waitForPageToLoad();

		
		return;
	}
	
	/**
	 * Returns true if given by element is present else returns false
	 *
	 * @param by
	 * @return
	 */
	public boolean isElementPresent(By by) {
		try {
			pageDriver.findElement(by);
			return true;
		} catch (NoSuchElementException e) {
			return false;
		}
	}

	/**
	 * This method checks whether PageElement represented by Given By locator is being displayed on Page or Not
	 * 
	 * @param by Given By Locator for PageElement
	 * @return true if displayed else returns false
	 */
	public boolean isElementDisplayed(By by) {
		
			try {
				pageDriver.findElement(by).isDisplayed();
				return true;
			} catch (Exception e) {
				CustomizedTimeOuts.pause(1);
			}
		
		return false;
	}
		
	
	/**
	 * This method checks if PageElement represented by GivenByLocator is selected/checked
	 * 
	 * @param by GivenByLocator For PageElement
	 * 
	 * @return True if PageElement is selected/checked already Else returns false
	 */
	public boolean isChecked(By by) {
		return isChecked(findElement(by));
	}
	
	/**
	 * This method checks if PageElement represented by GivenWebElementLocator is selected/checked
	 * 
	 * @param element GivenWebElementLocator For PageElement
	 * @return True if PageElement is selected/checked already Else returns false
	 */
	public boolean isChecked(WebElement element) {
		return element.isSelected();
	}

	/**
	 * This method checks/selects PageElement represented by GivenByLocator
	 * 
	 * @param by GivenByLocator For PageElement
	 */
	public void checkCheckbox(By by) {
		checkCheckbox(findElement(by));
	}
	
	/**
	 * This method checks/selects PageElement represented by GivenWebElementLocator
	 * 
	 * @param element GivenWebElementLocator For PageElement
	 */
	public void checkCheckbox(WebElement element) {
		element.click();
	}
}
