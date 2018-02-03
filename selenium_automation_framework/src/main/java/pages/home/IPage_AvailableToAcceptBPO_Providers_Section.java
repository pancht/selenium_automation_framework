package pages.home;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

interface IPage_AvailableToAcceptBPO_Providers_Section {
   
	By rowsAvailableToAcceptOrderList = By.xpath("//div[@id='availableBpos']//h4[text()='Available to Accept']/../table//tr[@class='ng-scope']");
	
	By colBPO_ProviderAvailableToAcceptOrderList = By.xpath(".//td[1]");
	
	By colBPO_Provider_AddressAvailableToAcceptOrderList = By.xpath(".//td[2]/a");
	
	By colOrderFeeAvailableToAcceptOrderList = By.xpath(".//td[3]");
	
	By colOrderDateAvailableToAcceptOrderList = By.xpath(".//td[4]");
	
	By colOrderAcceptDeclineButtonAccept = By.xpath(".//td[5]/button[contains(@class,'btn-success')]");
	
	By colOrderAcceptDeclineButtonDecline = By.xpath(".//td[5]/button[contains(@class,'btn-danger')]");
	
	
	public WebElement getRow_AvailableToAcceptBPO_Provider(int row_no);
	
	public List<WebElement> getRows_AvailableToAccept_BPO_Providers();
	
	public int getRows_Count_AvailableToAccept_BPO_Providers();
	
	public void click_AvailableToAccept_BPO_Provider_Address_Link(WebElement rowAvailableToAcceptBPO_Provider);
	
	public boolean is_There_Any_AvailableToAccept_BPO_Provider_Order();
	
}
