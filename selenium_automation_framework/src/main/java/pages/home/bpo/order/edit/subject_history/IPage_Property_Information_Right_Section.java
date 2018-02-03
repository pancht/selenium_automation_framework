package pages.home.bpo.order.edit.subject_history;

import org.openqa.selenium.By;

interface IPage_Property_Information_Right_Section {

	By txtGuestHouseSF = By.xpath("//label[text()='Guest House SF:']/../..//input");

	By txtGuestHouseBasementSF = By.xpath("//label[text()='Guest House Basement SF:']/../..//input");

	By txtTaxes = By.xpath("//label[text()='Taxes:']/../..//input");

	By txtDelinquentTaxes = By.xpath("//label[text()='Delinquent Taxes:']/../..//input");

	By cboTitleLegalIssues = By.xpath("//label[text()='Title/Legal Issues:']/../..//select");

	By cboBuyerType = By.xpath("//label[text()='Buyer Type:']/../..//select");

	By txtOwnerOfPublicRecord = By.xpath("//label[text()='Owner Of Public Record:']/../..//input");

	By txtLegalDescription = By.xpath("//label[text()='Legal Description:']/../..//input");

	By cboAreAllTypesOfFinancingAvailableForThisProperty = By
			.xpath("//label[text()='Are all types of financing available for this property?']/../..//select");

	By txtIfNoExplain = By.xpath("//label[text()='If no, Explain:']/../..//input");

	By cboImprovementCondition = By.xpath("//label[text()='Improvement Condition:']/../..//select");
	
	public String getTextGuestHouseSF();
	public void typeGuestHouseSF(String sGuestHouseSF);
	
	public String getTextGuestHouseBasementSF();
	public void typeGuestHouseBasementSF(String sGuestHouseBasementSF);
	
	public String getTextTaxes();
	public void typeTaxes(String sTaxes);
	
	public String getTextDelinquentTaxes();
	public void typeDelinquentTaxes(String sDelinquentTaxes);
	
	public String getSelectedTitleLegalIssuesOption();
	public void selectTitleLegalIssuesOption(String sTitleLegalIssues);
	
	public String getSelectedBuyerTypeOption();
	public void selectBuyerTypeOption(String sBuyerType);
	
	public String getTextOwnerOfPublicRecord();
	public void typeOwnerOfPublicRecord(String sOwnerOfPublicRecord);
	
	public String getTextLegalDescription();
	public void typeLegalDescription(String sLegalDescription);
	
	public String getSelectedAreAllTypesOfFinancingAvailableForThisPropertyOption();
	public void selectAreAllTypesOfFinancingAvailableForThisPropertyOption(String sAreAllTypesOfFinancingAvailableForThisProperty);
	
	public String getTextIfNoExplain();
	public void typeIfNoExplain(String sIfNoExplain);
	
	public String getSelectedImprovementConditionOption();
	public void selectImprovementConditionOption(String sImprovementCondition);

}
