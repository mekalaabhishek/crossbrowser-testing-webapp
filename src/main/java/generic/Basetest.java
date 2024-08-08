package generic;

import java.time.Duration;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.commons.mail.EmailException;
import org.monte.screenrecorder.ScreenRecorder;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.model.ReportStats;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.aventstack.extentreports.reporter.configuration.ViewName;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.config.OperatingSystem;

public class Basetest {
    public static final String userdir = System.getProperty("user.dir");
    public static final String excelPath = userdir + "\\documents\\Data.xlsx";

    

    public static webactionutil actionutil;

    public static WebDriver driver;

    public static ExtentReports extent;
    public static ScreenRecorder screenRecorder;
    ExtentSparkReporter sparkReporter;

    public static String browser;
    public static List<String> browserList = new ArrayList<>();
    public Map<Status, Float> Parent_percentage;
    Status key;
    public static ReportStats Stats;
    public static String Pass;
    public static String P_Percentage;
    public static String Fail;
    public static String F_Percentage;

    public static String T_Pass;
    public static String P_Scrips;
    public static String T_Fail;
    public static String F_Scripts;

    public static int totalTestScripts;
    public static List<com.aventstack.extentreports.model.Test> testList;
    public static String body = "";
    public static String emailTable = "";
    public static String detailedResults = "";

    public static List<Map<String, Object>> testResultsList;

    static {
        WebDriverManager.chromedriver().operatingSystem(OperatingSystem.WIN).setup();
        WebDriverManager.firefoxdriver().operatingSystem(OperatingSystem.WIN).setup();
        WebDriverManager.edgedriver().operatingSystem(OperatingSystem.WIN).setup();
        System.setProperty("webdriver.http.factory", "jdk-http-client");
    }

    @BeforeSuite
    public void generateReport() {
        sparkReporter = new ExtentSparkReporter("CrossBrowser_AutomationReport.html").viewConfigurer().viewOrder().as(new ViewName[] 
        {ViewName.DASHBOARD, ViewName.TEST, ViewName.CATEGORY}).apply();

        sparkReporter.config().setTheme(Theme.DARK);
        extent = new ExtentReports();
        extent.attachReporter(sparkReporter);
        extent.setSystemInfo("Project", "Your Project");
        extent.setSystemInfo("Environment", "QA Environment");
    }

    @BeforeClass
    @Parameters({"browser"})
    public void initializeDriver(String browser) throws Exception {
        if (browser.equalsIgnoreCase("chrome")) {
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("firefox")) {
            driver = new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("edge")) {
            driver = new EdgeDriver();
        } else {
            throw new Exception("Incorrect Browser");
        }
        browserList.add(browser);
        driver.get("https://www.facebook.com/login/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().window().maximize();
    }

    @AfterClass
    public void postcondition() {
        // Quit the WebDriver instance to close all browser windows
        driver.quit();
        
        // Flush the ExtentReports instance to ensure all information is written to the report
        extent.flush();

        // Get statistics from the ExtentReports instance
        Stats = extent.getStats();
        Parent_percentage = Stats.getParentPercentage();
        
        // Iterate over Parent_percentage to extract pass and fail percentages
        for (Map.Entry<Status, Float> details : Parent_percentage.entrySet()) {
            Status key = details.getKey();
            Float value = details.getValue();
            
            // Set Pass and Pass Percentage variables if the status is PASS
            if (key.equals(Status.PASS)) {
                Pass = key.toString();
                P_Percentage = value.toString();
            }
            
            // Set Fail and Fail Percentage variables if the status is FAIL
            if (key.equals(Status.FAIL)) {
                Fail = key.toString();
                F_Percentage = value.toString();
            }
        }

        // Get the total number of passed and failed scripts from the Stats
        Map<Status, Long> Total_Scripts = Stats.getParent();
        long passedScripts = 0;
        long failedScripts = 0;
        
        // Iterate over Total_Scripts to count passed and failed scripts
        for (Map.Entry<Status, Long> details : Total_Scripts.entrySet()) {
            Status key = details.getKey();
            Long value = details.getValue();
            
            // Set passedScripts and corresponding variables if the status is PASS
            if (key.equals(Status.PASS)) {
                passedScripts = value;
                T_Pass = key.toString();
                P_Scrips = value.toString();
            }
            
            // Set failedScripts and corresponding variables if the status is FAIL
            if (key.equals(Status.FAIL)) {
                failedScripts = value;
                T_Fail = key.toString();
                F_Scripts = value.toString();
            }
        }

        // Calculate the total number of test scripts
        totalTestScripts = (int) (passedScripts + failedScripts);
        
        // Calculate the pass percentage
        double passPercentage = (double) passedScripts / totalTestScripts * 100;

        // Generate an HTML table for email reporting
        emailTable = "<table border='1'>" +
                "<tr>" +
                "<th>Total Scripts</th>" +
                "<th>Passed Scripts</th>" +
                "<th>Failed Scripts</th>" +
                "<th>Pass Percentage</th>" +
                "</tr>" +
                "<tr>" +
                "<td>" + totalTestScripts + "</td>" +
                "<td>" + passedScripts + "</td>" +
                "<td>" + failedScripts + "</td>" +
                "<td>" + String.format("%.2f%%", passPercentage) + "</td>" +
                "</tr>" +
                "</table>";

        // Print summary to console
        System.out.println("--------------------------------------------");
        System.out.printf("| %-15s | %-15s | %-15s | %-15s |\n", "Total Scripts", "Passed Scripts", "Failed Scripts", "Pass Percentage");
        System.out.printf("| %-15d | %-15d | %-15d | %-15.2f%% |\n", totalTestScripts, passedScripts, failedScripts, passPercentage);

        // Get the list of tests from the ExtentReports instance
        testList = extent.getReport().getTestList();

        // Initialize a string to store detailed results for email reporting
        detailedResults = "";

        // Initialize a Set to track unique failed scripts
        Set<String> failedScriptsSet = new HashSet<>();

        // Check if there were any failed scripts
        if (failedScripts == 0) {
            System.out.println("No failed scripts. All scripts passed successfully!");
            detailedResults += "<p>No failed scripts. All scripts passed successfully!</p>";
        } else {
            // Iterate over the testList to find and report details of failed scripts
            for (com.aventstack.extentreports.model.Test test : testList) {
                if (test.getStatus() == Status.FAIL) {
                    String Scripts_Name = test.getName();
                    String testBrowser = Scripts_Name.substring(Scripts_Name.lastIndexOf("on") + 2);

                    // Check if the script name is not already in the Set
                    if (!failedScriptsSet.contains(Scripts_Name)) {
                        failedScriptsSet.add(Scripts_Name);

                        // Print details of the failed script to console
                        System.out.println("--------------------------------------------");
                        System.out.println("Failed Script Details:");
                        System.out.println("Script Name: " + Scripts_Name);
                        System.out.println("Browser: " + testBrowser);

                        // Append details of the failed script to detailedResults for email reporting
                        detailedResults += "<p>Script Name: " + Scripts_Name + " | Browser: " + testBrowser + "</p>";
                    }
                }
            }
        }
    }

    @AfterSuite
    public void Sendmail() throws EmailException {
        try {
            Java_Mail.sendmail();
        } catch (Exception e) {
        	e.printStackTrace();
            System.err.println("Error occurred while sending email: " + e.getMessage());
        }}
}
