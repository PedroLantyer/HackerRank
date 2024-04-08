import java.util.*;

public class JavaSubstringComparisons 
{	
	
	public static void GetLargestAndSmallest(String str, int subStrLen) 
	{
		String small = str.substring(0, subStrLen);
		String big = str.substring(0, subStrLen);
		
		for(int i = 0; i <= str.length() - subStrLen; i++) 
		{
			String subStr = str.substring(i, i+subStrLen);
			if(subStr.compareTo(big) > 0) 
			{
				big = subStr;
			}
			else if(subStr.compareTo(small) < 0) 
			{
				small = subStr;
			}
		}
		
		System.out.printf("%s\n%s\n", small, big);
	}
	
	public static void main(String[] args)
	{		
		Scanner input = new Scanner(System.in);
		String str = input.next();
		int subStrLen = input.nextInt();
		GetLargestAndSmallest(str, subStrLen);
		input.close();
	}

}