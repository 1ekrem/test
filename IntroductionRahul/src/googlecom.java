import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class googlecom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Desktop\\Selenium WebDriver\\ChromeDriver\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			
			driver.get("https://google.com");
			driver.findElement(By.xpath("//div[@class='lst-c']/div/div[2]/div/input")).sendKeys("Quality Assurance Jobs in NY");
			driver.findElement(By.xpath("//a[@class='gb_P'][contains(text(),'Images')]")).click();
			
			
	}

}
