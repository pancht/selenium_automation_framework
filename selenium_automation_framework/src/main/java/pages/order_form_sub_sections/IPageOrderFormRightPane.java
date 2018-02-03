package pages.order_form_sub_sections;

import org.openqa.selenium.By;

@Deprecated
public interface IPageOrderFormRightPane {
	
	By rdoListedOrLast12Months = By.id("SubList1");
	
	By cboStatus = By.id("SubStatus");
	
	By txtMLS_No = By.id("SubMLS");
	
	By txtListOrSoldDate = By.id("SubListDate");
	
	By txtListOrSoldPrice = By.id("SubListPrice");
	
	By txtListedCompany = By.id("SubListComp");
	
	By cboREO_ShortSale = By.name("SubReoSSale");
	
	By rdoBoardedHome = By.name("SubBoarded");
	
	By rdoRepairs = By.name("SubRep");
	
	By txtRepairDescription = By.id("desp1");
	
	By txtAmount = By.id("amount1");
	
	By txtTotalRepairs = By.id("total");
	
	By txtLegalDescription = By.id("LegalDesc");
	
	By btnClearRepairs = By.xpath("//button[text()='Clear Repairs']");
	
	public void checkRadioListedOrLast12Months(String sRadioOptionValue);
	
	public void selectStatus(String sStatus);
	
	public void typeMLS_No(String sMLS_No);
	
	public void typeListOrSoldDate(String sListOrSoldDate);
	
	public void typeListOrSoldPrice(String sListOrSoldPrice);
	
	public void typeListedCompany(String sListedCompany);
	
	public void selectREO_ShortSale(String sREO_ShortSale);
	
	public void checkRadioBoardedHome(String sRadioOptionValue);
	
	public void checkRadioRepairs(String sRadioOptionValue);
	
	public void typeRepairDescription(String sRepairDesription);
	
	public void typeAmount(String sAmount);
	
	public void typeTotalRepairs(String sTotalRepairs);
	
	public void typeLegalDescription(String sLegalDescription);
	
	public void btnClickClearRepairs();
	
}
