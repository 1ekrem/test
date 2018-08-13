import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class synchronization {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Desktop\\Selenium WebDriver\\ChromeDriver\\chromedriver.exe");	
		WebDriver driver = new ChromeDriver();
		
		// So we added our Impilicit Wait
	//	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.get("https://alaskatrips.poweredbygps.com/g/pt/hotels?MDPCID=ALASKA-US.TPS.BRAND.hotels.HOTEL");
		driver.findElement(By.xpath("//*[@id='H-destination']")).sendKeys("nyc");
		driver.findElement(By.xpath("//*[@id='H-destination']")).sendKeys(Keys.TAB);
		driver.findElement(By.xpath("//*[@id='H-fromDate']")).sendKeys(Keys.ENTER);
		//The Script is failing because it is not able to locate the location of the element
		//Now we have to use the implicit Wait to fix this failing script.
		//Now we have applied the explicit wait in the script so it should be fine!

		//this is an explicit wait
		WebDriverWait d = new WebDriverWait(driver, 20); // I'll 20 seconds
		d.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(@href, 'New-York-Hotels-Westgate-New-York-City')]")));
		// If it is visible within 20 second then click.
		driver.findElement(By.xpath("//a[contains(@href, 'New-York-Hotels-Westgate-New-York-City')]")).click();
		
		
	}

}


