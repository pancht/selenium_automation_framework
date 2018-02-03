package pages.order_form_sub_sections;

import org.openqa.selenium.By;

@Deprecated
public interface IPageOrderFormHeaderSection {
	
	By cboFormNameHeader = By.xpath("//select[@id='FormName']");
	
	By txtAddress = By.id("SubAdd");
	
	public void selectFormNameLeft(String sFormName) ;
	
	public void typeAddress(String sAddress);
	
	public void selectFormNameRight(String sFormName) ;
	
}
