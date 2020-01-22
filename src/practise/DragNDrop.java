package practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragNDrop {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		Thread.sleep(2000);
		
		driver.switchTo().frame(0);
		
		Actions a = new Actions(driver);
		WebElement e = driver.findElement(By.xpath("//div[@id='draggable']"));
		Thread.sleep(2000);//drag and hold
		WebElement e1 = driver.findElement(By.xpath("//div[@id='droppable']")); //release place
		a.clickAndHold(e).moveToElement(e1).release().build().perform();
		
		
		
		

	}

}
