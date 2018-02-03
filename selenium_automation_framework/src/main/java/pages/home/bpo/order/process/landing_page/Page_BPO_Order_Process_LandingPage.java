package pages.home.bpo.order.process.landing_page;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import saf.essentials.Page;

public class Page_BPO_Order_Process_LandingPage extends Page implements IPage_BPO_Order_Process_Landing_BPO_Landing_Control_DataGrid_Section{

	public Page_BPO_Order_Process_LandingPage(WebDriver pageDriver) {
		super(pageDriver);
		
	}

	@Override
	public List<WebElement> getRows_BPO_Landing_Control_Data_Grid_Rows() {
		
		return findElements(rows_BPO_Landing_Control_DataGrid_Rows_List);
	}

	@Override
	public WebElement getRow_BPO_Landing_Control_Data_Grid_Row(int row_id) {
		
		return getRow_BPO_Landing_Control_Data_Grid_Row(row_id);
	}

	@Override
	public void click_BPO_Landing_Control_Data_Grid_Row_Edit_Form_Link(int row_id) {
		
		getRow_BPO_Landing_Control_Data_Grid_Row(row_id).findElement(col_Edit_Form_Link_BPO_Landing_Control_DataGrid_Rows_List).click();
	}

}
