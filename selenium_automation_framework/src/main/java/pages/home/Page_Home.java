package pages.home;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import pages.home.bpo.order.process.landing_page.Page_BPO_Order_Process_LandingPage;
import saf.essentials.Page;

public class Page_Home extends Page implements IPage_AvailableToAcceptBPO_Providers_Section, IPage_ActiveBPOs_Section {

	public Page_Home(WebDriver pageDriver) {
		super(pageDriver);
	}

	@Override
	public WebElement getRow_AvailableToAcceptBPO_Provider(int row_no) {

		return getRows_AvailableToAccept_BPO_Providers().get(row_no);
	}

	@Override
	public List<WebElement> getRows_AvailableToAccept_BPO_Providers() {

		List<WebElement> rowsAvailableToAccept_BPO_Providers = findElements(rowsAvailableToAcceptOrderList);

		return rowsAvailableToAccept_BPO_Providers;
	}

	@Override
	public void click_AvailableToAccept_BPO_Provider_Address_Link(WebElement rowAvailableToAcceptBPO_Provider) {

		rowAvailableToAcceptBPO_Provider.findElement(colBPO_Provider_AddressAvailableToAcceptOrderList).click();
	}

	@Override
	public boolean is_There_Any_AvailableToAccept_BPO_Provider_Order() {

		return getRows_AvailableToAccept_BPO_Providers().size() > 0 ? true : false;
	}

	@Override
	public int getRows_Count_AvailableToAccept_BPO_Providers() {

		return getRows_AvailableToAccept_BPO_Providers().size();
	}

	@Override
	public WebElement getRow_ActiveBPOs_Provider(int row_no) {
		
		
		return getRows_ActiveBPOs_BPO_Providers().get(row_no);
	}

	@Override
	public List<WebElement> getRows_ActiveBPOs_BPO_Providers() {
		
		List<WebElement> rowsActiveBPOs_BPO_Providers = findElements(rowsActiveBPOsList);
		
		return rowsActiveBPOs_BPO_Providers;
	}

	@Override
	public int getRows_Count_ActiveBPOs_BPO_Providers() {
		
		return getRows_ActiveBPOs_BPO_Providers().size();
	}

	@Override
	public Page_BPO_Order_Process_LandingPage click_ActiveBPOs_BPO_Provider_Address_Link(WebElement rowActiveBPOs_BPO_Provider) {
			
		rowActiveBPOs_BPO_Provider.findElement(colAddress_ActiveBPOsList).click();
		
		return new Page_BPO_Order_Process_LandingPage(pageDriver);

	}

	@Override
	public boolean is_There_Any_ActiveBPOs_BPO_Provider_Order() {
		
		return getRows_Count_ActiveBPOs_BPO_Providers() > 0 ? true : false ;
	}

}
