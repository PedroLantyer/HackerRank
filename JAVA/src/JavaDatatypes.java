import java.util.*;

public class JavaDatatypes {

	public static String Fits(long n) 
	{
		String result = "";
		
		if(n >= Byte.MIN_VALUE && n <= Byte.MAX_VALUE)
		{
			result += "* byte\n";
		}
		if(n >= Short.MIN_VALUE && n <= Short.MAX_VALUE)
		{
			result += "* short\n";
		}
		if(n >= Integer.MIN_VALUE && n <= Integer.MAX_VALUE)
		{
			result += "* int\n";
		}
		if(n >= Long.MIN_VALUE && n <= Long.MAX_VALUE)
		{
			result += "* long";
		}
		
		if(!result.isEmpty()) 
		{
			String finalValue = String.format("%s can be fitted in:\n%s", Long.toString(n), result);
			return finalValue;
		}
		return (String.format("%s can't be fitted anywhere.", Long.toString(n)));
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int testCases = input.nextInt();
		
		for(int i = 0; i < testCases; i++) 
		{
			try 
			{
				long num = input.nextLong();
				System.out.println(Fits(num));
			}
			catch(Exception e)
			{
				System.out.println(input.next()+" can't be fitted anywhere.");
			}
		}
		
		input.close();
	}
}