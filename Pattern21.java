/*
	   A1   
	  AB12  
	 ABC123 
	ABCD1234
   
 */

public class Pattern21 {

	public static void main(String[] args) { 
		
		for (int i = 1; i <= 4; i++)
		{
			char k='A';
			for (int j = 1; j <= 8; j++) 
			{			
				if(j>=5-i && j<=4+i)
				{
				 if(j==5)
					 k='1';
				 System.out.print(k);
				 k++;
				}
				else
					System.out.print(" ");
		    }
			System.out.println();

	}

	}
}
