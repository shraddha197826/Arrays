package Arrays;

public class CheckPalindrom 
{
	public static void main(String[] args)
	{
		int[] ar = {1,2,3,4,4,5};
		System.out.println(checkPalindrom(ar));
	}
	
	public static boolean checkPalindrom(int[] ar)
	{
		int i=0;
		int j=ar.length-1;
		
		while(i<j)
		{
			if(ar[i] == ar[j])
			{
				i++;;
				j--;
			}
			else
			{
				break;
			}
		}
		return i >= j;
	}
}

//output :
//	false
	