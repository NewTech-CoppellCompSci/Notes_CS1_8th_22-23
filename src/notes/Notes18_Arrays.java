package notes;

/*
 * Notes - Arrays
 * 
 * Basically if a variable is a shoe box, then an array is a shoe store
 * 
 */


public class Notes18_Arrays {

	public static void main(String[] args) {
	
		//declare an array
		
		//create with default values
		int[] nums1 = new int[5];  //it has 5 elements
		String[] words1 = new String[6];  // it has 6 elements
		
		//create with specific values
		int[] nums2 = {5, 7, -1, 3, 9};
		String[] words2 = {"a", "b", "c", "d", "e"};
		
		
		//You cannot change the SIZE of an array
		
		
		
		/*
		 * How to access an array's element
		 */
		System.out.println( nums2 );
		System.out.println( nums2[2] );
		System.out.println( words2[4] );
		System.out.println();
		
		/*
		 * How to change and array's element
		 */
		System.out.println("changing values");
		System.out.println(nums1[2]);
		nums1[2] = 9;
		System.out.println(nums1[2]);
		System.out.println();
		
		System.out.println(nums1[4]);
		nums1[4] = nums1[2] + 3 *  nums2[2];
		System.out.println(nums1[4]);
		
		
		
		
		System.out.println("\n Traversing Arrays");
		
		for (int i = 0; i < nums2.length ; i++) {
			System.out.println(nums2[i]);
		}
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
}
