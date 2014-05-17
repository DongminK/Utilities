package dmk.utilities.date;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class DateUtil {

	/**
	 * yyyyMMdd 포맷의 오늘날짜를 반환한다.
	 * @return 
	 */
	public static String today() {
		
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMdd");
		Calendar calendar = Calendar.getInstance();
		
		return dateFormat.format(calendar.getTime());
		
	}
	
	
}
