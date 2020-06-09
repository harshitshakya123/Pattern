import java.util.Scanner;

/*
		    Enter Number of rows
			5
			*********
			 ******* 
			  *****  
			   ***   
			    *    
     
 
*/
public class Pattern12 {

	public static void main(String[] args) { 
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number of rows");
		int row=sc.nextInt();       //row =5
		for (int i = 1; i <= row; i++)
		{
			for (int j = 1; j <=2*row - 1; j++) 
			{			
				if(j>=i && j<=2*row-i)
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
