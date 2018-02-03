package pages.home.bpo.order.edit.subject_history;

import org.openqa.selenium.WebDriver;

import saf.essentials.Page;

public class Page_BPO_Order_Edit_Subject_History_Tab_Default_Landing_Tab extends Page
		implements IPage_Order_Details_Top_Row, IPage_Top_Form_Navigation, IPage_Current_Listing_Information_Section,
		IPage_Last_Sold_Information_Section, IPage_Property_Information_Left_Section,
		IPage_Property_Information_Right_Section{

	public Page_BPO_Order_Edit_Subject_History_Tab_Default_Landing_Tab(WebDriver pageDriver) {
		super(pageDriver);
	}

	@Override
	public String getInspectionDate_OrderDetails() {

		return findElement(txtInspectionDate_Field_1).getText();
	}

	@Override
	public String getSelectedInformationSource_OrderDetails() {

		return getFirstSelectedOption(cboInformationSource_Field_2);
	}

	@Override
	public String getSelectedPropertyType_OrderDetails() {

		return getFirstSelectedOption(cboPropertyType_Field_3);
	}

	@Override
	public String getAPNOrTaxIDNumber_OrderDetails() {

		return findElement(txtAPN_Or_Tax_ID_Number_Field_4).getText();
	}

	@Override
	public void clickLinkDataSource_OrderDetails() {

		findElement(linkDataSource_Field_5).click();
	}

	@Override
	public void clickButton_Cancel_BPO_Form_Navigation() {
		click(btn_Cancel_BPO_Form_Navigation);
	}

	@Override
	public void clickButton_Save_And_Close_Form_Navition() {
		click(btn_Save_And_Close_Form_Navition);

	}

	@Override
	public void clickButton_Submit_Form_Navigation() {
		click(btn_Submit_Form_Navigation);

	}

	@Override
	public void clickButton_New_Comment_Form_Navigation() {
		click(btn_New_Comment_Form_Navigation);

	}

	@Override
	public String getSelectedIsListedInLast12MonthsOption_CurrentListingInformationSection() {

		return getFirstSelectedOption(cboIsListedInLast12Months);
	}

	@Override
	public void selectIsListedInLast12MonthsOption_CurrentListingInformationSection(
			String sIsListedInLast12MonthsOption) {
		select(cboIsListedInLast12Months, sIsListedInLast12MonthsOption);

	}

	@Override
	public String getSelectedIsCurrentlyListedOption_CurrentListingInformationSection() {

		return getFirstSelectedOption(cboIsCurrentlyListed);
	}

	@Override
	public void selectIsCurrentlyListedOption_CurrentListingInformationSection(String sIsCurrentlyListedOption) {

		select(cboIsCurrentlyListed, sIsCurrentlyListedOption);
	}

	@Override
	public String getSelectedHasSubjectBeenListedMultipleTimesInLast12MonthsOption_CurrentListingInformationSection() {

		return getFirstSelectedOption(cboHasSubjectBeenListedMultipleTimesInLast12Months);

	}

	@Override
	public void selectHasSubjectBeenListedMultipleTimesInLast12MonthsOption_CurrentListingInformationSection(
			String sHasSubjectBeenListedMultipleTimesInLast12MonthsOption) {

		select(cboHasSubjectBeenListedMultipleTimesInLast12Months,
				sHasSubjectBeenListedMultipleTimesInLast12MonthsOption);

	}

	@Override
	public String getCurrentListedDate_CurrentListingInformationSection() {

		return findElement(txtCurrentListedDate).getText();
	}

	@Override
	public void typeCurrentListedDate_CurrentListingInformationSection(String sCurrentListedDate) {
		click(txtCurrentListedDate);
		type(txtCurrentListedDate, sCurrentListedDate);
	}

	@Override
	public String getCurrentFinalListPrice_CurrentListingInformationSection() {
		return findElement(txtCurrentFinalListPrice).getText();
	}

	@Override
	public void typeCurrentFinalListPrice_CurrentListingInformationSection(String sCurrentFinalListPrice) {
		type(txtCurrentFinalListPrice, sCurrentFinalListPrice);

	}

	@Override
	public String getOriginalListdate_CurrentListingInformationSection() {
		return findElement(txtOriginalListdate).getText();
	}

	@Override
	public void typeOriginalListdate_CurrentListingInformationSection(String sOriginalListdate) {
		click(txtOriginalListdate);
		type(txtOriginalListdate, sOriginalListdate);

	}

	@Override
	public String getOriginalListPrice_CurrentListingInformationSection() {

		return findElement(IPage_Current_Listing_Information_Section.txtOriginalListPrice).getText();
	}

	@Override
	public void typeOriginalListPrice_CurrentListingInformationSection(String sOriginalListPrice) {
		type(IPage_Current_Listing_Information_Section.txtOriginalListPrice, sOriginalListPrice);

	}

	@Override
	public String getDOMCurrentListingInformationSection_CurrentListingInformationSection() {

		return findElement(IPage_Current_Listing_Information_Section.txtDOM).getText();
	}

	@Override
	public void typeDOMCurrentListingInformationSection_CurrentListingInformationSection(String sDOM) {
		type(IPage_Current_Listing_Information_Section.txtDOM, sDOM);

	}

	@Override
	public String getListingBroker_CurrentListingInformationSection() {

		return findElement(txtListingBroker).getText();
	}

	@Override
	public void typeListingBroker_CurrentListingInformationSection(String sListingBroker) {
		type(txtListingBroker, sListingBroker);

	}

	@Override
	public String getListingCompany_CurrentListingInformationSection() {

		return findElement(IPage_Current_Listing_Information_Section.txtListingCompany).getText();
	}

	@Override
	public void typeListingCompany_CurrentListingInformationSection(String sListingCompany) {
		type(IPage_Current_Listing_Information_Section.txtListingCompany, sListingCompany);

	}

	@Override
	public String getListingPhone_CurrentListingInformationSection() {

		return findElement(IPage_Current_Listing_Information_Section.txtListingPhone).getText();
	}

	@Override
	public void typeListingPhone_CurrentListingInformationSection(String sListingPhone) {
		type(IPage_Current_Listing_Information_Section.txtListingPhone, sListingPhone);

	}

	@Override
	public String getSelectedIfListedIsAForSaleSignVisibleOption_CurrentListingInformationSection() {

		return getFirstSelectedOption(cboIfListedIsAForSaleSignVisible);
	}

	@Override
	public void selectIfListedIsAForSaleSignVisibleOption_CurrentListingInformationSection(
			String sIfListedIsAForSaleSignVisibleOption) {
		select(cboIfListedIsAForSaleSignVisible, sIfListedIsAForSaleSignVisibleOption);

	}

	@Override
	public String getToTheBestOfYourKnowledgeWhyDidThePropertyNotSellText_CurrentListingInformationSection() {

		return findElement(txtToTheBestOfYourKnowledgeWhyDidThePropertyNotSell).getText();
	}

	@Override
	public void typeToTheBestOfYourKnowledgeWhyDidThePropertyNotSellText_CurrentListingInformationSection(
			String sToTheBestOfYourKnowledgeWhyDidThePropertyNotSellText) {
		type(txtToTheBestOfYourKnowledgeWhyDidThePropertyNotSell,
				sToTheBestOfYourKnowledgeWhyDidThePropertyNotSellText);

	}

	@Override
	public String getSelectedSoldInLast12MonthsOption_LastSoldInformationSection() {
		
		return getFirstSelectedOption(cboSoldInLast12MonthsOption);
	}

	@Override
	public void selectSoldInLast12MonthsOptionOption_LastSoldInformationSection(String sSoldInLast12MonthsOption) {
		select(cboSoldInLast12MonthsOption, sSoldInLast12MonthsOption);

	}

	@Override
	public String getTextLastListdate_LastSoldInformationSection() {

		return getText(txtLastListdate);
	}

	@Override
	public void typeLastListdate_LastSoldInformationSection(String sLastListdate) {
		type(txtLastListdate, sLastListdate);
	}

	@Override
	public String getTextFialListPrice_LastSoldInformationSection() {

		return getText(txtCurrentFinalListPrice);
	}

	@Override
	public void typeFialListPrice_LastSoldInformationSection(String sFialListPrice) {
		type(txtFialListPrice, sFialListPrice);

	}

	@Override
	public String getTextOriginalListDate_LastSoldInformationSection() {

		return getText(IPage_Last_Sold_Information_Section.txtOriginalListDate);
	}

	@Override
	public void typeOriginalListDate_LastSoldInformationSection(String sOriginalListDate) {
		type(IPage_Last_Sold_Information_Section.txtOriginalListDate, sOriginalListDate);

	}

	@Override
	public String getTextOriginalListPrice_LastSoldInformationSection() {
		return getText(IPage_Last_Sold_Information_Section.txtOriginalListPrice);
	}

	@Override
	public void typeOriginalListPrice_LastSoldInformationSection(String sOriginalListPrice) {
		type(IPage_Last_Sold_Information_Section.txtOriginalListPrice, sOriginalListPrice);

	}

	@Override
	public String getTextDOM_LastSoldInformationSection() {

		return getText(IPage_Last_Sold_Information_Section.txtDOM);
	}

	@Override
	public void typeDOM_LastSoldInformationSection(String sDOM) {
		type(IPage_Last_Sold_Information_Section.txtDOM, sDOM);

	}

	@Override
	public String getTextSalesPrice_LastSoldInformationSection() {
		
		return getText(IPage_Last_Sold_Information_Section.txtSalesPrice);
	}

	@Override
	public void typeSalesPrice_LastSoldInformationSection(String sSalesPrice) {
		type(IPage_Last_Sold_Information_Section.txtSalesPrice, sSalesPrice);

	}

	@Override
	public String getTextSalesDate_LastSoldInformationSection() {
		
		return getText(IPage_Last_Sold_Information_Section.txtSalesDate);
	}

	@Override
	public void typeSalesDate_LastSoldInformationSection(String sSalesDate) {
		type(IPage_Last_Sold_Information_Section.txtSalesDate, sSalesDate);

	}

	@Override
	public String getTextListingBroken_LastSoldInformationSection() {
		
		return getText(IPage_Last_Sold_Information_Section.txtListingBroken);
	}

	@Override
	public void typeListingBroken_LastSoldInformationSection(String sListingBroken) {
		type(IPage_Last_Sold_Information_Section.txtListingBroken, sListingBroken);

	}

	@Override
	public String getTextListingCompany_LastSoldInformationSection() {
		
		return getText(IPage_Last_Sold_Information_Section.txtListingCompany);
	}

	@Override
	public void typeListingCompany_LastSoldInformationSection(String sListingCompany) {
		type(IPage_Last_Sold_Information_Section.txtListingCompany, sListingCompany);

	}

	@Override
	public String getTextListingPhone_LastSoldInformationSection() {
		
		return getText(IPage_Last_Sold_Information_Section.txtListingPhone);
	}

	@Override
	public void typeListingPhone_LastSoldInformationSection(String sListingPhone) {
		type(IPage_Last_Sold_Information_Section.txtListingPhone, sListingPhone);

	}

	@Override
	public String getSelectedIsTheSubjectVisibleOption() {
		
		return getFirstSelectedOption(IPage_Property_Information_Left_Section.cboIsTheSubjectVisible);
	}

	@Override
	public void selectIsTheSubjectVisibleOption(String sIsTheSubjectVisible) {
		select(IPage_Property_Information_Left_Section.cboIsTheSubjectVisible, sIsTheSubjectVisible);
		
	}

	@Override
	public String getSelectedPropertyVacantOption() {

		return getFirstSelectedOption(IPage_Property_Information_Left_Section.cboPropertyVacant);
	}

	@Override
	public void selectPropertyVacantOption(String sPropertyVacant) {
		select(IPage_Property_Information_Left_Section.cboPropertyVacant, sPropertyVacant);
		
	}

	@Override
	public String getSelectedIfOccupied_WhoIsTheOccupantOption() {

		return getFirstSelectedOption(IPage_Property_Information_Left_Section.cboIfOccupied_WhoIsTheOccupant);
	}

	@Override
	public void selectIfOccupied_WhoIsTheOccupantOption(String sIfOccupied_WhoIsTheOccupant) {
		select(IPage_Property_Information_Left_Section.cboIfOccupied_WhoIsTheOccupant, sIfOccupied_WhoIsTheOccupant);
		
	}

	@Override
	public String getSelectedSecuredOption() {

		return getFirstSelectedOption(IPage_Property_Information_Left_Section.cboSecured);
		
	}

	@Override
	public void selectSecuredOption(String sSecured) {
		select(IPage_Property_Information_Left_Section.cboSecured, sSecured);
		
	}

	@Override
	public String getTextLandValue() {
		
		return getText(IPage_Property_Information_Left_Section.txtLandValue);
	}

	@Override
	public void typeLandValue(String sLandValue) {
		type(IPage_Property_Information_Left_Section.txtLandValue, sLandValue);
		
	}

	@Override
	public String getSelectedView() {

		return getFirstSelectedOption(IPage_Property_Information_Left_Section.cboView);
	}

	@Override
	public void selectView(String sView) {
		select(IPage_Property_Information_Left_Section.cboView, sView);
		
	}

	@Override
	public String getSelectedIsTheSubjectIncludedInAnHOAOrOtherAssociationOption() {
		
		return getFirstSelectedOption(IPage_Property_Information_Left_Section.cboIsTheSubjectIncludedInAnHOAOrOtherAssociation);
	}

	@Override
	public void selectIsTheSubjectIncludedInAnHOAOrOtherAssociationOption(
			String sIsTheSubjectIncludedInAnHOAOrOtherAssociation) {
		select(IPage_Property_Information_Left_Section.cboIsTheSubjectIncludedInAnHOAOrOtherAssociation, sIsTheSubjectIncludedInAnHOAOrOtherAssociation);
		
	}

	@Override
	public String getTextHOAName() {
		
		return getText(IPage_Property_Information_Left_Section.txtHOAName);
	}

	@Override
	public void typeHOAName(String sHOAName) {
		type(IPage_Property_Information_Left_Section.txtHOAName, sHOAName);
		
	}

	@Override
	public String getTextHOAPhone() {
		return getText(IPage_Property_Information_Left_Section.txtHOAPhone);
	}

	@Override
	public void typeHOAPhone(String sHOAPhone) {
		type(IPage_Property_Information_Left_Section.txtHOAPhone, sHOAPhone);		
	}

	@Override
	public String getTextHOAFees() {
		
		return getText(IPage_Property_Information_Left_Section.txtHOAFees);
	}

	@Override
	public void typeHOAFees(String sHOAFees) {
		type(IPage_Property_Information_Left_Section.txtHOAFees, sHOAFees);
		
	}

	@Override
	public String getSelectedHOAPaymentTermOption() {
		
		return getFirstSelectedOption(IPage_Property_Information_Left_Section.cboHOAPaymentTerm);
	}

	@Override
	public void selectHOAPaymentTermOption(String sHOAPaymentTerm) {
		select(IPage_Property_Information_Left_Section.cboHOAPaymentTerm, sHOAPaymentTerm);
		
	}

	@Override
	public String getSelectedAreHOADuesCurrent() {
		
		return getFirstSelectedOption(IPage_Property_Information_Left_Section.cboAreHOADuesCurrent);
	}

	@Override
	public void selectAreHOADuesCurrentOption(String sAreHOADuesCurrent) {
		select(IPage_Property_Information_Left_Section.cboAreHOADuesCurrent, sAreHOADuesCurrent);
		
	}

	@Override
	public boolean isCheckedHOAFeesIncludeInsuranceOption() {

		return isChecked(IPage_Property_Information_Left_Section.chkHOAFeesIncludeInsuranceOption);
	}

	@Override
	public void checkHOAFeesIncludeInsuranceOption() {
		checkCheckbox(IPage_Property_Information_Left_Section.chkHOAFeesIncludeInsuranceOption);
		
	}

	@Override
	public boolean isCheckedHOAFeesIncludeLandscapingOption() {

		return isChecked(IPage_Property_Information_Left_Section.chkHOAFeesIncludeLandscapingOption);
	}

	@Override
	public void checkHOAFeesIncludeLandscapingOption() {
		checkCheckbox(IPage_Property_Information_Left_Section.chkHOAFeesIncludeLandscapingOption);
		
	}

	@Override
	public boolean isCheckedHOAFeesIncludePoolOption() {
		
		return isChecked(IPage_Property_Information_Left_Section.chkHOAFeesIncludePoolOption);
	}

	@Override
	public void checkHOAFeesIncludePoolOption() {
		checkCheckbox(IPage_Property_Information_Left_Section.chkHOAFeesIncludePoolOption);
		
	}

	@Override
	public boolean isCheckedHOAFeesIncludeGymOption() {
		
		return isChecked(IPage_Property_Information_Left_Section.chkHOAFeesIncludeGymOption);
	}

	@Override
	public void checkchkHOAFeesIncludeGymOption() {
		checkCheckbox(IPage_Property_Information_Left_Section.chkHOAFeesIncludeGymOption);
		
	}

	@Override
	public boolean isCheckedHOAFeesIncludeTennisOption() {
		
		return isChecked(IPage_Property_Information_Left_Section.chkHOAFeesIncludeTennisOption);
	}

	@Override
	public void checkHOAFeesIncludeTennisOption() {
		checkCheckbox(IPage_Property_Information_Left_Section.chkHOAFeesIncludeTennisOption);
		
	}

	@Override
	public boolean isCheckedHOAFeesIncludeOtherOption() {
		
		return isChecked(IPage_Property_Information_Left_Section.chkHOAFeesIncludeOtherOption);
	}

	@Override
	public void checkHOAFeesIncludeOtherOption() {
		checkCheckbox(IPage_Property_Information_Left_Section.chkHOAFeesIncludeOtherOption);
		
	}

	@Override
	public String getTextOther__HOAFeesIncludeOtherOption() {
		
		return getText(IPage_Property_Information_Left_Section.txtOther__HOAFeesIncludeOtherOption);
	}

	@Override
	public void typeOther__HOAFeesIncludeOtherOption(String sOther__HOAFeesIncludeOtherOption) {
		type(IPage_Property_Information_Left_Section.txtOther__HOAFeesIncludeOtherOption, sOther__HOAFeesIncludeOtherOption);
		
	}

	@Override
	public String getTextGuestHouseSF() {
	
		return getText(IPage_Property_Information_Right_Section.txtGuestHouseSF);
	}

	@Override
	public void typeGuestHouseSF(String sGuestHouseSF) {
		type(IPage_Property_Information_Right_Section.txtGuestHouseSF, sGuestHouseSF);
		
	}

	@Override
	public String getTextGuestHouseBasementSF() {
		
		return getText(IPage_Property_Information_Right_Section.txtGuestHouseBasementSF);
	}

	@Override
	public void typeGuestHouseBasementSF(String sGuestHouseBasementSF) {
		type(IPage_Property_Information_Right_Section.txtGuestHouseBasementSF, sGuestHouseBasementSF);
		
	}

	@Override
	public String getTextTaxes() {
		
		return getText(IPage_Property_Information_Right_Section.txtTaxes);
	}

	@Override
	public void typeTaxes(String sTaxes) {
		type(IPage_Property_Information_Right_Section.txtTaxes, sTaxes);
		
	}

	@Override
	public String getTextDelinquentTaxes() {

		return getText(IPage_Property_Information_Right_Section.txtDelinquentTaxes);
	}

	@Override
	public void typeDelinquentTaxes(String sDelinquentTaxes) {
		type(IPage_Property_Information_Right_Section.txtDelinquentTaxes, sDelinquentTaxes);
		
	}

	@Override
	public String getSelectedTitleLegalIssuesOption() {

		return getFirstSelectedOption(IPage_Property_Information_Right_Section.cboTitleLegalIssues);
	}

	@Override
	public void selectTitleLegalIssuesOption(String sTitleLegalIssues) {
		select(IPage_Property_Information_Right_Section.cboTitleLegalIssues, sTitleLegalIssues);
		
	}

	@Override
	public String getSelectedBuyerTypeOption() {

		return getFirstSelectedOption(IPage_Property_Information_Right_Section.cboBuyerType);
	}

	@Override
	public void selectBuyerTypeOption(String sBuyerType) {
		select(IPage_Property_Information_Right_Section.cboBuyerType, sBuyerType);
		
	}

	@Override
	public String getTextOwnerOfPublicRecord() {
		
		return getText(IPage_Property_Information_Right_Section.txtOwnerOfPublicRecord);
	}

	@Override
	public void typeOwnerOfPublicRecord(String sOwnerOfPublicRecord) {
		type(IPage_Property_Information_Right_Section.txtOwnerOfPublicRecord, sOwnerOfPublicRecord);
		
	}

	@Override
	public String getTextLegalDescription() {
		
		return getText(IPage_Property_Information_Right_Section.txtLegalDescription);
	}

	@Override
	public void typeLegalDescription(String sLegalDescription) {
		type(IPage_Property_Information_Right_Section.txtLegalDescription, sLegalDescription);
		
	}

	@Override
	public String getSelectedAreAllTypesOfFinancingAvailableForThisPropertyOption() {
		
		return getFirstSelectedOption(IPage_Property_Information_Right_Section.cboAreAllTypesOfFinancingAvailableForThisProperty);
	}

	@Override
	public void selectAreAllTypesOfFinancingAvailableForThisPropertyOption(
			String sAreAllTypesOfFinancingAvailableForThisProperty) {
		select(IPage_Property_Information_Right_Section.cboAreAllTypesOfFinancingAvailableForThisProperty, sAreAllTypesOfFinancingAvailableForThisProperty);
		
	}

	@Override
	public String getTextIfNoExplain() {
		
		return getText(IPage_Property_Information_Right_Section.txtIfNoExplain);
	}

	@Override
	public void typeIfNoExplain(String sIfNoExplain) {
		type(IPage_Property_Information_Right_Section.txtIfNoExplain, sIfNoExplain);
		
	}

	@Override
	public String getSelectedImprovementConditionOption() {
		
		return getFirstSelectedOption(IPage_Property_Information_Right_Section.cboImprovementCondition);
	}

	@Override
	public void selectImprovementConditionOption(String sImprovementCondition) {
		select(IPage_Property_Information_Right_Section.cboImprovementCondition, sImprovementCondition);
		
	}


}
