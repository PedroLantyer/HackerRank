import java.util.*;

public class JavaEOF {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ArrayList<String> strings = new ArrayList<String>();
		int count = 0;
		
		while(input.hasNext()) 
		{
			strings.add(input.nextLine());
		}
		
		for(String elements : strings) 
		{
			count += 1;
			System.out.printf("%d %s\n", count, elements);
		}
		input.close();
	}

}
