package com.javaConcepts;


interface WebDriver 
{
		void get() ; 
	
}

public class ChromeDriver implements WebDriver {

	public void get()
	{
		System.out.println("chrome browser launch");
	}
	
	public void hello()
	{
		System.out.println("hello");
	}
	
	public static void main(String[] args) {
//		
//		ChromeDriver cd = new ChromeDriver() ;  // normal object creation
//		cd.get();
//		cd.hello();
		
		WebDriver driver = new ChromeDriver() ; // Upcasting
		driver.get(); // coming from interface
	}

}
 class InternetExplorer implements WebDriver {

	public void get()
	{
		System.out.println("IE browser launch");
	}
	
	public static void main(String[] args) {
		
//		InternetExplorer ie = new InternetExplorer() ;  // normal object creation
//		ie.get();
	
		
		WebDriver driver = new InternetExplorer() ; // Upcasting
		driver.get(); // coming from interface
	}

}












