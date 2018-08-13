import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class runWebBrowsers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Dont forget setting the Properties
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Desktop\\Selenium WebDriver\\ChromeDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://google.com");
		System.out.println(driver.getTitle()); // Validates if your Page Title is correct
		
		//Get the current URl
		System.out.println(driver.getCurrentUrl());// Validates if you are landed on the correct URL.
		
		//System.out.println(driver.getPageSource());
		driver.get("http://yahoo.com");
		//driver.navigate().back(); // Goes back to previous page
		driver.close(); // Closes the current browser
		//driver.quit(); // Closes all the browser opened by Selenium Script
	}

}
