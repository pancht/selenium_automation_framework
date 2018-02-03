package saf.util.csv;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

/**
 * {@link} http://commons.apache.org/proper/commons-csv/user-guide.html
 * @author Panchdev Chauhan
 *
 */
public class CsvFileReader {

	// CSV file header
	// private static final String [] FILE_HEADER_MAPPING =
	// {"id","firstName","lastName","gender","age"};

	// Student attributes
	/*
	 * private static final String STUDENT_ID = "id"; private static final String
	 * STUDENT_FNAME = "firstName"; private static final String STUDENT_LNAME =
	 * "lastName"; private static final String STUDENT_GENDER = "gender"; private
	 * static final String STUDENT_AGE = "age";
	 */

	public static List<CSVRecord> readCsvFile(String fileName, String[] FILE_HEADER_MAPPING) {

		FileReader fileReader = null;

		CSVParser csvFileParser = null;

		// Create the CSVFormat object with the header mapping
		CSVFormat csvFileFormat = CSVFormat.DEFAULT.withHeader(FILE_HEADER_MAPPING);

		// Get a list of CSV file records
		List csvRecords = null;

		try {

			// Create a new list of student to be filled by CSV file data
			List students = new ArrayList();

			// initialize FileReader object
			fileReader = new FileReader(fileName);

			// initialize CSVParser object
			csvFileParser = new CSVParser(fileReader, csvFileFormat);

			// Get a list of CSV file records
			csvRecords = csvFileParser.getRecords();

			// Read the CSV file records starting from the second record to skip the header
			for (int i = 1; i < csvRecords.size(); i++) {
				CSVRecord record = (CSVRecord) csvRecords.get(i);
				// Create a new student object and fill his data
				/*
				 * Student student = new Student(Long.parseLong(record.get(STUDENT_ID)),
				 * record.get(STUDENT_FNAME), record.get(STUDENT_LNAME),
				 * record.get(STUDENT_GENDER), Integer.parseInt(record.get(STUDENT_AGE)));
				 * students.add(student);
				 */
			}

			// Print the new student list
			/*
			 * for (Student student : students) { System.out.println(student.toString()); }
			 */
		} catch (Exception e) {
			System.out.println("Error in CsvFileReader !!!");
			e.printStackTrace();
		} finally {
			try {
				fileReader.close();
				csvFileParser.close();
			} catch (IOException e) {
				System.out.println("Error while closing fileReader/csvFileParser !!!");
				e.printStackTrace();
			}

			return csvRecords;
		}

	}
	
	
	public static Iterable<CSVRecord> readExcelCsvFile(String pathExcelCsv){
		Reader in = null;
		try {
			in = new FileReader(pathExcelCsv);
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
		Iterable<CSVRecord> records = null;
		try {
			//records = CSVFormat.EXCEL.parse(in);
			records = CSVFormat.RFC4180.withFirstRecordAsHeader().parse(in);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return records;
	}

}