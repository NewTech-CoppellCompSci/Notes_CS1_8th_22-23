package notes;

import java.util.Scanner;

/*
 * Do Loops
 * 
 * A While loop that always runs at LEAST once.
 * 
 * 
 */

public class Notes11_Do_Loops {

	public static void main(String[] args) {
		
		int x = 5;
		
		do {
			System.out.println("BUT THE CONDITION IS FALSE!!!!");
		} while (x != 5);
		System.out.println("\n");
		
		/*
		 * Very useful for things that may run a bunch but MUST run once
		 * 
		 */
		
		
		//Take inputs till they say "hi" (not case sensitive)
		
		String input = "hi";
		Scanner inKey = new Scanner(System.in);
		
		do {
			System.out.print("Hi there!! ");
			input = inKey.nextLine();
		} while (!input.equalsIgnoreCase("hi"));
		
		System.out.println("\nFin..");
		
		
		
	}
	
	
	
}
