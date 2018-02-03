package saf.autotests;

import java.util.stream.Stream;

import org.apache.commons.csv.CSVRecord;
import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import junit.framework.Assert;
import pages.home.bpo.order.edit.subject_history.Page_BPO_Order_Edit_Subject_History_Tab_Default_Landing_Tab;
import pages.login.Page_Login;
import saf.essentials.ConfigurationProjectSpecific;
import saf.testconfig.TestBase;
import saf.util.csv.CsvFileReader;

public class BPO_Asset_Orders_Edit_Form_Subject_History_Tab_TestSuite extends TestBase{
	
	@Test(priority = 1, dataProvider = "bpo_asset_orders_edit_form_subject_history_tab_form_fillUp_test_data_from_csv")
	public void validateBPO_Asset_Orders_Edit_Form_Subject_History_Tab_Form_FillUp(String sListedInLlast12Months,String sCurrentlyListed,String sHasSubjectBeenListedMultipleTimesInLast12Months,
			String sCurrentListDate, String sCurrentFinalListPrice, String sOriginalListDate, String sOriginalListPrice,
			String sDOMCurrentListingInformation, String sListingBroker, String sListingCompany, String sListingPhone,
			String sIfListedIs_A_ForSaleSignVisible, String sToTheBestOfYourKnowledgeWhyDidThePropertyNotSell,
			String sSoldInLast12Mo, String sLastListDate, String sFinalListPrice_LastSoldPrice, 
			String sOriginalListDate_LastSoldPrice, String sOriginalListPrice_LastSoldPrice, String sDOM_LastSoldPrice,
			String sSalesPrice, String sSaleDate, String sListingBroker_LastSoldPrice, String sListingCompany_LastSoldPrice,
			String sListingPhone_LastSoldPrice, String sIsTheSubjectVisible, String sPropertyVacant,
			String sIfOccupiedWhoIsTheOccupant, String sSecured, String sLandValue, String sView,
			String sIsTheSubjectIncludedInAnHOA_OrOtherAssociation, String sHOAName, String sHOAPhone,
			String sHOAFees, String sHOAPaymentTerm, String sAreHOADuesCurrent, String sHOAFeesInclude_Insurance,
			String sHOA_Fees_Include_Landscapping, String sHOAFeesInclude_Pool, String sHOAFeesInclude_Gym, String sHOAFeesInclude_Tenis,
			String sHOAFeesInclude_Other, String sGuestHouseSF, String sGuestHouseBasementSF, String sTaxes, 
			String sDelinquentTaxes, String sTitleLegalIssues, String sBuyerType,
			String sOwnerOfPublicRecord, String sLegalDescription,
			String sAreAllTypesOfFinancingAvailableForThisProperty, String sIfNoExplain,
			String sImprovementCondition) {
		
		String sUserName = "VickyS21";
		String sPassword = "VickyS$20";
		page_Login = new Page_Login(pageDriver);
		page_Login.openUrl("https://bpofulfillment.com/");
		
		/*page_Login.typeUserName(sUserName);
		page_Login.typePassword(sPassword);
		page_SecurityQuestionPage = page_Login.clickButtonLogin();*/
		
		/*try {
			Thread.sleep(35000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
		/*page_BPO_Order_Edit_Subject_History_Tab_Default_Landing_Tab = new Page_BPO_Order_Edit_Subject_History_Tab_Default_Landing_Tab(pageDriver);
		
		By txtInspectionDate_Field_1 = By.xpath("//h5[text()='Current Listing Information']/../table//tr[1]/td[2]//select");
		page_BPO_Order_Edit_Subject_History_Tab_Default_Landing_Tab.waitForElementDisplayed(txtInspectionDate_Field_1, 600);
		
		page_BPO_Order_Edit_Subject_History_Tab_Default_Landing_Tab.selectIsListedInLast12MonthsOption_CurrentListingInformationSection(sListedInLlast12Months);
		
		page_BPO_Order_Edit_Subject_History_Tab_Default_Landing_Tab.selectIsCurrentlyListedOption_CurrentListingInformationSection(sCurrentlyListed);
		
		page_BPO_Order_Edit_Subject_History_Tab_Default_Landing_Tab.selectHasSubjectBeenListedMultipleTimesInLast12MonthsOption_CurrentListingInformationSection(sHasSubjectBeenListedMultipleTimesInLast12Months);
		
		page_BPO_Order_Edit_Subject_History_Tab_Default_Landing_Tab.typeCurrentListedDate_CurrentListingInformationSection(sCurrentListDate);
				
		page_BPO_Order_Edit_Subject_History_Tab_Default_Landing_Tab.typeCurrentFinalListPrice_CurrentListingInformationSection(sCurrentFinalListPrice);
		
		page_BPO_Order_Edit_Subject_History_Tab_Default_Landing_Tab.typeOriginalListdate_CurrentListingInformationSection(sOriginalListDate);
		
		page_BPO_Order_Edit_Subject_History_Tab_Default_Landing_Tab.typeOriginalListPrice_CurrentListingInformationSection(sOriginalListPrice);
		
		String expectedDOM = page_BPO_Order_Edit_Subject_History_Tab_Default_Landing_Tab.getDOMCurrentListingInformationSection_CurrentListingInformationSection();
		
		page_BPO_Order_Edit_Subject_History_Tab_Default_Landing_Tab.typeListingPhone_CurrentListingInformationSection(sListingPhone);
		
		Assert.assertEquals(expectedDOM, sDOMCurrentListingInformation);
		
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		*/
		

	}
	
	@DataProvider(name = "bpo_asset_orders_edit_form_subject_history_tab_form_fillUp_test_data_from_csv")
	public Object[][] getBPO_Asset_Orders_Edit_Form_Subject_History_Tab_Form_FillUp_TestData_TableArray() throws Exception {

		String[][] tabArray = null;

		Iterable<CSVRecord> csvRecords = CsvFileReader
				.readExcelCsvFile(ConfigurationProjectSpecific.pathBPO_Asset_Orders_Edit_Form_Subject_History_Tab_Form_FillUp_Test_Data);

		int startRow = 0;

		int startCol = 0;

		int ci, cj;

		int totalRows = (int) Stream.of(csvRecords).count();

		// you can write a function as well to get Column count

		int totalCols = ConfigurationProjectSpecific.File_Headers_BPO_Asset_Orders_Edit_Form_Subject_History_Tab_Form_FillUp_Test_Data.size();

		System.out.println("TotalRows[" + totalRows + "] TotalColumns[" + totalCols + "]");

		tabArray = new String[totalRows][totalCols];

		ci = 0;

		csvRecords = CsvFileReader.readExcelCsvFile(ConfigurationProjectSpecific.pathBPO_Asset_Orders_Edit_Form_Subject_History_Tab_Form_FillUp_Test_Data);

		for (CSVRecord csv_record : csvRecords) {

			cj = 0;

			for (int j = startCol; j < totalCols; j++, cj++) {

				/**
				 * If you encounter following or similar exception while running tests
				 * 
				 * "java.lang.IllegalArgumentException: Mapping for Assessed Value - Total not
				 * found"
				 * 
				 * Resolution: Open test data csv file, remove any trailing and leading spaces
				 * in header names
				 * 
				 */
				tabArray[ci][cj] = csv_record.get(ConfigurationProjectSpecific.File_Headers_BPO_Asset_Orders_Edit_Form_Subject_History_Tab_Form_FillUp_Test_Data.get(cj));

				// System.out.println(tabArray[ci][cj] + ",");

			}

			ci++;

		}

		return (tabArray);

	}
	
	
}
