import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Step 1 - Create Driver Object based on Chrome browser.
		
		// We will strictly implement method of webdriver
			
			/* 
			 * Syntax - Class name = X
			 * 	X driver = new X();
			 */
		// Invoke .exe file first -- So you need one more step before you execute this step
		// You should set property now
		System.setProperty("webdriver.chrome.driver", "C:/Users/DELL/Desktop/Selenium WebDriver/ChromeDriver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://google.com");
		System.out.println(driver.getTitle()); // A test case can be 
	}

}
