package saf.essentials;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public abstract class KeyboardActions extends BrowserActions {

	public KeyboardActions(WebDriver pageDriver) {
		super(pageDriver);

	}

	
	/********************************************************
	 ********************************************************
	 * HandleKeyboard
	 ******************************************************** 
	 ********************************************************/
	public void copy(By by) {
		copy(element(by));
	}

	public void copy(WebElement element) {
		element.sendKeys(Keys.chord(Keys.CONTROL, "c"), "");
	}

	public void cut(By by) {
		cut(element(by));
	}

	public void cut(WebElement element) {
		element.sendKeys(Keys.chord(Keys.CONTROL, "x"), "");
	}

	public void paste(By by) {
		paste(element(by));
	}

	public void paste(WebElement element) {
		element.sendKeys(Keys.chord(Keys.CONTROL, "v"), "");
	}
	
	public void pressEndKey() {
		Actions action = new Actions(pageDriver);
		action.sendKeys(Keys.END).build().perform();
	}

	public void pressHomeKey() {
		Actions action = new Actions(pageDriver);
		action.sendKeys(Keys.HOME).build().perform();
	}
}
