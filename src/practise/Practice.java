package practise;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Practice {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		

		WebElement e = driver.findElement(By.xpath("//li[@class='li-login float-right tabres']/a[contains( text(), 'Login / Signup')]"));
		Actions a = new Actions(driver);
		a.moveToElement(e).build().perform();
		Thread.sleep(2000);
		WebElement e1 = driver.findElement(By.xpath("//a[contains( text(), 'SpiceClub Members')]"));
		a.moveToElement(e1).build().perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text() = 'Sign up']")).click();
		String s = driver.getTitle();
		System.out.println(s);
	}	

}
