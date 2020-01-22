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

public class Excel_Write {

	public static void main(String[] args) throws EncryptedDocumentException, InvalidFormatException, IOException {
		
		//System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
		
		FileInputStream fis = new FileInputStream("./ExcelSheets/TestData_Write.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet("Home");
		Row r = sh.getRow(1);
		Cell c = r.getCell(0);

		c.setCellValue("manager");
		FileOutputStream fos = new FileOutputStream("./ExcelSheets/TestData_Write.xlsx");
		wb.write(fos);
		
	}

}
