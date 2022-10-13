package scripts;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.google.inject.Key;

import generic.Basetest;
import generic.ScreenRecorderUtil;
import generic.screenshot;
import pages.aptahrlogin_pageNew;
import pages.postjobmanually_pageNew;


public class Postjobmanually extends Basetest {

	
@Test
	
	public void postjobmanullyscript() throws Exception
	{
		
		ScreenRecorderUtil.startRecord("Post Job manually");
		

		  FileInputStream f= new FileInputStream("C:\\Users\\system3\\eclipse-workspace\\AptaHR_Jenkins\\Login credentials.xlsx");   
	      Workbook book=WorkbookFactory.create(f);
			
			  ExtentTest test =  extent.createTest("Post Job manually", "Verify Post Job manually");
			  
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
		      
		      postjobmanually_pageNew pjm =new postjobmanually_pageNew(driver);
		      
		      test.info("Starting Post Job manually script");
		      
		      try {
					 pjm.clickjobsandapplication();
					 test.pass("Clicked On jobs and applications");
					 } catch (Exception e) {
					 test.fail("Check Jobs and application xpath");
					 test.log(Status.FAIL,test.addScreenCaptureFromBase64String(screenshot.capture(driver))+ "Test Failed"); 
			         ScreenRecorderUtil.stopRecord();
					 }
		         
		         Thread.sleep(1000);
		         
		         try {
					 pjm.clicknewjob();
					 test.pass("Clicked On new Jobs");
					 } catch (Exception e) {
					 test.fail("Check New Jobs xpath");
					 test.log(Status.FAIL,test.addScreenCaptureFromBase64String(screenshot.capture(driver))+ "Test Failed"); 
			         ScreenRecorderUtil.stopRecord();
					 }
		         
		         Thread.sleep(1000);
		         
		         try {
					 pjm.clickmanual();
					 test.pass("Clicked add job manually");
					 } catch (Exception e) {
					 test.fail("Check add job manually xpath");
					 test.log(Status.FAIL,test.addScreenCaptureFromBase64String(screenshot.capture(driver))+ "Test Failed"); 
			         ScreenRecorderUtil.stopRecord();
					 }
		         
		         Thread.sleep(1000);
		         
		         try {
					 pjm.setjobtitle("QA Automation");         //send from excel
					 test.pass("Entered Job Title");
					 } catch (Exception e) {
					 test.fail("Check Job title xpath");
					 test.log(Status.FAIL,test.addScreenCaptureFromBase64String(screenshot.capture(driver))+ "Test Failed"); 
			         ScreenRecorderUtil.stopRecord();
					 }
		         
		         Thread.sleep(1000);
		         
		         try {
					 pjm.setlocation("Hyderabad");        //send from excel
					 test.pass("Entered Location");
					 } catch (Exception e) {
					 test.fail("Check location xpath");
					 test.log(Status.FAIL,test.addScreenCaptureFromBase64String(screenshot.capture(driver))+ "Test Failed"); 
			         ScreenRecorderUtil.stopRecord();
					 }
		         
		         Thread.sleep(1000);
		         
		         try {
					 pjm.clickemploymenttypedropdown();
					 test.pass("Clicked on Employment Dropdown");
					 } catch (Exception e) {
					 test.fail("Check Employment Dropdown xpath");
					 test.log(Status.FAIL,test.addScreenCaptureFromBase64String(screenshot.capture(driver))+ "Test Failed"); 
			         ScreenRecorderUtil.stopRecord();
					 }
		         
		         Thread.sleep(1000);
		         
		         try {
					 pjm.clickemploymenttype();
					 test.pass("Clicked on Employment type");
					 } catch (Exception e) {
					 test.fail("Check Employment type xpath");
					 test.log(Status.FAIL,test.addScreenCaptureFromBase64String(screenshot.capture(driver))+ "Test Failed"); 
			         ScreenRecorderUtil.stopRecord();
					 }
		         
		         Thread.sleep(1000);
		         
		         try {
					 pjm.settotalopenings("2");                     //send from excel
					 test.pass("Entered Total Number of Openings");
					 } catch (Exception e) {
					 test.fail("Check total Openings xpath");
					 test.log(Status.FAIL,test.addScreenCaptureFromBase64String(screenshot.capture(driver))+ "Test Failed"); 
			         ScreenRecorderUtil.stopRecord();
					 }
		         
		         Thread.sleep(1000);
		         
		         try {
					 pjm.clickexperiencedropdown();
					 test.pass("Clicked on Experience Dropdown");
					 } catch (Exception e) {
					 test.fail("Check Experience drodpown xpath");
					 test.log(Status.FAIL,test.addScreenCaptureFromBase64String(screenshot.capture(driver))+ "Test Failed"); 
			         ScreenRecorderUtil.stopRecord();
					 }
		         
		         Thread.sleep(1000);
		         
		         try {
					 pjm.clickexperience();
					 test.pass("Clicked on Experience");
					 } catch (Exception e) {
					 test.fail("Check Experience xpath");
					 test.log(Status.FAIL,test.addScreenCaptureFromBase64String(screenshot.capture(driver))+ "Test Failed"); 
			         ScreenRecorderUtil.stopRecord();
					 }
		         
		         Thread.sleep(1000);
		         
		         try {
					 pjm.setfromsalary("250");          //send from excel
					 test.pass("Entered From salary Range");
					 } catch (Exception e) {
					 test.fail("Check From Salary Range xpath");
					 test.log(Status.FAIL,test.addScreenCaptureFromBase64String(screenshot.capture(driver))+ "Test Failed"); 
			         ScreenRecorderUtil.stopRecord();
					 }
		         
		         Thread.sleep(1000);
		         
		         try {
					 pjm.settosalary("255");          //send from excel
					 test.pass("Entered From salary Range");
					 } catch (Exception e) {
					 test.fail("Check From Salary Range xpath");
					 test.log(Status.FAIL,test.addScreenCaptureFromBase64String(screenshot.capture(driver))+ "Test Failed"); 
			         ScreenRecorderUtil.stopRecord();
					 }
		         
		         Thread.sleep(1000);
		         
		         try {
					 pjm.clickmonthlyoranuallydropdown();
					 test.pass("Clicked on Monthly or Anually Dropdown");
					 } catch (Exception e) {
					 test.fail("Check Monthly or Anually Dropdown xpath");
					 test.log(Status.FAIL,test.addScreenCaptureFromBase64String(screenshot.capture(driver))+ "Test Failed"); 
			         ScreenRecorderUtil.stopRecord();
					 }
		         
		         Thread.sleep(1000);
		         
		         try {
					 pjm.clickmonthly();
					 test.pass("Clicked on Monthly");         //can change to Anually if Needed
					 } catch (Exception e) {
					 test.fail("Check Monthly xpath");
					 test.log(Status.FAIL,test.addScreenCaptureFromBase64String(screenshot.capture(driver))+ "Test Failed"); 
			         ScreenRecorderUtil.stopRecord();
					 }
		         
		         Thread.sleep(1000);
		         
		         
		         try {
					 pjm.setjobdescription("We are looking for a Quality Assurance (QA) engineer to develop and execute exploratory and automated tests to ensure product quality.\r\n"
					 	
					 		+ "QA engineer responsibilities include designing and implementing tests, debugging and defining corrective actions. You will also review system requirements and track quality assurance metrics (e.g. defect densities and open defect counts.)\r\n"
					 		+ "\r\n"
					 		+ "The QA technician role plays an important part in our company’s product development process. Our ideal candidate will be responsible for conducting tests before product launches to ensure software runs smoothly and meets client needs, while being cost-effective. If you hold an engineering background and enjoy providing end-to-end solutions to software quality problems, we’d like to meet you.\r\n"
					 		+ "\r\n"
					 		+ "Ultimately, you should monitor all stages of software development to identify and resolve system malfunctions to meet quality standards.");      //send from excel
					 test.pass("Entered Job Description");
					 } catch (Exception e) {
					 test.fail("Check Job Description xpath");
					 test.log(Status.FAIL,test.addScreenCaptureFromBase64String(screenshot.capture(driver))+ "Test Failed"); 
			         ScreenRecorderUtil.stopRecord();
					 }
		         
		         Thread.sleep(1000);
		         
		         try {
					 pjm.clickaddskillsfromjobdescription();
					 test.pass("Clicked on Add skills From Job Description");
					 } catch (Exception e) {
					 test.fail("Check Add skills From Job Description xpath");
					 test.log(Status.FAIL,test.addScreenCaptureFromBase64String(screenshot.capture(driver))+ "Test Failed"); 
			         ScreenRecorderUtil.stopRecord();
					 }
		         
		         Thread.sleep(1000);
		         
		         try {
					 pjm.clickjobscreeningstages();
					 test.pass("Clicked on job screening stages");
					 } catch (Exception e) {
					 test.fail("Check job screening stages xpath");
					 test.log(Status.FAIL,test.addScreenCaptureFromBase64String(screenshot.capture(driver))+ "Test Failed"); 
			         ScreenRecorderUtil.stopRecord();
					 }
		         
		         Thread.sleep(1000);
		         
		         try {
					 pjm.clicknext1();
					 test.pass("Clicked on Next button to Navigate to second page");
					 } catch (Exception e) {
					 test.fail("Check Next1 xpath");
					 test.log(Status.FAIL,test.addScreenCaptureFromBase64String(screenshot.capture(driver))+ "Test Failed"); 
			         ScreenRecorderUtil.stopRecord();
					 }
		         
		         Thread.sleep(1000);
		         
		         try {
					 pjm.clickcvscreenassignreedrpdown();
					 test.pass("Clicked on CV Screening Asigned to dropdown");
					 } catch (Exception e) {
					 test.fail("Check CV screening assignee dropdown xpath");
					 test.log(Status.FAIL,test.addScreenCaptureFromBase64String(screenshot.capture(driver))+ "Test Failed"); 
			         ScreenRecorderUtil.stopRecord();
					 }
		         
		         Thread.sleep(1000);
		         
		         try {
					 pjm.clickcvscreeningassignedto();
					 test.pass("Clicked on CV screening assigned to");
					 } catch (Exception e) {
					 test.fail("Check CV screening assigneed to xpath");
					 test.log(Status.FAIL,test.addScreenCaptureFromBase64String(screenshot.capture(driver))+ "Test Failed"); 
			         ScreenRecorderUtil.stopRecord();
					 }
		         
		         Thread.sleep(1000);
		         
		         try {
					 pjm.clickskillassessmentassigneedropdown();
					 test.pass("Clicked on skill Assessment assigned dropdown");
					 } catch (Exception e) {
					 test.fail("Check skill Assessment assigned dropdown xpath");
					 test.log(Status.FAIL,test.addScreenCaptureFromBase64String(screenshot.capture(driver))+ "Test Failed"); 
			         ScreenRecorderUtil.stopRecord();
					 }
		         
		         Thread.sleep(1000);
		         
		         try {
					 pjm.clickskillassessassignedtodo();
					 test.pass("Clicked on skill Assessment assigned to");
					 } catch (Exception e) {
					 test.fail("Check skill Assessment assigned to xpath");
					 test.log(Status.FAIL,test.addScreenCaptureFromBase64String(screenshot.capture(driver))+ "Test Failed"); 
			         ScreenRecorderUtil.stopRecord();
					 }
		         
		         Thread.sleep(1000);
		         
		         try {
					 pjm.setskillassesstobecompleted("2");       //send from excel
					 test.pass("Clicked on skill Assessment assigned to");
					 } catch (Exception e) {
					 test.fail("Check skill Assessment assigned to xpath");
					 test.log(Status.FAIL,test.addScreenCaptureFromBase64String(screenshot.capture(driver))+ "Test Failed"); 
			         ScreenRecorderUtil.stopRecord();
					 }
		         
		         Thread.sleep(1000);
		         
		         try {
					 pjm.clickaddskillassquest();
					 test.pass("Clicked on Add Skill Assessment ");
					 } catch (Exception e) {
					 test.fail("Check Add skill Assessment xpath");
					 test.log(Status.FAIL,test.addScreenCaptureFromBase64String(screenshot.capture(driver))+ "Test Failed"); 
			         ScreenRecorderUtil.stopRecord();
					 }
		         
		         Thread.sleep(1000);
		         
		         try {
					 pjm.clickskillassessmentfolder();
					 test.pass("Skill Assessment Folder selected ");
					 } catch (Exception e) {
					 test.fail("Check skill Assessment folder xpath");
					 test.log(Status.FAIL,test.addScreenCaptureFromBase64String(screenshot.capture(driver))+ "Test Failed"); 
			         ScreenRecorderUtil.stopRecord();
					 }
		         
		         Thread.sleep(1000);
		         
		         try {
					 pjm.clicksaveskillass();
					 test.pass("Clicked on save for selected skill assessment folder ");
					 } catch (Exception e) {
					 test.fail("Check save skill Assessment folder xpath");
					 test.log(Status.FAIL,test.addScreenCaptureFromBase64String(screenshot.capture(driver))+ "Test Failed"); 
			         ScreenRecorderUtil.stopRecord();
					 }
		         
		         Thread.sleep(3000);
		         
		/*         try {
					 pjm.clickmcqquestdropdown();
					 test.pass("Clicked on mcq questions dropdown");
					 } catch (Exception e) {
					 test.fail("Check mcq questions dropdown xpath");
					 test.log(Status.FAIL,test.addScreenCaptureFromBase64String(screenshot.capture(driver))+ "Test Failed"); 
			         ScreenRecorderUtil.stopRecord();
					 }*/
		         
		         try {
					driver.findElement(By.xpath("(//div[text()='questions'])[1]")).click();
				} catch (Exception e) {
					driver.findElement(By.xpath("(//div[text()='questions'])[4]")).click();
				}
		         
		         Thread.sleep(2000);
		         
		         try {
					 pjm.clicktotalmcqquest();
					 test.pass("No. Mcq questions selected");
					 } catch (Exception e) {
					 test.fail("Check mcq questions xpath");
					 test.log(Status.FAIL,test.addScreenCaptureFromBase64String(screenshot.capture(driver))+ "Test Failed"); 
			         ScreenRecorderUtil.stopRecord();
					 }
		         
		         Thread.sleep(2000);
		         
		      /*   try {
					 pjm.clicktfquestdropdown();
					 test.pass("Clicked on true or False questions dropdown");
					 } catch (Exception e) {
					 test.fail("Check True or False questions dropdown xpath");
					 test.log(Status.FAIL,test.addScreenCaptureFromBase64String(screenshot.capture(driver))+ "Test Failed"); 
			         ScreenRecorderUtil.stopRecord();
					 }*/
		         
		         
		         try {
					driver.findElement(By.xpath("(//div[@class=\"react-select-sm__control css-yk16xz-control\"])[1]")).click();     //xpath might change
				} catch (Exception e) {
					driver.findElement(By.xpath("(//div[@class=\"react-select-sm__control css-yk16xz-control\"])[5]")).click();
				}
		         Thread.sleep(3000);
		         
		         try {
					driver.findElement(By.xpath("(//div[text()='3'])[3]")).click();
				} catch (Exception e) {
					driver.findElement(By.xpath("(//div[text()='3'])[4]")).click();
				}
		   
		       /*  try {
					 pjm.clicktotaltfquest();
					 test.pass("No. True or False questions selected");
					 } catch (Exception e) {
					 test.fail("Check True or False questions xpath");
					 test.log(Status.FAIL,test.addScreenCaptureFromBase64String(screenshot.capture(driver))+ "Test Failed"); 
			         ScreenRecorderUtil.stopRecord();
					 }    */   
		         
		         Thread.sleep(2000);
		         
		     /*   try {
					 pjm.clicksaqquestdropdown();
					 test.pass("Clicked on saq questions dropdown");
					 } catch (Exception e) {
					 test.fail("Check saq questions dropdown xpath");
					 test.log(Status.FAIL,test.addScreenCaptureFromBase64String(screenshot.capture(driver))+ "Test Failed"); 
			         ScreenRecorderUtil.stopRecord();
					 }
		         */
		         
		         try {
						driver.findElement(By.xpath("(//div[text()='0'])[1]")).click();
					} catch (Exception e) {
						driver.findElement(By.xpath("(//div[text()='0'])[2]")).click();
					}
		         Thread.sleep(2000);   
		         
		         
		         try {
					 pjm.clicksaqquest();
					 test.pass("No. saq questions selected");
					 } catch (Exception e) {
					 test.fail("Check saq questions xpath");
					 test.log(Status.FAIL,test.addScreenCaptureFromBase64String(screenshot.capture(driver))+ "Test Failed"); 
			         ScreenRecorderUtil.stopRecord();
					 }
		         
		        
		         
		         Thread.sleep(2000);
		         
		         try {
					 pjm.clickpsyassigneedropdown();
					 test.pass("Clicked on Psy assignee dropdown");
					 } catch (Exception e) {
					 test.fail("Check psy assignee dropdown xpath");
					 test.log(Status.FAIL,test.addScreenCaptureFromBase64String(screenshot.capture(driver))+ "Test Failed"); 
			         ScreenRecorderUtil.stopRecord();
					 }
		         
		         Thread.sleep(2000);
		         
		         try {
					 pjm.clickpsyassignedtodo();
					 test.pass("Clicked on Psy assignee to do");
					 } catch (Exception e) {
					 test.fail("Check psy assignee to do xpath");
					 test.log(Status.FAIL,test.addScreenCaptureFromBase64String(screenshot.capture(driver))+ "Test Failed"); 
			         ScreenRecorderUtil.stopRecord();
					 }
		         
		         Thread.sleep(3000);
		         try {
		        	 driver.findElement(By.xpath("//input[@name='pshycometric_assesment_day']")).sendKeys("2");  //send from excel
		        	 test.pass("Entered psy to be completed");
				} catch (Exception e) {
					 test.fail("Check psy to be completed xpath");
					 test.log(Status.FAIL,test.addScreenCaptureFromBase64String(screenshot.capture(driver))+ "Test Failed"); 
			         ScreenRecorderUtil.stopRecord();
				}
		         //driver.findElement(By.xpath("//input[@name='pshycometric_assesment_day']")).sendKeys("2");
		      /*   try {
					 pjm.setpsytobecompleted("2"); //send from excel
					 test.pass("Entered psy to be completed");
					 } catch (Exception e) {
					 test.fail("Check psy to be completed xpath");
					 test.log(Status.FAIL,test.addScreenCaptureFromBase64String(screenshot.capture(driver))+ "Test Failed"); 
			         ScreenRecorderUtil.stopRecord();
					 }  */
		         
		         Thread.sleep(2000);
		         
		         try {
					 pjm.clickaddpsyquest();
					 test.pass("Clicked on Add psy questions");
					 } catch (Exception e) {
					 test.fail("Check Add psy questions xpath");
					 test.log(Status.FAIL,test.addScreenCaptureFromBase64String(screenshot.capture(driver))+ "Test Failed"); 
			         ScreenRecorderUtil.stopRecord();
					 }
		         
		         Thread.sleep(1000);
		         
		         try {
					 pjm.clickpsyassessfolder();
					 test.pass("Selected Psy Assessment Folder");
					 } catch (Exception e) {
					 test.fail("Check psy assessment folder xpath");
					 test.log(Status.FAIL,test.addScreenCaptureFromBase64String(screenshot.capture(driver))+ "Test Failed"); 
			         ScreenRecorderUtil.stopRecord();
					 }
		         
		         Thread.sleep(1000);
		         
		         try {
					 pjm.clicksavepsyass();
					 test.pass("Clicked on save for selected psy assessment folder");
					 } catch (Exception e) {
					 test.fail("Check save psy Assessment folder xpath");
					 test.log(Status.FAIL,test.addScreenCaptureFromBase64String(screenshot.capture(driver))+ "Test Failed"); 
			         ScreenRecorderUtil.stopRecord();
					 }
		         
		         Thread.sleep(1000);
		         
		         try {
					 pjm.clickpsyquestdropdown();
					 test.pass("Clicked on psy questions to be selected Dropdown");
					 } catch (Exception e) {
					 test.fail("Check psy questions dropdown xpath");
					 test.log(Status.FAIL,test.addScreenCaptureFromBase64String(screenshot.capture(driver))+ "Test Failed"); 
			         ScreenRecorderUtil.stopRecord();
					 }
		         
		         Thread.sleep(1000);
		         
		         try {
					 pjm.clicktotalpsyquest();
					 test.pass("No. Psy Assessment questions selected");
					 } catch (Exception e) {
					 test.fail("Check total psy questions xpath");
					 test.log(Status.FAIL,test.addScreenCaptureFromBase64String(screenshot.capture(driver))+ "Test Failed"); 
			         ScreenRecorderUtil.stopRecord();
					 }
		         
		         Thread.sleep(1000);
		         
		         try {
					 pjm.clickinterviewassigneedropdown();
					 test.pass("clicked on Interview assignee dropdown");
					 } catch (Exception e) {
					 test.fail("Check interview assignee dropdown xpath");
					 test.log(Status.FAIL,test.addScreenCaptureFromBase64String(screenshot.capture(driver))+ "Test Failed"); 
			         ScreenRecorderUtil.stopRecord();
					 }
		         
		         Thread.sleep(1000);
		         
		         try {
					 pjm.clickinterviewassignedto();
					 test.pass("clicked on Interview assignee");
					 } catch (Exception e) {
					 test.fail("Check interview assignee to do xpath");
					 test.log(Status.FAIL,test.addScreenCaptureFromBase64String(screenshot.capture(driver))+ "Test Failed"); 
			         ScreenRecorderUtil.stopRecord();
					 }
		         
		         Thread.sleep(1000);
		         
		         try {
					 pjm.clickhrassigneedropdown();
					 test.pass("clicked on HR assignee Drodpown");
					 } catch (Exception e) {
					 test.fail("Check HR assignee Dropdown xpath");
					 test.log(Status.FAIL,test.addScreenCaptureFromBase64String(screenshot.capture(driver))+ "Test Failed"); 
			         ScreenRecorderUtil.stopRecord();
					 }
		         
		         Thread.sleep(1000);
		         
		         try {
					 pjm.clickhrassignedto();
					 test.pass("clicked on HR assignee");
					 } catch (Exception e) {
					 test.fail("Check HR assignee xpath");
					 test.log(Status.FAIL,test.addScreenCaptureFromBase64String(screenshot.capture(driver))+ "Test Failed"); 
			         ScreenRecorderUtil.stopRecord();
					 }
		         
		         Thread.sleep(1000);
		         
		         try {
					 pjm.clicknext2();
					 test.pass("clicked on Next button to navigate to Third page");
					 } catch (Exception e) {
					 test.fail("Check Next2 xpath");
					 test.log(Status.FAIL,test.addScreenCaptureFromBase64String(screenshot.capture(driver))+ "Test Failed"); 
			         ScreenRecorderUtil.stopRecord();
					 }
		         
		         Thread.sleep(1000);
		         
		        try {
					 pjm.clickpostjob();
					 test.pass("clicked on Post job");
					 } catch (Exception e) {
					 test.fail("Check Post job xpath");
					 test.log(Status.FAIL,test.addScreenCaptureFromBase64String(screenshot.capture(driver))+ "Test Failed"); 
			         ScreenRecorderUtil.stopRecord();
					 }
		         
		         
		         test.info("Test case Execution completed successfully");
		         Thread.sleep(1000);
		         ScreenRecorderUtil.stopRecord();
}}
