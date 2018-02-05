package saf.essentials;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

/************************************************************************************
 ************************************************************************************
 * This class contains advance keyboard actions that bot wants to perform on a Page
 *  
 * @author Panchdev Chauhan
 ************************************************************************************
 ************************************************************************************/
public abstract class PageKeyboardActions extends BrowserActions {

	public PageKeyboardActions(WebDriver pageDriver) {
		super(pageDriver);

	}

	
	/********************************************************
	 ********************************************************
	 * HandleKeyboard
	 ******************************************************** 
	 ********************************************************/
	
	/**
	 * Performs Control+C Keyboard action on given by locator
	 * 
	 * @param by
	 */
	public void copy(By by) {
		copy(element(by));
	}

	/**
	 * Performs Control+C Keyboard action on given element locator
	 * 
	 * @param element
	 */
	public void copy(WebElement element) {
		element.sendKeys(Keys.chord(Keys.CONTROL, "c"), "");
	}

	/**
	 * Performs Control+X Keyboard action on given by locator
	 * 
	 * @param by
	 */
	public void cut(By by) {
		cut(element(by));
	}

	/**
	 * Performs Control+X Keyboard action on given element locator
	 * 
	 * @param element
	 */
	public void cut(WebElement element) {
		element.sendKeys(Keys.chord(Keys.CONTROL, "x"), "");
	}

	/**
	 * Performs Control+V Keyboard action on given by locator
	 * 
	 * @param by
	 */
	public void paste(By by) {
		paste(element(by));
	}

	/**
	 * Performs Control+V Keyboard action on given element locator
	 * 
	 * @param element
	 */
	public void paste(WebElement element) {
		element.sendKeys(Keys.chord(Keys.CONTROL, "v"), "");
	}
	
	/**
	 * Performs END Keyboard action 
	 * 
	 */
	public void pressEndKey() {
		Actions action = new Actions(pageDriver);
		action.sendKeys(Keys.END).build().perform();
	}

	/**
	 * Performs Home Keyboard action
	 */
	public void pressHomeKey() {
		Actions action = new Actions(pageDriver);
		action.sendKeys(Keys.HOME).build().perform();
	}
}
