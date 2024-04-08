import java.io.*;
import java.math.BigInteger;

public class JavaPrimalityTest 
{

	public static void main(String[] args) throws IOException 
	{
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		String numStr = input.readLine();
		BigInteger num = new BigInteger(numStr);
		
		if(num.isProbablePrime(1)) 
		{
			System.out.println("prime");
		}
		else 
		{
			System.out.println("not prime");
		}
		
		input.close();
	}

}
