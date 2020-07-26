package practise;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class urlTesting {

	static int v ;
	static WebDriver driver;
	
	public static void main(String[] args) throws EncryptedDocumentException, InvalidFormatException, IOException
	{
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver_83.exe");
		 driver= new ChromeDriver();
		 excelData();
	}
	
	static void verify(int v)
	{
		
		driver.get("https://www.testflipkart.com/" +v);
	}
	
	public static void excelData() throws EncryptedDocumentException, InvalidFormatException, IOException
	{
		FileInputStream fis = new FileInputStream("./ExcelSheets/TestData_Read.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet("url");
		
		int rowCount = sh.getPhysicalNumberOfRows();
		System.out.println(rowCount);
		
		for(int i=1 ; i<=rowCount ; i++)
		{
		
			Row r = sh.getRow(i);
			Cell c = r.getCell(0);
	
			v= (int)c.getNumericCellValue();
			System.out.println(v);
			verify(v);
			
		}
	}
		

	}


