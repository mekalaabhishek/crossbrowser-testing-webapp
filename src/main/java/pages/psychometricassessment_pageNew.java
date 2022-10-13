package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generic.webactionutil;

       public class psychometricassessment_pageNew {
    	   webactionutil actionutil;

       @FindBy(xpath = "//a[text()='Assessments']")
       private WebElement assessments;
       
       @FindBy(xpath = "//li[text()='Psychometric Assessment']")
       private WebElement psychometricassessment;
       
       @FindBy(xpath = "//div[@id='add_psy_assessment']")
       private WebElement addpsyassessment;
       
       @FindBy(xpath = "//input[@id='folder_name']")
       private WebElement foldername;
       
       @FindBy(xpath = "//p[text()='Create Assessment']")
       private WebElement createassessment;
       
       @FindBy(xpath = "(//p[text()='QA'])[1]")     //Must change the Xpath when url is stable
       private WebElement Openfolder;
       
       @FindBy(xpath = "//p[text()='+ Add Questions']")
       private WebElement addquestions1;
       
       @FindBy(xpath = "//textarea[@id='name']")
       private WebElement question1;
       
       @FindBy(xpath = "//p[text()='Save']")
       private WebElement save1;
       
       @FindBy(xpath = "//p[text()='+ Add Questions']")
       private WebElement addquestions2;
       
       @FindBy(xpath = "//textarea[@id='name']")
       private WebElement question2;
       
       @FindBy(xpath = "//p[text()='Save']")
       private WebElement save2;
       
       @FindBy(xpath = "//p[text()='+ Add Questions']")
       private WebElement addquestions3;
       
       @FindBy(xpath = "//textarea[@id='name']")
       private WebElement question3;
       
       @FindBy(xpath = "//p[text()='Save']")
       private WebElement save3;
       
       public void clickassessments()
       {
    	   this.assessments.click();
       }
       public void clickpsyassessment()
       {
    	   this.psychometricassessment.click();
       }
       public void clickaddpsyassessment()
       {
    	   this.addpsyassessment.click();
       }
       public void setfoldername(String fn)
       {
    	   this.foldername.sendKeys(fn);
       }
       public void clickcreateassessment()
       {
    	   this.createassessment.click();
       }
       public void clicktoopenfolder()
       {
    	   this.Openfolder.click();
       }
       public void clickaddquestion1()
       {
    	   this.addquestions1.click();
       }
       public void setquestion1(String question1)
       {
    	   this.question1.sendKeys(question1);
       }
       public void clicksave1()
       {
    	   this.save1.click();
       }
       public void clickaddquestion2()
       {
    	   this.addquestions2.click();
       }
       public void setquestion2(String question2)
       {
    	   this.question2.sendKeys(question2);
       }
       public void clicksave2()
       {
    	   this.save2.click();
       }
       public void clickaddquestion3()
       {
    	   this.addquestions3.click();
       }
       public void setquestion3(String question3)
       {
    	   this.question3.sendKeys(question3);
       }
       public void clicksave3()
       {
    	   this.save3.click();
       }
       
       public void psychometricassessment(String fn,String question1, String question2 , String question3)
       {
    	   this.assessments.click();
    	   this.psychometricassessment.click();
    	   this.addpsyassessment.click();
    	   this.foldername.sendKeys(fn);
    	   this.createassessment.click();
    	   this.Openfolder.click();
    	   this.addquestions1.click();
    	   this.question1.sendKeys(question1);
    	   this.save1.click();
    	   this.addquestions2.click();
    	   this.question2.sendKeys(question2);
    	   this.save2.click();
    	   this.addquestions3.click();
    	   this.question3.sendKeys(question3);
    	   this.save3.click();
    	   
       }
       
       public  psychometricassessment_pageNew(WebDriver driver) {
   		//initiialises the webelement
   	PageFactory.initElements(driver, this);
   	actionutil=new webactionutil(driver);
   	}
}
