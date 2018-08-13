package EkremTest;

public class selfFizzBuzz {

	public static void main(String[] args) {
	
	}
	
	public void fizzbuzz(String fizz, String buzz, int b){
		
	//	String fizz = "fizz";
	//	String buzz = "buzz";
		
		for(int i=1; i<=b; i++){
			if(i % 15==0){
				System.out.println(fizz + " " + i );
			}
			else if (i % 3==0){
				System.out.println(buzz + " " + i);
			}
			else if (i % 5==0){
				System.out.println(fizz+buzz+" "+i);
			}
			else if (i % 7 ==0){
				System.out.println("**Divion to 7 :" +i);
			
			}
	}

	}
}
