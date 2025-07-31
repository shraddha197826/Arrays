package Arrays;

public class PrimeNoCount 
{
	public static void main(String[] args)
	{
		int[] ar = {1,2,3,4,5,6,7,8,9,10};
		int count =0 ;
		
		for(int i=0 ; i<ar.length ; i++)
		{
			if(isPrime(ar[i]))
			{
				count++;
			}
		}
		System.out.println("Count of Prime Number is "+count);
		
	}
	public static boolean isPrime(int num)
	{
		int den =2 ;
		
		while(den<num)
		{
			if(num % den == 0)
			{
				return false;
			}
			den++;
		}
		return num==den;
	}
}
