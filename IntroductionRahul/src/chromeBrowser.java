import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class chromeBrowser {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Desktop\\Selenium WebDriver\\ChromeDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://facebook.com");// URL in the browser.
		
	//	driver.findElement(By.id("email")).sendKeys("burhannyc@gmail.com"); // This piece of code takes you to email box and writes "this is my first code"
	//	driver.findElement(By.id("pass")).sendKeys("xxx");
	//	driver.findElements(By.id("loginbutton")).get(0).click();
	//	driver.findElement(By.linkText("Forgot account?")).click();
	
		driver.findElement(By.cssSelector("#email")).sendKeys("burhannyc@gmail.com"); // CSS SELECTOR
		driver.findElement(By.xpath("//*[@id='pass']")).sendKeys("1234");	// XPATH
		driver.findElement(By.xpath("//*[@id='u_0_2']")).click(); 	// XPATH
		
		
	}

}
