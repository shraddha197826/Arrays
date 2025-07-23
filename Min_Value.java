package array;

public class Min_Value
{
	public static void main(String[] args)
	{
		int[] ar = {2,4,1,6,9,3};
		System.out.println(minValue(ar));
	}
	
	public static int minValue(int[] ar)
	{
		int min = Integer.MAX_VALUE;
		for(int i=0 ; i<ar.length ; i++)
		{
			if(ar[i] < min)
			{
				min = ar[i];
			}
		}
		return min;
	}
}

//output : 
//
//	1
