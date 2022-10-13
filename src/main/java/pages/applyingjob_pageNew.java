package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generic.webactionutil;

public class applyingjob_pageNew {
	webactionutil actionutil;
	
	@FindBy(xpath = "//a[text()='Jobs & Applicants']")
	private WebElement jobsandapplications;
	
	@FindBy(xpath = "//button[@type='button']")
	private WebElement optionsdropdown;
	
	@FindBy(xpath = "//p[text()='Copy URL']")
	private WebElement copyurl;
	
	//copied url must store 
	
	@FindBy(xpath = "//div[text()='Apply']")
	private WebElement apply;
	
	@FindBy(xpath = "//input[@name='name']")
	private WebElement fullname;
	
	@FindBy(xpath = "//input[@name='email']")
	private WebElement email;
	
	@FindBy(xpath = "//div[@class='p-dropdown p-component p-inputwrapper']")
	private WebElement countrydropdown;
	
	@FindBy(xpath = "//li[text()='India/+91']")
	private WebElement countryname;
	
	@FindBy(xpath = "//input[@name='mobile_number']")
	private WebElement mobilenumber;
	
	@FindBy(xpath = "//input[@name='your_current_location']")
	private WebElement location;
	
	@FindBy(xpath = "//input[@name='your_current_position']")
	private WebElement currentposition;
	
	@FindBy(xpath = "//input[@name='notice_period_days']")
	private WebElement noticeperiod;
	
	@FindBy(xpath = "//input[@name='relevant_experience']")
	private WebElement experience;
	
	@FindBy(xpath = "//div[@class='p-checkbox-box']")
	private WebElement checkbox;
	
	@FindBy(xpath = "//div[text()='Click here to Upload']")
	private WebElement uploadbutton;
	
	@FindBy(xpath = "//p[text()='Apply']")
	private WebElement apply1;
	
	
	public void clickjobsandapplications()
	{
		this.jobsandapplications.click();
	}
	public void clickoptionsdropdown()
	{
		this.optionsdropdown.click();
	}
	public void clickcopyurl()
	{
		this.copyurl.click();
	}
	public void clickapply()
	{
		this.apply.click();
	}
	public void setfullname(String fn)
	{
		this.fullname.sendKeys(fn);
	}
	public void setemail(String email)
	{
		this.email.sendKeys(email);
	}
	public void clickcountrydropdown()
	{
		this.countrydropdown.click();
	}
	public void clickcountry()
	{
		this.countryname.click();
	}
	public void setmobilenumber(String ph)
	{
		this.mobilenumber.sendKeys(ph);
	}
	public void setlocation(String loc)
	{
		this.location.sendKeys(loc);
	}
	
	public void setcurrentposition(String cp)
	{
		this.currentposition.sendKeys(cp);
	}
	public void setnoticeperiod(String np)
	{
		this.noticeperiod.sendKeys(np);
	}
	public void setexperience(String exp)
	{
		this.experience.sendKeys(exp);
	}
	public void clickcheckbox()
	{
		this.checkbox.click();
	}
	public void clickuploadbutton()
	{
		this.uploadbutton.click();
	}
	public void clickapply1()
	{
		this.apply1.click();
	}
	
	public void applyingjob(String fn ,String email ,String ph, String loc,String cp, String np, String exp)
	{
		this.jobsandapplications.click();
		this.optionsdropdown.click();
		this.copyurl.click();
		this.apply.click();
		this.fullname.sendKeys(fn);
		this.email.sendKeys(email);
		this.countrydropdown.click();
		this.countryname.click();
		this.mobilenumber.sendKeys(ph);
		this.location.sendKeys(loc);
		this.currentposition.sendKeys(cp);
		this.noticeperiod.sendKeys(np);
		this.experience.sendKeys(exp);
		this.checkbox.click();
		this.uploadbutton.click();
		this.apply1.click();
		
	}
	
	public  applyingjob_pageNew(WebDriver driver) {
		//initiialises the webelement
	PageFactory.initElements(driver, this);
	actionutil=new webactionutil(driver);
	}
}
