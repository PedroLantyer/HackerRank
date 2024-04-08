import java.util.*;

public class JavaStaticInitializerBlock 
{
	static Scanner input = new Scanner(System.in);
	static boolean flag = true;
	static int b = input.nextInt();
	static int h = input.nextInt();
	
	
	static
	{
		try
		{
			if(b <= 0 || h <= 0) 
			{
				flag = false;
				throw new Exception("Breadth and height must be positive");
			}
		}
		catch(Exception e) 
		{
			System.out.println(e);
		}
	}
	public static void main(String[] args) 
	{
		if(flag) 
		{
			System.out.println(b*h);
			
		}
		input.close();
	}
	
}
