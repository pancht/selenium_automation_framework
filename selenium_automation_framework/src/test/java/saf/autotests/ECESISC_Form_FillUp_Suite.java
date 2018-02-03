package saf.autotests;

import java.util.stream.Stream;

import org.apache.commons.csv.CSVRecord;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pages.PageOrderForm;
import saf.essentials.ConfigurationProjectSpecific;
import saf.essentials.WaitForPageActions;
import saf.interfaces.IValues;
import saf.testconfig.TestBase;
import saf.util.csv.CsvFileReader;

public class ECESISC_Form_FillUp_Suite extends TestBase {

	@Test(priority = 1, dataProvider = "order_form_test_data_from_csv" , enabled = false)
	public void validateFormFillUpWithTestDataFromCsvFile(String sStreet_Number, String sStreet_Name,
			String sStreet_Suffix, String sCity, String sState, String sZip, String sCounty, String sMLS_Beds,
			String sMLS_Sq_Ft, String sLot_Sq_Ft, String sMLS_Baths, String sYr_Built, String sType, String sOwner_Name,
			String sSubdivision, String sTax_ID, String sParcel_ID, String sLegal_Description, String sAssessment_Year,
			String sAssessed_Value_Total, String sMarket_Value_Total, String sTotal_Tax, String sBuilding_Type,
			String sStories, String sHeat_Type, String sGarage_Type, String sGarage_Capacity, String sFoundation,
			String sBasement, String sBasement_Area_SQFT, String sConstruction, String sExterior, String sCondition,
			String sStyle, String sPool, String sFireplaces, String sView, String sNeighbourhood, String sMLS_Status,
			String sCooling_Type, String sSale_Settlement_Date, String sSold_Price, String sSewer, String sWater) {

		pageOrderForm = new PageOrderForm(pageDriver);

		Reporter.log("Open site URL");
		pageOrderForm.openUrl(ConfigurationProjectSpecific.SITE_URL);

		String sFullAddress = sStreet_Number + ", " + sStreet_Name + ", " + sStreet_Suffix + ", " + sCity + ", "
				+ sState;
		Reporter.log("Type address[" + sFullAddress + "]");
		pageOrderForm.typeAddress(sFullAddress);

		Reporter.log("Select Property Type[" + sType + "]");
		pageOrderForm.selectPropertyType(sType);

		Reporter.log("Select Style[" + sStyle + "]");
		pageOrderForm.selectStyle(sStyle);

		Reporter.log("Select Stories[" + sStories + "]");
		pageOrderForm.selectStoriesOrLevels(sStories);

		/*
		 * Reporter.log("Select Design"); pageOrderForm.selectDesign(sDesign);
		 */

		/*
		 * Reporter.log("Select No of Units");
		 * pageOrderForm.selectNoOfUnits(sNoOfUnits);
		 */

		Reporter.log("Type Year Built[" + sYr_Built + "]");
		pageOrderForm.typeYearBuilt(sYr_Built);

		/*
		 * Reporter.log("Type Age"); pageOrderForm.typeAge(sAge);
		 */

		Reporter.log("Type GLA[" + sMLS_Sq_Ft);
		pageOrderForm.typeGLA(sMLS_Sq_Ft);

		Reporter.log("Type Lot Size Sqft[" + sLot_Sq_Ft + "]");
		pageOrderForm.typeLotSizeSqrt(sLot_Sq_Ft);

		/*
		 * Reporter.log("Type Lot Size Acres");
		 * pageOrderForm.typeLotSizeAcres(sLotSizeAcres);
		 */

		Reporter.log("Select Pool[" + sPool + "]");
		pageOrderForm.selectRadioPool(sPool);

		
		Reporter.log("Type Bed[" + sMLS_Beds + "]"); 
		pageOrderForm.typeBed(sMLS_Beds);
		 

		/*
		 * Reporter.log("Type Full Bath"); pageOrderForm.typeFullBath(sFullBath);
		 */

		/*
		 * Reporter.log("Type Half Bath"); pageOrderForm.typeHalfBath(sHalfBath);
		 */

		sGarage_Capacity = sGarage_Capacity.trim();
		int index_of_last_occurance_of_space = sGarage_Capacity.lastIndexOf(IValues.SPACE);
		String fetchGarageCapacity = sGarage_Capacity.substring(index_of_last_occurance_of_space + 1);

		int index_of_first_occurance_of_space = sGarage_Type.indexOf(IValues.SPACE);
		String fetchGarageType = sGarage_Type.substring(0, index_of_first_occurance_of_space);

		String sGarage = null;

		if (fetchGarageCapacity.length() == 0) {
			sGarage = sGarage_Type;
		} else {
			String sCar = (sGarage_Type.contains("Attached")) ? "car" : "Car";
			sGarage = fetchGarageCapacity + IValues.SPACE + sCar + IValues.SPACE + fetchGarageType;
		}

		Reporter.log("Select Garage[" + sGarage + "]");
		pageOrderForm.selectGarage(sGarage);

		/*
		 * Reporter.log("Select CarPort");
		 * pageOrderForm.selectCarPortType(sCarPortType);
		 */

		Reporter.log("Select Condition[" + sCondition + "]");
		pageOrderForm.selectCondition(sCondition);

		Reporter.log("Select Basement[" + sBasement + "]");
		pageOrderForm.selectBasement(sBasement);

		Reporter.log("Type Basement Area[" + sBasement_Area_SQFT + "]");
		pageOrderForm.typeBasementArea(sBasement_Area_SQFT);

		Reporter.log("Select View[" + sView + "]");
		pageOrderForm.selectView(sView);

		/*
		 * Reporter.log("Select Location[]"); pageOrderForm.selectLocation(sLocation);
		 */
		
		Reporter.log("Type Country[" + sCounty + "]");
		pageOrderForm.typeCountry(sCounty);
		
		Reporter.log("Type Sub Division[" + sSubdivision + "]");
		pageOrderForm.typeSubDivision(sSubdivision);
		
		Reporter.log("Type APN[" + sTax_ID + "]");
		pageOrderForm.typeAPN(sTax_ID);
		
		Reporter.log("Type Assessed Value Total[" + sAssessed_Value_Total + "]");
		pageOrderForm.typeAssessedValue(sAssessed_Value_Total);
		
		/*Reporter.log("Type Prior Date[]");
		pageOrderForm.typePriorDate(sPriorDate);*/
		
		/*Reporter.log("Type Prior Value[]");
		pageOrderForm.typePriorValue(sPriorValue);*/
		
		/*Reporter.log("Type Land Value[]");
		pageOrderForm.typeLandValue(sLandValue);*/
		
		Reporter.log("Type Yearly Tax[" + sTotal_Tax + "]");
		pageOrderForm.typeYearlyTax(sTotal_Tax);
		
		/*Reporter.log("Type Rent[]");
		pageOrderForm.typeRent(sRent);*/
		
		Reporter.log("Type Estimated Value[" + sMarket_Value_Total + "]");
		pageOrderForm.typeEstimatedValue(sMarket_Value_Total);
		
		Reporter.log("Type Owner Name[" + sOwner_Name + "]");
		pageOrderForm.typeOwnerName(sOwner_Name);
		
		/*Reporter.log("Select Listed Or Last 12 Months[]");
		pageOrderForm.checkRadioListedOrLast12Months(sRadioOptionValue);*/
		
		Reporter.log("Select Status[" + sMLS_Status + "]");
		pageOrderForm.selectStatus(sMLS_Status);
		
		/*Reporter.log("Type MLS No[]");
		pageOrderForm.typeMLS_No(sMLS_No);*/
		
		Reporter.log("Type List/Sold Date[" + sSale_Settlement_Date + "]");
		pageOrderForm.typeListOrSoldDate(sSale_Settlement_Date);
		
		Reporter.log("Type List/Sold Price[" + sSold_Price + "]");
		pageOrderForm.typeListOrSoldPrice(sSold_Price);
		
		/*Reporter.log("Type Listed Company[]");
		pageOrderForm.typeListedCompany(sListedCompany);*/
		
		/*Reporter.log("Select REO/Short Sale[]");
		pageOrderForm.selectREO_ShortSale(sREO_ShortSale);*/
		
		/*Reporter.log("Select Boarded Home Option[]");
		pageOrderForm.checkRadioBoardedHome(sRadioOptionValue);;*/
		
		/*Reporter.log("Select Repairs[]");
		pageOrderForm.checkRadioRepairs(sRadioOptionValue);*/
		
		/*Reporter.log("Type Repair Description[]");
		pageOrderForm.typeRepairDescription(sRepairDesription);*/
		
		/*Reporter.log("Type Amount[]");
		pageOrderForm.typeAmount(sAmount);*/
		
		/*Reporter.log("Total Repairs[]");
		pageOrderForm.typeTotalRepairs(sTotalRepairs);*/
		
		/*Reporter.log("Type LegalDescription[]");
		pageOrderForm.typeLegalDescription(sLegalDescription);;*/
		
		Reporter.log("Click Save button");
		pageOrderForm.btnClickSave();
		
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@DataProvider(name = "order_form_test_data_from_csv")
	public Object[][] getTableArray() throws Exception {

		String[][] tabArray = null;

		Iterable<CSVRecord> csvRecords = CsvFileReader
				.readExcelCsvFile(ConfigurationProjectSpecific.pathTestDataExcelCsv);

		int startRow = 0;

		int startCol = 0;

		int ci, cj;

		int totalRows = (int) Stream.of(csvRecords).count();

		// you can write a function as well to get Column count

		int totalCols = ConfigurationProjectSpecific.File_headers.size();

		System.out.println("TotalRows[" + totalRows + "] TotalColumns[" + totalCols + "]");

		tabArray = new String[totalRows][totalCols];

		ci = 0;

		csvRecords = CsvFileReader.readExcelCsvFile(ConfigurationProjectSpecific.pathTestDataExcelCsv);

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
				tabArray[ci][cj] = csv_record.get(ConfigurationProjectSpecific.File_headers.get(cj));

				// System.out.println(tabArray[ci][cj] + ",");

			}

			ci++;

		}

		return (tabArray);

	}

}
