/*
		*****
		 ****
		  ***
		   **
		    *
*/
public class Pattern3 {

	public static void main(String[] args) {
		//In this case i am provide 5 in a loop otherwise you can provide whatever you want. 
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				if(j>=i)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();//This is used for next line
		}

	}

}
