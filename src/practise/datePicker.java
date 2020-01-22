package practise;

import org.openqa.selenium.By;
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
		driver.get("http://demo.automationtesting.in/WebTable.html");
		Thread.sleep(2000);
		
		//Mouse hover over
		WebElement e = driver.findElement(By.xpath("//a[contains(text(), 'Widgets')]"));
		Actions a = new Actions(driver);
		a.moveToElement(e).perform();
		driver.findElement(By.xpath("//a[contains(text(), 'Datepicker')]")).click();
		
		
		String date = "18-June-2012";
		String datearr[] = date.split("-");
		String day = datearr[0];
		String month = datearr[1];
		String year =  datearr[2];
		
		
		driver.findElement(By.xpath("//input[@id='datepicker2']")).click();
		Thread.sleep(1000);
		Select s = new Select(driver.findElement(By.xpath("//select[@title='Change the month']")));
		s.selectByVisibleText(month);
		
		Thread.sleep(8000);
		driver.findElement(By.xpath("//select[@title='Change the year']")).click();
		driver.findElement(By.xpath("//select[@title='Change the year']/option[contains(text(),'2012')]")).click();
		
//		Thread.sleep(2000);
//		Select s1 = new Select(driver.findElement(By.xpath("//select[@title='Change the year']")));
//		s1.selectByVisibleText(year);
		
		
		
		
		
		
	}

}
