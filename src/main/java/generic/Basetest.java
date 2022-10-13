package generic;





//import java.text.SimpleDateFormat;

import java.util.concurrent.TimeUnit;





import org.apache.commons.mail.EmailException;

import org.monte.screenrecorder.ScreenRecorder;
import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.zaproxy.clientapi.core.ClientApi;
import org.zaproxy.clientapi.core.ClientApiException;

import com.aventstack.extentreports.ExtentReports;

import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import io.github.bonigarcia.wdm.WebDriverManager;






public class Basetest {
	public static final String userdir = System.getProperty("user.dir");	
	public static final String chromekey="webdriver.chrome.driver";
	public static final String geckokey="webdriver.gecko.driver";
	public static final String chromevalue=userdir+"\\drivers\\chromedriver.exe";
	public static final String geckovalue=userdir+"\\drivers\\geckodriver.exe";
	public static final String excelPath=userdir+"\\data\\excel.xlsx";
	public static webactionutil actionutil;
	
	public static WebDriver driver;
	
	public static ExtentReports extent;
	public static ScreenRecorder screenRecorder;
	ExtentSparkReporter sparkReporter;
	//static final String ZAP_PROXY_ADDRESS ="localhost";
	//static final int ZAP_PROXY_PORT =8080;
	//static final String ZAP_API_KEY="p7jrlt9mleukff8q6its86pg67";
	
	//private ClientApi api;
	static
	{
		System.setProperty(chromekey, chromevalue);
		System.setProperty(geckokey, geckovalue);
		
	}
	
/*	@BeforeMethod
	public void setup()
	{
		String proxyserverUrl =  ZAP_PROXY_ADDRESS+":"+ZAP_PROXY_PORT;
		Proxy proxy =new Proxy();
		proxy.setHttpProxy(proxyserverUrl);
		proxy.setSslProxy(proxyserverUrl);
		
		ChromeOptions co =new ChromeOptions();
		co.setProxy(proxy);
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver(co);
		api=new ClientApi(ZAP_PROXY_ADDRESS, ZAP_PROXY_PORT, ZAP_API_KEY);
		
	}*/
	
	@BeforeTest
	public void generateReport()
	{
		
		
		 sparkReporter =new ExtentSparkReporter("AutomationReport.html");
		 
		extent = new ExtentReports();
	    extent.attachReporter(sparkReporter);	
	}
	
	
	
	
	




	@SuppressWarnings("deprecation")
	@BeforeClass 
	public void precondition()
	{
		driver=new ChromeDriver();
		actionutil=new webactionutil(driver);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://dev.apta-hr.com/auth/login");	
	}
		
		
	
	
	@AfterClass	
	public void postcondition()
	{
		
	    driver.close();
		extent.flush();
		   
		 
	}
	
/*	@AfterMethod
	public void teardown() throws ClientApiException
	{
		if(api !=null) {
			String title ="AptaHR ZAP security port";
					String template ="traditional-html";
					String description="This is Aptahr zap Securtiy test report";
					String reportfilename= "Aptahr zap report html";
					String targetfolder=System.getProperty("user.dir");
					
			api.reports.generate(title, template,null,description,null, null, null, null, null, 
					reportfilename, null, targetfolder, null);
		} 
	}*/
	
	
	@AfterSuite
	public void sendmail() throws EmailException
	{
		 Mail.sendmail();
	}
	


}


