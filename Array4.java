package array;

public class Array4 
{
	public static void main(String[] args)
	{
			String[] ar = new String[3];
			
			ar[0] = "Shraddha";
			ar[1] = "Shruti";
			ar[2] = "Mansi";
			
			System.out.println(ar[0]);
			System.out.println(ar[1]);
			System.out.println(ar[2]);
			
			System.out.println(ar.length);
			
			
			for(int index=0 ; index<ar.length ; index++)
			{
				System.out.println(ar[index]);
			}
	}
}

//********* OUTPUT ********
//Shraddha
//Shruti
//Mansi
//3
//Shraddha
//Shruti
//Mansi
