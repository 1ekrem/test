package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class actionDemo {

	public static void main(String[] args) {
		

		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Desktop\\Selenium WebDriver\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();		
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com");
		
		// Driver will now have the capabilities of the ACTIONS
		// So a object will have the capabilities to play on web page
		Actions a = new Actions(driver);
		WebElement move = driver.findElement(By.cssSelector("a[id='nav-link-accountList']"));
		
		// In this example we have to move and hover our mouse over to 'Hello, Sign in--Account & Lists'
		

		//Build means it is ready to execute but It wont execute only with build method. You have to add perform method as well.
		// We set the move object for the cssSelector. 
		
		// How would you enter CAPITAL LETTERS string in a search bar?
		//1. Go to the search bar by ID.
		//2.Click on search bar
		//3.hold the shift key down
		//4.type 'hello' in LowerCase but it will be in UPPERCASE
		a.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("hello").build().perform();
		
		//How would you selected typed string
		a.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).doubleClick().build().perform();
		
		//Moves to specific element and performs the jobs
		a.moveToElement(move).contextClick().build().perform();
		//contextClick is right click

	}

}
