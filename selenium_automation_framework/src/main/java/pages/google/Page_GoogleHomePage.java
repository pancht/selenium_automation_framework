package pages.google;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import pages.google.search_result_pages.Page_GoogleSearchResult;
import saf.essentials.Page;

public class Page_GoogleHomePage extends Page implements IPage_GoogleHome{

	public Page_GoogleHomePage(WebDriver pageDriver) {
		super(pageDriver);
	}

	@Override
	public void typeSearchText(String sSearchText) {
		type(txtSearchField, sSearchText);
		
	}

	@Override
	public Page_GoogleSearchResult clickButton_Search() {
		click(btnSearchButton);
		
		return new Page_GoogleSearchResult(pageDriver);
	}
	
	
	
	

}
