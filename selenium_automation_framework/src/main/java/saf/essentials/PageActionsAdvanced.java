package saf.essentials;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import saf.util.CustomizedTimeOuts;

public abstract class PageActionsAdvanced extends PageActions {

	public PageActionsAdvanced(WebDriver pageDriver) {
		super(pageDriver);
	}

	
	/********************************************************
	 ********************************************************
	 * AdvancePageMethods
	 ******************************************************** 
	 ********************************************************/
	
	/**
	 * Drags given source element and drops in target element
	 *
	 * @param source
	 * @param target
	 */
	public final void dragAndDrop(By source, By target) {
		dragAndDrop(element(source), element(target));
	}
	
	
	/**
	 * Drags given source element and drops in target element
	 *
	 * @param source
	 * @param target
	 */
	public final void dragAndDrop(WebElement source, WebElement target) {
		for (int trial = 1; trial <= WAIT_FOR_TIME_0; trial++) {
			try {
				Actions action = new Actions(pageDriver);
				action.moveToElement(source).dragAndDrop(source, target).build().perform();
				return;
			} catch (Exception e) {
				//CustomizedTimeOuts.pause(1);
			}
		}
	}
	
	public final void dragAndDropBy(By source, int xOffset, int yOffset) {
		for (int trial = 1; trial <= WAIT_FOR_TIME_0; trial++) {
			try {
				Actions action = new Actions(pageDriver);
				action.moveToElement(element(source)).dragAndDropBy(element(source), xOffset, yOffset).build()
						.perform();
				return;
			} catch (Exception e) {
				//CustomizedTimeOuts.pause(1);
			}
		}
	}
	
	public final void dragAndDropBy(WebElement source, int xOffset, int yOffset) {
		for (int trial = 1; trial <= WAIT_FOR_TIME_0; trial++) {
			try {
				Actions action = new Actions(pageDriver);
				action.moveToElement(source).dragAndDropBy(source, xOffset, yOffset).build().perform();
				return;
			} catch (Exception e) {
				//CustomizedTimeOuts.pause(1);
			}
		}
	}
	
	
	/**
	 * Moves mouse over given [by] element
	 *
	 * @param by
	 */
	public final void mouseOver(By by) {
		waitForElementDisplayed(by);
		WebElement element = pageDriver.findElement(by);
		mouseOver(element);
	}
	
	/**
	 * Moves mouse over given [element] element
	 *
	 * @param element
	 */
	public final void mouseOver(WebElement element) {
		for (int trial = 1; trial <= WAIT_FOR_TIME_0; trial++) {
			try {
				Actions action = new Actions(pageDriver);
				action.moveToElement(element).build().perform();
				CustomizedTimeOuts.pauseMilis(100);
				return;
			} catch (Exception e) {
				CustomizedTimeOuts.pause(1);
			}
		}
	}
	
	
	/**
	 * Double-click on given [by] element
	 *
	 * @param by
	 */
	public final void doubleClick(By by) {
		WebElement element = pageDriver.findElement(by);
		doubleClick(element);
	}

	/**
	 * Double-click on given [element] element
	 *
	 * @param element
	 */
	public final void doubleClick(WebElement element) {
		for (int trial = 1; trial <= WAIT_FOR_TIME_0; trial++) {
			try {
				CustomizedTimeOuts.pause(2);
				Actions action = new Actions(pageDriver);
				action.moveToElement(element).doubleClick().build().perform();
				CustomizedTimeOuts.pause(1);
				return;
			} catch (Exception e) {
				CustomizedTimeOuts.pause(1);
			}
		}
	}

	public final void doubleClickQuickest(WebElement element) {
		Actions action = new Actions(pageDriver);
		action.moveToElement(element).doubleClick().build().perform();
	}
		
	
	/**
	 * Switch to window with given name
	 */
	public void switchToWindow(String windowName) {
		getWebDriver().switchTo().window(windowName);
	}

	/**
	 * switch to this window
	 */
	public void switchToWindow() {
		pageDriver.switchTo().window(pageDriver.getWindowHandle().toString());
	}
	
	/**
	 * Returns true if Alert is being displayed Else returns false
	 *
	 * @return
	 */
	public boolean isAlertWindowPopUps() {
		CustomizedTimeOuts.pauseMilis(500);
		String alert = pageDriver.switchTo().alert().getText();
		if (alert.length() > 5) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * Returns true if alert is present else returns false
	 *
	 * @return
	 */
	public boolean isAlertPresent() {
		CustomizedTimeOuts.pauseMilis(500);
		try {
			pageDriver.switchTo().alert();
			return true;
		} catch (NoAlertPresentException nep) {
			return false;
		}
	}

	/**
	 * Get alert text
	 *
	 * @return
	 */
	public String getAlertText() {
		CustomizedTimeOuts.pauseMilis(1000);
		return pageDriver.switchTo().alert().getText();
	}

	/**
	 * Accepts alert.
	 */
	public void acceptAlert() {
		CustomizedTimeOuts.pause(1);
		pageDriver.switchTo().alert().accept();
	}

	/**
	 * Dismiss alert
	 */
	public void dismissAlert() {
		CustomizedTimeOuts.pause(1);
		pageDriver.switchTo().alert().dismiss();
	}
	
	
	/**
	 * Selects a given option from the-list-of-available-options
	 *
	 * @param element
	 * @param optionText
	 */
	public void select(WebElement element, String optionText) {
		Select select = new Select(element);
		List<WebElement> list = select.getOptions();
		for (WebElement option : list) {
			// System.out.println(option.getText());
			String fullText = option.getText();
			if (fullText.equals(optionText)) {
				select.selectByVisibleText(fullText);
			}
		}
	}

	public String getFirstSelectedOption(By by) {
		return getFirstSelectedOption(element(by));
	}

	public String getFirstSelectedOption(WebElement element) {
		Select select = new Select(element);
		return select.getFirstSelectedOption().getText();
	}

	public List<WebElement> getAllSelectedOptions(By by) {
		return getAllSelectedOptions(element(by));
	}

	public List<WebElement> getAllSelectedOptions(WebElement element) {
		Select select = new Select(element);
		return select.getAllSelectedOptions();
	}

	/**
	 * Selects a given option from the-list-of-available-options
	 *
	 * @param element
	 * @param optionText
	 */
	public void selectLazy(WebElement element, String optionText) {
		Select select = new Select(element);
		List<WebElement> list = select.getOptions();
		for (WebElement option : list) {
			// System.out.println(option.getText());
			String fullText = option.getText();
			if (fullText.contains(optionText)) {
				select.selectByVisibleText(fullText);
			}
		}
	}
	
	
	/**
	 * Selects a given option from the-list-of-available-options
	 *
	 * @param by
	 * @param optionText
	 */
	public void select(By by, String optionText) {
		Select select = new Select(pageDriver.findElement(by));
		List<WebElement> list = select.getOptions();
		for (WebElement option : list) {
			// System.out.println(option.getText());
			String fullText = option.getText();
			if (fullText.equals(optionText)) {
				select.selectByVisibleText(fullText);
			}
		}
	}

	/**
	 * Selects a given option from the-list-of-available-options by lazy comparison
	 *
	 * @param by
	 * @param optionText
	 */
	public void selectLazy(By by, String optionText) {
		Select select = new Select(pageDriver.findElement(by));
		List<WebElement> list = select.getOptions();
		for (WebElement option : list) {
			// System.out.println(option.getText());
			String fullText = option.getText();
			if (fullText.contains(optionText)) {
				select.selectByVisibleText(fullText);
			}
		}
	}
	

	public void selectRadioOption(By by,String sValue) {
		List<WebElement>  oRadioButton = pageDriver.findElements(by);
		
		selectRadioOption(oRadioButton, sValue);
	}
	
	
	public void selectRadioOption(List<WebElement> oRadioOptions, String sValue) {
		for (WebElement option : oRadioOptions) {
			if ( option.getAttribute("value").trim().equals(sValue) ) {
				if(option.isSelected()) {
					// do nothing
				} else {
					//Select this radio option
					option.click();
				}
			}
		}
		
	}
	
	
}
