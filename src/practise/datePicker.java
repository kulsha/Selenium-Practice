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
		
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver_83.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.cleartrip.com/");
		Thread.sleep(2000);
		
		WebElement date = driver.findElement(By.xpath("//input[@id='DepartDate']"));
		String dateval = "Fri, 26 Aug, 2020";
		
		selectDateByJS(driver, date, dateval);
		
	}
	//D, d M, yy
	
	public static void selectDateByJS(WebDriver driver ,WebElement element , String dateval)
	{
			JavascriptExecutor js = ((JavascriptExecutor)driver); 
			//js.executeScript("arguments[0].setAttribute('value' , '"+dateval+"');", element);
			//arguments[0].removeAttribute('readonly','readonly')
			js.executeScript("arguments[0].removeAttribute('readonly','readonly')",element);
			element.clear();
			element.sendKeys(dateval);
	}

}
