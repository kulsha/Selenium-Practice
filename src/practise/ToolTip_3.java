package practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToolTip_3 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.menucool.com/tooltip/css-tooltip");
		driver.manage().window().maximize();
		
		WebElement top= driver.findElement(By.xpath("//div[contains(text(),'Top')]"));
		Actions a=new Actions(driver);
		a.clickAndHold().moveToElement(top).build().perform();

		WebElement text=driver.findElement(By.xpath("//li[text()='Aliquam ac odio ut est']"));

		String actualTooltip=text.getText();
		System.out.println(actualTooltip);
		/*String expectTooltip="What's new in 3.2";

		Assert.assertEquals(actualTooltip,expectTooltip);*/




	}

}
