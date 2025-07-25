package array;

import java.util.Arrays;

public class Binary_Search
{
	public static void main(String[] args)
	{
		int[] a = {10,40,2,-29,14,6};
//		bubbleSort(a);
//		System.out.println(Arrays.toString(a));
		binarySearch(a,100);
		System.out.println(Arrays.toString(a));
	}
	
	public static void bubbleSort(int[] a)
	{
		for(int i=0 ; i<a.length-1 ; i++)
		{
			for(int j=0 ; j<a.length-1-i ; j++)
			{
				if(a[j] > a[j+1])
				{
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}
		}
	}
	
	public static int binarySearch(int[] a,int search)
	{
		bubbleSort(a);
		int start=0,end=a.length-1,mid=(start+end)/2;
		while(start <= end)
		{
			if(a[mid] == search)
			{
				System.out.println("Element Found "+search+ " in the array");
				break;
			}
			
			else if(a[mid] < search)
			{
				start = mid+1;
			}
			
			else if(a[mid] > search)
			{
				end = mid-1;
			}
			mid = (start+end)/2;
		}
		if(start > end)
		{
			System.out.println("Element "+search+" Not Found in the array");
		}
		
		return -1;
	}
}
