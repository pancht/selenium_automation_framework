package saf.testconfig;

import java.util.Hashtable;
import java.util.Iterator;

import org.apache.commons.csv.CSVRecord;
import org.testng.annotations.DataProvider;

import saf.util.PropertyLoader;
import saf.util.csv.CsvFileReader;

public class DataProviders extends TestNG_SAF {

	static String FILE_PATH_TO_USERS_CSV_FILE = PATH_USER_DIR.concat(PATH_SEPARATOR).concat("src")
			.concat(PATH_SEPARATOR).concat("test").concat(PATH_SEPARATOR).concat("resources").concat(PATH_SEPARATOR)
			.concat(PropertyLoader.loadProperty("test.data.users.csv"));;

	/**
	 * This DataProvider Method Reads users.csv file <br/>
	 * And Passed it to the @Test method as Parameters
	 * 		
	 * @return
	 * @throws Exception
	 */
	@DataProvider(name = "test_data_users_list")
	public Object[][] getUsersTableArray() throws Exception {

		String[][] tabArray = null;

		/*
		 * String filePathToUsersCSV =
		 * PATH_USER_DIR.concat(PATH_SEPARATOR).concat("src").concat(PATH_SEPARATOR)
		 * .concat("test").concat(PATH_SEPARATOR).concat("resources").concat(
		 * PATH_SEPARATOR) .concat(PropertyLoader.loadProperty("test.data.users.csv"));
		 */

		Hashtable<Integer, String> Users_File_Headers = new Hashtable<Integer, String>() {
			private static final long serialVersionUID = 1L;
			{
				put(0, "email");
				put(1, "password");
			}

		};

		Iterable<CSVRecord> csvRecords = CsvFileReader.readExcelCsvFile(FILE_PATH_TO_USERS_CSV_FILE);

		int startCol = 0;

		int ci, cj;

		int totalRows = 0, count = 0;

		for (Iterator<CSVRecord> iterator = csvRecords.iterator(); iterator.hasNext();) {
			iterator.next();
			count++;
		}
		totalRows = count;

		// System.out.println("Total Rows:" + totalRows);

		// you can write a function as well to get Column count

		int totalCols = 2;

		// System.out.println("TotalRows[" + totalRows + "] TotalColumns[" + totalCols +
		// "]");

		tabArray = new String[totalRows][totalCols];

		ci = 0;

		csvRecords = CsvFileReader.readExcelCsvFile(FILE_PATH_TO_USERS_CSV_FILE);

		for (CSVRecord csv_record : csvRecords) {

			cj = 0;

			for (int j = startCol; j < totalCols; j++, cj++) {

				tabArray[ci][cj] = csv_record.get(Users_File_Headers.get(cj));

				// System.out.print(tabArray[ci][cj]);

				if (j < totalCols - 1) {
					// System.out.print(",");
				}

			}

			// System.out.println();

			ci++;

		}

		return (tabArray);

	}

}
