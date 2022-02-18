package internationalization;

import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormatTest {
	public static void main(String[] args) {
		Double d = 12312.12312;
		NumberFormat nf = NumberFormat.getInstance();
		nf.setMinimumFractionDigits(4);
		System.out.println(nf.format(d));
	}
}
