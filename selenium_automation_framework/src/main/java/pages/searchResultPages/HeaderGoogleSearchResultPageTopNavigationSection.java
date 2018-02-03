package pages.searchResultPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import saf.essentials.Page;

@Deprecated
public class HeaderGoogleSearchResultPageTopNavigationSection extends Page {

	public HeaderGoogleSearchResultPageTopNavigationSection(WebDriver pageDriver) {
		super(pageDriver);

	}

	// Elements on Google Search Result Page [Top Navigation Section]

	/**
	 * Search text field
	 */
	By txtSearch = By.name("q");

	/**
	 * "Google Search" button
	 */
	By btnGoogleSearch = By.name("btnG");
	
	By lnkAll = By.xpath("//div[@id='top_nav']");

	// Actions on Google Search Result Page [Top Navigation Section]
	/**
	 * Type given sSearchText in txtSearch field
	 * 
	 * @param sSearchText
	 */
	public void aTypeSearchText(String sSearchText) {
		type(txtSearch, sSearchText);
	}

	public void aClickGoogleSearchButton() {
		click(btnGoogleSearch);
	}
	
	
}
