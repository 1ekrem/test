package EkremTest;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scope {

	public static void main(String[] args) throws InterruptedException {
		
		// 1. Give me the counts of links on the page.
		
		//if there is a link on the page, then there is a tag 'a' in the HTML
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Desktop\\Selenium WebDriver\\ChromeDriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.qaclickacademy.com/practice.php");
		
		System.out.println("Number of links on the page: "+driver.findElements(By.tagName("a")).size());
		
		// 2. Give me the counts of links on the footer section of the page.
		
		WebElement footerdriver = driver.findElement(By.id("gf-BIG")); // Limiting Webdriver scope
		
		System.out.println(footerdriver.findElements(By.tagName("a")).size());
		
		// 3. Give me the count of links of the first section of the footer.
		
		WebElement columndriver = footerdriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		
		System.out.println(columndriver.findElements(By.tagName("a")).size());
		
		// 4. Click on each on the the column and validate if the pages open
		
		// Imagine there is a dynamic list, where more functions will be added. So do not hardcode it
		
		for(int i=1; i<columndriver.findElements(By.tagName("a")).size();i++){
			
			System.out.println(columndriver.findElements(By.tagName("a")).get(i).getText());
			
			String clickonthelinktab = Keys.chord(Keys.CONTROL, Keys.ENTER);
			
			columndriver.findElements(By.tagName("a")).get(i).sendKeys(clickonthelinktab);
			Thread.sleep(5000);
		}	
			Set<String> abc=driver.getWindowHandles();
			Iterator<String> it=abc.iterator();
		
			while(it.hasNext())
			{
				
				driver.switchTo().window(it.next());
				System.out.println(driver.getTitle());
			}
		
	}

}
