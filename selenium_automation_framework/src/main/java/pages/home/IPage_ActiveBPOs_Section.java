package pages.home;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import pages.home.bpo.order.process.landing_page.Page_BPO_Order_Process_LandingPage;

interface IPage_ActiveBPOs_Section {

	By rowsActiveBPOsList = By
			.xpath("//div[@id='availableBpos']//h4[text()='Active BPOs']/../table//tr[@class='ng-scope']");

	By colBPO_Provider_ActiveBPOsList = By.xpath(".//td[1]");

	By colAddress_ActiveBPOsList = By.xpath(".//td[2]/a");

	By colFee_ActiveBPOsList = By.xpath("./td[3]");

	By colAcceptDate_ActiveBPOsList = By.xpath("./td[4]");

	By colAgentDueDate_ActiveBPOsList = By.xpath("./td[5]");

	public WebElement getRow_ActiveBPOs_Provider(int row_no);

	public List<WebElement> getRows_ActiveBPOs_BPO_Providers();

	public int getRows_Count_ActiveBPOs_BPO_Providers();

	public Page_BPO_Order_Process_LandingPage click_ActiveBPOs_BPO_Provider_Address_Link(WebElement rowActiveBPOs_BPO_Provider);

	public boolean is_There_Any_ActiveBPOs_BPO_Provider_Order();

}
