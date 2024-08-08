package generic;

import org.openqa.selenium.WebDriver;


import pages.signin_PageNew;

public class initialisePages {
	
	public signin_PageNew signin;
  
	
	public initialisePages(WebDriver driver) 
	{
	this.signin = new signin_PageNew(driver);
	}
	

}
