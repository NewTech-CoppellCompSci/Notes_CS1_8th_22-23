package notes;

/*
 * Traversing Strings
 * 
 * Basically looping through a string 1 or 2 
 * characters at a time
 * 
 * 
 * 
 */

public class Notes17_String_Traversing {

	public static void main(String[] args) {
		
		String word = "American Indian";
		
		//print each character on a separate line
		for (int i = 0; i < word.length(); i++) {
			System.out.println(word.substring(i, i + 1));
		}
		System.out.println("\n");
		
		//print 2 characters at a time, but only shift over 1 step
		for (int i = 0; i < word.length() - 1; i++) {
			System.out.println(word.substring(i, i + 2));
		}
		System.out.println("\n");
		
		
		
		
		//let the user know if there are any 1's
		//in the string
		String word1 = "11asdf1ghj";
		boolean has1 = false;
		int count = 0;
		for (int i = 0; i < word1.length(); i++) {
			if (word1.substring(i, i + 1).equals("1")) {
				System.out.println("Found a 1");
				has1 = true;
				count++;
			}
			
		}
		
		if (!has1) {
			System.out.println("There are no 1's in " + word1);
		}
		
		if (count > 0) {
			System.out.println("There are " + count + " 1's in " + word1);
		}
		
		System.out.println("\n");
		
		
		
		
		/*
		 * Changing individual letters in a string
		 * 
		 * you physically rebuild the string from the beginning
		 */
		
		String original = "Puss in Boots is a film masterpiece!";
		String newString = "";
		
		//change s to a
		for (int i = 0; i < original.length(); i++) {
			if (original.substring(i, i+1).equals("s")) {
				newString += "a";
			}
			else {
				newString += original.substring(i, i+1);
			}
			
			
			
		}
		System.out.println(original);
		System.out.println(newString);
		
		
		
		
		
		
		
	}
	
}
