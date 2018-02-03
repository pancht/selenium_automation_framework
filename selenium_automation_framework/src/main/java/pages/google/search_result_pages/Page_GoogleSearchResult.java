package pages.google.search_result_pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Page_GoogleSearchResult extends FooterGoogleSearchResultPageFooterNavigationSection implements IPage_SearchResultPageBody{

	public Page_GoogleSearchResult(WebDriver pageDriver) {
		super(pageDriver);
		
		waitForElementDisplayed(citeResult_actual_real_link);
	}

	@Override
	public List<WebElement> get_SearchResults() {
		
		return findElements(listSearchResultList);
	}

	@Override
	public void clickLinkSearchResult(WebElement we_search_result) {
		we_search_result.click();
		
	}

	@Override
	public String getTextLink(WebElement we_search_result) {

		return we_search_result.findElement(citeResult_actual_real_link).getText();
	}
	
	
}
