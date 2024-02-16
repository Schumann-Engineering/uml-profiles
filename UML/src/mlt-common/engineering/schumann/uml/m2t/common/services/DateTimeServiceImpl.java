package engineering.schumann.uml.m2t.common.services;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class DateTimeServiceImpl {
	public static String getCurrentDateTime()
	{
		return toString(DateFormat.getDateTimeInstance());
	}
	
	
	public static String getCurrentDateTimeRFC3339()
	{
		var timestamp = new Date();
		
		var timeformat = new SimpleDateFormat(
					// 2022-04-18T21:15:00+0000
					"yyyy-MM-dd'T'HH:mm:ssZ"
			);
		
		var result = timeformat.format(
				timestamp
			);
		
		return result;
	}
	
	
	public static String getCurrentDate()
	{
		return toString(DateFormat.getDateInstance());
	}	
	
	
	public String getCurrentTime()
	{
		return toString(DateFormat.getTimeInstance());
	}	
	
	
	private static String toString(
		DateFormat formatter
	) {
		formatter.setTimeZone(TimeZone.getDefault());
		
		var result = formatter.format(new Date());
		
		// === RESULT ===
		return result;
	}
}
