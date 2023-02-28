package notes;

import java.util.Arrays;

/*
 * Notes Chars
 * 
 * Char is a variable that holds 1 character
 * 
 * Stored as an integer
 * 
 * 
 */

public class Notes21_Chars {

	public static void main(String[] args) {
		
		char letter1 = 'a';
		char letter2 = 98;
		System.out.println(letter1);
		System.out.println(letter2);
		
		letter1 += 2;
		System.out.println(letter1);
		System.out.println( (int) letter1);
		
		/*
		 * NO .equals!!!
		 * 
		 * Just use == >= and everything else
		 * 
		 * 
		 */
		String quote = "It's a C Mario!!";
		if (letter1 == 'c')
		{
			System.out.println(quote);
		}
		
		
		/*
		 * NO MORE substring(i, i+1)
		 * 
		 * 
		 * use <string>.charAt(<int>);
		 */
		System.out.println("Hi Ho Neighbor".charAt(4));
		
		//print all occurrences of 'a' in quote
		for (int i = 0; i < quote.length(); i++) {
			if (quote.charAt(i) == 'a' ) {
				System.out.println("a at = " + i);
			}
		}
		System.out.println();
		
		
		
		
		
		/*
		 * Create Char[] from a String
		 */
		char[] letters = quote.toCharArray();
		System.out.println(Arrays.toString(letters));
		
		
		System.out.println(quote + " = " + hasSpace(quote));
		System.out.println("BUUUURP!" + " = " + hasSpace("BUUUURP!"));
	}
	
	
	/*
	 * returns true if str has a space in it
	 * return false otherwise
	 */
	public static boolean hasSpace(String str) {
		
		char[] letters = str.toCharArray();
		
		//Google "For Each Java" for an explanation
		for (char c : letters) {
			if (c == ' ') {
				return true;
			}
		}
		
		return false;
	}
	
	
	
	
	

	
	
	
	
	
	
}
