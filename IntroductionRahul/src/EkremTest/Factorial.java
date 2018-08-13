package EkremTest;

public class Factorial {

	public static void main(String[] args) {
		
		System.out.println("Call factorial Method:"+fact(5));
		
		System.out.println("Double Check:"+5*4*3*2*1);	

	}
	
	public static int fact(int x){
		
		if(x==0){
			return 1;
		}
		else if (x==1){
			return 1;
		}
		return fact(x-1)*x;		
		
	}


}

