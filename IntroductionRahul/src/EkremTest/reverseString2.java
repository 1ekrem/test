package EkremTest;

public class reverseString2 {

	public static void main(String[] args) {
	}
	
	public void String(String x){
	//	String x = null;

		StringBuffer reverse = new StringBuffer(x);
		System.out.println(reverse);
		
		//Reverse the string
		reverse.reverse().toString();
		System.out.println(reverse);
		
		//Insert a char in the beginning
		reverse.insert(0, 'Q');
		System.out.println(reverse);
		
		//Replace first 5 letters with HELLO
		reverse.replace(0, 5, "HELLO");
		System.out.println(reverse);
		
	}

}
