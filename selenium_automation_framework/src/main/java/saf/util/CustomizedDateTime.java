package saf.util;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CustomizedDateTime {

	/**
	 * Return today's date in given dateFormat
	 *
	 * @param dateFormat
	 * @return
	 */
	public static String getDateToday(String dateFormat) {
		DateFormat _dateFormat = new SimpleDateFormat(dateFormat);
		Calendar c = Calendar.getInstance();
		c.setTime(new Date());
		return _dateFormat.format(c.getTime());
	}

	
}
