package saf.util.csv;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;

/**
 * This class contains methods to operate on CSV Files
 * 
 * @author Panchdev Chauhan
 *
 */
public class CsvFileWriter {

	/**
	 * This method creates a new Csv file with GivenFilePath and Headers <br/>
	 * No record is being added/inserted.
	 * 
	 * @param sFilePath
	 * @param header
	 * @throws IOException
	 */
	public static void writeExcelCsvFileHeader(String sFilePath, String... header) throws IOException {
		try (BufferedWriter writer = Files.newBufferedWriter(Paths.get(sFilePath),StandardOpenOption.CREATE,StandardOpenOption.APPEND);

				CSVPrinter csvPrinter = new CSVPrinter(writer, CSVFormat.EXCEL.withHeader(header));

		) {
			
			csvPrinter.flush(); //Flush Data to Physical FileSystem
		}
	}
	
	/**
	 * This method creates a new Csv file with GivenFilePath and csvRecord data <br/>
	 * Keeping First Record As Header
	 * 
	 * @param sFilePath
	 * @param csvRecord
	 * @param header
	 * @throws IOException
	 */
	public static void writeExcelCsvFile(String sFilePath, String[] csvRecord,String... header) throws IOException {
		try (BufferedWriter writer = Files.newBufferedWriter(Paths.get(sFilePath),StandardOpenOption.CREATE,StandardOpenOption.APPEND);

				CSVPrinter csvPrinter = new CSVPrinter(writer, CSVFormat.EXCEL.withFirstRecordAsHeader());

		) {
			csvPrinter.printRecord(csvRecord);

			csvPrinter.flush(); //Flush Data to Physical FileSystem
		}
	}
}
