package practise;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectingAllLinksAndPrintingText {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		//driver.manage().window().maximize();
		
		
	List<WebElement> list =	driver.findElements(By.tagName("a"));
		System.out.println("Total Links " +list.size());
		
		for(int i = 0 ; i<list.size() ; i++)
		{
		String linktext =	list.get(i).getText();
			System.out.println(linktext);
		}
		
	}

}
