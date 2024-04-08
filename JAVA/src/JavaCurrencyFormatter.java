import java.text.NumberFormat;
import java.util.*;

public class JavaCurrencyFormatter {
	
	public static Locale CreateIndianLocale() 
	{
		Locale india = new Locale.Builder().setLanguage("en").setRegion("IN").build();
		return india;
	}
	
	public static void GetConvertedCurrency(double value, String countryName, Locale country) 
	{	
		String result = countryName + ": " + NumberFormat.getCurrencyInstance(country).format(value);
		System.out.println(result);
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double value = input.nextDouble();
		
		Locale[] countries = {Locale.US, CreateIndianLocale(), Locale.CHINA, Locale.FRANCE};
		String[] countryName = {countries[0].getCountry(), countries[1].getDisplayCountry(), countries[2].getDisplayCountry(), countries[3].getDisplayCountry()};
		
		for(int i = 0; i < countries.length; i++) 
		{
			GetConvertedCurrency(value, countryName[i], countries[i]);
		}
		
		input.close();
	}

}
