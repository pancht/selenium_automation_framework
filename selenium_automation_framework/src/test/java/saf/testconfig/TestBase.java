package saf.testconfig;

import pages.google.Page_GoogleHomePage;
import pages.google.search_result_pages.Page_GoogleSearchResult;

/**
 TestBase class is going to be Superclass for all test-case classes
 * 
 * This class is added for just simplicity in SAF.
 * 
 * Note:
 * 1. TestBase class contains all project wide page declarations
 *  
 * @author Panchdev Chauhan
 *
 */
public class TestBase extends TestNG_SAF {

	// Declare All Project Pages here
		
	protected Page_GoogleHomePage page_GoogleHomePage = null;
	
	protected Page_GoogleSearchResult page_GoogleSearchResult = null;
}
