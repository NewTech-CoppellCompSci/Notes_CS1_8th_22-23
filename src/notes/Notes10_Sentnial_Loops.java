package notes;

import java.util.Scanner;

/*
 * Sentinal Controlled Loops
 * 
 * Loops that are NOT a specific number of iterations.
 * They are stopped either at random or by a user.
 * 
 */

public class Notes10_Sentnial_Loops {

	public static void main(String[] args) {
		
		Scanner inKey = new Scanner(System.in);
		
		
		
		/*
		 * add user inputs till they enter a 0
		 * and count the number of inputs (including the 0)
		 */
		int input = -1;
		int sum = 0;
		int count = 0;
		while (input != 0) {
			count++;
			System.out.print("Enter a positive integer: ");
			input = inKey.nextInt();
			sum += input;
			//System.out.println("count = " + count + "   input = " + input + "   sum = " + sum);
			
		}
		System.out.println("Those " + count + " numbers add up to " + sum);
		
		
		
		
		
		
	}
	
}
