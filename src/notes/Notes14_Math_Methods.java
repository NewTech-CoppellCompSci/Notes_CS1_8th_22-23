package notes;

import java.util.Scanner;

public class Notes14_Math_Methods {

	public static void main(String[] args) {
		
		/*
		 * Pi
		 */
		System.out.println("Pi = " + Math.PI);
		System.out.println("Area of circle with 2ft radius = " + (Math.PI * Math.pow(2, 2)) + " ft^2");
		
		System.out.println();
		/*
		 * Exponents
		 * 
		 * Math.pow(<base>, <exponent>) -> double 
		 */
		
		System.out.println(Math.pow(3, 4));
		double x = Math.pow(3, 4);
		System.out.println(x);
		System.out.println();
		
		double a1 = 2, a2 = -3, a3 = 4;
		System.out.println(Math.pow(a1, a2));
		System.out.println(Math.pow(a2, a3));
		System.out.println(Math.pow(a2 - a1, a3 / (a1 - a2) ) );
		System.out.println();
		
		
		/*
		 * Math.sqrt(<num>)
		 * it's a square root!!!
		 */
		
		
		System.out.println(Math.sqrt(25));
		System.out.println(Math.sqrt(25.7));
		System.out.println(Math.sqrt(27 / (a3 - a1)));
		System.out.println();
		
		
		/*
		 * Math.max(<num>, <num>)
		 * Math.min(<num>, <num>)
		 * 
		 */
		System.out.println("Min of 5 & -2 = " + Math.min(5, -2));
		System.out.println("Min of 50, 80, & 100 = " + Math.min(80, Math.min(100, 50)));
		System.out.println();
		
		
		Scanner inKey = new Scanner(System.in);
		double min = Integer.MAX_VALUE;
		int input = 0;
		
		for (int i = 0; i < 7; i++) {
			System.out.print("Enter an integer: ");
			input = inKey.nextInt();
			min = Math.min(input, min);
		}
		System.out.println("Smallest = " + min);
	}
	
}
