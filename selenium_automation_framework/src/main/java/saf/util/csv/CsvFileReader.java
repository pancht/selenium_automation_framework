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
	 * Read GivenExcelCsvFile and return CsvRecords with removing header 
	 * 
	 * @param pathExcelCsv
	 * @return
	 */
	public static Iterable<CSVRecord> readExcelCsvFile(String pathExcelCsv) {
		Reader in = null;
		try {
			in = new FileReader(pathExcelCsv);
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		Iterable<CSVRecord> records = null;
		try {
			// records = CSVFormat.EXCEL.parse(in);
			records = CSVFormat.EXCEL.withFirstRecordAsHeader().parse(in);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return records;
	}
	
	
}