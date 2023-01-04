package notes;

import java.util.Scanner;

/*
 * Notes: Nested Loops
 * 
 * 
 * Outer Loop {
 * 
 * 		Inner Loop {
 * 
 * 
 * 		}
 * 
 * }
 * 
 * 
 */
		

public class Notes13_Nested_Loops {

	public static void main(String[] args) {
		
		//How many times does the inner loop run?
		//50 times
		int count = 0;
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 5; j++) {
				count++;
				System.out.print(count + " ");
			}
		}
		System.out.println("\n");
		
		
		/*
		 * Outer loop: rows
		 * Inner Loop: columns
		 */
		System.out.println("Outer Loop = Rows");
		System.out.println("Inner Loop = Columns");
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print(" i = " + i + "  j = " + j + "  | ");
			}
			System.out.println("\n");
		}
		System.out.println("\n");
		
		
		
		System.out.println("Print a 5x7 box of #");
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 7; j++) {
				System.out.print("#");
			}
			System.out.println();
		}
		System.out.println("\n");
		
		/*
		 * Same as above but use user inputs
		 */
		Scanner inKey = new Scanner(System.in);
		System.out.print("Enter the height: ");
		int height = inKey.nextInt();
		System.out.print("Enter the width: ");
		int width = inKey.nextInt();
		
		for (int i = 0; i < height; i++) { //prints each row
			for (int j = 0; j < width; j++) { //prints each column
				System.out.print("#");
			}
			System.out.println();
		}
		System.out.println("\n");
		
		
		
		/*
		 * Print Triangle
		 *    #
		 *   ##
		 *  ###
		 * ####    
		 */
		for (int i = 0; i < 4; i++) {
			
			//print spaces
			for (int j = 0; j < 3 - i; j++) {
				System.out.print(" ");
			}
			
			//print #s
			for (int j = 4; j > 3 - i; j--) {
				System.out.print("#");
			}
			
			System.out.println();
		}
		
		/*
		 * Create chart showing basic addition
		 * from 0 to 9
		 */
		System.out.println("10 x 10 adding chart");
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				System.out.printf("%4d", i + j);
			}
			System.out.println();
		}
		
		
		
		
		
		
		
	}

}
