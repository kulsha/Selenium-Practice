package practise;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
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

public class Excel_Read {

	public static void main(String[] args) throws EncryptedDocumentException, InvalidFormatException, IOException {
		
		//System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
		
		FileInputStream fis = new FileInputStream("./ExcelSheets/TestData_Read.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet("Home");
		Row r = sh.getRow(1);
		Cell c = r.getCell(0);
		

		String v = c.getStringCellValue(); // string
		System.out.println(v);
		c.getNumericCellValue();   // number
		//int rowCoun = sh.getLastRowNum();
		int rowCount = sh.getPhysicalNumberOfRows();
		System.out.println(rowCount);
		

//		File fis=new File("./ExcelData/TestData_Write1.xlsx")
//		XSSFWorkbook wb=new XSSFWorkbook();
//		XSSFSheet sh=wb.createSheet();
//		sh.createRow(10).createCell(10).setCellValue("Angrej");
//
//		FileOutputStream fos= new FileOutputStream(fis);
//
//		wb.write(fos);
		
		
		
		
	}

}
