package scripts;



import java.io.FileInputStream;



import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.testng.annotations.Test;


import com.aventstack.extentreports.ExtentTest;

import com.aventstack.extentreports.Status;


import generic.Basetest;
import generic.Mail;
import generic.ScreenRecorderUtil;
import generic.screenshot;
import pages.aptahrlogin_pageNew;

public class Login_page extends Basetest {
	
		
	
	@Test
	
	public void aptahrloginScript() throws Exception
	{
		
		ScreenRecorderUtil.startRecord("LoginScript");
		

		  FileInputStream f= new FileInputStream("C:\\Users\\system3\\eclipse-workspace\\AptaHR_Jenkins\\Login credentials.xlsx");   
	      Workbook book=WorkbookFactory.create(f);
			
			ExtentTest test =  extent.createTest("Login", "Verify Login");
			  aptahrlogin_pageNew ob=new aptahrlogin_pageNew(driver);
			  test.log(Status.INFO, "Starting Test case");
			 
			 try {
			 ob.setUserName(book.getSheet("sheet1").getRow(1).getCell(1).getStringCellValue());
			 test.pass("Entered username");
			 } catch (Exception e) {
			 test.fail("Check username xpath");
			 test.log(Status.FAIL,test.addScreenCaptureFromBase64String(screenshot.capture(driver))+ "Test Failed"); 
			 //test.log(Status.FAIL,test.addScreenCaptureFromPath(screenshot.capture(driver))+ "Test Failed");
	        
	         ScreenRecorderUtil.stopRecord();
			 }
				 Thread.sleep(1000); 
	    	try {
	 		ob.setPassword(book.getSheet("sheet1").getRow(1).getCell(2).getStringCellValue()); 
		     test.pass("Entered password");
		    } catch (Exception e) {
			test.fail("Check password xpath");
			
			 test.log(Status.FAIL,test.addScreenCaptureFromBase64String(screenshot.capture(driver))+ "Test Failed");
			//test.log(Status.FAIL,test.addScreenCaptureFromPath(screenshot.capture(driver))+ "Test Failed");
			ScreenRecorderUtil.stopRecord();
	    	}
			
	    	 Thread.sleep(1000); 
         	try {
		   	ob.clickLogin();
		    test.pass("Clicked on Login Button");
			} catch (Exception e) {
			test.fail("Check login xpath");
			 test.log(Status.FAIL,test.addScreenCaptureFromBase64String(screenshot.capture(driver))+ "Test Failed");
			//test.log(Status.FAIL,test.addScreenCaptureFromPath(screenshot.capture(driver))+ "Test Failed");
			
			ScreenRecorderUtil.stopRecord();
		     } 
         	
         	 try {
 				driver.findElement(By.xpath("//p[text()='Yes']")).click();
 			} catch (Exception e) {
 				System.out.println("Already Logged in");
 			}
		      test.info("Test Completed successfully");
		      
		  	Thread.sleep(1000);
			if (driver.getCurrentUrl().equals("https://dev.apta-hr.com/dashboard/overview")) {
			test.pass("URL is correct");
			}
			else
			{
				 test.fail("Wrong Credentials");
				 
				
				 test.log(Status.FAIL,test.addScreenCaptureFromBase64String(screenshot.capture(driver))+ "Test Failed");
				 //test.log(Status.FAIL,test.addScreenCaptureFromPath(screenshot.capture(driver))+ "Test Failed");
			}
		
			System.out.println(test);
		      
		      ScreenRecorderUtil.stopRecord();
	         //Mail.sendmail();
	}
		    
	
	}
	
		
    
      
    
   
		
	