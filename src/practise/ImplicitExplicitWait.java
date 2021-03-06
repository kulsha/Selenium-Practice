package practise;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ImplicitExplicitWait {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.HOURS);
		
		driver.get("https://www.facebook.com");
		
		WebElement firstName = driver.findElement(By.name("firstname")); //10   3rd second   17 sec
		WebElement lastName = driver.findElement(By.name("lastname")); //10	    7th second   13 sec
		
		WebElement login = driver.findElement(By.name("login")); //20   nosuch element     60 second
		
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		sendKeys(driver , firstName , 10 , "Tom");
		sendKeys(driver , lastName , 5 , "Peter");
		
		WebElement forgotAccount = driver.findElement(By.linkText("Forgotten account"));
		clickOn(driver , forgotAccount , 5);
	}

	
	public static void sendKeys(WebDriver driver , WebElement element , int timeout , String value)
	{
		new WebDriverWait(driver , timeout).
		until(ExpectedConditions.visibilityOf(element));
		element.sendKeys(value);
	}
	
	public static void clickOn(WebDriver driver , WebElement element , int timeout)
	{
		new WebDriverWait(driver , timeout).
		until(ExpectedConditions.elementToBeClickable(element));
		element.click();
	}
	
	
}
