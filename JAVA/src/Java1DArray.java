import java.util.*;

public class Java1DArray
{
    static ArrayList<Integer> nums = new ArrayList<Integer>();
    
    public static void PopulateArray(int len)
    {
    	int temp;
    	Scanner input = new Scanner(System.in);
    	
        for(int i = 0; i < len; i++)
        {
        	
        	temp = input.nextInt();
        	nums.add(temp);
        }
        
        input.close();
    }
    
    public static void PrintArray() 
    {
    	for(Integer num : nums) 
    	{
    		System.out.println(num);
    	}
    }
    
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int numberOfIntegers = input.nextInt();
        PopulateArray(numberOfIntegers);
        PrintArray();
        input.close();
    }
}