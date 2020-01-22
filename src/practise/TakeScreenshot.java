package practise;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakeScreenshot {
	 static	WebDriver driver;
	
	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get("http://www.facebook.com");	
		takeScreenshot("facebook_loginPage");
	}

	public static void takeScreenshot(String fileName) throws IOException
	{
		// 1 Take screenshot and store it as a file format
		File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		// 2 now copy the screenshot to desired location using copyfile method
		FileUtils.copyFile(file, new File("./Screenshots/" + fileName+".jpg"));
	}
	
	
	
}
