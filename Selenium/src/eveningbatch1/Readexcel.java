package eveningbatch1;

import java.io.FileInputStream;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Readexcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
      FileInputStream src=new FileInputStream("./software/emp.xlsx");
      Workbook book = WorkbookFactory.create(src);
      Sheet sh = book.getSheet("sheet1");
      Row r = sh.getRow(2);
      Cell cell = r.getCell(1);
      String value = cell.toString();
      System.out.println(cell);
      
      driver.get("https://www.facebook.com/");
      driver.findElement(By.id("email")).sendKeys(value);
      
      
	}

}


