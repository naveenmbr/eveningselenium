package eveningbatch;

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
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class fetchdataexcel {

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub

		
			
			
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        
       driver.manage().window().maximize();
       //Step1
       FileInputStream fis = new FileInputStream("./software/emp1.xlsx");
       //step2
       Workbook book = WorkbookFactory.create(fis);
       //step3
        Sheet sh = book.getSheet("Sheet1");
       //step4
        Row ro = sh.getRow(0);
       //step5
         Cell cel = ro.getCell(0);
       //step 6
          String value = cel.toString();
          
          System.out.println(value);
                    
       
      
     //----
       Thread.sleep(4000);
      driver.quit();
			 
			
	}

}
