package practise;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FrameHandling {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver_83.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Frames.html");
		
		Thread.sleep(2000);
		driver.switchTo().frame(3);
		Thread.sleep(2000);
		 driver.findElement(By.xpath("//input[@type = 'text']")).sendKeys("hello");		
		 
		 driver.switchTo().defaultContent();
		 
		 
		 
		 
		
	}

}
