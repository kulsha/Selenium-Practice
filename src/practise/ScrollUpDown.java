package practise;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollUpDown {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://indianexpress.com/");
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		//js.executeScript("window.scrollBy(0,6000)");
		//js.executeScript("window.scrollBy(6000,0)");
		
		WebElement e = driver.findElement(By.xpath("//div[@class='home-section']//a[contains( text(), 'Education')]"));
		js.executeScript("arguments[0].scrollIntoView();", e);
	}

}
