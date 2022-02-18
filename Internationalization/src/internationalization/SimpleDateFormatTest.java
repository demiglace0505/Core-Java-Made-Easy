package internationalization;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatTest {
	public static void main(String[] args) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/M/yyyy hh::mm:ss");
		String date = sdf.format(new Date());
		System.out.println(date);
		
		String dateAsString = "05-05-2022";
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd-M-yyyy");
		Date date2 = sdf2.parse(dateAsString);
		
		System.out.println(date2);
	}
}
