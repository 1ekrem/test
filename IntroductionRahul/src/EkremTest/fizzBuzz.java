package EkremTest;

public class fizzBuzz {

	public static void main(String[] args) {
		
		String fizz = "fizz";
		String buzz = "buzz";
		
		for(int i=1; i<=100; i++){
			
			if(i % 15 == 0){
				System.out.println(fizz+buzz+" "+ i );
			}
			else if (i % 3 == 0){
				System.out.println(buzz + " " + i);
			}
			else if (i % 5 == 0){
				System.out.println(fizz + " "+ i);
			}
		}
	}

}
