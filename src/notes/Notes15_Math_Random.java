package notes;

import java.util.Scanner;

/*
 * Math.random() Notes
 * 
 * 
 */

public class Notes15_Math_Random {

	public static void main(String[] args) {
		
		/*
		 * Math.random() -> double
		 *   0 <= x < 1
		 *     
		 */
		System.out.println("20 random numbers");
		for (int i = 0; i < 20; i++) {
			System.out.println(Math.random());
		}
		System.out.println("\n");
		
		
		/*
		 * What if I want a bigger range?
		 * 
		 * (int) (Math.random() * scope) + min
		 *
		 */
		System.out.println("20 random numbers from 1 to 10");
		for (int i = 0; i < 20; i++) {
			System.out.print((int) (Math.random() * 10) + 1 + " ");
		}
		System.out.println("\n");
		
		
		
		System.out.println("100 random numbers from 20 to 50");
		for (int i = 0; i < 100; i++) {
			System.out.print((int) (Math.random() * 31) + 20 + " ");
		}
		System.out.println("\n");
		
		
		
		System.out.println("100 random numbers from -20 to 20");
		for (int i = 0; i < 100; i++) {
			System.out.print((int) (Math.random() * 41) - 20 + " ");
		}
		System.out.println("\n");
		
		
		
		/*
		 * What if you need to calculate the scope?
		 * 
		 * scope = max - min + 1
		 * 
		 */
		Scanner inKey = new Scanner(System.in);
		System.out.print("Enter the min = ");
		int min = inKey.nextInt();
		System.out.print("Enter the max = ");
		int max = inKey.nextInt();
		
		System.out.println("100 random numbers from " + min + " to " + max);
		for (int i = 0; i < 100; i++) {
			System.out.print((int) (Math.random() * (max - min + 1)) + min + " ");
		}
		System.out.println("\n");
		
		
		
		
	}

}
