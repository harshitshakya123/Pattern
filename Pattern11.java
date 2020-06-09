import java.util.Scanner;

/*
		    Enter Number of rows
			9
			*    
			**   
			***  
			**** 
			*****
			**** 
			***  
			**   
			*      
 
*/
public class Pattern11 {

	public static void main(String[] args) { 
		int k=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number of rows");
		int row=sc.nextInt();       //row =9
		for (int i = 1; i <= row; i++) {
			
			if (row % 2 == 0)
			{
				if(i<=(row/2))
				{
					k++;
				}
				if(i>row/2 + 1)
				{
					k--;
				}
			}
			else
			{
				if (i<=(row+1)/2)
					 k++;
				else
					 k--;
			}
			for (int j = 1; j <= (row + 1)/2; j++) 
			{			
				if(j<=k)
				{
					System.out.print("*");					
				}
				else
				{
					System.out.print(" ");			
			    }
			
		    }
			System.out.println();

	}

	}
}
