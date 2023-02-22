package notes;

public class Notes20_Aligned_Arrays {

	public static void main(String[] args) {
		
		
		String[] nameFirst = {"Robert", "Mark", "Huzefa", "Sam", "Arjun"};
		String[] nameLast = {"Hunter", "Granado", "Bohri", "Uglow", "Sharma"};
		double[] heightFeet = {6.0, 5.9, 5.1, 17.7, 2.4};
		boolean[] hasKids = {true, true, false, false, true, false};
		
		
		//list people with kids
		System.out.println("Has Kids:");
		for (int i = 0; i < hasKids.length; i++) {
			if (hasKids[i]) {
				System.out.println(nameLast[i] + ", " + nameFirst[i]);
			}
			
		}
		
		System.out.println();
		
		
		//list people who are under 6ft tall...
		System.out.println("People under 6ft tall:");
		for (int i = 0; i < heightFeet.length; i++) {
			if (heightFeet[i] < 6.0) {
				System.out.println(nameLast[i] + ", " 
						+ nameFirst[i] + " = " 
						+ heightFeet[i] + "ft");
			}
			
		}
		
		System.out.println();
		
		
		
		
		
		
		
		
	}
	
	
}
