package array;

public class Array3 
{
	public static void main(String[] args)
	{
		int[] ar = new int[4];
		
		ar[0] = 10;
		ar[1] = 20;
		ar[2] = 30;
		ar[3] = 40;
		
		System.out.println(ar.length);
		
		
		for(int index=0 ; index<ar.length ; index++)
		{
			System.out.println(ar[index]);
		}
	}
}

//********** OUTPUT **********
//4
//10
//20
//30
//40