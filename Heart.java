/*
	     *  *     *  *    
	 *        *        * 
	 *                 * 
	    *           *    
	       *     *       
	          *  
 */


public class Heart {
	public static void main(String[] args) {
		//In this case i am provide 5 in a loop otherwise you can provide whatever you want. 
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 7; j++) {
				if((i==0 && j%3 !=0)||(i==1 && j%3==0) ||(i-j==2)||(i+j==8))
					System.out.print(" * ");
				else
					System.out.print("   ");
			}
			System.out.println();
		}

	}
}
