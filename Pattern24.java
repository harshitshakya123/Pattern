/*
	    A   
		BA  
		CBA 
		DCBA  
   
 */

public class Pattern24 {

	public static void main(String[] args) { 
		
		for (int i = 1; i <= 4; i++)
		{
		  char k= (char) (64+i);
			for (int j = 1; j <= 4; j++) 
			{			
				if(j<=i)
				{
				 System.out.print(k--);
				}
				else
					System.out.print(" ");
		    }
			System.out.println();

	}

	}
}
