package practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToolTip_2 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/tooltip.html");
		Thread.sleep(2000);    
		
		//jquery tooltip
		
		WebElement download = driver.findElement(By.id("download_now"));
		Actions a = new Actions(driver);
		
		a.clickAndHold().moveToElement(download).build().perform(); 
		
		WebElement e = driver.findElement(By.xpath("//div[@class='tooltip']/a"));
		String Actualtext = e.getText();
		System.out.println(Actualtext);
		
		
		
		
		

	}

}
