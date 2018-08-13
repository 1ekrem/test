package Test;

public class FibonacciSeries {

	public static void main(String[] args) {
		
		int a=0, b=1, c, d, count =20;
		
		System.out.println(a+" "+b);
		
		for(int i=2; i < count; i++){
			c=a+b;
			System.out.println(c);
			a=b;
			b=c;
		}
	}

}
