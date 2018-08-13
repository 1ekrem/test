package EkremTest;

public class ifStatements {

	public static void main(String[] args) {
		
		//Equal to 					==
		//Greater than	 			>
		//Less than 				< 
		//Greater than/equal to 	>=
		//Less than/equal to 		<= 
		//Not equal to 				!=

		// = Assigning value
		// == Checking value
		
		boolean a = (2==2);
		boolean b = (2!=3);
		boolean c = (2==3);
		
		System.out.println("Condition A is: "+a);
		System.out.println("Condition B is: "+b);
		System.out.println("Condition C is: "+c);
		
		
		//if (condition is true) {
		//	do this code
		//  }

		if (true == c){
			System.out.println("Condition #1 is true");
		}
		else if (false == c ){
			System.out.println("Condition #2 is false");
		}
		
		else{ 
			System.out.println("first condition is false and second condition is true");
			
		}
		
	}

}
