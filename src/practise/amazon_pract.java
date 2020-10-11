package practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class amazon_pract {
	int a = 10;
	static int b= 20 ;

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver_1.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		Thread.sleep(2000);
		
		//driver.findElement(By.xpath("//span[contains( text(), 'Hello. Sign in')]")).click();
		//driver.findElement(By.xpath("//input[@id='ap_email']")).sendKeys("shashank");
		//WebElement e1 = driver.findElement(By.xpath("//span[contains( text(), 'Sign in')])[3]"));
		
	//	mouseOverUsingActions(driver, e, e1);
		
		driver.findElement(By.xpath("//i[@class='hm-icon nav-sprite']")).click();
		driver.findElement(By.xpath("//div[@id='hmenu-content']/ul[19]/li[5]/a")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id='hmenu-content']/ul[4]/li[4]/a")).click();
		

	}

//	public static void mouseOverUsingActions(WebDriver driver , WebElement element1 , WebElement element_2) throws InterruptedException
//	{
//		Actions a = new Actions(driver);
//		a.moveToElement(element1).build().perform();
//		a.moveToElement(element_2).click().build().perform();
//	}
	
	
}
