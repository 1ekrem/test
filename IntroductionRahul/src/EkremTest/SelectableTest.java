package EkremTest;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SelectableTest {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Desktop\\Selenium WebDriver\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://jqueryui.com/selectable/");
		
		
		//There is a frame, so we should switch to Frame. 
		
		//Let's see how many frames there
		System.out.println(driver.findElements(By.tagName("iframe")).size());
		
		driver.switchTo().frame(0);
		
		Actions ac = new Actions(driver);
		
		ac.click(driver.findElement(By.xpath("//a[contains (@li, 'Item 2')]"))).build().perform();

		//t(By.xpath("//a[contains(@href,'https://support.google.com/accounts?hl=en')]"))
	}

}
