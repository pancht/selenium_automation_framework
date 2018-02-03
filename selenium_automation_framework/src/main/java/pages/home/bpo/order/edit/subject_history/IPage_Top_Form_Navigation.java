package pages.home.bpo.order.edit.subject_history;

import org.openqa.selenium.By;

interface IPage_Top_Form_Navigation {
	
	String navBPO_Form_Navigation = "//div[contains(@class,'bpo_form_navigation')]";

	By btn_Cancel_BPO_Form_Navigation = By.xpath( navBPO_Form_Navigation + "//input[@value='Cancel']");
	
	By btn_Save_And_Close_Form_Navition = By.xpath( navBPO_Form_Navigation  + "//input[@value='Save & Close']");
	
	By btn_Submit_Form_Navigation = By.xpath( navBPO_Form_Navigation  + "//input[@value='Submit']");
	
	By btn_New_Comment_Form_Navigation = By.xpath( navBPO_Form_Navigation  + "//input[@value='New Comment']");
	
	public void clickButton_Cancel_BPO_Form_Navigation();
	
	public void clickButton_Save_And_Close_Form_Navition();
	
	public void clickButton_Submit_Form_Navigation();
	
	public void clickButton_New_Comment_Form_Navigation();
}
