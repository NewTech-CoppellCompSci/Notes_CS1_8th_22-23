package notes;

public class Notes02_String_Variables {

	public static void main(String[] args) {
		
		/*
		 * String variable
		 * 		that's a variable that holds a String
		 * 
		 * String literal
		 * 		this is LITERALLY the text
		 */
		
		
		
		/*
		 * All variables need 3 pieces of info
		 * 
		 * 1 - type (declaring)
		 * 2 - name (declaring)
		 * 3 - starting value (initializing)
		 */
				
		//declaring a variable: type and name
		String words;
		//initializing (give it a first value)
		words = "warm sausage filled doughnuts";
		
		
		System.out.println(words);
		
		//note the VALUE of words does NOT change
		System.out.println(words + " are delicious!");
		System.out.println(words);
		//words - String variable
		//" are delicious!" is a String literal
		
		
		
		//lets change the value of words
		words = "776";
		System.out.println(words);
		
		
		/*
		 * Concatenating multiple variables
		 * 		Smooshing Strings together
		 * 
		 */
		String name = "Huzefa";
		System.out.println(name + " " + name + " " + name);
		System.out.println(name + " " + "name " + name);
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
