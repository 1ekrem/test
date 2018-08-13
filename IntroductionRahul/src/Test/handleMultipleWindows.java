package Test;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class handleMultipleWindows {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Desktop\\Selenium WebDriver\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();	
		
		driver.get("https://accounts.google.com/signup");
		driver.findElement(By.xpath("//a[contains(@href,'https://support.google.com/accounts?hl=en')]")).click();
		System.out.println(driver.getTitle()); // Even though the child class opened, the selenium prints the title of the parent account.
		
		//How can you navigate to child window and print the child window title?
		//1. Get all the window handle ids
		//2. You have to SET to get your ids so learn SET method
		//3. Than you have to create object for the iteration
		//4. By iterating the and passing the ids to string you can store your ids
		//5. After you store your ids, type-- driver.switchTo().window(childid); 
		//5.1--> ID should be the one that you want to switch to.
		
		Set<String>ids= driver.getWindowHandles();

		Iterator<String> it=ids.iterator();
		String parentid=it.next();
		String childid=it.next();
		
		driver.switchTo().window(childid);		
		System.out.println("After iterator method-->"+driver.getTitle());
		
		
	}

}
