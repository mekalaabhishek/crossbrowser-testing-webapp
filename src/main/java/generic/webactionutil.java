package generic;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

public class webactionutil {
	
	WebDriver driver;
	public webactionutil(WebDriver driver) {
		this.driver=driver;
	}
	
	public String getdata(String excelPath,String stname,int row,int col)
	{
		try {
		FileInputStream f=new FileInputStream(excelPath);
		Workbook book = WorkbookFactory.create(f);
		String data = book.getSheet(stname).getRow(row).getCell(col).getStringCellValue();
		return data;
		}
		catch (Exception e) {
		return null;
		}
	}
	
	
	public void titleValidate(String expectedTitle)
	{
		try
		{
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.titleContains(expectedTitle));
		Reporter.log("pass:title is matching",true);
		}
		catch (Exception e) {
		Reporter.log("fail:title is not matching",true);
		Assert.fail();
		}
		
	}
	
	public void validateElementVisibility(WebElement element)
	{
		try
		{
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOf(element));
		Reporter.log("pass:Element is visible",true);
		}
		catch (Exception e) {
		Reporter.log("fail:Element is not visible",true);
		Assert.fail();
		}
		
	}
	
	
	public void captureScreenshot(String scriptName)
	{
		TakesScreenshot t=(TakesScreenshot) driver;
		File src = t.getScreenshotAs(OutputType.FILE);
	
		File dest=new File(Basetest.userdir+"\\screenshot\\"+scriptName+".png");
		try {
			FileUtils.copyFile(src, dest);
		} catch (IOException e) {
			
		}
		
	}
				
	public void doubleclick(WebElement element)
	{
	
		Actions a=new Actions(driver);
		a.doubleClick(element).perform();
	}
	
	public void mouseover(WebElement element)
	{
	
		Actions a=new Actions(driver);
		a.moveToElement(element).perform();
	}
	
	
	
	

}
