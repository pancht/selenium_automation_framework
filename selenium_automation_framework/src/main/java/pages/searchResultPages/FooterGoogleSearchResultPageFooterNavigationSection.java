package pages.searchResultPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

@Deprecated
public class FooterGoogleSearchResultPageFooterNavigationSection
		extends HeaderGoogleSearchResultPageTopNavigationSection {

	public FooterGoogleSearchResultPageFooterNavigationSection(WebDriver pageDriver) {
		super(pageDriver);
	}

	// Elements on Google Search Result Page [Footer Navigation Section]
	By secFooterNavigation= By.id("navcnt");
	
	By lnkPrevious = By.id("pnprev");
	
	// Actions on Google Search Result Page [Footer Navigation Section]
	
}
