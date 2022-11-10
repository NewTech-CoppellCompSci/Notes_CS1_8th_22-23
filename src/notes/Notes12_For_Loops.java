package notes;

/*
 * Notes: For Loops
 * 
 * 
 *       <Start>            ;   <Stop>    ;         )
 * for (<instance variable> ; <condition> ; <update>) {
 * 
 * 		//Code Block
 * 
 * }
 * 
 * 
 * 
 */

public class Notes12_For_Loops {

	public static void main(String[] args) {
		
		
		//Print 1 to 10 on the same line
		
		for (int i = 1; i <= 10; i++) {
			System.out.print(i + " ");
		}
		
		System.out.println("\n");
		
		
		//go up by powers of 2 starting with 2
		
		for (int i = 0; i < 11; i++) {
			System.out.print((int) Math.pow(2,  i) + " ");
		}
		
		System.out.println("\n");
		
		
		
		//Print 0 to 50 on the same line
		//omit multiples of 5
		//go up by 2
		
		for (int i = 0; i <= 50; i += 2) {
			if (i % 5 != 0) {
				System.out.print(i + " ");
			}
			else {
				System.out.print("!" + " ");
			}
		}
		
		System.out.println("\n");
		
		
		
		
		
		
		
		//Turn this while loop into a for loop
		int num = 1000;
		while (num > 0) {
			System.out.print(num + " ");
			num /= 2;
		}
		System.out.println("\n");
		
		for (int i = 1000; i > 0; i /= 2) {
			System.out.print(i + " ");
		}
		System.out.println("\n");
		
		
		
		System.out.println("...fin...");
		
		
		
		
		
		
	}
	
}
