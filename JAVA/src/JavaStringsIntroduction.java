import java.util.*;

public class JavaStringsIntroduction {

	public static int SumLengths(String strA, String strB) 
	{
		return (strA.length() + strB.length());
	}
	
	public static String LexGreater(String strA, String strB) 
	{
		if(strA.toLowerCase().charAt(0) > strB.toLowerCase().charAt(0)) 
		{
			return "Yes";
		}
		return "No";
	}
	
	public static String CapitalizeAndJoin(String strA, String strB) 
	{
		strA = strA.substring(0, 1).toUpperCase() + strA.substring(1);
		strB = strB.substring(0, 1).toUpperCase() + strB.substring(1);
		
		String result = String.join(" ", strA, strB);
		return result;
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String strA = input.next();
		String strB = input.next();
		
		System.out.println(SumLengths(strA, strB));
		System.out.println(LexGreater(strA, strB));
		System.out.println(CapitalizeAndJoin(strA, strB));
		
		input.close();
	}

}
