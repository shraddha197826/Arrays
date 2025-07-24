package array;

public class SecondMin
{
	public static void main(String[] args)
	{
		int[] ar = {1,34,78,24,6,8};
		System.out.println(secondMin(ar));
	}
	
	public static int secondMin(int[] ar)
	{
		int min = Integer.MAX_VALUE;
		int secmin = Integer.MAX_VALUE;
		
		for(int i=0 ; i<ar.length;i++)
		{
			if(ar[i]<min)
			{
				secmin = min;
				min=ar[i];
			}
			else if(ar[i]<secmin)
			{
				secmin=ar[i];
			}
		}
		return secmin;
	}
}

//output :
//	6
