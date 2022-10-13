package scripts;

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
import pages.aptahrlogin_pageNew;
import pages.psychometricassessment_pageNew;

public class PsychometricAssessment extends Basetest {
	
@Test
	
	public void aptahrpsychometricAssessmentScript() throws Exception
	{
		
		ScreenRecorderUtil.startRecord("Psychometric Assessment");
		

		  FileInputStream f= new FileInputStream("C:\\Users\\system3\\eclipse-workspace\\AptaHR_Jenkins\\Login credentials.xlsx");   
	      Workbook book=WorkbookFactory.create(f);
			
			  ExtentTest test =  extent.createTest("Psychometric Assessment", "Verify Psychometric Assessment");
			  
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
		      
		      psychometricassessment_pageNew psy =new psychometricassessment_pageNew(driver);
		      
		      test.info("Starting Psychometric Assessment script");
		      
		      try {
					 psy.clickassessments();
					 test.pass("Clicked On Assessments");
					 } catch (Exception e) {
					 test.fail("Check Assessments xpath");
					 test.log(Status.FAIL,test.addScreenCaptureFromBase64String(screenshot.capture(driver))+ "Test Failed"); 
			         ScreenRecorderUtil.stopRecord();
					 }
		         
		         Thread.sleep(1000);
		        
		         try {
					 psy.clickpsyassessment();
					 test.pass("Clicked On Psychometric Assessments");
					 } catch (Exception e) {
					 test.fail("Check psyassessments xpath");
					 test.log(Status.FAIL,test.addScreenCaptureFromBase64String(screenshot.capture(driver))+ "Test Failed"); 
			         ScreenRecorderUtil.stopRecord();
					 }
		         
		         Thread.sleep(1000);

		         try {
					 psy.clickaddpsyassessment();
					 test.pass("Clicked On Add Psychometric Assessments Button");
					 } catch (Exception e) {
					 test.fail("Check add psyassessments xpath");
					 test.log(Status.FAIL,test.addScreenCaptureFromBase64String(screenshot.capture(driver))+ "Test Failed"); 
			         ScreenRecorderUtil.stopRecord();
					 }
		         
		         Thread.sleep(1000);
		         
		         try {
					 psy.setfoldername("QA");
					 test.pass("Entered Foldername");
					 } catch (Exception e) {
					 test.fail("Check Foldername xpath");
					 test.log(Status.FAIL,test.addScreenCaptureFromBase64String(screenshot.capture(driver))+ "Test Failed"); 
			         ScreenRecorderUtil.stopRecord();
					 }
		         
		         Thread.sleep(1000);
		         
		         try {
					 psy.clickcreateassessment();
					 test.pass("Clicked on create assessment button");
					 } catch (Exception e) {
					 test.fail("Check create assessment xpath");
					 test.log(Status.FAIL,test.addScreenCaptureFromBase64String(screenshot.capture(driver))+ "Test Failed"); 
			         ScreenRecorderUtil.stopRecord();
					 }
		         
		         Thread.sleep(1000);
		         
		         try {
					 psy.clicktoopenfolder();
					 test.pass("Clicked to Open create folder");
					 } catch (Exception e) {
					 test.fail("Check open folder xpath");
					 test.log(Status.FAIL,test.addScreenCaptureFromBase64String(screenshot.capture(driver))+ "Test Failed"); 
			         ScreenRecorderUtil.stopRecord();
					 }
		         Thread.sleep(1000);
		         
		       /*  try {
					 psy.clickaddquestion1();
					 test.pass("Clicked to add question1");
					 } catch (Exception e) {
					 test.fail("Check add question1 xpath");
					 test.log(Status.FAIL,test.addScreenCaptureFromBase64String(screenshot.capture(driver))+ "Test Failed"); 
			         ScreenRecorderUtil.stopRecord();
					 }
		         Thread.sleep(1000);*/
		         
		         
		         try {
			        	try {
							driver.findElement(By.xpath("(//p[text()='+ Add Questions'])[1]")).click();
						} catch (Exception e) {
							driver.findElement(By.xpath("(//p[text()='+ Add questions'])[2]")).click();	
						}
					} catch (Exception e) {
						 test.fail("Check add question1 xpath");
						 test.log(Status.FAIL,test.addScreenCaptureFromBase64String(screenshot.capture(driver))+ "Test Failed"); 
				         ScreenRecorderUtil.stopRecord();
					}
		         
		         try {
					 psy.setquestion1("How Do you handle the problems?");
					 test.pass("Entered First question");
					 } catch (Exception e) {
					 test.fail("Check question1 xpath");
					 test.log(Status.FAIL,test.addScreenCaptureFromBase64String(screenshot.capture(driver))+ "Test Failed"); 
			         ScreenRecorderUtil.stopRecord();
					 }
		         Thread.sleep(1000);
		         
		         try {
					 psy.clicksave1();
					 test.pass("First Question Saved");
					 } catch (Exception e) {
					 test.fail("Check save1 xpath");
					 test.log(Status.FAIL,test.addScreenCaptureFromBase64String(screenshot.capture(driver))+ "Test Failed"); 
			         ScreenRecorderUtil.stopRecord();
					 }
		         Thread.sleep(4000);
		         
		         
		       /*  try {
					 psy.clickaddquestion2();
					 test.pass("Clicked to add question2");
					 } catch (Exception e) {
					 test.fail("Check add question2 xpath");
					 test.log(Status.FAIL,test.addScreenCaptureFromBase64String(screenshot.capture(driver))+ "Test Failed"); 
			         ScreenRecorderUtil.stopRecord();
					 }
		         Thread.sleep(1000);*/
		         
		         try {
			        	try {
							driver.findElement(By.xpath("(//p[text()='+ Add Questions'])[1]")).click();
						} catch (Exception e) {
							driver.findElement(By.xpath("(//p[text()='+ Add questions'])[2]")).click();	
						}
					} catch (Exception e) {
						 test.fail("Check add question2 xpath");
						 test.log(Status.FAIL,test.addScreenCaptureFromBase64String(screenshot.capture(driver))+ "Test Failed"); 
				         ScreenRecorderUtil.stopRecord();
					}
		         
		         try {
					 psy.setquestion2("Do you set up long term goals?");
					 test.pass("Entered Second question");
					 } catch (Exception e) {
					 test.fail("Check question2 xpath");
					 test.log(Status.FAIL,test.addScreenCaptureFromBase64String(screenshot.capture(driver))+ "Test Failed"); 
			         ScreenRecorderUtil.stopRecord();
					 }
		         Thread.sleep(1000);
		         
		         try {
					 psy.clicksave2();
					 test.pass("Second Question Saved");
					 } catch (Exception e) {
					 test.fail("Check save2 xpath");
					 test.log(Status.FAIL,test.addScreenCaptureFromBase64String(screenshot.capture(driver))+ "Test Failed"); 
			         ScreenRecorderUtil.stopRecord();
					 }
		         Thread.sleep(4000);
		        /* try {
					 psy.clickaddquestion3();
					 test.pass("Clicked to add question3");
					 } catch (Exception e) {
					 test.fail("Check add question3 xpath");
					 test.log(Status.FAIL,test.addScreenCaptureFromBase64String(screenshot.capture(driver))+ "Test Failed"); 
			         ScreenRecorderUtil.stopRecord();
					 }
		         Thread.sleep(1000);  */
		         try {
			        	try {
							driver.findElement(By.xpath("(//p[text()='+ Add Questions'])[1]")).click();
						} catch (Exception e) {
							driver.findElement(By.xpath("(//p[text()='+ Add questions'])[2]")).click();	
						}
					} catch (Exception e) {
						 test.fail("Check add question3 xpath");
						 test.log(Status.FAIL,test.addScreenCaptureFromBase64String(screenshot.capture(driver))+ "Test Failed"); 
				         ScreenRecorderUtil.stopRecord();
					}
		         
		         try {
					 psy.setquestion3("Do you like helping people out?");
					 test.pass("Entered Third question");
					 } catch (Exception e) {
					 test.fail("Check question3 xpath");
					 test.log(Status.FAIL,test.addScreenCaptureFromBase64String(screenshot.capture(driver))+ "Test Failed"); 
			         ScreenRecorderUtil.stopRecord();
					 }
		         Thread.sleep(1000);
		         
		         try {
					 psy.clicksave2();
					 test.pass("Third Question Saved");
					 } catch (Exception e) {
					 test.fail("Check save3 xpath");
					 test.log(Status.FAIL,test.addScreenCaptureFromBase64String(screenshot.capture(driver))+ "Test Failed"); 
			         ScreenRecorderUtil.stopRecord();
					 }
		        
		         Thread.sleep(1000);
		         test.info("Test case Execution completed Successfully");
		         ScreenRecorderUtil.stopRecord();
		         
}}
