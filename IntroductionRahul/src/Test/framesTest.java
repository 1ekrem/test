package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class framesTest {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Desktop\\Selenium WebDriver\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://jqueryui.com/droppable/");

		//Check How many frames do you have on the page?
		System.out.println("Number of frames: "+driver.findElements(By.tagName("iframe")).size());
		
		
		// We need to switch to frame to work with a frame.
		// How should we switch to this frame?
		//1. WAY TO SWITCH
		//driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		//2. WAY TO SWITCH
		driver.switchTo().frame(0);
		
		driver.findElement(By.id("draggable")).click(); // If you run only by using the locator id than it will fail. 
		// The id is in the frame. 
		//Selenium cannot recognize if it is a frame or not.
		//So we have to setup the framework for selenium to recognize.
		//Frame is a part of a web page or browser window displays content independent of its container 
		
		// After the frame is created than we have to create Actions 
		Actions ac =new Actions(driver);
		
		WebElement source = driver.findElement(By.id("draggable"));
		WebElement target = driver.findElement(By.id("droppable"));
		
		ac.dragAndDrop(driver.findElement(By.id("draggable")), driver.findElement(By.id("droppable")));
		
		ac.dragAndDrop(source, target).build().perform();
		
	}

}
