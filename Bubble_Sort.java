package array;

import java.util.Arrays;

public class Bubble_Sort 
{
	public static void main(String[] args)
	{
		int ar[] = {30,100,3,-8};
		bubbleSort(ar);
		System.out.println(Arrays.toString(ar));
	}
	
	public static void bubbleSort(int[] ar)
	{
		for(int i=0 ; i<ar.length-1 ; i++)
		{
			for(int j=0 ; j<ar.length-1-i ; j++)
			{
				if(ar[j]>ar[j+1])
				{
					int temp = ar[j];
					ar[j] = ar[j+1];
					ar[j+1] = temp;
				}
			}
		}
		
	}
}
