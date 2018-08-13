import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebookXpath {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Desktop\\Selenium WebDriver\\ChromeDriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://facebook.com");
		// Using Customized XPaths
/*		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("my own XPath");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("123");
		driver.findElement(By.xpath("//input[@value='Log In']")).click();
*/		
		// Using Customized CSS
		driver.findElement(By.cssSelector("input[id='email']")).sendKeys("MyOwnCSS");
		driver.findElement(By.cssSelector("input[id='pass']")).sendKeys("123");
		
		
		driver.close();
	}

}
