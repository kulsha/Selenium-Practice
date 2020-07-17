package practise;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingDisabledElements {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver_83.exe");
		WebDriver driver = new ChromeDriver();
		//driver.get("https://www.guru99.com/execute-javascript-selenium-webdriver.html");
		//driver.get("https://html.com/attributes/input-disabled/");
		//driver.get("https://www.goindigo.in/");
		driver.get("file:///E:/Java/java%20selenium/disabled%20element.html");
		//driver.manage().window().maximize();	
		
	
//scroll up down-------------------------done
//enter data in disabled elements
// sendkeys , click , clear() , 
//date picker
//
		WebElement lname = driver.findElement(By.xpath("//input[@id='lname']"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("document.getElementById('lname').value='shashank';");

	}

}
