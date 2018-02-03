package pages.home.bpo.order.edit.subject_history;

import org.openqa.selenium.By;

interface IPage_Subject_History_Tab_Actions {

	By btnSave = By.xpath("//a[text()='Save']");
	
	By btnNext = By.xpath("//a[text()='Next']");
	
	public void clickButton_Save();
	
	public void clickButton_Next();
}
