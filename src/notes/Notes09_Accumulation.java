package notes;

import java.util.Scanner;

/*
 * Notes Accumulation
 * 
 * Define:
 *    Gather a set of information into a single 
 *    variable using loops.  These can be numerical
 *    or text accumulations.
 *    
 *    
 * Counters   
 *    
 *    
 */


public class Notes09_Accumulation {

	public static void main(String[] args) {
		
		/*
		 * The sum of all integers less than 10
		 */
		
		int i = 1;
		int sum = 0;
		
		while (i < 10) {
			System.out.println("sum = " + sum + "   i = " + i);
			sum += i;  // sum = sum + i;
			
			i++;
		}
		System.out.println("Sum of numbers < 10 = " + sum + "\n");
		
		
		
		/*
		 * Count how many time the loop above iterated
		 * 
		 * copy loop from above and add a counter
		 */
		i = 1;
		sum = 0;
		int count = 0;
		while (i < 10) {
			sum += i;  // sum = sum + i;
			i++;
			count++;
		}
		System.out.println("Sum of numbers < 10 = " + sum);
		System.out.println("It looped " + count + " times.\n");
		
		
		
		
		
		
		
		/*
		 * Add multiples of 3 below the user's input
		 */
		Scanner inKey = new Scanner(System.in);
		
		System.out.print("Enter a positive integer: ");
		int input = inKey.nextInt();
		
		i = 0;
		sum = 0;
		count = 0;
		
		//loop till you get to user input
		while (i < input) {
			
			if (i % 3 == 0) {
				sum += i;
				count++;
			}
			i++;
		}
		System.out.println("The " + count + " multiples of 3 less");
		System.out.println("than " + input + " = " + sum);
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
