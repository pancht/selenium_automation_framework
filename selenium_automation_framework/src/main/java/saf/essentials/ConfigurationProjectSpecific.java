package saf.essentials;

import java.util.Hashtable;

import org.openqa.selenium.WebDriver;

import saf.util.PropertyLoader;

/*******************************************************************************
 *******************************************************************************
 * This class contains Project Specific configurations 
 *  
 * @author Panchdev Chauhan
 *******************************************************************************
 *******************************************************************************/
public abstract class ConfigurationProjectSpecific extends PageActionsProjectSpecific {

	public static String SITE_URL = PropertyLoader.loadProperty("site.url");

	public static String pathTestDataExcelCsv = PATH_USER_DIR + PATH_SEPARATOR + "src" + PATH_SEPARATOR + "test"
			+ PATH_SEPARATOR + "resources" + PATH_SEPARATOR + PropertyLoader.loadProperty("test.data.csv");

	public static String pathBPO_Asset_Orders_Edit_Form_Subject_History_Tab_Form_FillUp_Test_Data = PATH_USER_DIR
			+ PATH_SEPARATOR + "src" + PATH_SEPARATOR + "test" + PATH_SEPARATOR + "resources" + PATH_SEPARATOR
			+ "bpo_asset_orders_edit_form_subject_history_tab_form_fillUp_test_data.csv";

	/**
	 * Constructor 
	 * 
	 * @param pageDriver
	 */
	public ConfigurationProjectSpecific(WebDriver pageDriver) {
		super(pageDriver);

	}

	public static Hashtable<Integer, String> File_headers = new Hashtable<Integer, String>() {
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;

		{
			put(0, "Street Number");
			put(1, "Street Name");
			put(2, "Street Suffix");
			put(3, "City");
			put(4, "State");
			put(5, "Zip");
			put(6, "County");
			put(7, "MLS Beds");
			put(8, "MLS Sq Ft");
			put(9, "Lot Sq Ft");
			put(10, "MLS Baths");
			put(11, "Yr Built");
			put(12, "Type");
			put(13, "Owner Name");
			put(14, "Subdivision");
			put(15, "Tax ID");
			put(16, "Parcel ID");
			put(17, "Legal Description");
			put(18, "Assessment Year");
			put(19, "Assessed Value - Total");
			put(20, "Market Value - Total");
			put(21, "Total Tax");
			put(22, "Building Type");
			put(23, "Stories");
			put(24, "Heat Type");
			put(25, "Garage Type");
			put(26, "Garage Capacity");
			put(27, "Foundation");
			put(28, "Basement");
			put(29, "Basement Area/SQFT");
			put(30, "Construction");
			put(31, "Exterior");
			put(32, "Condition");
			put(33, "Style");
			put(34, "Pool");
			put(35, "Fireplaces");
			put(36, "View");
			put(37, "Neighbourhood");
			put(38, "MLS Status");
			put(39, "Cooling Type");
			put(40, "Sale/Settlement Date");
			put(41, "Sold Price");
			put(42, "Sewer");
			put(43, "Water");
		}

	};

	public static Hashtable<Integer, String> File_Headers_BPO_Asset_Orders_Edit_Form_Subject_History_Tab_Form_FillUp_Test_Data = new Hashtable<Integer, String>() {
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;

		{
			put(0, "Listed in last 12 months:");
			put(1, "Currently Listed:");
			put(2, "Has subject been listed multiple times in last 12 months:");
			put(3, "Current List Date:");
			put(4, "Current/Final List Price:");
			put(5, "Original List Date:");
			put(6, "Original List Price:");
			put(7, "DOM:");
			put(8, "Listing Broker:");
			put(9, "Listing Company:");
			put(10, "Listing Phone:");
			put(11, "If listed, is a For Sale sign visible?");
			put(12, "To the best of your knowledge, why did the property not sell?");
			put(13, "Sold in Last 12 Mo:");
			put(14, "Last List Date:");
			put(15, "Final List Price(Last Sold Price):");
			put(16, "Original List Date(Last Sold Price):");
			put(17, "Original List Price(Last Sold Price):");
			put(18, "DOM(Last Sold Price):");
			put(19, "Sales Price:");
			put(20, "Sale Date:");
			put(21, "Listing Broker(Last Sold Price):");
			put(22, "Listing Company(Last Sold Price):");
			put(23, "Listing Phone(Last Sold Price):");
			put(24, "Is the Subject Visible?");
			put(25, "Property Vacant:");
			put(26, "If occupied, who is the occupant?");
			put(27, "Secured:");
			put(28, "Land Value:");
			put(29, "View:");
			put(30, "Is the subject included in an HOA or other Association?");
			put(31, "HOA Name:");
			put(32, "HOA Phone:");
			put(33, "HOA Fees:");
			put(34, "HOA Payment Term:");
			put(35, "Are HOA Dues Current?");
			put(36, "HOA Fees Include(Insurance):");
			put(37, "HOA Fees Include(Landscapping):");
			put(38, "HOA Fees Include(Pool):");
			put(39, "HOA Fees Include(Gym):");
			put(40, "HOA Fees Include(Tenis):");
			put(41, "HOA Fees Include(Other):");
			put(42, "Guest House SF:");
			put(43, "Guest House Basement SF:");
			put(44, "Taxes:");
			put(45, "Delinquent Taxes:");
			put(46, "Title/Legal Issues:");
			put(47, "Buyer Type:");
			put(48,"Owner Of Public Record:");
			put(49, "Legal Description:");
			put(50,"Are all types of financing available for this property?");
			put(51, "If no, Explain:");
			put(52, "Improvement Condition:");
		}

	};

}
