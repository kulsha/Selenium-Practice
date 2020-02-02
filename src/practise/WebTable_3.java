package practise;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable_3 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://cosmocode.io/automation-practice-webtable/");
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		List<WebElement> list = driver.findElements(By.xpath("//*[@id='countries']/tbody/tr"));
		int rowCount = list.size();
		System.out.println(rowCount);
		
		// //*[@id='countries']/tbody/tr[2]/td[2]/strong
		//*[@id='countries']/tbody/tr[3]/td[2]/strong
		
		String before_xpath = "//*[@id='countries']/tbody/tr[";
		String after_xpath = "]/td[2]/strong";
		
		for(int i=2 ; i<10 ; i++)
		{
			String actual_xpath = before_xpath+i+after_xpath;
			WebElement element = driver.findElement(By.xpath(actual_xpath));
			System.out.println(element.getText());
			
			if(element.getText().equals("Austria"))
			{
				System.out.println("Country name : " + element.getText() + " is found at position " + (i-1));
			}
		}
		
		System.out.println("***************************************************");
		
		// //*[@id="countries"]/tbody/tr[2]/td[3]
		String afterXpathCapital= "]/td[3]";
		for(int i=2 ; i<10 ; i++)
		{
			String actual_xpath = before_xpath + i + afterXpathCapital;
			WebElement element = driver.findElement(By.xpath(actual_xpath));
			System.out.println(element.getText());	
		}
		System.out.println("***************************************************");
		
		String afterXpathCurrency= "]/td[4]";
		for(int i=2 ; i<10 ; i++)
		{
			String actual_xpath = before_xpath + i + afterXpathCurrency;
			WebElement element = driver.findElement(By.xpath(actual_xpath));
			System.out.println(element.getText());	
		}
		
		
		System.out.println("**************************************************");
		
		// //*[@id="countries"]/tbody/tr[1]/td[1]
		// //*[@id="countries"]/tbody/tr[1]/td[2]
		
		String colBeforeXpath = "//*[@id='countries']/tbody/tr[1]/td[";
		String colAfterXpath = "]";
		List<WebElement> cols = driver.findElements(By.xpath("//*[@id='countries']/tbody/tr[1]/td"));
		int colCount = cols.size();
		System.out.println("Total no of Columns are " +colCount);
		
		for(int i=1 ; i<=colCount ; i++)
		{
			String actual_xpath = colBeforeXpath + i + colAfterXpath;
			WebElement element = driver.findElement(By.xpath(actual_xpath));
			System.out.println(element.getText());	
		}
		
		

	}

}
