package practise;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks {

	static void verify(String url) throws IOException
	{
		try {
			URL link = new URL(url);
			HttpURLConnection httpConn =(HttpURLConnection)link.openConnection();
			httpConn.connect();
			if(httpConn.getResponseCode()== 200) { 
				 System.out.println(url+" - "+httpConn.getResponseMessage());
				 }
				 if(httpConn.getResponseCode()== 404) {
				 System.out.println(url+" - "+httpConn.getResponseMessage());
				 }
			}
			
			
		catch (MalformedURLException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver_80.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		
		List<WebElement> list = driver.findElements(By.tagName("a"));
		
		for(int i=0 ; i<list.size() ; i++)
		{
			String url =list.get(i).getAttribute("href");
			verify(url);
		}
		
	}

}
