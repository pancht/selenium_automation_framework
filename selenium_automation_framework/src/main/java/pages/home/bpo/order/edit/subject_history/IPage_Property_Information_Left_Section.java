package pages.home.bpo.order.edit.subject_history;

import org.openqa.selenium.By;

interface IPage_Property_Information_Left_Section {
	
	By cboIsTheSubjectVisible = By.xpath("//label[text()='Is the Subject Visible?']/../..//select") ;
	
	By cboPropertyVacant = By.xpath("//label[text()='Property Vacant:']/../..//select");
	
	By cboIfOccupied_WhoIsTheOccupant = By.xpath("//label[text()='If occupied, who is the occupant?']/../..//select");
	
	By cboSecured = By.xpath("//label[text()='Secured:']/../..//select");
	
	By txtLandValue = By.xpath("//label[text()='Land Value:']/../..//input");
	
	By cboView = By.xpath("//label[text()='View:']/../..//select");
	
	By cboIsTheSubjectIncludedInAnHOAOrOtherAssociation = By.xpath("//label[text()='Is the subject included in an HOA or other Association?']/../..//select");
	
	By txtHOAName = By.xpath("//label[text()='HOA Name:']/../..//input");
	
	By txtHOAPhone = By.xpath("//label[text()='HOA Phone:']/../..//input");
	
	By txtHOAFees = By.xpath("//label[text()='HOA Fees:']/../..//input");
	
	By cboHOAPaymentTerm = By.xpath("//label[text()='HOA Payment Term:']/../..//select");
	
	By cboAreHOADuesCurrent = By.xpath("//label[text()='Are HOA Dues Current?']/../..//select");
	
	By chkHOAFeesIncludeInsuranceOption = By.xpath("//label[text()='HOA Fees Include:']/../..//tr//label[text()='Insurance']/../../td[1]/input");
	By chkHOAFeesIncludeLandscapingOption = By.xpath("//label[text()='HOA Fees Include:']/../..//tr//label[text()='Landscaping']/../../td[3]/input");
	By chkHOAFeesIncludePoolOption = By.xpath("//label[text()='HOA Fees Include:']/../..//tr//label[text()='Pool']/../../td[5]/input");
	By chkHOAFeesIncludeGymOption = By.xpath("//label[text()='HOA Fees Include:']/../..//tr//label[text()='Gym']/../../td[1]/input");
	By chkHOAFeesIncludeTennisOption = By.xpath("//label[text()='HOA Fees Include:']/../..//tr//label[text()='Tennis']/../../td[3]/input");
	By chkHOAFeesIncludeOtherOption = By.xpath("//label[text()='HOA Fees Include:']/../..//tr//label[text()='Other:']/../../td[5]/input");
	By txtOther__HOAFeesIncludeOtherOption = By.xpath("//label[text()='HOA Fees Include:']/../..//tr//label[text()='Other:']/../../td[6]/input");
	
	public String getSelectedIsTheSubjectVisibleOption();
	public void selectIsTheSubjectVisibleOption(String sIsTheSubjectVisible);
	
	public String getSelectedPropertyVacantOption();
	public void selectPropertyVacantOption(String sPropertyVacant);
	
	public String getSelectedIfOccupied_WhoIsTheOccupantOption();
	public void selectIfOccupied_WhoIsTheOccupantOption(String sIfOccupied_WhoIsTheOccupant);
	
	public String getSelectedSecuredOption();
	public void selectSecuredOption(String sSecured);
	
	public String getTextLandValue();
	public void typeLandValue(String sLandValue);
	
	public String getSelectedView();
	public void selectView(String sView);
	
	public String getSelectedIsTheSubjectIncludedInAnHOAOrOtherAssociationOption();
	public void selectIsTheSubjectIncludedInAnHOAOrOtherAssociationOption(String sIsTheSubjectIncludedInAnHOAOrOtherAssociation);
	
	public String getTextHOAName();
	public void typeHOAName(String sHOAName);
	
	public String getTextHOAPhone();
	public void typeHOAPhone(String sHOAPhone);
	
	public String getTextHOAFees();
	public void typeHOAFees(String sHOAFees);
	
	public String getSelectedHOAPaymentTermOption();
	public void selectHOAPaymentTermOption(String sHOAPaymentTerm);
	
	public String getSelectedAreHOADuesCurrent();
	public void selectAreHOADuesCurrentOption(String sAreHOADuesCurrent);
	
	public boolean isCheckedHOAFeesIncludeInsuranceOption();
	public void checkHOAFeesIncludeInsuranceOption();
	
	public boolean isCheckedHOAFeesIncludeLandscapingOption();
	public void checkHOAFeesIncludeLandscapingOption();
	
	public boolean isCheckedHOAFeesIncludePoolOption();
	public void checkHOAFeesIncludePoolOption();
	
	public boolean isCheckedHOAFeesIncludeGymOption();
	public void checkchkHOAFeesIncludeGymOption();
	
	public boolean isCheckedHOAFeesIncludeTennisOption();
	public void checkHOAFeesIncludeTennisOption();
	
	public boolean isCheckedHOAFeesIncludeOtherOption();
	public void checkHOAFeesIncludeOtherOption();
	
	
	public String getTextOther__HOAFeesIncludeOtherOption();
	public void typeOther__HOAFeesIncludeOtherOption(String sOther__HOAFeesIncludeOtherOption);
	
	
	
	
	
	
}
