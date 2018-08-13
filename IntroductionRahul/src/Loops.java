
public class Loops {

	public static void main(String[] args) {

		// How to print something 100 times?
		// You should you LOOP
		// while loop
		// Define a int
		// while (either TRUE or False)
		
		int i=1; // 2 Initialization 
		while(i<10){ // Condition
			System.out.println(i+"    "+"hello");
			//i=i+1;
			i++;//Post Increment// Increment // decrement
		}
		
		
		int j=20;
		while (j>9){
			System.out.println("j"+j);
			j--;
		}
// For Loop
		for(int k=1;k<10;k++){
			System.out.println(k+"-Ekrem");	
		
		}
			//DO WHILE
		do{ /// in this case it will first print "hiii" then will check the
			/// while loop, It will print hi, until it is false. Below case,
			// will execute only once because 4 is not greater than 4 
			System.out.println("hiii");
		}while(4>5);
		

	}

}
