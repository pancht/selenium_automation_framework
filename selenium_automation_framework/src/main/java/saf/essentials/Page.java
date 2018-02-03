package saf.essentials;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.pagefactory.ElementLocatorFactory;

public class Page  extends ConfigurationProjectSpecific{

	public Page(WebDriver pageDriver) {
		super(pageDriver);
		
		ElementLocatorFactory finder = new AjaxElementLocatorFactory(pageDriver, PAGE_WAIT);

		PageFactory.initElements(finder, this);
		
		waitForPageToLoad();
		
	}

		
	//Define all Product/Website-wide pages declaration here
	
	
	@Override
	public Object goBack() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object goBack(String pageName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getPageTitle() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void verifyPageUI() {
		// TODO Auto-generated method stub
		
	}
	
}
