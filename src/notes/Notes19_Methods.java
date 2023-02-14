package notes;

/*
 * Notes - Methods
 * 
 * 
 * 
 */

public class Notes19_Methods {

	public static void main(String[] args) {
		
		System.out.println(getNum());
		System.out.println(getNum());
		System.out.println(getNum());
		System.out.println(getNum());
		System.out.println(getNum());
		System.out.println(getNum());
		System.out.println(getNum());
		System.out.println(getNum());
		System.out.println(getNum());
		
		
		System.out.println();
		System.out.println( isOver50(15) );
		System.out.println( isOver50(57) );
		
		if (isOver50(765)) {
			System.out.println("Old Fart!");
		}
		
	}
	
	
	
	public static int getNum() {
		
		int num = (int) (Math.random() * 50) + 1;
		
		return num;
	}
	
	public static boolean isOver50(int num) {
		
		if (num > 50) {
			return true;
			
		}
		
		return false;
	}
	
}
