package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class actionGoogleDemo {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Desktop\\Selenium WebDriver\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();	
		
		driver.get("https://google.com");
		Actions d = new Actions(driver);
		
		d.moveToElement(driver.findElement(By.id("lst-ib"))).click().sendKeys("Ekrem Ersayin").sendKeys(Keys.ENTER).build().perform();
		
		
		
	}

}
