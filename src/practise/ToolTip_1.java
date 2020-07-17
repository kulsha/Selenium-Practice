package practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class ToolTip_1 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/tooltip/");
		Thread.sleep(2000);
		
		WebElement jquery = driver.findElement(By.xpath("//h2[@class='logo']/a"));
		
		String tooltip = jquery.getAttribute("title");
		System.out.println(tooltip); // Actual Result
		
		String ExpectedToolTip = "jQuery U";
		Assert.assertEquals(tooltip, ExpectedToolTip);
		
		
		
		
		

	}

}
