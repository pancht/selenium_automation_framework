package pages.order_form_sub_sections;

import org.openqa.selenium.By;

@Deprecated
public interface IPageOrderFormLeftPane {
	
	// Elements on Order Form Page
		By cboPropertyType = By.id("Subtype");
		
		By cboStyle = By.id("Substye");
		
		By cboStoriesOrLevels = By.name("Substories");
		
		By cboDesign = By.name("SubDesign");
		
		By cboNoOfUnits = By.id("SubUnits");
		
		By txtYearBuilt = By.id("yb");
		
		By txtAge = By.id("age");
		
		By txtGLA = By.id("gla");
		
		By txtLotSizeSqrt = By.id("lotsq");
		
		By txtLotSizeAcres = By.id("lotac");
		
		By rdoPool = By.name("SubPool");
		
		By txtBed = By.name("SubBed");
		
		By txtFullBath = By.name("SubFBath");
		
		By txtHalfBath = By.name("SubHBath");
		
		By cboGarage = By.name("SubGarType");
		
		By cboCarPortType = By.name("SubCarporttype");
		
		
		// Actions on Order Form Page
		public void selectPropertyType(String sPropertyType) ;
		
		public void selectStyle(String sStyle) ;
		
		public void selectStoriesOrLevels(String sStoriesOrLevels);
		
		public void selectDesign(String sDesign) ;
		
		public void selectNoOfUnits(String sNoOfUnits) ;
		
		public void typeYearBuilt(String sYearbuilt) ;
		
		public void typeAge(String sAge) ;
		
		public void typeGLA(String sGLA) ;
		
		
		public void typeLotSizeSqrt(String sLotSizeSqrt) ;
		
		public void typeLotSizeAcres(String sLotSizeAcres);
		
		
		public void selectRadioPool(String sPool) ;
		
		public void typeBed(String sBed);
		
		public void typeFullBath(String sFullBath);
		
		public void typeHalfBath(String sHalfBath);
		
		public void selectGarage(String sGarage) ;
		
		
		public void selectCarPortType(String sCarPortType);
}
