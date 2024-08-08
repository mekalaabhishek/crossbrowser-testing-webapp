package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generic.webactionutil;

public class signin_PageNew {
	webactionutil actionutil;
	
	@FindBy(xpath = "//input[@type='text']")
	private WebElement username;
	
	@FindBy(xpath = "//input[@type='password']")
	private WebElement password;
	
	@FindBy(xpath = "//button[@id='loginbutton']")
	private WebElement signin;
	
	
	public void setusername(String un)
	{
		this.username.sendKeys(un);
	}
	public void setpassword(String pd)
	{
		this.password.sendKeys(pd);
	}
	public void clicksignin()
	{
		this.signin.click();
	}
	
    public void signin(String un , String pd)
    {
    	this.username.sendKeys(un);
    	this.password.sendKeys(pd);
    	this.signin.click();
    }
    public  signin_PageNew(WebDriver driver) {
		//initiialises the webelement
	PageFactory.initElements(driver, this);
	actionutil=new webactionutil(driver);
	}
}
