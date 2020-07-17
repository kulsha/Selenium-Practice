package practise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown_AscendingOrder {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		Thread.sleep(2000);
		
		WebElement e = driver.findElement(By.id("searchDropdownBox"));
		Select s = new Select(e);
		
		List<WebElement> options = s.getOptions();
		
		int count = options.size();
		System.out.println("no of options = "+count);
		
		ArrayList<String> l = new ArrayList<String>();
		
		for(WebElement b : options)
		{
			String text = b.getText();
			l.add(text);
		}
		
		Collections.sort(l);
		
		for(String m : l)
		{
			System.out.println(m);
		}
		//Assert.assertArrayEquals( expectedResult, result );
		//Assert.assertArrayEquals(expecteds, actuals);
	}

}
