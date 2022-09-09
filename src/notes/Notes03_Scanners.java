package notes;

import java.util.Scanner;

public class Notes03_Scanners {

	public static void main(String[] args) {
		
		
		/*
		 * Scanner
		 * 
		 * This is how we take input from the anything
		 * - keyboard
		 * - mouse
		 * - file
		 * 
		 * 
		 * 2 parts
		 * 		1 - create the Scanner object (only once)
		 * 		2 - use the object to scan as many times necessary
		 * 
		 * 
		 * .next() - Stops scanning at space OR end of line
		 * .nextLine() - Stops scanning at the end of the line
		 * 
		 * 
		 */
		
		//Creat a Scanner ONCE!!!!! ONLLY!!!!!
		Scanner inKey = new Scanner(System.in);
		
		
		//prompt 
		System.out.print("Enter your favorite ice cream flavor: ");
		//scan
		String input = inKey.nextLine();
		//use
		System.out.println(input);
		
		
		System.out.println();
		
		//prompt 
		System.out.print("Do you prefer pineapple on pizza: ");
		//scan
		String input2 = inKey.next();
		//use
		System.out.println(input2);
		
		
		
		
		
		
		
	}
	
	
}
