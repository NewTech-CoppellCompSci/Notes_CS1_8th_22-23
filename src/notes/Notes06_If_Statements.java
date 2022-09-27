package notes;

/* 
 * Notes If Statements
 * 
 * if (<condition>)
 *     TRUE - code block runs
 *     FALSE - code block does not run
 * 
 * 
 * Operators
 * 	   == checks if 2 things are equal
 *     != checks if 2 things are NOT equal
 *     >  checks if the left is greater than the right
 *     >= checks if the left is greater than or equal to the right
 * 	   <  checks if the left is less than the right
 *     <= checks if the left is less than or equal to the right
 *     
 *     
 * STRINGS!!!!
 *    .equals()  for comparing Strings
 *      
 */

public class Notes06_If_Statements {

	public static void main(String[] args) {
		
		int a = 5, b = 15, c = 95;
		String name1 = "Jeremy";
		String name2 = new String("Jeremy");  //I know this is weird, but it proves a point.
		String name3 = "jeRemy"; 
		
		
		if (a == 5) {
			System.out.println("a = 5\n");
		}
		
		
		
		if (a == b) {
			System.out.println("a = b\n");
		}
		else {
			System.out.println("a not b\n");
		}
		
		
		/*
		 * Not Operator
		 */
		if (c != 100) {
			System.out.println("c isn't 100\n");
		}
		
		if (b % a != 0) {
			System.out.println("No b % a is not 0\n");
		}
		else {
			System.out.println("Yes b % a == 0\n");
		}
		
		
		//check if a number is even
		if (a % 2 == 0) {
			System.out.println("a is even\n");
		}
		else {
			System.out.println("a is odd\n");
		}
		
		
		
		
		
		/*
		 * Else if 
		 */
		if (a * b == 20) {
			System.out.println("#1\n");
		}
		else if (b / a == 5) {
			System.out.println("#2\n");
		}
		else if (a == 5) {
			System.out.println("#3\n");
		}
		else if (b == 15) {
			System.out.println("#4\n");
		}
		else {
			System.out.println("#5\n");
		}
		
		
		
		/*
		 * Strings
		 * 
		 */
		
		if (name1.equals(name3)) {
			System.out.println("name 1 & 3 are equal\n");
		}
		else if (name1.equals(name2)) {
			System.out.println("name 1 & 2 are equal\n");
		}
		else {
			System.out.println("Jeremy?\n");
		}
		
		

	}

}
