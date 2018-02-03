package pages.order_form_sub_sections;

import org.openqa.selenium.By;

@Deprecated
public interface IPageOrderFormMiddlePane {
	
	By cboCondition = By.name("SubPropCond");
	
	By cboBasement = By.name("SubBase");
	
	By txtBasementArea = By.name("SubBaseare");
	
	By cboView = By.name("SubView");
	
	By cboLocation = By.name("SubLoc");
	
	By txtCountry = By.name("County");
	
	By txtSubDivision = By.name("SubDiv");
	
	By txtAPN = By.name("APN");
	
	By txtAssessedValue = By.name("Assessed");
	
	By txtPriorDate = By.name("Priordate");
	
	By txtPriorValue = By.name("Priorval");
	
	By txtLandValue = By.name("LandValue");
	
	By txtYearlyTax = By.name("YearlyTax");
	
	By txtRent = By.name("Rent");
	
	By txtEstimatedValue = By.id("Zillowvalue");
	
	By txtOwnerName = By.id("OwnerName");
	
	public void selectCondition(String sCondition);
	
	public void selectBasement(String sBasement);
	
	
	public void typeBasementArea(String sBasementArea);
	
	public void selectView(String sView);
	
	public void selectLocation(String sLocation);
	
	public void typeCountry(String sCountry);
	
	public void typeSubDivision(String sSubDivision);
	
	public void typeAPN(String sAPN);
	
	public void typeAssessedValue(String sAssessedValue);
	
	public void typePriorDate(String sPriorDate);
	
	public void typePriorValue(String sPriorValue);
	
	public void typeLandValue(String sLandValue);
	
	public void typeYearlyTax(String sYearlyTax);
	
	public void typeRent(String sRent);
	
	public void typeEstimatedValue(String sEstimatedValue);
	
	public void typeOwnerName(String sOwnerName);
}
