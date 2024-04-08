import java.util.*;

public class JavaAnagrams {
	static char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
	static int[] countsA = new int[26];
	static int[] countsB = new int[26];
	
	public static void SetCounts(String str, int[]counts) 
	{
		for(int i = 0; i < str.length(); i++) 
		{
			int asciiValue = (int)str.charAt(i);
			counts[asciiValue-65] += 1;
		}
	}
	
	public static String IsAnagram() 
	{
		for(int i = 0; i < countsA.length; i++) 
		{
			if(countsA[i] != countsB[i]) 
			{
				return "Not Anagrams";
			}
		}
		return "Anagrams";
	}
	
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		String strA = input.next().strip().toUpperCase();
		String strB = input.next().strip().toUpperCase();
		
		if(strA.length() != strB.length()) 
		{
			System.out.println("Not Anagrams");
		}
		else
		{
			SetCounts(strA, countsA);
			SetCounts(strB, countsB);
			System.out.println(IsAnagram());
		}
		
		input.close();
	}

}
