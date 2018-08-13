import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Desktop\\Selenium WebDriver\\ChromeDriver\\chromedriver.exe");	
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://echoecho.com/htmlforms10.htm");
		
		//driver.findElement(By.xpath("//input[@value='Milk']")).click();
		//driver.findElements(By.xpath("//input[@name='group1']")).size();
		
		//This process will capture all the elements in the radio button list,
		int count = driver.findElements(By.xpath("//input[@name='group1']")).size();
		
		for(int i=0; i<count;i++) // Loop will continue until i<count (Count comes from .size which is 3)
			{
			//driver.findElements(By.xpath("//input[@name='group1']")).get(i).click();
			
			//This is prints out values in the console
			//System.out.println(driver.findElements(By.xpath("//input[@name='group1']")).get(i).getAttribute("value"));
		
			//Now lets create an object as text and list all values above - Handling Dynamic RadioButtons
			String text=driver.findElements(By.xpath("//input[@name='group1']")).get(i).getAttribute("value");
			//Create a if condition to choose one
			if(text.equals("Cheese"))
			{
				driver.findElements(By.xpath("//input[@name='group1']")).get(i).click();
			}
	
			
		}
		
		
	}

}
