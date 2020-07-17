package practise;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CompareTwoDropdowns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver_83.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");
	
		WebElement e = driver.findElement(By.id("select-demo"));
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
		ArrayList<String> dd = new ArrayList<String>();
		dd.add("Tuesday");
		dd.add("Sunday");
		dd.add("Monday");
		dd.add("Please select");
		dd.add("Wednesday");
		dd.add("Thursday");
		dd.add("Friday");
		dd.add("Saturday");
		// , "Sunday" , "Monday" , "Tuesday" , "Wednesday" , "Thursday" , "Friday" , "Saturday"};
		
		//Collections.sort(l);
	
		for(String m : l)
		{
			System.out.println(m);
		}
		
		//assertTrue(Arrays.equals(dd, l));
		Assert.assertEquals( dd, l );
		
		
	}

}
