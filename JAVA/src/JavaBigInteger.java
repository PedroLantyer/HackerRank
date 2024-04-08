import java.io.*;
import java.math.BigInteger;

public class JavaBigInteger {
	static BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
	
	public static BigInteger GetBigInt() throws IOException
	{
		String numStr = input.readLine();
		BigInteger num = new BigInteger(numStr);
		return num;
	}
	
	public static void main(String[] args) throws IOException {
		BigInteger x = GetBigInt();
		BigInteger y = GetBigInt();
		
		System.out.println(x.add(y));
		System.out.println(x.multiply(y));
		input.close();
	}

}
