package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Googleoprations {
	
	WebDriver driver;
		
@BeforeMethod
public void Openbrowser()
{
	System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver_83.exe");
	driver=new ChromeDriver();
	driver.get("https://google.com");
	driver.manage().window().maximize();
}

@Test(groups="smoke")  //dependsOnMethods= {"printtitle"},
public void Images() 

{
	WebElement linkc=driver.findElement(By.linkText("Images"));
	linkc.click();
}

@Test(groups="smoke")
public void privacy () 
{

	driver.manage().window().maximize();
	WebElement linkk=driver.findElement(By.linkText("Privacy"));
	linkk.click();
}

@Test(groups="smoke")
public void printtitle()
{
	String title = driver.getTitle();
	System.out.println("title = "+title);
}

@Test(groups= "smoke")
public void Gmail()  
{  

	WebElement glink=driver.findElement(By.linkText("Gmail"));
	glink.click();
}  

@Test(groups= "smoke") // priority=1,
public void Advertising()  
{  
	WebElement Alink=driver.findElement(By.linkText("Advertising"));
	Alink.click();  
} 

@Test // enabled=false
public void Terms()  
{  
	
	WebElement tlink=driver.findElement(By.linkText("Terms"));
	tlink.click(); 
}  

@Test(timeOut=1)
public void Settings()  
{  
	driver.manage().window().maximize();
	WebElement slink=driver.findElement(By.linkText("Settings"));
	slink.click();
}  
@Test
public void Business()  
{  

	WebElement Blink=driver.findElement(By.linkText("Business"));
	Blink.click();
}  

@Test
public void About()  
{  

	WebElement Abtlink=driver.findElement(By.linkText("About"));
	Abtlink.click();
}  


@AfterMethod /*5*/

public void closeBrowser()

{

	driver.quit();

}





}





