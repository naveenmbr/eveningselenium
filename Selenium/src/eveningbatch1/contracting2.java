package eveningbatch1;

/*----BEGIN-----+WORKING CODE+++++++++++++++NEXT BUTTON--++++++++++++++++++++============+++++++++=----------------------*/
//--------"NEXT BUTTON"---at the Bottom of NEW RFQ page is working-----------//
import org.openqa.selenium.By;


import java.util.regex.Pattern;
import java.util.regex.Matcher;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.By.ByLinkText;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import org.openqa.selenium.WebDriver.Window;
//import org.openqa.selenium.devtools.idealized.Javascript;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Wait;
import java.time.Duration;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.testng.Assert;
//import org.testng.annotations.Test;

import java.util.List;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import org.openqa.selenium.Keys;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;

//import org.testng.annotations.Test;

public class contracting2 {





	final static String desiredDate = "10 Sep 2023";
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//---BEGIN-new code browser issue ---20--03--2023
		/*
				ChromeOptions co = new ChromeOptions();
				co.addArguments("--remote-allow-origins=*");
				WebDriver driver = new ChromeDriver(co);
				System.setProperty("webdriver.chrome.driver","C:\\");
				co.addArguments("disable-notifications");
				co.addArguments("--enable-javascript");
				
		*/	
				//--chrome driver
				System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
				
				WebDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				
				
				//--
				
		//---END new Code browser issue  ---20-03-2023
		

/*-----Original browser code without any  Fix------------------*/	
		/*		
	  	ChromeOptions options = new ChromeOptions();
		options.addArguments("disable-notifications");
		options.addArguments("--enable-javascript");
		*/
/*-----Original browser code without any  Fix------------------*/			
		
		//WebDriverManager.chromedriver().setup();
	/*		WebDriver driver = new ChromeDriver(options);      */
			/*browser instance --15--03--2023   */
		//	var driver = new webdriver.Builder().forBrowser('Chrome').build();
			
			
			/*browser instance --15--03--2023   */
	/*		System.setProperty("webdriver.chrome.driver","C:\\");  //local path        */
			
			driver.get("https://beta-contracting.transporteg.com/");
	        driver.manage().window().maximize();                  
			
			driver.findElement(By.xpath("//input[@type='text']")).sendKeys("demouser13@yopmail.com");
			driver.findElement(By.xpath("//input[@type='password']")).sendKeys("qwerty");
			driver.findElement(By.xpath("//input[@type='submit']")).submit();
			
			//New User 16-02-2023//
		    /*
			driver.findElement(By.xpath("//input[@type='text']")).sendKeys("naveen@caliperbusiness.com");
			driver.findElement(By.xpath("//input[@type='password']")).sendKeys("qwerty");
			driver.findElement(By.xpath("//input[@type='submit']")).submit();
			*/
			/*--------------------------------BEGIN---code for CLICK HERE Button in Login page --------------------------------------*/
			Wait<WebDriver> wait = new FluentWait<>(driver).withTimeout(Duration.ofSeconds(10)).pollingEvery(Duration.ofSeconds(2)).ignoring(NoSuchElementException.class); 
			WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()=' Click Here...']")));			
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoView();", element);

			element.click();
			System.out.println("Click Here BUtton is Clicked");
			Thread.sleep(1000);

/*--------------------------------END---code for CLICK HERE Button in Login page --------------------------------------*/
			
/*--Earlier working code --not working now
			Wait<WebDriver> wait = new FluentWait<>(driver).withTimeout(Duration.ofSeconds(10)).pollingEvery(Duration.ofSeconds(2)).ignoring(NoSuchElementException.class); 
			WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='root']/div/div[2]/div[1]/div[2]/div/div/span/a")));			
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoView();", element);

			element.click();
			System.out.println("Click Here -login page button is clicked");
*/			
//------------TEST CASE FOR VALIDATING TITLE--------------------------------------------//		
			String expected_title = "TEG";
			String actual_title = driver.getTitle();

			if (expected_title.equals(actual_title)){
			    System.out.println("Login Successfull");
			} else{
			System.out.println("Login Failed");
			}
			
//------------TEST CASE FOR VALIDATING TITLE--------------------------------------------//				
			
			
/*--------------------------Code for New RFQ --Button---------------------------------*/
			
			Wait<WebDriver> wait1 = new FluentWait<>(driver).withTimeout(Duration.ofSeconds(10)).pollingEvery(Duration.ofSeconds(2)).ignoring(NoSuchElementException.class); 
//below earlier working code--not working now[x-path has issue]			
/*			WebElement element1 = wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='root']/div/div[2]/div/div[2]/div[1]/div[3]/a")));             */
			
			WebElement element1 = wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@href='/rfq/type']")));
			//a[@href='/rfq/type']
			JavascriptExecutor js1 = (JavascriptExecutor) driver;
			js1.executeScript("arguments[0].scrollIntoView();", element1);

			element1.click();
			
			
/*--------------------------Code for New RFQ --Button--------------------------------------*/
			
/*--------------Begin------code for Single Mode RFQ Button---------------------------------*/			
			//Earlier working code commented--not working now[changed the x-path]
/*			WebElement element2 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='root']/div/div[2]/div[2]/div/div/div[2]/div[1]/button")));         */
			
			//below  is New x-path for Single mode RFQ
			//button[text()='Create New Single Mode RFQ']
			WebElement element2 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Create New Single Mode RFQ']")));
			
			JavascriptExecutor js2 = (JavascriptExecutor) driver;
			js2.executeScript("arguments[0].scrollIntoView();", element2);

			element2.click();
			
			
/*--------------End------code for Single Mode RFQ Button------------------------------------*/
			
/* ---------scroll to bottom of page---------------------------*/
			 // scroll down the page
			/*
			JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
			
			jsExecutor.executeScript("window.scrollTo(200, document.body.scrollHeight");	
			*/
/* ---------scroll to bottom of page---------------------------*/
			
		  	
//------------BEGIN---CODE--TO--SCROLL DOWN TO SPECIFIC PIXEL-----------------------------------------------------------//
		 
	//---Change the scroll location to (0,1500) -->scroll to Upload File Button
		
			Thread.sleep(2000); //4000
		  	 // scroll down by a specific amount of pixels
		  	 JavascriptExecutor jspix = (JavascriptExecutor)driver;
		  	 jspix.executeScript("window.scrollBy(0,650);");
		  	 System.out.println("Page scrolled to 650 pixel--SCROLLS TO CHOOSE FUEL TYPE DROP DOWN");
		  	System.out.println("Page scrolled to 2500 pixel to view - Page scrolls to Upload New Document Button");
		  	 // wait for a few seconds to allow the page to load  	
		 /* System.out.println("Page is scrolled to pixel");   */
		  	Thread.sleep(2000);  //--original  8000
		  //	Thread.sleep(3000);	  	 
 /*
Thread.sleep(8000);
Thread.sleep(10000);
*/
/*-----------------------++-----New code-24-MAY--2023-++--------new ---Code for Choose Fuel Drop down-----------------------------------------------------------------*/
	/*-----RECENT CODE --LATEST FOR CHOOSE FUEL TYPE
		  	Thread.sleep(8000);
		 	
		 	Wait<WebDriver> waitfl = new FluentWait<>(driver).withTimeout(Duration.ofSeconds(10)).pollingEvery(Duration.ofSeconds(2)).ignoring(NoSuchElementException.class); 
		 	//WebElement elementfl = waitfl.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='pr dropdown-container pr mb-30 wt-250 fuel_type']")));			
		 	//elementfl.click();
		 
		 	//--x-path 
		 WebElement elementfl = waitfl.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='pr dropdown-container pr mb-30 wt-250 fuel_type']//div//div[@class='flex-1 curP flex flex-middle pl-10 pr-10 label-color fSemibold']")));
		//--x-path 	//div[@class='pr dropdown-container pr mb-30 wt-250 fuel_type']//div//div[@class='flex-1 curP flex flex-middle pl-10 pr-10 label-color fSemibold']
		 	//--new code
		 	Actions actionsfl = new Actions(driver);
		 ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(false); arguments[0].focus();", elementfl);
		 	
		 	//--new code
		 	actionsfl.perform();
		 	elementfl.click();
		 
		 	System.out.println("Choose fuel type clicked");
*/	
		  	
//--BEGIN----new code from suggestion-OPTION-1----
		 // Wait until the element is clickable
		  	/*
	        WebDriverWait waitdrp = new WebDriverWait(driver, 10); // Max wait time of 10 seconds
	        WebElement elementdrp = waitdrp.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='flex-1 curP flex flex-middle pl-10 pr-10 label-color fSemibold']")));

	        // Perform the click operation
	        elementdrp.click();	  	
		  	*/
//--END----new code from suggestion-OPTION-1-------
		  	Thread.sleep(4000); //8000
//---------FINAL CODE-------------++++++WORKING CODE FOR ElementClickInterceptedException-+++++-------------------------------+++++//	        
//----------BEGIN----new code from suggestion-OPTION-2------------------------
		  	Thread.sleep(3000);
		  	// Locating Choose Fuel type and click on it
			WebElement ele = driver.findElement(By.xpath("//div[@class='flex-1 curP flex flex-middle pl-10 pr-10 label-color fSemibold']"));
			System.out.println(ele);
			JavascriptExecutor jse = (JavascriptExecutor)driver;
			jse.executeScript("arguments[0].click()", ele); 
			System.out.println("Choose fuel type drop down is clicked");
		
			Thread.sleep(3000);
		// Locating the drop-down value 'petroleum' and click on it
			WebElement elelst = driver.findElement(By.xpath("//div[@class='pr dropdown-container pr mb-30 wt-250 fuel_type']//div//div[contains(text(),'Petroleum')]"));
			JavascriptExecutor jselst = (JavascriptExecutor)driver;
			jselst.executeScript("arguments[0].click()", elelst);
			System.out.println("Choose fuel type--Petroleum selected");
	       
//-----------END---new code from suggestion-OPTION-2---------------------------			
//---------FINAL CODE-------------++++++WORKING CODE FOR ElementClickInterceptedException-+++++----------------------------------++++//		        
	        
/*---------FINAL CODE---------++-----New code-01-JUNE--2023-++-----Code for CONTRACT TYPE Drop down-------------------------------*/
			            Thread.sleep(3000);
			// Locating Contract type Drop down and click on it
						WebElement elecnty = driver.findElement(By.xpath("//div[@class='pr dropdown-container pr mb-30 wt-250']//div//div[contains(text(),'Choose Contract Type')]"));
						System.out.println(elecnty);
						JavascriptExecutor jsecnty = (JavascriptExecutor)driver;
						jsecnty.executeScript("arguments[0].click()", elecnty); 
						System.out.println("Choose Contract type drop down is clicked");
						Thread.sleep(3000);			
			//-- Selecting the value from the  Contract type Drop down and click on it
						WebElement elecntval = driver.findElement(By.xpath("//div[@class='pr dropdown-container pr mb-30 wt-250']//div//div[contains(text(),'Normal')]"));
						System.out.println(elecntval);
						JavascriptExecutor jsecntval = (JavascriptExecutor)driver;
						jsecntval.executeScript("arguments[0].click()", elecntval); 
						System.out.println(" Normal Contract type  is selected from drop down");
			
			
/*---------FINAL CODE---------++-----New code-01-JUNE--2023-++-----Code for CONTRACT TYPE Drop down-------------------------------*/	

/*---------FINAL CODE---------++-----New code-05-JUNE--2023-++-----Code for CONTRACT TENURE DATE PICKER--------------------------*/
						Thread.sleep(2000);
		//---Write code for Contract Tenure Date Picker
						// Assuming you have already instantiated the WebDriver and navigated to the webpage containing the date picker

						// Get the WebElement for the date input field
						WebElement dateInput = driver.findElement(By.id("endDate"));

						// Clear the existing value, if any
						dateInput.clear();

						// Send the desired date value to the date input field
					//	String desiredDate = "23 Aug 2023";
						dateInput.sendKeys(desiredDate);
						Thread.sleep(5000);  //10000-earlier
/*---------FINAL CODE---------++-----New code-05-JUNE--2023-++-----Code for CONTRACT TYPE Drop down-------------------------------*/
////---------Bidding details--------Choose Complete Solutions   / Partial Solution[default]----------------------///
						
						//--
						// Locating Contract type Drop down and click on it
						/*
						WebElement elecnty1 = driver.findElement(By.xpath("//div[text()='Complete Solution']/preceding-sibling::div"));
						System.out.println(elecnty1);
						JavascriptExecutor jsecnty1 = (JavascriptExecutor)driver;
						jsecnty1.executeScript("arguments[0].click()", elecnty1); 
						System.out.println("Choose Contract type drop down is clicked");
						Thread.sleep(3000);					
						*/
					//--	
						/*
						driver.findElement(By.xpath("//div[text()='Complete Solution']/preceding-sibling::div")).click();
						*/
						/*
						Thread.sleep(15000);
						System.out.println("complete solution selected");
						System.out.println("driver will quit");
						driver.quit();
						*/
						
////---------Bidding details--------Choose Complete Solutions   / Partial Solution[default]----------------------///
/*-------------FINAL CODE -----++-----New code-01--JUNE--2023--++---Code for CARGO INFORMATION------------------*/
		                 
		//-- Selecting the option  from the  CARGO INFORMATION and click on it
						WebElement elecrgo = driver.findElement(By.xpath("//div[@class='border-white tCenter wt-100 ml-10 mr-10 pt-10 pb-10' and  @name='1']"));
						System.out.println(elecrgo);
						JavascriptExecutor jsecrgo = (JavascriptExecutor)driver;
						jsecrgo.executeScript("arguments[0].click()", elecrgo); 
						System.out.println("Cargo Information- SOLID is selected");
		 
/*-------------FINAL CODE -----++-----New code-01--JUNE--2023--++---Code for CARGO INFORMATION------------------*/
		 
		 
/*-------------FINAL CODE -----++-----New code-01--JUNE--2023--++---Code for CARGO DESCRIPTION------------------*/
                 driver.findElement(By.xpath("//input[@name='Cargo Description']")).sendKeys("Handle with care");
 
/*-------------FINAL CODE -----++-----New code-01--JUNE--2023--++---Code for CARGO DESCRIPTION------------------*/

/*-------------FINAL CODE -----++-----New code-02--JUNE--2023--++---Code for PRODUCT CATEGORY-Drop-down------------------*/
//--PRODUCT CATEGORY
                 Thread.sleep(3000);
              // Locating product Category  Drop down and click on it
					WebElement eleprctg = driver.findElement(By.xpath("//div[@class='pr dropdown-container pr mb-30 wt-250']//div//div[contains(text(),'Choose Product Category')]"));
					System.out.println(eleprctg);
					JavascriptExecutor jseprctg = (JavascriptExecutor)driver;
					jseprctg.executeScript("arguments[0].click()", eleprctg); 
					System.out.println("Choose product Category drop down is clicked");
					Thread.sleep(3000);			
//-- Selecting the value from the  product Category Drop down and click on it
					WebElement eleprcval = driver.findElement(By.xpath("//div[@name='Food and Non Food']"));
					System.out.println(eleprcval);
					JavascriptExecutor jseprcval = (JavascriptExecutor)driver;
					jseprcval.executeScript("arguments[0].click()", eleprcval); 
					System.out.println(" Food and Non Food product Category  is selected from drop down");
                 
/*-------------FINAL CODE -----++-----New code-02--JUNE--2023--++---Code for PRODUCT CATEGORY-Drop-down------------------*/
					
/*-------------FINAL CODE -----++-----New code-02--JUNE--2023--++---Code for PACKING TYPE-Drop-down------------------*/
					// Locating Packaging Type  Drop down and click on it
					WebElement elepktyp = driver.findElement(By.xpath("//div[@class='pr dropdown-container pr mb-30 wt-250']//div//div[contains(text(),'Choose Packing Type')]"));
					System.out.println(elepktyp);
					JavascriptExecutor jsepktyp = (JavascriptExecutor)driver;
					jsepktyp.executeScript("arguments[0].click()", elepktyp); 
					System.out.println("Choose Packaging Type drop down is clicked");
					Thread.sleep(3000);			
//-- Selecting the value from the  Packaging Type Drop down and click on it
					//--Earlier working code commented now[not working]
		/*			WebElement elepktpval = driver.findElement(By.xpath("//div[@class='pr dropdown-container pr mb-30 wt-250']//div//div[contains(text(),'Bundles')]"));   */
					
					
					WebElement elepktpval = driver.findElement(By.xpath("//div[text()='Bundles']"));
					System.out.println(elepktpval);
					JavascriptExecutor jsepktpval = (JavascriptExecutor)driver;
					jsepktpval.executeScript("arguments[0].click()", elepktpval); 
					System.out.println(" Bundles Packaging Type  is selected from drop down");
					Thread.sleep(3000);	
/*-------------FINAL CODE -----++-----New code-02--JUNE--2023--++---Code for PACKING TYPE-Drop-down------------------*/
					

 
/*---------Rough CODE---PAYMENT CYCLE------++-----New code-05-JUNE--2023-++-----Code for PAYMENT CYCLE DROP DOWN--------------------------*/
					
		//--payment cycle---CODE
			// Locating Payment Cycle  Drop down and click on it
							                        Thread.sleep(2000);	
													WebElement elepaycle = driver.findElement(By.xpath("//div[@class='pr dropdown-container pr undefined']//div//div[contains(text(),'Select Cycle')]"));
													System.out.println(elepaycle);
													JavascriptExecutor jsepaycle = (JavascriptExecutor)driver;
													jsepaycle.executeScript("arguments[0].click()", elepaycle); 
													System.out.println("Choose Payment Cycle drop down is clicked");
													Thread.sleep(2000);			
			//-- Selecting the value [15 days] from the  Payment cycle Drop down and click on it
													WebElement elepaycval = driver.findElement(By.xpath("//div[@class='pr dropdown-container pr undefined']//div//div[contains(text(),'15 days')]"));
													System.out.println(elepaycval);
													JavascriptExecutor jsepaycval = (JavascriptExecutor)driver;
													jsepaycval.executeScript("arguments[0].click()", elepaycval); 
													System.out.println(" 15 days payment cycle  is selected from drop down");
													Thread.sleep(2000);	
								
/*---------FINAL CODE---PAYMENT CYCLE------++-----New code-05-JUNE--2023-++-----Code for PAYMENT CYCLE DROP DOWN--------------------------*/

//---Inserting the move the cursor to the Date picker location
//------------------MouseHover to specific Element-----------------------------------------------------------//
													/*
													// Find the element to hover over
													WebElement elementToHover = driver.findElement(By.xpath("//input[@name='date' and @placeholder='Please Add Bidding To']"));

													// Create an instance of the Actions class
													Actions actions = new Actions(driver);

													// Perform the mouse hover action on the element
													actions.moveToElement(elementToHover).perform();
																		
													*/
//-------------------MouseHover to specific Element-------------------------------------------------------//												
													
													
													
/*---------Rough CODE---BIDDING DATE------++-----New code-05-JUNE--2023-++-----Code for BIDDING_TO DATE PICKER--------------------------*/
				//Bidding To- only Date is selected but time also need to be selected	[Pending]		
							//---Write code for Contract Tenure Date Picker
									// Assuming you have already instantiated the WebDriver and navigated to the webpage containing the date picker

											// Get the WebElement for the date input field
										/* --WebElement dateInputbid = driver.findElement(By.xpath("//div[@class='DateInput DateInput_1']//input[@id='date' and @placeholder='Please Add Bidding To']")); ----*/
									/*
											WebElement dateInputbid = driver.findElement(By.xpath("//input[@name='date' and @placeholder='Please Add Bidding To']"));
											//dateInputbid.click();
											
											dateInputbid.sendKeys("19 Jun 2023");
											
											JavascriptExecutor jsedtval = (JavascriptExecutor)driver;
											jsedtval.executeScript("arguments[0].click()", dateInputbid);
											System.out.println("Bidding To Date is clicked");
											
										*/	
	/*---------------------------------------using old elementclickable method------------------------------------*/
								/*
								Wait<WebDriver> wait8 = new FluentWait<>(driver).withTimeout(Duration.ofSeconds(10)).pollingEvery(Duration.ofSeconds(2)).ignoring(NoSuchElementException.class); 
								WebElement elementdt = wait8.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@name='date' and @placeholder='Please Add Bidding To']")));
								JavascriptExecutor jsdt = (JavascriptExecutor) driver;
								jsdt.executeScript("arguments[0].scrollIntoView();", elementdt);
								elementdt.click();	
								*/
													
//	call the date through method which is  declared outside main method
/*								
								WebElement date = driver.findElement(By.xpath("//input[@name='date' and @placeholder='Please Add Bidding To']"));
								String dateVal = "19-Jun-2023";

								selectDateByJS(driver, date, dateVal);
     //	call the date through method which is  declared outside main method	
								
	//Call the Time method which is declared outside the main method.
	                            WebElement time = driver.findElement(By.xpath("//div[@class='flex pb-20']//span[@class='rc-time-picker ht-40 wt-150 border-status-bar br-5']//input[@type='text']"));
								String timeVal = "          04:30 PM";

								selectTimeByJS(driver, time, timeVal);
	//Call the Time method which is declared outside the main method.	
*/								
	//----------Bidding To date selection -----19-JUN--2023-------------------NEW METHOD----------------------------//
								/*---not working -click not receivables error--
								Wait<WebDriver> wait8 = new FluentWait<>(driver).withTimeout(Duration.ofSeconds(10)).pollingEvery(Duration.ofSeconds(2)).ignoring(NoSuchElementException.class); 
								WebElement elementdt = wait8.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@name='date' and @placeholder='Please Add Bidding To']")));
								JavascriptExecutor jsdt = (JavascriptExecutor) driver;
								jsdt.executeScript("arguments[0].scrollIntoView();", elementdt);
								elementdt.click();
								*/
/////////LATEST CODE--BUT NOT WORKING AS EXPECTED////////////////////////////////////////////////////////////////////////////
/*
								//---scroll page to Date picker-Bidding To Date
								Thread.sleep(4000);
							  	 // scroll down by a specific amount of pixels
							  	 JavascriptExecutor jspix1 = (JavascriptExecutor)driver;
							  	 jspix1.executeScript("window.scrollBy(0,2200);");
							  	System.out.println("Page scrolled to 2200 pixel to view - Page scrolls to Bidding To Date");
				 	
							 /* System.out.println("Page is scrolled to pixel");   */					
													
													
						//---scroll page to Date picker Bidding To Date
								
								Thread.sleep(2000);	
								WebElement elepaycle1 = driver.findElement(By.xpath("//input[@name='date' and @placeholder='Please Add Bidding To']"));
								System.out.println(elepaycle1);
								JavascriptExecutor jsepaycle1 = (JavascriptExecutor)driver;
								jsepaycle1.executeScript("arguments[0].click()", elepaycle1); 
								System.out.println("Bidding To Date  is clicked");
								Thread.sleep(2000);	
													
								//WebElement date1 = driver.findElement(By.xpath("//input[@name='date' and @placeholder='Please Add Bidding To']"));
								//date1.click();
								Thread.sleep(4000);
					//--mousehover to particular date
								/*
								WebElement elehover = driver.findElement(By.xpath("//*[@id='root']/div/div[2]/div[1]/div[2]/div[3]/div/div/div[4]/div/div[2]/div[1]/div[2]/div[4]/div/div/div[2]/div/div/div/div[2]/div[2]/div/div[2]/div/table/tbody/tr[4]/td[4]"));
							       Actions action = new Actions(driver);
							       action.moveToElement(elehover).build().perform();
							       Thread.sleep(2000);
					//--perform click operation on particular date
							       elehover.click();
							     */  
//----------new suggestion --21--June--2023----------------------------------------------------------------//
			/*				   
								
								// Find the web elements using the given XPath
							       List<WebElement> elements = driver.findElements(By.xpath("//table[@class='CalendarMonth_table CalendarMonth_table_1']/tbody/tr[4]/td[2]"));

							       // Check if any elements are found
							       if (!elements.isEmpty()) {
							           // Extract the first value from the list
							           WebElement firstElement = elements.get(0);

							           // Get the text value of the element
							           String firstValue = firstElement.getText();

							           // Print the first value
							           System.out.println("First Value: " + firstValue);
							       } else {
							           System.out.println("No elements found.");
							       }	
              */
//----------new suggestion --21--june--2023----------------------------------------------------------------//


/////////LATEST CODE--BUT NOT WORKING AS EXPECTED////////////////////////////////////////////////////////////////////////////
	//----------Bidding To date selection -----19-JUN--2023-------------------NEW METHOD----------------------------//
						 
/*----------------------------------------using old elementclickable method-------------------------------------*/
											//Thread.sleep(3000);
											
											//placeholder='Please Add Bidding To'
		           //-------------Selecting particular Date 19-Jun-2023 from Date Picker-------------------//
											/*
											WebElement dateInputbid1 = driver.findElement(By.xpath("//*[@id='root']/div/div[2]/div[1]/div[2]/div[3]/div/div/div[4]/div/div[2]/div[1]/div[2]/div[4]/div/div/div[2]/div/div/div/div[2]/div[2]/div/div[2]/div/table/tbody/tr[4]/td[3]"));
											//dateInputbid.click();
											
											JavascriptExecutor jsedtval1 = (JavascriptExecutor)driver;
											jsedtval1.executeScript("arguments[0].click()", dateInputbid1);
											System.out.println("Bidding To Date and Time is clicked");
											Thread.sleep(3000);
											*/

				 				  
/*---------Rough CODE---BIDDING DATE------++-----New code-13-JUNE--2023-++-----Code for BIDDING_TO DATE PICKER-------------------------------*/
													
																																																
/*---------FINAL CODE---PRICING BASIS------++-----New code-05-JUNE--2023-++-----Code for PRICING BASIS- DROP DOWN--------------------------*/
									
//--PRICING BASIS----CODE
			// Locating Pricing Basis Drop down and click on it
			                        Thread.sleep(2000);	  //3000--9000
									WebElement elepribas = driver.findElement(By.xpath("//div[@class='pr dropdown-container pr undefined']//div//div[contains(text(),'Select Unit')]"));
									System.out.println(elepribas);
									JavascriptExecutor jsepribas = (JavascriptExecutor)driver;
									jsepribas.executeScript("arguments[0].click()", elepribas); 
									System.out.println("Choose Pricing Basis drop down is clicked");
									Thread.sleep(2000);	//3000--4000		
			//-- Selecting the value [15 days] from the  Pricing Basis Drop down and click on it
									WebElement eleprival = driver.findElement(By.xpath("//div[@class='pr dropdown-container pr undefined']//div//div[contains(text(),'Rate per MT')]"));
									System.out.println(eleprival);
									JavascriptExecutor jseprival = (JavascriptExecutor)driver;
									jseprival.executeScript("arguments[0].click()", eleprival); 
									System.out.println(" Rate per MT Pricing Basis  is selected from drop down");

													
/*---------final CODE---PRICING BASIS-------++-----New code-05-JUNE--2023-++-----Code for PRICING BASIS- DROP DOWN--------------------------*/
		         
//------------BEGIN---CODE--TO--SCROLL DOWN TO SPECIFIC PIXEL----File Upload Button-------------------------------------//
			 
//---Change the scroll location to (0,1500) -->scroll to Upload File Button
				
					Thread.sleep(4000);
				  	 // scroll down by a specific amount of pixels
				  	 JavascriptExecutor jspix2 = (JavascriptExecutor)driver;
				  	 jspix2.executeScript("window.scrollBy(0,2500);");
				  	System.out.println("Page scrolled to 2500 pixel to view - Page scrolls to Upload New Document Button");
				  	Thread.sleep(4000);
				
//------------BEGIN---CODE--TO--SCROLL DOWN TO SPECIFIC PIXEL----File Upload Button-------------------------------------//
				  	
//--BEGIN--new java script code from suggestion---31--05--2023--
					 // Locating the File Upload button and click on it
						//WebElement elefu = driver.findElement(By.xpath("//button[@class='flex flex-middle flex-center border-theme wt-250 ht-40 bg-white theme-color fBold fs-16 br-20']"));
						
			//x-path by id			//*[@id="81024679-e044-493b-b4bb-7f19d8561cc7"]
				  	/*
						WebElement elefu = driver.findElement(By.xpath("//div[@class='box-shadow ph-20 pv-20 br-5 ']//div//button"));
						JavascriptExecutor jsefu = (JavascriptExecutor)driver;
						jsefu.executeScript("arguments[0].click()", elefu);	 
						System.out.println("File upload button clicked");
				  	*/
				  	
				  	 // Find the file upload input element by its x-path
				  WebElement fileUploadInput =  driver.findElement(By.xpath("//div[@class='box-shadow ph-20 pv-20 br-5 ']//div//input[@type='file']"));
			        
			        // Enter the path of the file you want to upload
			        String filePath = "C:\\Users\\Dell\\Desktop\\samplefile\\file-sample_150kB.pdf";
			        fileUploadInput.sendKeys(filePath);
			        Thread.sleep(4000);
			        System.out.println("File upload button clicked");
//--END--new java script code from suggestion---31--05--2023----------------------//
			        
			        
			        
/*-------------FINAL CODE -----++-----New code-01--JUNE--2023--++---Code for RADIO BUTTON----------------------*/
	                 
			        //---Radio button dynamic selection
			                      //--FINAL_CODE- Selecting the Transporter from the Radio Button option and click on it
			                        Thread.sleep(2000);  //5000
			            			WebElement elerdo = driver.findElement(By.xpath("//*[@id='group-transporter6867f0615eb748e08edd2401fb2f207223294786a7984f44a6c5be49741f87ff']"));
			            			System.out.println(elerdo);
			            			JavascriptExecutor jserdo = (JavascriptExecutor)driver;
			            			jserdo.executeScript("arguments[0].click()", elerdo); 
			            			System.out.println("CTA Logistics is selected from options");
			        
			        
/*-------------FINAL CODE -----++-----New code-01--JUNE--2023--++---Code for RADIO BUTTON----------------------*/
			
/* -----------------------------------------NEXT BUTTON CODE--SUBMISSION OF RFQ FIRST PAGE----------------------- */		  	
		  	
/*----BEGIN-----+WORKING CODE+++++++++++++++NEXT BUTTON--++++++++++++++++++++============+++++++++=----------------------*/
					
//---------------NEXT BUTTON WORKING CODE-------12--JUNE--2023------------------------------//
	//---WORKING CODE COMMENTED--FOR EXECUTION PURPOSE
					
			Thread.sleep(3000);
//--code below is commented [which was working earlier--is not working now]					
/*			WebElement element4 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='root']/div/div[2]/div[2]/div/div[2]/button")));           */
			
			WebElement element4 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Next']")));
			
			//button[text()='Next']
			JavascriptExecutor js4 = (JavascriptExecutor) driver;
			js4.executeScript("arguments[0].scrollIntoView();", element4);

			element4.click();
					
			//Button based on the X-Path
			//driver.findElement(By.xpath("//*[@id='root']/div/div[2]/div[2]/div/div[2]/button")).click();
				
			System.out.println("Please Fill Mandatory Fields");
	       
/*----END-----+WORKING CODE+++++++++++++++NEXT BUTTON--++++++++++++++++++++============+++++++++=-----------------------*/	  
		
             
/*--------PAGE 1 SUBMIT THROUGH NEXT BUTTON--GO--TO--NEXT PAGE--ADD NEW TRIP----------------------------------*/
 
//----------++++++++++++++++++++++++++++++PAGE--2--++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++//
//----------++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++//
 
 /*----FINAL--CODE--------------ADD NEW TRIP--BUTTON---------------------------------------------------------------*/
			
//--x-path--	//*[@id="root"]/div/div[2]/div[1]/div[2]/div[3]/div/div/div[1]/div[6]/div[1]/button
			
			Thread.sleep(4000); //5000
			//Earlier working code [not working currently]
/* 			WebElement elenwtrp = driver.findElement(By.xpath("//*[@id='root']/div/div[2]/div[1]/div[2]/div[3]/div/div/div[1]/div[6]/div[1]/button"));              */
 			
 			WebElement elenwtrp = driver.findElement(By.xpath("//button[text()='+ Add New Trip']"));
 			//button[text()='+ Add New Trip']
 			System.out.println(elenwtrp);
 			JavascriptExecutor jsenwtrp = (JavascriptExecutor)driver;
 			jsenwtrp.executeScript("arguments[0].click()", elenwtrp); 
 			System.out.println("Add New Trip button is clicked");
 		
 /*----FINAL--CODE--------------ADD NEW TRIP--BUTTON---------------------------------------------------------------*/
 
 /*----FINAL--CODE--------------ADD NEW TRIP--SELECT-VEHICLE--DROP-DOWN---------------------------------------------------------------*/
 /*---------FINAL CODE---ADD NEW TRIP------++-----New code-13-JUNE--2023-++-----ADD NEW TRIP--Select Vehicle type drop down-------------*/
			
 			//--Select Vehicle type---CODE
 				// Select Vehicle type Drop down  and click on it
 								                        Thread.sleep(2000);	
 														WebElement elevehtyp = driver.findElement(By.xpath("//div[@class='pr dropdown-container pr undefined']//div//div[contains(text(),'Select Vehicle Type')]"));
 														System.out.println(elevehtyp);
 														JavascriptExecutor jsevehtyp = (JavascriptExecutor)driver;
 														jsevehtyp.executeScript("arguments[0].click()", elevehtyp); 
 														System.out.println("Select Vehicle type Drop down is clicked");
 														Thread.sleep(2000);			
 				//-- Selecting 1.0 MT vehcile from Drop down and click on it
 														WebElement elevehsel = driver.findElement(By.xpath("//div[@class='pr dropdown-container pr undefined']//div//div[contains(text(),'1.0 MT')]"));
 														System.out.println(elevehsel);
 														JavascriptExecutor jsevehsel = (JavascriptExecutor)driver;
 														jsevehsel.executeScript("arguments[0].click()", elevehsel); 
 														System.out.println("1.0 MT vehicle type is selected from drop down");
 														Thread.sleep(2000);	
 									
 /*---------FINAL CODE---ADD NEW TRIP------++-----New code-13-JUNE--2023-++-----ADD NEW TRIP--Select Vehicle type drop down-------------*/		
 			
 /*---------FINAL CODE---ADD NEW TRIP------++-----New code-13-JUNE--2023-++-----ADD NEW TRIP--SELECT-VEHICLE-BODY-TYPE drop down-------------*/
 	
 	//--ADD NEW TRIP--SELECT-VEHICLE-BODY-TYPE	
 														
//--Select Vehicle Body type---CODE
           // Select Vehicle Body type Drop down  and click on it
			                        Thread.sleep(2000);	
									WebElement elevehbod = driver.findElement(By.xpath("//div[@class='pr dropdown-container pr undefined']//div//div[contains(text(),'Select Vehicle Body Type')]"));
									System.out.println(elevehbod);
									JavascriptExecutor jsevehbod = (JavascriptExecutor)driver;
									jsevehbod.executeScript("arguments[0].click()", elevehbod); 
									System.out.println("Select Vehicle Body Type Drop down is clicked");
									Thread.sleep(2000);			
          //-- Selecting Dala Body  from Drop down and click on it
									WebElement elevehbty = driver.findElement(By.xpath("//div[@class='pr dropdown-container pr undefined']//div//div[contains(text(),'Dala Body')]"));
									System.out.println(elevehbty);
									JavascriptExecutor jsevehbty = (JavascriptExecutor)driver;
									jsevehbty.executeScript("arguments[0].click()", elevehbty); 
									System.out.println("Dala Body is selected from drop down");
									Thread.sleep(2000);	
 														
 														
 /*---------FINAL CODE---ADD NEW TRIP------++-----New code-13-JUNE--2023-++-----ADD NEW TRIP--SELECT-VEHICLE-BODY-TYPE drop down-------------*/
 
/*----FINAL--CODE-------13--JUNE--2023-------ADD NEW TRIP--NEXT-BUTTON---------------------------------------------------------------*/
							
							//--x-path--	//*[@id='root']/div/div[2]/div[1]/div[2]/div[4]/div/div/div[1]/div[2]/button
										
										Thread.sleep(3000);
										//Earlier working code[not working now]
		               /*			 	WebElement elenwtrpbtn = driver.findElement(By.xpath("//*[@id='root']/div/div[2]/div[1]/div[2]/div[4]/div/div/div[1]/div[2]/button"));                    */
							 			
							 			WebElement elenwtrpbtn = driver.findElement(By.xpath("//button[text()='Next']"));
							 			
							 			
							 			//button[text()='Next']
							 			System.out.println(elenwtrpbtn);
							 			JavascriptExecutor jsenwtrpbtn = (JavascriptExecutor)driver;
							 			jsenwtrpbtn.executeScript("arguments[0].click()", elenwtrpbtn); 
							 			System.out.println("Add New Trip button is clicked");
							 		
 /*----FINAL--CODE------13--JUNE--2023------ADD NEW TRIP--NEXT-BUTTON---------------------------------------------------------------*/																																													
														
//------------------------------------ADD NEW TRIP --Source To Destination----------------------------------------------//													
							 			 
							 			 
/*-------------FINAL CODE -----++-----New code-15--JUNE--2023--++---Code for FROM LOCATION-----------------------------------------------*/
		 			                 driver.findElement(By.xpath("//input[@name='searchFromText-0']")).sendKeys("Mundra");
		 			                 Thread.sleep(4000);
		 			              
		 			               // WebElement sourceloc = driver.findElement(By.xpath("//input[@name='searchFromText-0' and @value='Mundra, Kutch, Gujarat']"));
		 			                /*
		 			               WebElement sourceloc = driver.findElement(By.xpath("//div[@class='col-2 mr-20 pr']//div//input"));
		 			                sourceloc.click();
		 			                */
		 			                 
		 			              //ADANI -Source Location x-path -- Mundra

		 			              //--x-path for drop down value---SOURCE LOCATION--
		 			                                 WebElement elesrcloc = driver.findElement(By.xpath("//div[@class='mr-20 pa col-1 ht-300 border-light overflowAuto bg-white z-1']//div[contains(text(),'Mundra, Kutch ,Gujarat')]"));
		 			              					System.out.println(elesrcloc);
		 			              					JavascriptExecutor jsesrcloc  = (JavascriptExecutor)driver;
		 			              					jsesrcloc .executeScript("arguments[0].click()", elesrcloc);  
		 			              					System.out.println("Mundra Source is clicked ");
		 			              		 		           Thread.sleep(4000);
		 			 
/*-------------FINAL CODE -----++-----New code-15--JUNE--2023--++---Code for FROM LOCATION-------------------------------------------------*/
		 			//----

/*-------------FINAL CODE -----++-----New code-13--JUNE--2023--++---Code for DESTINATION  LOCATION---------------------------------------------*/
		 			                 driver.findElement(By.xpath("//input[@name='searchToText-1']")).sendKeys("Bharatganj");
		 			                 Thread.sleep(18000);
		 			              
		 			               // WebElement destinloc = driver.findElement(By.xpath("//input[@name='searchToText-1' and @value='Bharatganj, Allahabad, Gujarat']"));
		 			                 /*
		 			                WebElement destinloc = driver.findElement(By.xpath("//div[@class='mr-20 pa col-1 ht-300 border-light overflowAuto bg-white z-1']//div"));
		 			                destinloc.click();
		 			                */
		 			                 
		 			              //ADANI -Destination Location x-path -- Bharatganj 

		 			              //--x-path for drop down value---DESTINATION LOCATION--
		 			                                 WebElement eledesloc = driver.findElement(By.xpath("//div[@class='mr-20 pa col-1 ht-300 border-light overflowAuto bg-white z-1']//div[contains(text(),'Bharatganj, Allahabad ,Uttar Pradesh')]"));
		 			              					System.out.println(eledesloc);
		 			              					JavascriptExecutor jsedesloc  = (JavascriptExecutor)driver;
		 			              					jsedesloc.executeScript("arguments[0].click()", eledesloc);  
		 			              					System.out.println("Bharatganj Destination is clicked ");
		 			              					Thread.sleep(3000);
/*-------------FINAL CODE -----++-----New code-13--JUNE--2023--++---Code for DESTINATION  LOCATION----------------------------------------------*/
		 			                 
/*----Rough--CODE-------13--JUNE--2023-------ADD NEW TRIP---Source-TO-Destination-NEXT-BUTTON------------------------------------------------------*/
 			    			
 //--x-path--	
 			              			
 			              			Thread.sleep(2000);
 			              			//Earlier working code -not working now
 			       /*        			WebElement elenwtrpbtn2 = driver.findElement(By.xpath("//*[@id='root']/div/div[2]/div[1]/div[2]/div[4]/div/div/div[1]/div[2]/button[2]"));                */
 			               			
 			               		WebElement elenwtrpbtn2 = driver.findElement(By.xpath("//button[text()='Next']"));
 			               		//button[text()='Next']
 			               			System.out.println(elenwtrpbtn2);
 			               			JavascriptExecutor jsenwtrpbtn2 = (JavascriptExecutor)driver;
 			               			jsenwtrpbtn2.executeScript("arguments[0].click()", elenwtrpbtn2); 
 			               			System.out.println("Source-TO-Destination-NEXT-BUTTON is clicked");
 			               		
/*----Rough--CODE------13--JUNE--2023------ADD NEW TRIP---Source-TO-Destination-NEXT-BUTTON-------------------------------------------------------*/
														

 /*-------------FINAL CODE -----++-----New code-13--JUNE--2023--++---ADD NEW TRIP--CEILING-PRICE------------------*/
 			               			Thread.sleep(4000);
 			               			
                   driver.findElement(By.xpath("//input[@name='qbr']")).sendKeys("3900");
   
  /*-------------FINAL CODE -----++-----New code-13--JUNE--2023--++---ADD NEW TRIP--CEILING-PRICE------------------*/

  //businessVolumeValue

 /*-------------FINAL CODE -----++-----New code-13--JUNE--2023--++---ADD NEW TRIP--BUSINESS VOLUME------------------*/
                   driver.findElement(By.xpath("//input[@name='businessVolumeValue']")).sendKeys("10");
   
 /*-------------FINAL CODE -----++-----New code-13--JUNE--2023--++---ADD NEW TRIP--BUSINESS VOLUME------------------*/			
	
/*---------Rough CODE---ADD NEW TRIP------++-----New code-13-JUNE--2023-++-----ADD NEW TRIP--Business volume --Drop Down----------------------------------------------------------------------------------*/					
	
	// Select Business Volume Drop down  and click on it
					                        Thread.sleep(2000);	
											WebElement elebusval = driver.findElement(By.xpath("//div[@class='pr dropdown-container pr flex-1 ht-40']//div//div[contains(text(),'Select UOM')]"));
											System.out.println(elebusval);
											JavascriptExecutor jsebusval = (JavascriptExecutor)driver;
											jsebusval.executeScript("arguments[0].click()", elebusval); 
											System.out.println("Business Volume Drop down  value is clicked");
											Thread.sleep(2000);			
	//-- Rate per MT - Business Volume Unit  from Drop down and click on it
											WebElement elebusvalmt = driver.findElement(By.xpath("//div[@class='pr dropdown-container pr flex-1 ht-40']//div//div[contains(text(),'Metric Tonnes (MT)')]"));
											System.out.println(elebusvalmt);
											JavascriptExecutor jsebusvalmt = (JavascriptExecutor)driver;
											jsebusvalmt.executeScript("arguments[0].click()", elebusvalmt); 
											System.out.println("Rate per MT  Business Volume Drop down  value is clicked");
   													Thread.sleep(2000);	
   								
/*----Rough CODE---ADD NEW TRIP------++-----New code-13-JUNE--2023-++-----ADD NEW TRIP--Business volume --Drop Down------------------------------------------------------------------------------------------*/
  
//*----Rough--CODE-------13--JUNE--2023-------ADD NEW TRIP---SAVE AND CLOSE BUTTON------------------------------------------------------------------------------------------*/			
						//--x-path--				
									Thread.sleep(2000);
									//Earlier working code --not working now
						/* 			WebElement elenwtrpbtn3 = driver.findElement(By.xpath("//*[@id='root']/div/div[2]/div[1]/div[2]/div[4]/div/div/div[1]/div[2]/button[2]"));                   */
						 			
						 			
						 			WebElement elenwtrpbtn3 = driver.findElement(By.xpath("//button[text()='Save And Close']"));
						 			//button[text()='Save And Close']
						 			System.out.println(elenwtrpbtn3);
						 			JavascriptExecutor jsenwtrpbtn3 = (JavascriptExecutor)driver;
						 			jsenwtrpbtn3.executeScript("arguments[0].click()", elenwtrpbtn3); 
						 			System.out.println("-SAVE AND CLOSE BUTTON is clicked");
						 		
//*----Rough--CODE------13--JUNE--2023------ADD NEW TRIP---SAVE AND CLOSE BUTTON---------------------------------------------------------------------------------------------*/
						

//---ADD NEW TRIP----SAVE AND CLOSE BUTTON---------
/*----REPEATED CODE++COMMENTED--CODE-------13--JUNE--2023-------ADD NEW TRIP---SAVE AND CLOSE BUTTON------------------------------------------------------*/						
					/*
					Thread.sleep(2000);
		 			WebElement elenwtrpbtn3i = driver.findElement(By.xpath("//*[@id='root']/div/div[2]/div[1]/div[2]/div[4]/div/div/div[1]/div[2]/button[2]"));
		 			System.out.println(elenwtrpbtn3i);
		 			JavascriptExecutor jsenwtrpbtn3i = (JavascriptExecutor)driver;
		 			jsenwtrpbtn3i.executeScript("arguments[0].click()", elenwtrpbtn3i); 
		 			System.out.println("-SAVE AND CLOSE BUTTON is clicked");
		 		     */
/*----REPEATED CODE++COMMENTED------13--JUNE--2023------ADD NEW TRIP---SAVE AND CLOSE BUTTON-------------------------------------------------------*/

/*----Rough--CODE-------13--JUNE--2023-------ADD NEW TRIP---PROCEED TO PREVIEW BUTTON------------------------------------------------------*/							
					Thread.sleep(4000);
		 			WebElement elenwtrpbtn4 = driver.findElement(By.xpath("//div[@class='flex flex-middle']//button[contains(text(),'Proceed to Preview')]"));
		 	//--below is the new x-path can be used---21--08--2023		
		 			//button[text()='Proceed to Preview']
		 			System.out.println(elenwtrpbtn4);
		 			JavascriptExecutor jsenwtrpbtn4 = (JavascriptExecutor)driver;
		 			jsenwtrpbtn4.executeScript("arguments[0].click()", elenwtrpbtn4); 
		 			System.out.println("-PROCEED TO REVIEW BUTTON is clicked");
		 		
/*----Rough--CODE------13--JUNE--2023------ADD NEW TRIP---PROCEED TO PREVIEW BUTTON-------------------------------------------------------*/						 			
	Thread.sleep(5000);
	
	//-----Click Proceed to Previw Button
/*----Rough--CODE-------13--JUNE--2023-------ADD NEW TRIP---SUBMIT--RFQ BUTTON------------------------------------------------------*/							
					Thread.sleep(2000);
					//Earlier working code--not working now
		 /*			WebElement elenwtrpbtn5 = driver.findElement(By.xpath("//*[@id='root']/div/div[2]/div[2]/div/div[2]/button[2]"));          */
		 			
		 			
		 			WebElement elenwtrpbtn5 = driver.findElement(By.xpath("//button[text()='Submit RFQ']"));
		 			//button[text()='Submit RFQ']
		 			System.out.println(elenwtrpbtn5);
		 			JavascriptExecutor jsenwtrpbtn5 = (JavascriptExecutor)driver;
		 			jsenwtrpbtn5.executeScript("arguments[0].click()", elenwtrpbtn5); 
		 			System.out.println("-SUBMIT--RFQ BUTTON is clicked");
		 		
/*----Rough--CODE------13--JUNE--2023------ADD NEW TRIP---SUBMIT--RFQ BUTTON-------------------------------------------------------*/

/*----Rough--CODE-------13--JUNE--2023-------ADD NEW TRIP---CONFIRM RFQ BUTTON--FINAL-BUTTON----------------------------------------------------*/							
					Thread.sleep(3000);
		 			WebElement eleconfbut = driver.findElement(By.xpath("//div[@class='bg-white box-shadow ph-20 pv-20 br-5']//div//button[contains(text(),'Confirm')]"));
		 			
		 		//below new x-path can be used 21--08--2023	
		 			//button[text()='Confirm']
		 			System.out.println(eleconfbut);
		 			JavascriptExecutor jseconfbut = (JavascriptExecutor)driver;
		 			jseconfbut.executeScript("arguments[0].click()", eleconfbut); 
		 			System.out.println("-CONFIRM RFQ BUTTON is clicked");
		 		
/*----Rough--CODE------13--JUNE--2023------ADD NEW TRIP---CONFIRM RFQ BUTTON--FINAL-BUTTON-----------------------------------------------------*/		 			
		 			
		 			
		 			
		 			
////////////////////////////////////////RFQ CREATION FROM SEEKER IS COMPLETE////////////////////////////////////////////	 			
//---------------------------------------CONTRACT IS CREATED----------------------------------------------------------//
		 								

Thread.sleep(6000);	    
driver.quit();
						          
						
	}

//declaring a method to access Date field
	
	public static void selectDateByJS(WebDriver driver, WebElement element, String dateVal) {
	    JavascriptExecutor jsd = ((JavascriptExecutor) driver);
	    jsd.executeScript("arguments[0].setAttribute('value', '" + dateVal + "');", element);
	}
	
//declaring method to access Date field
	
	//----Method for picking time-picker

		public static void selectTimeByJS(WebDriver driver, WebElement element1, String timeVal) {
		    JavascriptExecutor jsd1 = ((JavascriptExecutor) driver);
		    jsd1.executeScript("arguments[0].setAttribute('value', '" + timeVal + "');", element1);
		}
	//------Method for picking time-picker
	
	}
