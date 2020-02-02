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
		
		List<WebElement> list = driver.findElements(By.xpath("//*[@id='countries']/tbody/tr"));
		int rowCount = list.size();
		System.out.println(rowCount);
		
		//      //*[@id='countries']/tbody/tr[1]/td[2]/strong
		String before_xpath = "//*[@id='countries']/tbody/tr[";
		String after_xpath = "]/td[2]/strong";
		
		for(int i=2 ; i<=rowCount ; i++)
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
