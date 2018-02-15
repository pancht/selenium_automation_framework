package pages.google;

import org.openqa.selenium.By;

import pages.google.search_result_pages.Page_GoogleSearchResult;

/**
 * This interface defines page elements and element actions on GoogleHomePage
 * 
 * @author Panchdev Chauhan
 *
 */
public interface IPage_GoogleHome {

	/**
	 * Page Elements Declarations
	 */
	
	/**
	 * Search Text box
	 */
	By txtSearchField = By.name("q");
	
	/**
	 * Search Button
	 */
	By btnSearchButton = By.name("btnK");
	
	/**
	 * All Page Actions related to Page Elemenents
	 */
	
	/**
	 * Type Given Text in sSearchText in Search Text field
	 * 
	 * @param sSearchText
	 */
	public void typeSearchText(String sSearchText);
	
	/**
	 * Click button Search 
	 * 
	 * @return Page_Object for Google Search Result Page
	 */
	public Page_GoogleSearchResult clickButton_Search();
}
