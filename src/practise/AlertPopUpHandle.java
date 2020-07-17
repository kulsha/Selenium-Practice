  package practise;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class AlertPopUpHandle {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		Thread.sleep(2000);

		driver.findElement(By.xpath("//input[@name='proceed']")).click();
		Thread.sleep(5000);
		
		Alert alert = driver.switchTo().alert();
		Thread.sleep(3000);
	//	System.out.println(alert.getText());
		alert.accept(); //click ok button
		//alert.dismiss(); // click cancel button
	
		String text = alert.getText();
		System.out.println(text);
	  Assert.assertEquals(alert.getText(), "Please enter a valid user name" , "values match");
	  
	  
	  Wait wait = new WebDriverWait(driver,10);
	  wait.until(ExpectedConditions.alertIsPresent());
	  
	  
	}

}
