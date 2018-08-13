import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class rediffE2E {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Desktop\\Selenium WebDriver\\ChromeDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://rediff.com");
		
		driver.findElement(By.cssSelector("a[title*='Sign in']")).click(); // CSS
		driver.findElement(By.xpath("//input[@id='login1']")).sendKeys("ekrem@gmail.com"); // XPATH 
		driver.findElement(By.cssSelector("Input#password")).sendKeys("1234"); // CSS Regular Expression
		driver.findElement(By.xpath("//input[contains(@name,'procee')]")).click();  // XPATH regular Expression
	}

}
