package pages.google;

import org.openqa.selenium.WebDriver;

import pages.google.search_result_pages.Page_GoogleSearchResult;
import saf.essentials.Page;

/**
 * This class represent PageObject For GoogleHomePage
 * It implements IPage_GoogleHome interface 
 * 
 * @author Panchdev Chauhan
 *
 */
public class Page_GoogleHomePage extends Page implements IPage_GoogleHome{

	/**
	 * Constructor 
	 * 
	 * @param pageDriver
	 */
	public Page_GoogleHomePage(WebDriver pageDriver) {
		super(pageDriver);
	}

	@Override
	public void typeSearchText(String sSearchText) {
		type(txtSearchField, sSearchText);
	}

	@Override
	public Page_GoogleSearchResult clickButton_Search() {
		
		waitForElementDisplayed(btnSearchButton);
		findElement(btnSearchButton).click();
		
		return new Page_GoogleSearchResult(pageDriver);
	}
	
	
	
	

}
