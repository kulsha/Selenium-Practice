package practise;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class ValidateErroeMsg {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.gmail.com/");
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//div[@id='identifierNext']")).click();
		
		String msg = driver.findElement(By.xpath("//div[@class='o6cuMc']")).getText();
		Assert.assertEquals(msg, "Enter an email or phone number" , "TestCase fail");
		
	
		
	}

}
