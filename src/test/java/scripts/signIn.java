package scripts;

import java.io.FileInputStream;


import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;

import generic.Basetest;

import generic.ScreenRecorderUtil;
import generic.screenshot;
import pages.signin_PageNew;

public class signIn extends Basetest {

    @Test
    @Parameters({"browser"})
    public void loginScript(String browser) throws Exception {
    	String recordingName = "Sign_in_Script_" + browser;
        ScreenRecorderUtil.startRecord(recordingName);

        FileInputStream f = new FileInputStream(excelPath);
        Workbook book = WorkbookFactory.create(f);

        ExtentTest test = extent.createTest(" SignIn " + browser).assignAuthor("Tester name").assignCategory("Smoke").assignDevice("OS : Windows").assignCategory(browser);

        signin_PageNew ob = new signin_PageNew(driver);
        test.log(Status.INFO, "Starting Test case " + browser);

        try {
            ob.setusername(book.getSheet("Credentials").getRow(1).getCell(1).getStringCellValue());
            test.pass(MarkupHelper.createLabel("Entered username", ExtentColor.GREEN));
        } catch (Exception e) {
            test.fail(MarkupHelper.createLabel("Check username xpath", ExtentColor.RED))
                .log(Status.FAIL, test.addScreenCaptureFromBase64String(screenshot.capture(driver)) + "Test Failed"+e);

            ScreenRecorderUtil.stopRecord();
        }

        Thread.sleep(1000);
        try {
            ob.setpassword(book.getSheet("Credentials").getRow(1).getCell(2).getStringCellValue());
            test.pass(MarkupHelper.createLabel("Entered Password", ExtentColor.GREEN));
        } catch (Exception e) {
            test.fail(MarkupHelper.createLabel("Check password xpath", ExtentColor.RED))
                .log(Status.FAIL, test.addScreenCaptureFromBase64String(screenshot.capture(driver)) + "Test Failed"+e);

            ScreenRecorderUtil.stopRecord();
        }

        Thread.sleep(1000);
        try {
            ob.clicksignin();
            test.pass(MarkupHelper.createLabel("Clicked On Login Button", ExtentColor.GREEN));
        } catch (Exception e) {
            test.fail(MarkupHelper.createLabel("Check Login Button xpath", ExtentColor.RED))
                .log(Status.FAIL, test.addScreenCaptureFromBase64String(screenshot.capture(driver)) + "Test Failed"+e);

            ScreenRecorderUtil.stopRecord();
        }

        Thread.sleep(2000);
       
        test.info(MarkupHelper.createLabel("Test Completed Successfully", ExtentColor.GREEN));
        Thread.sleep(3000);
		/*
		 * if (driver.getCurrentUrl().equals("Add your URL")) {
		 * test.pass(MarkupHelper.createLabel("URL Matched", ExtentColor.GREEN)); } else
		 * { test.fail(MarkupHelper.createLabel("Wrong Credentials", ExtentColor.RED))
		 * .log(Status.FAIL,
		 * test.addScreenCaptureFromBase64String(screenshot.capture(driver)) +
		 * "Test Failed"); }
		 */

        Thread.sleep(2000);
        ScreenRecorderUtil.stopRecord();
    }
}
