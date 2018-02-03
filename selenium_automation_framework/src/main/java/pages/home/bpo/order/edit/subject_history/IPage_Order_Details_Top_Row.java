package pages.home.bpo.order.edit.subject_history;

import org.openqa.selenium.By;

interface IPage_Order_Details_Top_Row {

	By row_Order_Details_Top_Row = By.xpath("//*[text()='Inspection Date:']/../../");
	
	By txtInspectionDate_Field_1 = By.xpath("./td[2]//input");
	
	By cboInformationSource_Field_2 = By.xpath("./td[4]/select");
	
	By cboPropertyType_Field_3 = By.xpath("./td[6]/select");
	
	By txtAPN_Or_Tax_ID_Number_Field_4 = By.xpath("./td[8]//input");
	
	By linkDataSource_Field_5 = By.xpath("./td[10]/a");
	
	public String getInspectionDate_OrderDetails(); 
	
	public String getSelectedInformationSource_OrderDetails();
	
	public String getSelectedPropertyType_OrderDetails();
	
	public String getAPNOrTaxIDNumber_OrderDetails();
	
	public void clickLinkDataSource_OrderDetails();
	
	
	
}
