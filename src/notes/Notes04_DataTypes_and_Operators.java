package notes;

/*
 * Data Types and Operators
 * 
 * 	  int = Integers (32 bit)
 * 		  includes whole numbers
 * 		  from - to + 2.14 billion
 * 		  Remember: Integer Division drops decimals
 * 
 *    doubles = decimal (64 bits)
 *    	  freggin huge
 *    	  15 numbers with the decimal that
 *            floats wherever it's needed
 * 
 * 
 * Operators
 * 	  + add
 * 	  - subtract
 *    * multiply
 *    / divide
 *    % modulus
 * 
 */

public class Notes04_DataTypes_and_Operators {

	public static void main(String[] args) {
		
		//declaring ints and doubles
		int num1 = 50;
		int num2 = 130;
		int num3 = 4302;
		double num4 = 28.0;
		
		System.out.println("num1 = " + num1);
		System.out.println("num2 = " + num2);
		System.out.println("num3 = " + num3);
		System.out.println("num4 = " + num4 + "\n");
		
		
		num1 = num1 + 7;
		System.out.println("num1 = " + num1);
		System.out.println("num2 = " + num2);
		System.out.println("num3 = " + num3);
		System.out.println("num4 = " + num4 + "\n");
		
		/*
		 * Integer Division!!!
		 * if BOTH are integers, then
		 * the decimal is dropped NOT rounded 
		 */
		num1 = num1 / 5;
		System.out.println("num1 = " + num1);
		System.out.println("num2 = " + num2);
		System.out.println("num3 = " + num3);
		System.out.println("num4 = " + num4 + "\n");
		
		
		/*
		 * Modulus
		 * Just like integer division
		 * EXCEPT, it takes the remainder
		 */
		num1 = 50;
		num1 = num2 % num1;
		System.out.println("num1 = " + num1);
		System.out.println("num2 = " + num2);
		System.out.println("num3 = " + num3);
		System.out.println("num4 = " + num4 + "\n");
		
		
		num4 = num4 / 5;
		System.out.println("num1 = " + num1);
		System.out.println("num2 = " + num2);
		System.out.println("num3 = " + num3);
		System.out.println("num4 = " + num4 + "\n");
		
		
		
	}
	
	
	
}
