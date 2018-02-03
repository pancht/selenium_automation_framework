package pages.home.bpo.order.edit.subject_history;

import org.openqa.selenium.By;

interface IPage_Last_Sold_Information_Section {

	String tableLastSoldInformation = "//h5[text()='Last Sold Information']/../table";
	
	By cboSoldInLast12MonthsOption = By.xpath(tableLastSoldInformation + "//tr[1]/td[2]//select");
	
	By txtLastListdate = By.xpath(tableLastSoldInformation + "//tr[2]/td[2]//input" ) ;
	
	By txtFialListPrice = By.xpath(tableLastSoldInformation + "//tr[4]/td[2]//input") ;
	
	By txtOriginalListDate = By.xpath(tableLastSoldInformation + "//tr[6]/td[2]//input");
	
	By txtOriginalListPrice = By.xpath(tableLastSoldInformation + "//tr[7]/td[2]//input");
	
	By txtDOM = By.xpath(tableLastSoldInformation + "//tr[9]/td[2]//input");
	
	By txtSalesPrice = By.xpath(tableLastSoldInformation + "//tr[11]/td[2]//input");
	
	By txtSalesDate = By.xpath(tableLastSoldInformation + "//tr[13]/td[2]//input");
	
	By txtListingBroken = By.xpath(tableLastSoldInformation + "//tr[14]/td[2]//input");
	
	By txtListingCompany = By.xpath(tableLastSoldInformation + "//tr[16]/td[2]//input");
	
	By txtListingPhone = By.xpath(tableLastSoldInformation + "//tr[18]/td[2]//input");
	
	public String getSelectedSoldInLast12MonthsOption_LastSoldInformationSection();
	public void selectSoldInLast12MonthsOptionOption_LastSoldInformationSection(String sSoldInLast12MonthsOption);
	
	public String getTextLastListdate_LastSoldInformationSection();
	public void typeLastListdate_LastSoldInformationSection(String sLastListdate);
	
	public String getTextFialListPrice_LastSoldInformationSection();
	public void typeFialListPrice_LastSoldInformationSection(String sFialListPrice);
	
	public String getTextOriginalListDate_LastSoldInformationSection();
	public void typeOriginalListDate_LastSoldInformationSection(String sOriginalListDate);
	
	public String getTextOriginalListPrice_LastSoldInformationSection();
	public void typeOriginalListPrice_LastSoldInformationSection(String sOriginalListPrice);
	
	public String getTextDOM_LastSoldInformationSection();
	public void typeDOM_LastSoldInformationSection(String sDOM);
	
	public String getTextSalesPrice_LastSoldInformationSection();
	public void typeSalesPrice_LastSoldInformationSection(String sSalesPrice);
	
	public String getTextSalesDate_LastSoldInformationSection();
	public void typeSalesDate_LastSoldInformationSection(String sSalesDate);
	
	public String getTextListingBroken_LastSoldInformationSection();
	public void typeListingBroken_LastSoldInformationSection(String sListingBroken);
	
	public String getTextListingCompany_LastSoldInformationSection();
	public void typeListingCompany_LastSoldInformationSection(String sListingCompany);
	
	public String getTextListingPhone_LastSoldInformationSection();
	public void typeListingPhone_LastSoldInformationSection(String sListingPhone);
	
	
}
