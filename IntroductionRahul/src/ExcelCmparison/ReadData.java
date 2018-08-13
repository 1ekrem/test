package ExcelCmparison;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadData {

	public static void main(String[] args) {
		
		
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Desktop\\Selenium WebDriver\\ChromeDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://www.seslisozluk.net/");
		driver.manage().window().maximize();
		System.out.println(driver.findElement(By.xpath("//*[@id='wrap']/div[2]/div[1]/div/h1")).getText());
		
		String header = driver.findElement(By.xpath("//*[@id='wrap']/div[2]/div[1]/div/h1")).getText();
		driver.close();
		

		if(header == "Dictionary") {
			System.out.println("Test is successful");
		}
		else{
			System.out.println("Failed");
		}	

		
	}

}
