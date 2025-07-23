package array;

public class Max_Value 
{
	public static void main(String[] args)
	{
		int[] ar = {1,2,3,5,8,9,1,0,11};
		System.out.println(maxValue(ar));
	}
	
	public static int maxValue(int[] ar)
	{
		int max = Integer.MIN_VALUE;
		for(int i = 0 ; i < ar.length ; i++)
		{
			if(ar[i] > max)
			{
				max = ar[i];
			}
		}
		return max;
	}

}
