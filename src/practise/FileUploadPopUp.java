package practise;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadPopUp {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://html.com/input-type-file/");
		Thread.sleep(8000);
		
//		//driver.findElement(By.xpath("//a[@class='pm-cta']")).click();
//		WebElement e = driver.findElement(By.xpath("//input[@id='fileupload']"));
//		
//		JavascriptExecutor js = (JavascriptExecutor)driver ;
//		js.executeScript("arguments[0].scrollIntoView(true);",e);
//		Thread.sleep(millis);
		
		driver.findElement(By.xpath("//input[@id='fileupload']")).sendKeys("E:/Java/JAVA.txt");
		
		
		

	}
 
}
