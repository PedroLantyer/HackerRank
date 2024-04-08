import java.util.*;
public class JavaSubstring {

	
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		String str = input.next();
		int startPos = input.nextInt();
		int endPos = input.nextInt();
		
		System.out.println(str.substring(startPos, endPos));
		input.close();
	}

}
