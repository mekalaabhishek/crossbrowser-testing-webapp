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
import pages.skillassessment_pageNew;

public class SkillAssessment extends Basetest {

	
	@Test
	
	public void aptahrSkillAssessmentScript() throws Exception
	{
		
		ScreenRecorderUtil.startRecord("Skill Assessment");
		

		  FileInputStream f= new FileInputStream("C:\\Users\\system3\\eclipse-workspace\\AptaHR_Jenkins\\Login credentials.xlsx");   
	      Workbook book=WorkbookFactory.create(f);
			
			  ExtentTest test =  extent.createTest("Skill Assessment", "Verify Skill Assessment");
			  
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
		   	
		      //Skill Assessment Script starts
		      
		      skillassessment_pageNew sa=new skillassessment_pageNew(driver);
		      
		      test.info("Starting Skill Assessment script");
		      
		         try {
					 sa.clickassessment();
					 test.pass("Clicked On Assessments");
					 } catch (Exception e) {
					 test.fail("Check Assessments xpath");
					 test.log(Status.FAIL,test.addScreenCaptureFromBase64String(screenshot.capture(driver))+ "Test Failed"); 
			         ScreenRecorderUtil.stopRecord();
					 }
		         
		         Thread.sleep(1000);
		      
		         try {
					 sa.clickaddassessments();
					 test.pass("Clicked On AddAssessments");
					 } catch (Exception e) {
					 test.fail("Check AddAssessments xpath");
					 test.log(Status.FAIL,test.addScreenCaptureFromBase64String(screenshot.capture(driver))+ "Test Failed"); 
			         ScreenRecorderUtil.stopRecord();
					 }
		         
		        Thread.sleep(1000);
		        
		        try {
					 sa.setfoldername("QA Automation");
					 test.pass("Entered folder name");
					 } catch (Exception e) {
					 test.fail("Check Foldername xpath");
					 test.log(Status.FAIL,test.addScreenCaptureFromBase64String(screenshot.capture(driver))+ "Test Failed"); 
			         ScreenRecorderUtil.stopRecord();
					 }
		   	
		        Thread.sleep(1000);
		   	
		        try {
					 sa.clickcreateassessment();
					 test.pass("Clicked On CreateAssessments");
					 } catch (Exception e) {
					 test.fail("Check CreateAssessments xpath");
					 test.log(Status.FAIL,test.addScreenCaptureFromBase64String(screenshot.capture(driver))+ "Test Failed"); 
			         ScreenRecorderUtil.stopRecord();
					 }	
		        
		        Thread.sleep(1000);
		        
		        //Opens the created Skill Assessment Folder
		        
		        try {
					 sa.clickopenfolder();
					 test.pass("Clicked On Openfolder");
					 } catch (Exception e) {
					 test.fail("Check Open folder xpath");
					 test.log(Status.FAIL,test.addScreenCaptureFromBase64String(screenshot.capture(driver))+ "Test Failed"); 
			         ScreenRecorderUtil.stopRecord();
					 }	
		        Thread.sleep(1000);
		        
		        //Select MCQ
		        try {
					 sa.clickaddquestionmcq();
					 test.pass("Clicked On MCQ");
					 } catch (Exception e) {
					 test.fail("Check add question mcq xpath");
					 test.log(Status.FAIL,test.addScreenCaptureFromBase64String(screenshot.capture(driver))+ "Test Failed"); 
			         ScreenRecorderUtil.stopRecord();
					 }	
		        Thread.sleep(1000);
		        
		        try {
					 sa.clickproceedmcq();
					 test.pass("Clicked On Proceed MCQ");
					 } catch (Exception e) {
					 test.fail("Check proceed mcq xpath");
					 test.log(Status.FAIL,test.addScreenCaptureFromBase64String(screenshot.capture(driver))+ "Test Failed"); 
			         ScreenRecorderUtil.stopRecord();
					 }	
		        Thread.sleep(1000);
		        
		        // MCQ First Question
		        
		        try {
					 sa.clickmcqquestion1();     //Clicked the question
					 test.pass("clicked First MCQ Question");
					 } catch (Exception e) {
					 test.fail("Check mcqquestion1 xpath");
					 test.log(Status.FAIL,test.addScreenCaptureFromBase64String(screenshot.capture(driver))+ "Test Failed"); 
			         ScreenRecorderUtil.stopRecord();
					 }	
		        Thread.sleep(1000);
		        
		        
		        try {
					 sa.setmcqquestion1("The main Objective of Quality Assurance is ");      //set the question and options
					 test.pass("Entered First MCQ Question");
					 } catch (Exception e) {
					 test.fail("Check mcqquestion1 xpath");
					 test.log(Status.FAIL,test.addScreenCaptureFromBase64String(screenshot.capture(driver))+ "Test Failed"); 
			         ScreenRecorderUtil.stopRecord();
					 }	
		        Thread.sleep(1000);
		        // // MCQ First Question Options
		        try {
					 sa.setmcqq1optA("Proof of Fitness of the Product");
					 test.pass("Entered question 1 Option A");
					 } catch (Exception e) {
					 test.fail("Check q1 optionA  xpath");
					 test.log(Status.FAIL,test.addScreenCaptureFromBase64String(screenshot.capture(driver))+ "Test Failed"); 
			         ScreenRecorderUtil.stopRecord();
					 }	
		        
		        Thread.sleep(1000);
		        try {
					 sa.setmcqq1optB("Inspeciton of Quality of the Product");
					 test.pass("Entered question 1 Option B");
					 } catch (Exception e) {
					 test.fail("Check q1 optionB  xpath");
					 test.log(Status.FAIL,test.addScreenCaptureFromBase64String(screenshot.capture(driver))+ "Test Failed"); 
			         ScreenRecorderUtil.stopRecord();
					 }	
		        Thread.sleep(1000);
		        try {
					 sa.setmcqq1optC("Quality Conformance");
					 test.pass("Entered question 1 Option C");
					 } catch (Exception e) {
					 test.fail("Check q1 optionC  xpath");
					 test.log(Status.FAIL,test.addScreenCaptureFromBase64String(screenshot.capture(driver))+ "Test Failed"); 
			         ScreenRecorderUtil.stopRecord();
					 }	
		        Thread.sleep(1000);
		        try {
					 sa.setmcqq1optD("Customer Satisfaction");
					 test.pass("Entered question 1 Option D");
					 } catch (Exception e) {
					 test.fail("Check q1 optionD  xpath");
					 test.log(Status.FAIL,test.addScreenCaptureFromBase64String(screenshot.capture(driver))+ "Test Failed"); 
			         ScreenRecorderUtil.stopRecord();
					 }	
		        Thread.sleep(1000);
		        try {
					 sa.clicksaveandanothermcqq1();
					 test.pass("Clicked on save and another button mcqq1");
					 } catch (Exception e) {
					 test.fail("Check save and another button mcqq1  xpath");
					 test.log(Status.FAIL,test.addScreenCaptureFromBase64String(screenshot.capture(driver))+ "Test Failed"); 
			         ScreenRecorderUtil.stopRecord();
					 }
		        Thread.sleep(1000);
		        
		     // MCQ Second Question
		        
		        try {
					 sa.setmcqquestion2("QMS, TQM, and QIP all corresponds to");      //set the question and options
					 test.pass("Entered Second MCQ Question");
					 } catch (Exception e) {
					 test.fail("Check mcqquestion2 xpath");
					 test.log(Status.FAIL,test.addScreenCaptureFromBase64String(screenshot.capture(driver))+ "Test Failed"); 
			         ScreenRecorderUtil.stopRecord();
					 }	
		        Thread.sleep(1000);
		     // MCQ Second Question Options
		        try {
					 sa.setmcqq2optA("Quality abbreviations");
					 test.pass("Entered question 2 Option A");
					 } catch (Exception e) {
					 test.fail("Check q2 optionA  xpath");
					 test.log(Status.FAIL,test.addScreenCaptureFromBase64String(screenshot.capture(driver))+ "Test Failed"); 
			         ScreenRecorderUtil.stopRecord();
					 }	
		        Thread.sleep(1000);
		        try {
					 sa.setmcqq2optB("Quality techniques");
					 test.pass("Entered question 2 Option B");
					 } catch (Exception e) {
					 test.fail("Check q2 optionB  xpath");
					 test.log(Status.FAIL,test.addScreenCaptureFromBase64String(screenshot.capture(driver))+ "Test Failed"); 
			         ScreenRecorderUtil.stopRecord();
					 }	
		        Thread.sleep(1000);
		        try {
					 sa.setmcqq2optC("Quality parameters");
					 test.pass("Entered question 2 Option C");
					 } catch (Exception e) {
					 test.fail("Check q2 optionC  xpath");
					 test.log(Status.FAIL,test.addScreenCaptureFromBase64String(screenshot.capture(driver))+ "Test Failed"); 
			         ScreenRecorderUtil.stopRecord();
					 }	
		        Thread.sleep(1000);
		        try {
					 sa.setmcqq2optD("None of the above");
					 test.pass("Entered question 2 Option D");
					 } catch (Exception e) {
					 test.fail("Check q2 optionD  xpath");
					 test.log(Status.FAIL,test.addScreenCaptureFromBase64String(screenshot.capture(driver))+ "Test Failed"); 
			         ScreenRecorderUtil.stopRecord();
					 }
		        Thread.sleep(1000);
		        try {
					 sa.clicksaveandanothermcqq2();
					 test.pass("Clicked on save and another button mcqq2");
					 } catch (Exception e) {
					 test.fail("Check save and another button mcqq2  xpath");
					 test.log(Status.FAIL,test.addScreenCaptureFromBase64String(screenshot.capture(driver))+ "Test Failed"); 
			         ScreenRecorderUtil.stopRecord();
					 }
		        Thread.sleep(1000);
		     // MCQ Third Question
		        
		        try {
					 sa.setmcqquestion3("Quality management is a method for");      //set the question and options
					 test.pass("Entered Third MCQ Question");
					 } catch (Exception e) {
					 test.fail("Check mcqquestion3 xpath");
					 test.log(Status.FAIL,test.addScreenCaptureFromBase64String(screenshot.capture(driver))+ "Test Failed"); 
			         ScreenRecorderUtil.stopRecord();
					 }	
		        Thread.sleep(1000);
		     // MCQ Third Question Options
		        
		        
		        try {
					 sa.setmcqq3optA("Design");
					 test.pass("Entered question 3 Option A");
					 } catch (Exception e) {
					 test.fail("Check q3 optionA  xpath");
					 test.log(Status.FAIL,test.addScreenCaptureFromBase64String(screenshot.capture(driver))+ "Test Failed"); 
			         ScreenRecorderUtil.stopRecord();
					 }	
		        Thread.sleep(1000);
		        try {
					 sa.setmcqq3optB("Testing");
					 test.pass("Entered question 3 Option B");
					 } catch (Exception e) {
					 test.fail("Check q3 optionB  xpath");
					 test.log(Status.FAIL,test.addScreenCaptureFromBase64String(screenshot.capture(driver))+ "Test Failed"); 
			         ScreenRecorderUtil.stopRecord();
					 }	
		        Thread.sleep(1000);
		        try {
					 sa.setmcqq3optC("System");
					 test.pass("Entered question 3 Option C");
					 } catch (Exception e) {
					 test.fail("Check q3 optionC  xpath");
					 test.log(Status.FAIL,test.addScreenCaptureFromBase64String(screenshot.capture(driver))+ "Test Failed"); 
			         ScreenRecorderUtil.stopRecord();
					 }	
		        Thread.sleep(1000);
		        try {
					 sa.setmcqq3optD("Logic");
					 test.pass("Entered question 3 Option D");
					 } catch (Exception e) {
					 test.fail("Check q3 optionD  xpath");
					 test.log(Status.FAIL,test.addScreenCaptureFromBase64String(screenshot.capture(driver))+ "Test Failed"); 
			         ScreenRecorderUtil.stopRecord();
					 }	
		        
		        Thread.sleep(1000);
		        try {
					 sa.clicksavemcq3();
					 test.pass("Clicked on save button mcqq3");
					 } catch (Exception e) {
					 test.fail("Check save button mcqq3  xpath");
					 test.log(Status.FAIL,test.addScreenCaptureFromBase64String(screenshot.capture(driver))+ "Test Failed"); 
			         ScreenRecorderUtil.stopRecord();
					 }
		        
		        Thread.sleep(1000);
		        
		        try {
		        	try {
						driver.findElement(By.xpath("(//p[text()='+ Add questions'])[1]")).click();
					} catch (Exception e) {
						driver.findElement(By.xpath("(//p[text()='+ Add questions'])[2]")).click();	
					}
				} catch (Exception e) {
					 test.fail("Check Add button for True or false xpath");
					 test.log(Status.FAIL,test.addScreenCaptureFromBase64String(screenshot.capture(driver))+ "Test Failed"); 
			         ScreenRecorderUtil.stopRecord();
				}
		        
		        
		        
		        
		        //Click on Add question for True or False
		       /* try {
					 sa.clickaddquestiontf();
					 test.pass("Clicked on Add Question for TF");
					 } catch (Exception e) {
					 test.fail("Check Add Question TF  xpath");
					 test.log(Status.FAIL,test.addScreenCaptureFromBase64String(screenshot.capture(driver))+ "Test Failed"); 
			         ScreenRecorderUtil.stopRecord();
					 }
		        
		        Thread.sleep(1000);*/
		        //Select True or False and click on Proceed
		        try {
					 sa.clickaddtf();
					 test.pass("Clicked on TF");
					 } catch (Exception e) {
					 test.fail("Check Add TF  xpath");
					 test.log(Status.FAIL,test.addScreenCaptureFromBase64String(screenshot.capture(driver))+ "Test Failed"); 
			         ScreenRecorderUtil.stopRecord();
					 }
		        
		        Thread.sleep(1000);
		        try {
					 sa.clickproceedtf();
					 test.pass("Clicked on Proceed True or False");
					 } catch (Exception e) {
					 test.fail("Check Proceed TF  xpath");
					 test.log(Status.FAIL,test.addScreenCaptureFromBase64String(screenshot.capture(driver))+ "Test Failed"); 
			         ScreenRecorderUtil.stopRecord();
					 }
		        Thread.sleep(1000);
		        
		     // True or False First Question
		        
		        try {
					 sa.clicktfq1();
					 test.pass("Clicked on true or false question1");
					 } catch (Exception e) {
					 test.fail("Check true or false question1 clicked or Not xpath");
					 test.log(Status.FAIL,test.addScreenCaptureFromBase64String(screenshot.capture(driver))+ "Test Failed"); 
			         ScreenRecorderUtil.stopRecord();
					 }
		        Thread.sleep(1000);
		        
		        
		        try {
					 sa.settfq1("Control Charts is a statistical technique to assess, monitor, and maintain the stability of a process.");
					 test.pass("Entered TFQ1");
					 } catch (Exception e) {
					 test.fail("Check tfq1  xpath");
					 test.log(Status.FAIL,test.addScreenCaptureFromBase64String(screenshot.capture(driver))+ "Test Failed"); 
			         ScreenRecorderUtil.stopRecord();
					 }
		        Thread.sleep(1000);
		        try {
					 sa.clicksaveandanothertfq1();
					 test.pass("Clicked on save and another tfq1");
					 } catch (Exception e) {
					 test.fail("Check saveandanothertfq1 xpath");
					 test.log(Status.FAIL,test.addScreenCaptureFromBase64String(screenshot.capture(driver))+ "Test Failed"); 
			         ScreenRecorderUtil.stopRecord();
					 }
		        Thread.sleep(1000);
		        // True or False Second Question
		        
		        try {
					 sa.settfq2("Staff development plan describes how the skills and experience of the project team members will be developed.");
					 test.pass("Entered TFQ2");
					 } catch (Exception e) {
					 test.fail("Check tfq2  xpath");
					 test.log(Status.FAIL,test.addScreenCaptureFromBase64String(screenshot.capture(driver))+ "Test Failed"); 
			         ScreenRecorderUtil.stopRecord();
					 }
		        Thread.sleep(1000);
		        try {
					 sa.clicksaveandanothertfq2();
					 test.pass("Clicked on save and another button tfq2");
					 } catch (Exception e) {
					 test.fail("Check saveandanothertfq2 xpath");
					 test.log(Status.FAIL,test.addScreenCaptureFromBase64String(screenshot.capture(driver))+ "Test Failed"); 
			         ScreenRecorderUtil.stopRecord();
					 }
		        Thread.sleep(1000);
		        // True or False Third Question
		        
		        try {
					 sa.settfq3("Cost of quality = Prevention Cost + Appraisal cost + Failure cost");
					 test.pass("Entered TFQ3");
					 } catch (Exception e) {
					 test.fail("Check tfq3  xpath");
					 test.log(Status.FAIL,test.addScreenCaptureFromBase64String(screenshot.capture(driver))+ "Test Failed"); 
			         ScreenRecorderUtil.stopRecord();
					 }
		        
		        Thread.sleep(1000);
		        try {
					 sa.clicksavetfq3();
					 test.pass("Clicked on save button tfq3");
					 } catch (Exception e) {
					 test.fail("Check save tfq3 xpath");
					 test.log(Status.FAIL,test.addScreenCaptureFromBase64String(screenshot.capture(driver))+ "Test Failed"); 
			         ScreenRecorderUtil.stopRecord();
					 }
		        Thread.sleep(6000);
		        
		        
		        try {
		        	try {
						driver.findElement(By.xpath("(//p[text()='+ Add questions'])[1]")).click();
					} catch (Exception e) {
						driver.findElement(By.xpath("(//p[text()='+ Add questions'])[2]")).click();	
					}
				} catch (Exception e) {
					 test.fail("Check Add button for SAQ xpath");
					 test.log(Status.FAIL,test.addScreenCaptureFromBase64String(screenshot.capture(driver))+ "Test Failed"); 
			         ScreenRecorderUtil.stopRecord();
				}
		        
		        //Click on Add question for SAQ
		        
		        /*try {
					 sa.clickaddquestionsaq();
					 test.pass("Clicked on Add question SAQ");
					 } catch (Exception e) {
					 test.fail("Check addquestionsaq xpath");
					 test.log(Status.FAIL,test.addScreenCaptureFromBase64String(screenshot.capture(driver))+ "Test Failed"); 
			         ScreenRecorderUtil.stopRecord();
					 }
		        Thread.sleep(1000);*/
		        //Select SAQ and click on Proceed
		        
		        try {
					 sa.clickaddsaq();
					 test.pass("Clicked on SAQ");
					 } catch (Exception e) {
					 test.fail("Check addquestionsaq xpath");
					 test.log(Status.FAIL,test.addScreenCaptureFromBase64String(screenshot.capture(driver))+ "Test Failed"); 
			         ScreenRecorderUtil.stopRecord();
					 }
		        Thread.sleep(1000);
		        try {
					 sa.clickproceedsaq();
					 test.pass("Clicked on Proceed SAQ");
					 } catch (Exception e) {
					 test.fail("Check Proceed saq xpath");
					 test.log(Status.FAIL,test.addScreenCaptureFromBase64String(screenshot.capture(driver))+ "Test Failed"); 
			         ScreenRecorderUtil.stopRecord();
					 }
		        Thread.sleep(1000);
		        //First SAQ Question
		        
		        try {
					 sa.clicksaqq1();
					 test.pass("Clicked for SAQ Question");
					 } catch (Exception e) {
					 test.fail("Check Xpath wheather clicked on SAQ or Not");
					 test.log(Status.FAIL,test.addScreenCaptureFromBase64String(screenshot.capture(driver))+ "Test Failed"); 
			         ScreenRecorderUtil.stopRecord();
					 }
		        Thread.sleep(1000);
		        
		        try {
					 sa.setsaqq1("Explain Different Types of WebElement Locators");
					 test.pass("Entered SAQ Question");
					 } catch (Exception e) {
					 test.fail("Check  SAQ Q1 xpath");
					 test.log(Status.FAIL,test.addScreenCaptureFromBase64String(screenshot.capture(driver))+ "Test Failed"); 
			         ScreenRecorderUtil.stopRecord();
					 }
		        Thread.sleep(1000);
		        //Instructions for First SAQ Question
		        
		        try {
					 sa.clicksaqinstructionssaqq1();
					 test.pass("Clicked on Instructions for SAQ Question");
					 } catch (Exception e) {
					 test.fail("Check xpath on Instructions for SAQ Question");
					 test.log(Status.FAIL,test.addScreenCaptureFromBase64String(screenshot.capture(driver))+ "Test Failed"); 
			         ScreenRecorderUtil.stopRecord();
					 }
		        
		        Thread.sleep(1000);
		        try {
					 sa.setinstructionssaqq1("Explain In Brief");
					 test.pass("Entered Instructions for SAQ Question");
					 } catch (Exception e) {
					 test.fail("Check instructions SAQ Q1 xpath");
					 test.log(Status.FAIL,test.addScreenCaptureFromBase64String(screenshot.capture(driver))+ "Test Failed"); 
			         ScreenRecorderUtil.stopRecord();
					 }
		        Thread.sleep(1000);
		        //save for SAQ
		        try {
					 sa.clicksavesaqq1();
					 test.pass("Clicked on save saq q1");
					 } catch (Exception e) {
					 test.fail("Check save saq q1xpath");
					 test.log(Status.FAIL,test.addScreenCaptureFromBase64String(screenshot.capture(driver))+ "Test Failed"); 
			         ScreenRecorderUtil.stopRecord();
					 }
		        
		        test.info("Completed Skill Assessment Test case");
		        Thread.sleep(1000);
		        ScreenRecorderUtil.stopRecord();  
		        
		        
		   	
		 	
}}
