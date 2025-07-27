package array;

import java.util.Arrays;

public class ReverseArray
{
	public static void main(String[] args)
	{
		int[] ar = {10,20,30,40,50};
		int[] ans = reverseArray(ar);
		System.out.println(Arrays.toString(ans));
	}
	
	public static int[] reverseArray(int[] ar)
	{
		int[] rev = new int[ar.length];
		
		for(int i=0 ; i<ar.length ; i++)
		{
			rev[ar.length-1-i] = ar[i];
		}
		return rev;
	}
}

//output:
//		[50, 40, 30, 20, 10]
//