package notes;

/*
 * Notes While Loops
 * 
 * Basically, the code block loops while
 * the condition is true.
 * 
 * 
 * Parts:
 * 
 *    while (<condition>) {  // NO SEMICOLON!!!
 *    
 *    	 //code block
 *    	 //include an update for 
 *       //the condition variable(s)
 *    	 
 *    }
 * 
 * 
 * Numerically controlled
 * 
 * 	 
 * 
 * 
 * Boolean controlled
 * 
 * 	 
 * 
 * 
 */

public class Notes08_WhileLoops_Basic {

	public static void main(String[] args) {
		

		int x = 0;
		
		while (x < 5) {
			
			System.out.println("Kilroy was here!!  x = "  + x);
			
			x++;
			
		}
		System.out.println();
		
		
		
		
		//Make it count down from 5 to 1
		x = 5;

		while (x > 0) {

			System.out.println("Kilroy was here!!  x = " + x);

			x--;

		}
		System.out.println();
		
		
		
		//Make it count down from 20 to 10 exclusive.  Count down by 3
		x = 19;

		while (x > 10) {

			System.out.println(x + " ");

			x -= 3;

		}
		System.out.println("Huzefa was right\n");
		
		
		
		
		//Print
		//50, 25, 12, 6, 3, 1, 0
		//use x to print each number
		x = 50;

		while (x > 0) {

			System.out.print(x + ", ");

			x /= 2;

		}
		System.out.println("0");
		System.out.println("\n");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		System.out.println("fin...");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
