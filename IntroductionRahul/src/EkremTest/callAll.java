package EkremTest;

public class callAll {

	public static void main(String[] args) {
		
		callFunction pyramid = new callFunction();
		reverseString2 reverse = new reverseString2();
		CountProgram count = new CountProgram();
		selfFizzBuzz fizzbuzz = new selfFizzBuzz();
		
		pyramid.Call(5);
		System.out.println(" ");

		reverse.String("Ekrem");
		System.out.println(" ");
		
		count.counting(15);
		System.out.println(" ");
		
		fizzbuzz.fizzbuzz("fizz", "buzz", 30);
	}

}
