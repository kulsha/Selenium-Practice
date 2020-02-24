package practise;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrowser_ParentBrowser_PopUp {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.toolsqa.com/automation-practice-switch-windows/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.findElement(By.xpath("//a[@id='cookie_action_close_header']")).click();
		
		String parent = driver.getWindowHandle();
		System.out.println("parent browser = " +parent);
		 
		WebElement e = driver.findElement(By.xpath("//button[@id='button1']"));
			
		for(int i=0 ; i<3 ; i++)
		{
			e.click();
			Thread.sleep(2000);
		}
		
		Set<String> wh = driver.getWindowHandles();
		for(String k : wh)
		{
			System.out.println(k);
		}

		//		driver.switchTo().window(k);
//		driver.get("https://www.google.com");
		
		driver.switchTo().window(parent).close();
		
	}

}
