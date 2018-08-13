package EkremTest;

public class reverseString {

	public static void main(String[] args) {
		//Option 1
		System.out.println("Option 1");
		String s = "Ekrem";
		char[] try1 = s.toCharArray();
		for (int i=try1.length-1; i>=0 ;i--){
			System.out.print(try1[i]);
		}
		
		
		System.out.println(" ");
		System.out.println("Option 2");
		
		//Option 2
		String s2 = "Ersayin";
		String reverse = new StringBuffer(s2).reverse().toString();
		System.out.println(reverse);
	
		
		
	}

}
