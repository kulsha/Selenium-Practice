package practise;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AuthPopUp {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		String username = "admin";
		String password = "admin";
		Thread.sleep(3000);
		
		//driver.get("http://admin:admin@the-internet.herokuapp.com/basic_auth");
		driver.get("http://"+username+":"+password+"@"+"the-internet.herokuapp.com/basic_auth");
		
		
	}

}
