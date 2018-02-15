package saf.essentials;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.pagefactory.ElementLocatorFactory;

/**
 * This class is very important in Selenium Automation Framework [ SAF ]
 * Every PageObject will be direct or indirect decendent of this class.
 * Means every PageObject will extend this class.
 *  
 * @author Panchdev Chauhan
 *
 */
public class Page  extends ConfigurationProjectSpecific{

	/**
	 * Constructor 
	 * 
	 * @param pageDriver
	 */
	public Page(WebDriver pageDriver) {
		super(pageDriver);
		
		ElementLocatorFactory finder = new AjaxElementLocatorFactory(pageDriver, PAGE_WAIT);

		PageFactory.initElements(finder, this);
		
		waitForPageToLoad();
		
	}

		
	//Define all Product/Website-wide pages declaration here
	
	
	@Override
	public Object goBack() {
		
		return null;
	}

	@Override
	public Object goBack(String pageName) {
		
		return null;
	}

	@Override
	public String getPageTitle() {
		
		return null;
	}

	@Override
	public void verifyPageUI() {
		
		
	}
	
}
