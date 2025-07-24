package array;

public class SecondMax 
{
	public static void main(String[] args)
	{
		int[] ar = {10,30,28,6,8};
		System.out.println(secondMax(ar));
	}
	
	public static int secondMax(int[] ar)
	{
		int max = Integer.MIN_VALUE;
		int secmax = Integer.MIN_VALUE;
		
		for(int i=0 ; i<ar.length;i++)
		{
			if(ar[i]>max)
			{
				secmax = max;
				max=ar[i];
			}
			else if(ar[i]>secmax)
			{
				secmax=ar[i];
			}
		}
		return secmax;
	}
}

//output :
//	28
