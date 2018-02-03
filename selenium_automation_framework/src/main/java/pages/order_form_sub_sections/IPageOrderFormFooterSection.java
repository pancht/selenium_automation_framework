package pages.order_form_sub_sections;

import org.openqa.selenium.By;

@Deprecated
public interface IPageOrderFormFooterSection {

	By btnSave = By.xpath("//input[@value='Save']");
	
	
	public void btnClickSave();
	
}
