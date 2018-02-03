package saf.autotests.google;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import pages.google.Page_GoogleHomePage;
import saf.testconfig.TestBase;

public class GoogleTestSuite extends TestBase{

	@Test
	public void test_UpworkProfileLinkForFreelancerPanchdevChauhan() {
		
		// create page_object for Google Home Page
		page_GoogleHomePage = new Page_GoogleHomePage(pageDriver);
		
		//Launch Google Page URL
		page_GoogleHomePage.openUrl("https://www.google.com");
		
		//Search for "Panchdev Chauhan Upwork"
		String sSearchText = "Panchdev Chauhan Upwork";
		page_GoogleHomePage.typeSearchText(sSearchText);
		
		//Click [SearchButton] to search for
		page_GoogleSearchResult = page_GoogleHomePage.clickButton_Search();
		
		//Check if first search result is "Panchdev Chauhan" or not
		//Get link of first search result
		WebElement we_first_search_result = page_GoogleSearchResult.get_SearchResults().get(0);
		
		String link_of_first_search_resutl = page_GoogleSearchResult.getTextLink(we_first_search_result);
		
		Reporter.log("Validate that Panchdev Chauhan's Upwork profile link is \"https://www.upwork.com/fl/erpanchdev\"");
		Assert.assertEquals(link_of_first_search_resutl, "https://www.upwork.com/fl/erpanchdev");
		
	}
	
	
	@Test
	public void test_Framework_Screenshot_Capture_Functionality() {
		
		// create page_object for Google Home Page
		page_GoogleHomePage = new Page_GoogleHomePage(pageDriver);
		
		//Launch Google Page URL
		page_GoogleHomePage.openUrl("https://www.google.com");
		
		//Search for "Panchdev Chauhan Upwork"
		String sSearchText = "Panchdev Chauhan Upwork";
		page_GoogleHomePage.typeSearchText(sSearchText);
		
		//Click [SearchButton] to search for
		page_GoogleSearchResult = page_GoogleHomePage.clickButton_Search();
		
		//Check if first search result is "Panchdev Chauhan" or not
		//Get link of first search result
		WebElement we_first_search_result = page_GoogleSearchResult.get_SearchResults().get(0);
		
		String link_of_first_search_resutl = page_GoogleSearchResult.getTextLink(we_first_search_result);
		
		Reporter.log("Validate that Panchdev Chauhan's Upwork profile link is \"https://www.upwork.com/fl/erpanchdev\"");
		Assert.assertEquals(link_of_first_search_resutl, "https://www.upwork.com/fl/erpanchdev");
		
		//Intentially fail test
		Assert.assertEquals(true, false);
	}
}
