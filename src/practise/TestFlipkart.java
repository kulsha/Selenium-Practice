package practise;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class TestFlipkart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeOptions options = new ChromeOptions();
		//options.addArguments("--disable-notifications"); // disable notifications
		options.addArguments("start-maximized"); // to maximize the browser
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		WebDriver driver =new ChromeDriver(options);
		driver.get("https://www.flipkart.com");
		
		
		Actions action=new Actions(driver);
		action.sendKeys(Keys.ESCAPE).build().perform();
		
		
		WebElement headerDeals= driver.findElement(By.xpath("//h2[text()='Deals of the Day']"));
		
		
		
		List<WebElement> dealProducts= driver.findElements(By.xpath("//div[@data-tracking-id='Deals of the Day']/div/div/div/div//a"));
		
		List<WebElement> dealProdImg = driver.findElements(By.xpath("//div[@data-tracking-id='Deals of the Day']/div/div/div/div//a/div//img"));
		
		WebElement dealsPageArrow= driver.findElement(By.xpath("(//div[@class='_2AEDbQ _1V02gy']/*[name()='svg' and @class='Hfq2pU'])[1]"));
		
		System.out.println(headerDeals.isDisplayed());
		
		for (WebElement webElement : dealProducts) {
			String s1=webElement.getAttribute("title");
			System.out.println(s1.contains("off")+"---"+s1.contains("Off"));
			System.out.println(s1);
		}
		
		for (WebElement webElement : dealProdImg) {
			System.out.println(webElement.isDisplayed());
			
		}
		
	}

}
