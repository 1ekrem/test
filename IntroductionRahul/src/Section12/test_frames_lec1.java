package Section12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test_frames_lec1 {

	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Desktop\\Selenium WebDriver\\ChromeDriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		

		
		driver.get("https://www.dream11.com/tf/cricket/");
		
		driver.findElement(By.id("regEmail")).sendKeys("burhannyc1@gmail.com");
		driver.findElement(By.id("regPassword")).sendKeys("123456789e");
		
		driver.findElement(By.id("regUser")).click();

	}

}
