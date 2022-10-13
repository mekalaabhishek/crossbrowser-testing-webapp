package pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;





import generic.webactionutil;

public class aptahrlogin_pageNew  {
	webactionutil actionutil;
	
	@FindBy(xpath = "//input[@id='username_or_email']")
	private WebElement username;
	
	@FindBy(xpath = "//input[@name = 'password']")
	private WebElement password;
	
	@FindBy(xpath = "//p[text()='Login']")
	private WebElement login;
	
	public void setUserName(String un)
	{
		
			this.username.sendKeys(un);
	}
		
	public void setPassword(String pw)
	{
		
			this.password.sendKeys(pw);
	}
	public void clickLogin()
	{
		this.login.click();
		}
	public void login(String un,String pw)
	{
			this.username.sendKeys(un);  
	        this.password.sendKeys(pw);
		    this.login.click();
	}
		
	
	public  aptahrlogin_pageNew(WebDriver driver) {
		//initiialises the webelement
	PageFactory.initElements(driver, this);
	actionutil=new webactionutil(driver);
	}

	
	
	}
	

