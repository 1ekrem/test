import java.util.Scanner;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class scanner {

	public static void main(String[] args) throws Exception {

		Scanner scanner = new Scanner (System.in);
		Scanner scanner2 = new Scanner (System.in);
		
		System.out.println("Type your name please");
		String name = scanner.nextLine();
		Thread.sleep(20);
		System.out.println("Type your lastname please");
		String lastname = scanner.nextLine();
		
		System.out.print("Processing");
		Thread.sleep(500);
		System.out.print(".");
		Thread.sleep(500);
		System.out.print(".");
		Thread.sleep(500);
		System.out.println(".");
		Thread.sleep(500);

		System.out.println(" ");
		System.out.println("Successful!");

		System.out.println(" ");
		
		Thread.sleep(3000);
		
		System.out.println("Your email address has been created!");

		System.out.println(" ");
		
		Thread.sleep(3000);
		
		System.out.println("Please see your details below!");

		System.out.println(" ");
		
		Thread.sleep(3000);
		
		System.out.println(name+lastname+"@gmail.com");

		Thread.sleep(3000);
		
		System.out.println(" ");
		
		System.out.println("Let's create a new password for your email address");
		
		Thread.sleep(3000);

		System.out.print("Enter your new password: ");		
		String password1= scanner2.nextLine();
		
		System.out.print("Enter your new password again: ");		
		String password2= scanner2.nextLine();

		
		if (password1.equals(password2)){
			System.out.println("New password has been created");
			System.out.println(" ");
			System.out.println("Please login with your new credentials!");
		} 
		
			else {
				System.out.println("Entered passwords do not match, please try again!");
			}
		
		
		Thread.sleep(1000);
		System.out.println(" ");
		System.out.print("Please wait");
		System.out.print(".");
		Thread.sleep(1000);
		System.out.print(".");
		Thread.sleep(1000);
		System.out.println(".");
		Thread.sleep(500);
		
		System.out.println(" ");
		
		System.out.print("Please enter the new password: ");
		String password3 = scanner.nextLine();
		
		if (password1.equals(password3)){
			Thread.sleep(1000);
			System.out.println("New password has been created");
			Thread.sleep(1000);
			System.out.println("Please login your new credentials!");
			Thread.sleep(1000);
			System.out.println("Your account is ready to use, please logout and login with your created password!");
			}
		else {
			System.out.println("Your account cannot be opened at the moment, please call the customer service at +1-900-6611");
			}
		}
	}
