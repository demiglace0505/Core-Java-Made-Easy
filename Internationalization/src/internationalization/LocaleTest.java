package internationalization;

import java.util.Locale;

public class LocaleTest {
	public static void main(String[] args) {
		Locale l = Locale.getDefault();
		System.out.println(l.getDisplayCountry() + l.getDisplayLanguage());
		
		Locale.setDefault(Locale.UK);
		System.out.println(Locale.getDefault().getDisplayCountry());
		
		String[] isoCountries = Locale.getISOCountries();
		for (String country : isoCountries) {
			System.out.println(country);
		}
		
		String[] isoLanguages = Locale.getISOLanguages();
		for (String language : isoLanguages) {
			System.out.println(language);
		}
	}
}
