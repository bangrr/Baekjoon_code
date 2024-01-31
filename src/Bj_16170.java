import java.util.*;

public class Bj_16170 {
	public static void main(String[] args) {
		Date now = new Date();
		Calendar cal = Calendar.getInstance(TimeZone.getTimeZone("UTC+0"));
		cal.setTime(now);
		
		System.out.println(cal.get(Calendar.YEAR));
		System.out.println(cal.get(Calendar.MONTH)+1);
		System.out.println(cal.get(Calendar.DAY_OF_MONTH));
	}
}