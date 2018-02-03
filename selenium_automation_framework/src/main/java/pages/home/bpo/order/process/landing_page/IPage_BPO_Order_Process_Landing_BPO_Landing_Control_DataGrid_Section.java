package pages.home.bpo.order.process.landing_page;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

interface IPage_BPO_Order_Process_Landing_BPO_Landing_Control_DataGrid_Section {

	By rows_BPO_Landing_Control_DataGrid_Rows_List = 
			By.xpath("//div[contains(@ng-controller,'bpoLandingCtrl')]/div[@class='group']//tr[contains(@class,'DataGrid_Row')]");
	
	By col_Customer_Order_Date_BPO_Landing_Control_DataGrid_Rows_List = By.xpath("./td[2]");
	
	By col_Agent_Assined_Date__BPO_Landing_Control_DataGrid_Rows_List = By.xpath("./td[3]");
	
	By col_QC_Completed_Date_BPO_Landing_Control_DataGrid_Rows_List = By.xpath("./td[4]");
	
	By col_Broker_BPO_Landing_Control_DataGrid_Rows_List = By.xpath("./td[5]");
	
	By col_Company_BPO_Landing_Control_DataGrid_Rows_List = By.xpath("./td[6]");
	
	By col_AS_IS_BPO_Landing_Control_DataGrid_Rows_List = By.xpath("./td[7]");
	
	By col_Repaired_BPO_Landing_Control_DataGrid_Rows_List = By.xpath("./td[8]");
	
	By col_Estimated_Repairs_BPO_Landing_Control_DataGrid_Rows_List = By.xpath("./td[9]");
	
	By col_Condition_BPO_Landing_Control_DataGrid_Rows_List = By.xpath("./td[10]");
	
	By col_Edit_Form_Link_BPO_Landing_Control_DataGrid_Rows_List = By.xpath("./td[11]/a");
	
	
	public List<WebElement> getRows_BPO_Landing_Control_Data_Grid_Rows();
	
	public WebElement getRow_BPO_Landing_Control_Data_Grid_Row(int row_id);
	
	public void click_BPO_Landing_Control_Data_Grid_Row_Edit_Form_Link(int row_id);
	
}
