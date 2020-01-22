package practise;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable_1 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://cosmocode.io/automation-practice-webtable/");
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		WebElement e = driver.findElement(By.xpath("//*[@id='countries']/tbody"));
		List<WebElement> rowCount = e.findElements(By.tagName("tr"));
		System.out.println(rowCount.size());
		
		String before_xpath = "//*[@id='countries']/tbody/tr[";
		String after_xpath = "]/td[2]/strong";
		
		for(int i=2 ; i<=rowCount.size() ; i++)
		{
			String name = driver.findElement(By.xpath(before_xpath+i+after_xpath)).getText();
			System.out.println(name);
			if(name.contains("Australia"))
			{
				driver.findElement(By.xpath("//*[@id='countries']/tbody/tr["+i+"]/td[1]/input")).click();
			}
		}
		
		

	}

}
