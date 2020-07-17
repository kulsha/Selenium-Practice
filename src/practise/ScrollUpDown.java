package practise;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollUpDown {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver_83.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		//driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		//js.executeScript("window.scrollBy(0,6000)");
		//js.executeScript("window.scrollBy(6000,0)");
		
		//WebElement e = driver.findElement(By.xpath("//div[@class='home-section']//a[contains( text(), 'Education')]"));
		WebElement e = driver.findElement(By.linkText("Sell on Amazon"));
		js.executeScript("arguments[0].scrollIntoView(true);", e);
		//js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		Thread.sleep(2000);
		boolean b = e.isDisplayed();
		System.out.println(b);
		Thread.sleep(2000);
		e.click();
		

	}

}
