package engineering.schumann.uml.m2t.common.services;

import java.text.DateFormat;
import java.util.Date;
import java.util.TimeZone;

public class DateTimeServiceImpl {
	public String getCurrentDateTime()
	{
		return toString(DateFormat.getDateTimeInstance());
	}
	
	
	public String getCurrentDate()
	{
		return toString(DateFormat.getDateInstance());
	}	
	
	
	public String getCurrentTime()
	{
		return toString(DateFormat.getTimeInstance());
	}	
	
	
	private String toString(
		DateFormat formatter
	) {
		formatter.setTimeZone(TimeZone.getDefault());
		
		var result = formatter.format(new Date());
		
		// === RESULT ===
		return result;
	}
}
