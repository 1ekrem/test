import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Css {

	public static void main(String[] args) {
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Desktop\\Selenium WebDriver\\ChromeDriver\\chromedriver.exe");	
	WebDriver driver = new ChromeDriver();
	driver.get("https://login.salesforce.com/");
	driver.findElement(By.cssSelector("input[id='username']")).sendKeys("burhan");
	
	driver.findElement(By.cssSelector("input[id='password']")).sendKeys("1234");
	driver.findElement(By.xpath("//*[@id='Login']")).click();
	
	
	//xpath = //tagname(@attribute = 'value')
			
					//CSS== tagname[attribute='value'] // No double slash for CSS
						//all the special symbols
				//	div[id='username_container'] //css format
					//div[@id="username_container"] -- XPath Format
	}

}
