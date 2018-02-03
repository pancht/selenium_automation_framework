package pages.home.bpo.order.edit.subject_history;

import org.openqa.selenium.By;

interface IPage_Current_Listing_Information_Section {
	
	String tableCurrentListingInformation = "//h5[text()='Current Listing Information']/../table";
	
	By cboIsListedInLast12Months = By.xpath(tableCurrentListingInformation + "//tr[1]/td[2]//select");
	
	By cboIsCurrentlyListed = By.xpath(tableCurrentListingInformation + "//tr[2]/td[2]//select");
	
	By cboHasSubjectBeenListedMultipleTimesInLast12Months = By.xpath(tableCurrentListingInformation + "//tr[3]/td[2]//select");
	
	By txtCurrentListedDate = By.xpath(tableCurrentListingInformation + "//tr[4]/td[2]//input");
	
	By txtCurrentFinalListPrice = By.xpath(tableCurrentListingInformation + "//tr[6]/td[2]//input");
	
	By txtOriginalListdate = By.xpath(tableCurrentListingInformation + "//tr[8]/td[2]//input");
	
	By txtOriginalListPrice = By.xpath(tableCurrentListingInformation + "//tr[9]/td[2]//input");
	
	By txtDOM = By.xpath(tableCurrentListingInformation + "//tr[11]/td[2]//input");
	
	By txtListingBroker = By.xpath(tableCurrentListingInformation + "//tr[13]/td[2]//input");
	
	By txtListingCompany = By.xpath(tableCurrentListingInformation + "//tr[15]/td[2]//input");
	
	By txtListingPhone = By.xpath(tableCurrentListingInformation + "//tr[17]/td[2]//input");
	
	By cboIfListedIsAForSaleSignVisible = By.xpath(tableCurrentListingInformation + "//tr[19]/td[2]//select");
	
	By txtToTheBestOfYourKnowledgeWhyDidThePropertyNotSell  = By.xpath(tableCurrentListingInformation + "//tr[20]/td[2]//input");
	
	public String getSelectedIsListedInLast12MonthsOption_CurrentListingInformationSection();
	public void selectIsListedInLast12MonthsOption_CurrentListingInformationSection(String sIsListedInLast12MonthsOption);
	
	public String getSelectedIsCurrentlyListedOption_CurrentListingInformationSection();
	public void selectIsCurrentlyListedOption_CurrentListingInformationSection(String sIsCurrentlyListedOption);
	
	public String getSelectedHasSubjectBeenListedMultipleTimesInLast12MonthsOption_CurrentListingInformationSection();
	public void selectHasSubjectBeenListedMultipleTimesInLast12MonthsOption_CurrentListingInformationSection(String sHasSubjectBeenListedMultipleTimesInLast12MonthsOption);
	
	public String getCurrentListedDate_CurrentListingInformationSection();
	public void typeCurrentListedDate_CurrentListingInformationSection(String sCurrentListedDate);
	
	public String getCurrentFinalListPrice_CurrentListingInformationSection();
	public void typeCurrentFinalListPrice_CurrentListingInformationSection(String sCurrentFinalListPrice);
			
	public String getOriginalListdate_CurrentListingInformationSection();
	public void typeOriginalListdate_CurrentListingInformationSection(String sOriginalListdate);
	
	public String getOriginalListPrice_CurrentListingInformationSection();
	public void typeOriginalListPrice_CurrentListingInformationSection(String sOriginalListPrice);
	
	public String getDOMCurrentListingInformationSection_CurrentListingInformationSection();
	public void typeDOMCurrentListingInformationSection_CurrentListingInformationSection(String sDOM);
	
	public String getListingBroker_CurrentListingInformationSection();
	public void typeListingBroker_CurrentListingInformationSection(String sListingBroker);
	
	public String getListingCompany_CurrentListingInformationSection();
	public void typeListingCompany_CurrentListingInformationSection(String sListingCompany);
	
	public String getListingPhone_CurrentListingInformationSection();
	public void typeListingPhone_CurrentListingInformationSection(String sListingPhone);
	
	public String getSelectedIfListedIsAForSaleSignVisibleOption_CurrentListingInformationSection();
	public void selectIfListedIsAForSaleSignVisibleOption_CurrentListingInformationSection(String sIfListedIsAForSaleSignVisibleOption);
	
	public String getToTheBestOfYourKnowledgeWhyDidThePropertyNotSellText_CurrentListingInformationSection();
	public void typeToTheBestOfYourKnowledgeWhyDidThePropertyNotSellText_CurrentListingInformationSection(String sToTheBestOfYourKnowledgeWhyDidThePropertyNotSellText);
	
}
