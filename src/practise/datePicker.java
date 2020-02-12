package practise;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class datePicker {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.goindigo.in/");
		Thread.sleep(2000);
		
		WebElement date = driver.findElement(By.xpath("//input[@class='form-control or-depart igInitCalendar']"));
		String dateval = "30 Dec 2020";
		
		selectDateByJS(driver, date, dateval);
		
	}
	
	public static void selectDateByJS(WebDriver driver ,WebElement element , String dateval)
	{
			JavascriptExecutor js = ((JavascriptExecutor)driver); 
			js.executeScript("arguments[0].setAttribute('value' , '"+dateval+"');", element);
	}

}
