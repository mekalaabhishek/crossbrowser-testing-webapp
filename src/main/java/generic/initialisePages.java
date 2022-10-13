package generic;

import org.openqa.selenium.WebDriver;

import pages.applyingjob_pageNew;

import pages.aptahrlogin_pageNew;
import pages.postjobmanually_pageNew;
import pages.psychometricassessment_pageNew;
import pages.skillassessment_pageNew;



public class initialisePages {
	
	
	public aptahrlogin_pageNew aptahrpluslogin;
    public skillassessment_pageNew skillassessment;
	public psychometricassessment_pageNew psychometricassessment;
	public postjobmanually_pageNew postjobmanually;
	public applyingjob_pageNew applyingjob;
	
	
	public initialisePages(WebDriver driver) 
	{
	this.aptahrpluslogin=new aptahrlogin_pageNew(driver);
	this.skillassessment=new skillassessment_pageNew(driver);	
	this.psychometricassessment=new psychometricassessment_pageNew(driver);
	this.postjobmanually=new postjobmanually_pageNew(driver);
	this.applyingjob=new applyingjob_pageNew(driver);
	
	
	}
	

}
