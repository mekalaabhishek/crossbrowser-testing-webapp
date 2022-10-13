package scripts;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import generic.Basetest;
import generic.ScreenRecorderUtil;
import generic.screenshot;
import pages.applyingjob_pageNew;
import pages.aptahrlogin_pageNew;


public class Applyjob extends Basetest{
	
@Test
	
	public void postjobmanullyscript() throws Exception
	{
		
		ScreenRecorderUtil.startRecord("Apply Job");
		

		  FileInputStream f= new FileInputStream("C:\\Users\\system3\\eclipse-workspace\\AptaHR_Jenkins\\Login credentials.xlsx");   
	      Workbook book=WorkbookFactory.create(f);
			
			  ExtentTest test =  extent.createTest("Apply Job", "Verify Apply Job");
			  
			  aptahrlogin_pageNew ob=new aptahrlogin_pageNew(driver);
			  test.log(Status.INFO, "Starting Test case");
			
			  ob.setUserName(book.getSheet("sheet1").getRow(1).getCell(1).getStringCellValue()); 
	 		  ob.setPassword(book.getSheet("sheet1").getRow(1).getCell(2).getStringCellValue()); 
		      ob.clickLogin();
		      try {
	 				driver.findElement(By.xpath("//p[text()='Yes']")).click();
	 			} catch (Exception e) {
	 				System.out.println("Already Logged in");
	 			}
		   	
		      test.info("Completed Login Procedure");
		      
		      applyingjob_pageNew aj =new applyingjob_pageNew(driver);
		      
		      test.info("Starting Post Job manually script");
		      
		      try {
					 aj.clickjobsandapplications();
					 test.pass("Clicked On jobs and applications");
					 } catch (Exception e) {
					 test.fail("Check Jobs and application xpath");
					 test.log(Status.FAIL,test.addScreenCaptureFromBase64String(screenshot.capture(driver))+ "Test Failed"); 
			         ScreenRecorderUtil.stopRecord();
					 }
		         
		         Thread.sleep(1000);
		         
		         try {
					 aj.clickoptionsdropdown();
					 test.pass("Clicked On options dropdown");
					 } catch (Exception e) {
					 test.fail("Check Options dropdown xpath");
					 test.log(Status.FAIL,test.addScreenCaptureFromBase64String(screenshot.capture(driver))+ "Test Failed"); 
			         ScreenRecorderUtil.stopRecord();
					 }
		         
		         Thread.sleep(1000);
		         
		     /*    try {
					 aj.clickcopyurl();                           //must write the copied URl to excel
					 test.pass("Job URL copied");      
					 } catch (Exception e) {
					 test.fail("Check Options dropdown xpath");
					 test.log(Status.FAIL,test.addScreenCaptureFromBase64String(screenshot.capture(driver))+ "Test Failed"); 
			         ScreenRecorderUtil.stopRecord();
					 }  */
		         
		       
		         
		         
		         driver.findElement(By.xpath("//p[text()='Copy URL']")).click();
		         String myText = (String) Toolkit.getDefaultToolkit().getSystemClipboard().getData(DataFlavor.stringFlavor); // extracting the text that was copied to the clipboard
		        
		         Thread.sleep(1000);
		        
		         driver.get(myText);
		         
		         Thread.sleep(1000);
		         
		         try {
					 aj.clickapply();
					 test.pass("Clicked On Apply ");
					 } catch (Exception e) {
					 test.fail("Check Apply xpath");
					 test.log(Status.FAIL,test.addScreenCaptureFromBase64String(screenshot.capture(driver))+ "Test Failed"); 
			         ScreenRecorderUtil.stopRecord();
					 }
		         
		         Thread.sleep(1000);
		         
		         //Upload Profile Picture
		         driver.findElement(By.tagName("path")).click();
		         StringSelection stringSelection = new StringSelection("C:\\Users\\system3\\eclipse-workspace\\AptaHR_Jenkins\\documents\\QA.jpg");
			 	 Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
		      
			 	//Robot class to perform actions on file upload popup
			 	 Robot r=new Robot();
			 	 r.delay(3000);
			     r.keyPress(KeyEvent.VK_CONTROL);
			     r.keyPress(KeyEvent.VK_V);
			     r.keyRelease(KeyEvent.VK_CONTROL);
			     r.keyRelease(KeyEvent.VK_V);
			     r.keyPress(KeyEvent.VK_ENTER);
			     r.keyRelease(KeyEvent.VK_ENTER);
			     
			     Thread.sleep(2000);
		         
		         try {
		        	 driver.findElement(By.xpath("//input[@name='name']")).click();
					 aj.setfullname("Puneeth R");
					 test.pass("Entered Full Name ");
					 } catch (Exception e) {
					 test.fail("Check Full name xpath");
					 test.log(Status.FAIL,test.addScreenCaptureFromBase64String(screenshot.capture(driver))+ "Test Failed"); 
			         ScreenRecorderUtil.stopRecord();
					 }
		         
		         Thread.sleep(1000);
		         

		         try {
		        	 driver.findElement(By.xpath("//input[@name='email']")).click();
					 aj.setemail("puneeth@spacehotline.com");
					 test.pass("Entered Email");
					 } catch (Exception e) {
					 test.fail("Check Email xpath");
					 test.log(Status.FAIL,test.addScreenCaptureFromBase64String(screenshot.capture(driver))+ "Test Failed"); 
			         ScreenRecorderUtil.stopRecord();
					 }
		         
		         Thread.sleep(1000);
		         
		         try {
					 aj.clickcountrydropdown();
					 test.pass("Clicked on Country Dropdown");
					 } catch (Exception e) {
					 test.fail("Check Country Dropdown xpath");
					 test.log(Status.FAIL,test.addScreenCaptureFromBase64String(screenshot.capture(driver))+ "Test Failed"); 
			         ScreenRecorderUtil.stopRecord();
					 }
		         
		         Thread.sleep(1000);

		         try {
					 aj.clickcountry();
					 test.pass("selected country from Dorpdown");
					 } catch (Exception e) {
					 test.fail("Check Country name xpath");
					 test.log(Status.FAIL,test.addScreenCaptureFromBase64String(screenshot.capture(driver))+ "Test Failed"); 
			         ScreenRecorderUtil.stopRecord();
					 }
		         
		         Thread.sleep(1000);
		         
		         try {
		        	 driver.findElement(By.xpath("//input[@name='mobile_number']")).click();
					 aj.setmobilenumber("8529631478");
					 test.pass("Entered Mobile Number");
					 } catch (Exception e) {
					 test.fail("Check Mobile number xpath");
					 test.log(Status.FAIL,test.addScreenCaptureFromBase64String(screenshot.capture(driver))+ "Test Failed"); 
			         ScreenRecorderUtil.stopRecord();
					 }
		         
		         Thread.sleep(1000);
		         
		         try {
		        	 driver.findElement(By.xpath("//input[@name='your_current_location']")).click();
					 aj.setlocation("Hyderabad");
					 test.pass("Entered Location");
					 } catch (Exception e) {
					 test.fail("Check Location xpath");
					 test.log(Status.FAIL,test.addScreenCaptureFromBase64String(screenshot.capture(driver))+ "Test Failed"); 
			         ScreenRecorderUtil.stopRecord();
					 }
		         
		         Thread.sleep(1000);
		         
		         try {
		        	 driver.findElement(By.xpath("//input[@name='your_current_position']")).click();
					 aj.setcurrentposition("QA Engineer");
					 test.pass("Entered Current Position");
					 } catch (Exception e) {
					 test.fail("Check Location xpath");
					 test.log(Status.FAIL,test.addScreenCaptureFromBase64String(screenshot.capture(driver))+ "Test Failed"); 
			         ScreenRecorderUtil.stopRecord();
					 }
		         
		         Thread.sleep(1000);
		         
		         try {
		        	 driver.findElement(By.xpath("//input[@name='notice_period_days']")).click();
					 aj.setnoticeperiod("30");
					 test.pass("Entered Notice period");
					 } catch (Exception e) {
					 test.fail("Check Notice period xpath");
					 test.log(Status.FAIL,test.addScreenCaptureFromBase64String(screenshot.capture(driver))+ "Test Failed"); 
			         ScreenRecorderUtil.stopRecord();
					 }
		         
		         Thread.sleep(1000);
		         
		         try {
		        	 driver.findElement(By.xpath("//input[@name='relevant_experience']")).click();
					 aj.setexperience("2");
					 test.pass("Entered Notice period");
					 } catch (Exception e) {
					 test.fail("Check Notice period xpath");
					 test.log(Status.FAIL,test.addScreenCaptureFromBase64String(screenshot.capture(driver))+ "Test Failed"); 
			         ScreenRecorderUtil.stopRecord();
					 }
		         
		         Thread.sleep(1000);
		         
		         try {
					 aj.clickcheckbox();
					 test.pass("Clicked on checkbox before Uploading Resume");
					 } catch (Exception e) {
					 test.fail("Check Checkbox xpath");
					 test.log(Status.FAIL,test.addScreenCaptureFromBase64String(screenshot.capture(driver))+ "Test Failed"); 
			         ScreenRecorderUtil.stopRecord();
					 }
		         
		         Thread.sleep(1000);
		         
		         try {
					 aj.clickuploadbutton();
					 test.pass("Clicked on Upload Button for Uploading Resume");
					 } catch (Exception e) {
					 test.fail("Check Upload button xpath");
					 test.log(Status.FAIL,test.addScreenCaptureFromBase64String(screenshot.capture(driver))+ "Test Failed"); 
			         ScreenRecorderUtil.stopRecord();
					 }
		         
		         Thread.sleep(1000);
		         
		         //Uploading Resume
		         
		         StringSelection stringSelection1 = new StringSelection("C:\\Users\\system3\\eclipse-workspace\\AptaHR_Jenkins\\documents\\QA Engineer Resume.pdf");
			 	 Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection1, null);
			    
			 	Robot r1=new Robot();
			 	 r1.delay(3000);
			     r1.keyPress(KeyEvent.VK_CONTROL);
			     r1.keyPress(KeyEvent.VK_V);
			      r1.keyRelease(KeyEvent.VK_CONTROL);
			      r1.keyRelease(KeyEvent.VK_V);
			     r1.keyPress(KeyEvent.VK_ENTER);
			     r1.keyRelease(KeyEvent.VK_ENTER);
		         
			     test.info("Resume uploaded in PDF format");
			     
			     Thread.sleep(2000);
		         try {
					 aj.clickapply1();
					 test.pass("Clicked on Apply after Uploading Resume");
					 } catch (Exception e) {
					 test.fail("Check Apply1 xpath");
					 test.log(Status.FAIL,test.addScreenCaptureFromBase64String(screenshot.capture(driver))+ "Test Failed"); 
			         ScreenRecorderUtil.stopRecord();
					 }  
		         test.info("Test case Execution completed successfully");
		         Thread.sleep(1000);
		         ScreenRecorderUtil.stopRecord();
}}
