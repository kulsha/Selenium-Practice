package practise;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BrowserLevelNotifications {

	public static void main(String[] args) {
	
		// browser level notifications
		
		ChromeOptions options = new ChromeOptions();
		//options.addArguments("--disable-notifications"); // disable notifications
		options.addArguments("start-maximized"); // to maximize the browser
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		WebDriver driver =new ChromeDriver(options);
		driver.get("https://www.google.com");
		

	}

}
