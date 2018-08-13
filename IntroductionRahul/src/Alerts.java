import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Desktop\\Selenium WebDriver\\ChromeDriver\\chromedriver.exe");	
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.tizag.com/javascriptT/javascriptalert.php");
		
		driver.findElement(By.xpath("//input[@value='Confirmation Alert']")).click();
		
		//So we can not spy on the OK button the web alert, then we have to you Accept Method
		
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();//Accept =  OK done Yes
		driver.switchTo().alert().sendKeys("Ekrem");
		//Accept is used to click on OK or Yes
		// What if you want to click on NO?
		// You should use the following .dismiss() method
		driver.switchTo().alert().dismiss();
	}

}
