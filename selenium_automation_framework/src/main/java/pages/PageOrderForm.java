package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import pages.order_form_sub_sections.IPageOrderFormFooterSection;
import pages.order_form_sub_sections.IPageOrderFormHeaderSection;
import pages.order_form_sub_sections.IPageOrderFormLeftPane;
import pages.order_form_sub_sections.IPageOrderFormMiddlePane;
import pages.order_form_sub_sections.IPageOrderFormRightPane;
import pages.searchResultPages.PageGoogleSearchResult;
import saf.essentials.Page;

public class PageOrderForm extends Page implements IPageOrderFormHeaderSection, IPageOrderFormLeftPane,
		IPageOrderFormMiddlePane, IPageOrderFormRightPane, IPageOrderFormFooterSection {

	public PageOrderForm(WebDriver pageDriver) {
		super(pageDriver);

	}

	// Actions on Order Form Page
	public void selectPropertyType(String sPropertyType) {
		select(cboPropertyType, sPropertyType);
	
	}

	public void selectStyle(String sStyle) {
		select(cboStyle, sStyle);
	}

	public void selectStoriesOrLevels(String sStoriesOrLevels) {
		select(cboStoriesOrLevels, sStoriesOrLevels);
	}

	public void selectDesign(String sDesign) {
		select(cboDesign, sDesign);
	}

	public void selectNoOfUnits(String sNoOfUnits) {
		select(cboNoOfUnits, sNoOfUnits);
	}

	public void typeYearBuilt(String sYearbuilt) {
		type(txtYearBuilt, sYearbuilt);
	}

	public void typeAge(String sAge) {
		type(txtAge, sAge);
	}

	public void typeGLA(String sGLA) {
		type(txtGLA, sGLA);
	}

	public void typeLotSizeSqrt(String sLotSizeSqrt) {
		type(txtLotSizeSqrt, sLotSizeSqrt);
	}

	public void typeLotSizeAcres(String sLotSizeAcres) {
		type(txtLotSizeAcres, sLotSizeAcres);
	}

	public void selectRadioPool(String sPool) {
		selectRadioOption(rdoPool, sPool);
	}

	public void typeBed(String sBed) {
		type(txtBed, sBed);
	}

	public void typeFullBath(String sFullBath) {
		type(txtFullBath, sFullBath);
	}

	public void typeHalfBath(String sHalfBath) {
		type(txtHalfBath, sHalfBath);
	}

	public void selectGarage(String sGarage) {
		select(cboGarage, sGarage);
	}

	public void selectCarPortType(String sCarPortType) {
		select(cboCarPortType, sCarPortType);
	}

	@Override
	public void selectFormNameLeft(String sFormName) {
		List<WebElement> headerForms = findElements(cboFormNameHeader);

		select(headerForms.get(0), sFormName);
	}

	@Override
	public void typeAddress(String sAddress) {
		type(txtAddress, sAddress);

	}

	@Override
	public void selectFormNameRight(String sFormName) {
		List<WebElement> headerForms = findElements(cboFormNameHeader);

		select(headerForms.get(1), sFormName);

	}

	@Override
	public void selectCondition(String sCondition) {
		select(cboCondition, sCondition);

	}

	@Override
	public void selectBasement(String sBasement) {
		select(cboBasement, sBasement);

	}

	@Override
	public void typeBasementArea(String sBasementArea) {
		type(txtBasementArea, sBasementArea);

	}

	@Override
	public void selectView(String sView) {
		select(cboView, sView);

	}

	@Override
	public void selectLocation(String sLocation) {
		select(cboLocation, sLocation);

	}

	@Override
	public void typeCountry(String sCountry) {
		type(txtCountry, sCountry);

	}

	@Override
	public void typeSubDivision(String sSubDivision) {
		type(txtSubDivision, sSubDivision);

	}

	@Override
	public void typeAPN(String sAPN) {
		type(txtAPN, sAPN);

	}

	@Override
	public void typeAssessedValue(String sAssessedValue) {
		type(txtAssessedValue, sAssessedValue);

	}

	@Override
	public void typePriorDate(String sPriorDate) {
		type(txtPriorDate, sPriorDate);

	}

	@Override
	public void typePriorValue(String sPriorValue) {
		type(txtPriorValue, sPriorValue);

	}

	@Override
	public void typeLandValue(String sLandValue) {
		type(txtLandValue, sLandValue);

	}

	@Override
	public void typeYearlyTax(String sYearlyTax) {
		type(txtYearlyTax, sYearlyTax);

	}

	@Override
	public void typeRent(String sRent) {
		type(txtRent, sRent);

	}

	@Override
	public void typeEstimatedValue(String sEstimatedValue) {
		type(txtEstimatedValue, sEstimatedValue);

	}

	@Override
	public void typeOwnerName(String sOwnerName) {
		type(txtOwnerName, sOwnerName);

	}

	@Override
	public void checkRadioListedOrLast12Months(String sRadioOptionValue) {
		selectRadioOption(rdoListedOrLast12Months, sRadioOptionValue);

	}

	@Override
	public void selectStatus(String sStatus) {
		select(cboStatus, sStatus);

	}

	@Override
	public void typeMLS_No(String sMLS_No) {
		type(txtMLS_No, sMLS_No);

	}

	@Override
	public void typeListOrSoldDate(String sListOrSoldDate) {
		type(txtListOrSoldDate, sListOrSoldDate);

	}

	@Override
	public void typeListOrSoldPrice(String sListOrSoldPrice) {
		type(txtListOrSoldPrice, sListOrSoldPrice);

	}

	@Override
	public void typeListedCompany(String sListedCompany) {
		type(txtListedCompany, sListedCompany);

	}

	@Override
	public void selectREO_ShortSale(String sREO_ShortSale) {
		select(cboREO_ShortSale, sREO_ShortSale);

	}

	@Override
	public void checkRadioBoardedHome(String sRadioOptionValue) {
		selectRadioOption(rdoBoardedHome, sRadioOptionValue);

	}

	@Override
	public void checkRadioRepairs(String sRadioOptionValue) {
		selectRadioOption(rdoRepairs, sRadioOptionValue);

	}

	@Override
	public void typeRepairDescription(String sRepairDesription) {
		type(txtRepairDescription, sRepairDesription);

	}

	@Override
	public void typeAmount(String sAmount) {
		type(txtAmount, sAmount);

	}

	@Override
	public void typeTotalRepairs(String sTotalRepairs) {
		type(txtTotalRepairs, sTotalRepairs);

	}

	@Override
	public void typeLegalDescription(String sLegalDescription) {
		type(txtLegalDescription, sLegalDescription);

	}

	@Override
	public void btnClickClearRepairs() {
		click(btnClearRepairs);

	}

	@Override
	public void btnClickSave() {
		click(btnSave);
		
	}

}
