package practise;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BrowserLevelNotifications_ChromeOptionsClass {

	public static void main(String[] args) {
	
		// browser level notifications
		
		ChromeOptions options = new ChromeOptions();
		//options.addArguments("--disable-notifications"); // disable notifications
		options.addArguments("start-maximized"); // to maximize the browser
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		WebDriver driver =new ChromeDriver(options);
		driver.get("https://www.google.com");
		
		
	/*	start-maximized: Opens Chrome in maximize mode
		incognito: Opens Chrome in incognito mode
		headless: Opens Chrome in headless mode
		disable-extensions: Disables existing extensions on Chrome browser
		disable-popup-blocking: Disables pop-ups displayed on Chrome browser
		make-default-browser: Makes Chrome default browser
		version: Prints chrome browser version
		disable-infobars: Prevents Chrome from displaying the notification 'Chrome is being controlled by automated software
	*/
		
	}

}
