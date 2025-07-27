package array;
import java.util.Arrays;

public class DuplicateArray
{
	public static void main(String[] args)
	{
		int[] ar = {10,20,30,40,50};
		int[] dup = new int[ar.length];
		
		for(int i=0 ; i<ar.length ; i++)
		{
			dup[i] = ar[i];
		}
		
		for(int i=0 ; i<dup.length ; i++)
		{
			 System.out.println(dup[i] + ", ");
		}
		System.out.println(Arrays.toString(dup));
	}
}

//output :
//	10, 
//	20, 
//	30, 
//	40, 
//	50, 
//	[10, 20, 30, 40, 50]
