package practise;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectCommonTab_Link {

	public static void clickTab(WebDriver driver , String tabName) throws Exception
	{
		try
		{
			ArrayList<String> tabNameList = new ArrayList<String>();
			String locator = "//div[@id='nav-xshop']//a";
			List<WebElement> tabList  = driver.findElements(By.xpath(locator));
			int q = tabList.size();
			System.out.println(q);

			tabList.forEach(x-> tabNameList.add(x.getText().trim()));	

			for(String t : tabNameList)
			{
				System.out.println(t.toString());
			}

			int indexOfList = tabNameList.indexOf(tabName);
			String listIndex = Integer.toString(indexOfList+1);
			String classIdfr = "(//div[@id='nav-xshop']//a)["+listIndex+"]";
			WebElement ele = driver.findElement(By.xpath(classIdfr));

			//			JavascriptExecutor je = (JavascriptExecutor) driver;
			//			je.executeScript("arguments[0].scrollIntoView(true);",ele);
			Thread.sleep(1000);
			ele.click();
		}
		catch(Exception e)
		{
			throw new Exception("recheck tabname name "+tabName);
		}
	}





	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver_83.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");

		Thread.sleep(2000);
		clickTab(driver, "Books");

	}
}