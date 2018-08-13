import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Skiplagged {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Desktop\\Selenium WebDriver\\ChromeDriver\\chromedriver.exe");	
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://skiplagged.com/");
		driver.findElement(By.xpath("//button[@data-trip-type='one-way']")).click();
		driver.findElement(By.xpath("//*[@id='home-container']/div[1]/form/div[2]/div/label[2]")).click();
		driver.findElement(By.xpath("//*[@id='home-container']/div[1]/form/div[2]/div/label[2]")).sendKeys("SFO");
		driver.findElement(By.xpath("//*[@id='home-container']/div[1]/form/div[2]/div/div/label[1]")).click();
		driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div[1]/table/tbody/tr[2]/td[3]/a")).click();
		driver.findElement(By.xpath("//*[@id='home-container']/div[1]/form/div[2]/button")).submit();
	}

}
