import java.util.*;

public class IntToString {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num;
		String str = null;
		
		try 
		{
			num = input.nextInt();
			str = Integer.toString(num);
			str = "Good job";
		}
		catch (Exception e)
		{
			str = "Wrong Answer";
		}
		finally 
		{
			System.out.println(str);
		}
		
		input.close();
	}

}

//HACKER RANK DOESN'T COMPILE THIS CODE BUT IT'S 100% FUNCTIONAL!