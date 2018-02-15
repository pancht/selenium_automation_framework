package saf.util.csv;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;

/**
 * This class contains methods to read CSV files
 * 
 * {@link http://commons.apache.org/proper/commons-csv/user-guide.html} 
 * 
 * @author Panchdev Chauhan
 *
 */
public class CsvFileReader {

	/**
	 * Reads in Given Excel csv file and perfomrs following operations
	 * 1. Removes Header from Excel CSV file
	 * 2. Returns rest of the CSV Records 
	 * 
	 * @param pathExcelCsv
	 * @return Iterable<CSVRecord>
	 * @throws FileNotFoundException 
	 */
	public static Iterable<CSVRecord> getCSVRecordsExcludingHeaderFromExcelCsv(String pathExcelCsv) throws FileNotFoundException {
		
		Reader in = null;
		
		try { // Error Handling Block To Detect java.io.FileNotFoundException
			  // While trying to Open a File Which does not exists at all.
			
			// Create a java.io.FileReader Instance From Given FilePath
			in = new FileReader(pathExcelCsv);
			
		} finally {		}

		
		Iterable<CSVRecord> records = null;
		try {
			// Remove Header From Excel Csv File
			records = CSVFormat.EXCEL.withFirstRecordAsHeader().parse(in);
		} catch (IOException e) {
			e.printStackTrace(System.out);
		}

		return records; //Return reference to CSVRecords Excluding Header Record
	}

}