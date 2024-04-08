import java.util.*;

public class JavaStringReverse {

	public static String isPalindrome(String str) 
	{
		String reverseStr = "";
		
		for(int i = (str.length()-1); i >= 0; i--) 
		{
			reverseStr += str.charAt(i);
		}
		
		if(str.equals(reverseStr)) 
		{
			return "Yes";
		}
		return "No";
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String str = input.next().strip();
		System.out.println(isPalindrome(str));
		input.close();
	}

}
