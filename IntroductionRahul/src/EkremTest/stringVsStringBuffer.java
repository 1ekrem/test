package EkremTest;

public class stringVsStringBuffer {

	public static void main(String[] args) {
		
		String x = "Ekrem";
		StringBuffer y = new StringBuffer ("Ersayin");
	
		System.out.println(y);
		
		System.out.println(y.length());
		
		
		y.append("1989");
		System.out.println(y);

		// Print from 0 index to 3 index
		System.out.println(x.startsWith("E"));
		
		System.out.println(x.codePointAt(x.length()-2));
	
	}

}
