package EkremTest;

public class callFunction {

	public static void main(String[] args) {
		
		callFunction obj = new callFunction();
		
		obj.Call(7);

	}
	
	public void Call(int a){
		for(int x=1; x<=a; x++){
			for(int y=1; x>=y; y++){
				System.out.print(y+" ");
			}
				System.out.println();
		}
	}
}
