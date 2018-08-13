import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FormMethods {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Desktop\\Selenium WebDriver\\ChromeDriver\\chromedriver.exe");	
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.makemytrip.com/");
		System.out.println(" BEFORE clicking on Multi city Button");
		System.out.println(driver.findElement(By.xpath("//input[@id='hp-widget__return']")).isDisplayed());
		//When we click on Multi City Return date should disappear so below code
		// -- below code should print FALSE for .isDisplayed() Method
		driver.findElement(By.xpath("//label[@for='switch__input_3']")).click();
		System.out.println(" AFTER clicking on Multi city Button");
		System.out.println(driver.findElement(By.xpath("//input[@id='hp-widget__return']")).isDisplayed());
		Thread.sleep(3000L);
		//Test Scenario - Check if the button is there or not. Hint: Size>0 --> Button is there. 
		//System.out.println("Multi is "+driver.findElements(By.xpath("//input[@id='switch__input_3']")).size());
		System.out.println("TEXT -->" +driver.findElement(By.xpath("//*[@id='wallet_card']/div/p[1]/font[1]")).getText());
		Thread.sleep(3000L);
		//We can check the size and confirm if there is a button or not.
		//More professional way is as following;
		int count = driver.findElements(By.xpath("//input[@id='swith__input_3']")).size();
		if(count==0)
		{
			
			System.out.println("Removal is verified");
		}
		}

}
