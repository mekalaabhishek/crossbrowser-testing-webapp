package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generic.webactionutil;

public class skillassessment_pageNew {

	webactionutil actionutil;
	
	
	@FindBy(xpath = "//a[text()='Assessments']")
	private WebElement assessments;
	
	@FindBy(xpath = "//div[@id='add_skill_assessment']")           //p[text()='+ Add assessment']
	private WebElement addassessments;
	
	@FindBy(xpath = "//input[@id='folder_name']")
	private WebElement foldername;
	
	@FindBy(xpath = "//p[text()='Create Assessment']")
	private WebElement createassessment;
	
	@FindBy(xpath = "//div[text()='MCQ']")   //div[text()='MCQ']  //a[text()='QA Automation']
	private WebElement openfolder;
	
	@FindBy(xpath = "//p[text()='+ Add questions']")
	private WebElement addquestionsmcq;
	
	@FindBy(xpath = "//p[text()='Proceed']")
	private WebElement proceedmcq;
	
	@FindBy(xpath = "//div[text()='Type your question here']")
	private WebElement mcqquestion1;

	@FindBy(xpath = "//div[@class='ql-editor ql-blank']")
	private WebElement typemcqq1;
	
	@FindBy(xpath = "//textarea[@id='optionA']")
	private WebElement q1optionA;
	
	@FindBy(xpath = "//textarea[@id='optionB']")
	private WebElement q1optionB;
	
	@FindBy(xpath = "//textarea[@id='optionC']")
	private WebElement q1optionc;
	
	@FindBy(xpath = "//textarea[@id='optionD']")
	private WebElement q1optiond;
	
	@FindBy(xpath = "(//p[@class='w-full'])[2]")
	private WebElement saveandanothermcqq1;
	
	@FindBy(xpath = "//div[@class='ql-editor ql-blank']")
	private WebElement mcqquestion2;
	
	@FindBy(xpath = "//textarea[@id='optionA']")
	private WebElement q2optionA;
	
	@FindBy(xpath = "//textarea[@id='optionB']")
	private WebElement q2optionB;
	
	@FindBy(xpath = "//textarea[@id='optionC']")
	private WebElement q2optionc;
	
	@FindBy(xpath = "//textarea[@id='optionD']")
	private WebElement q2optiond;
	
	@FindBy(xpath = "(//p[@class='w-full'])[2]")
	private WebElement saveandanothermcqq2;
	
	@FindBy(xpath = "//div[@class='ql-editor ql-blank']")
	private WebElement mcqquestion3;
	
	@FindBy(xpath = "//textarea[@id='optionA']")
	private WebElement q3optionA;
	
	@FindBy(xpath = "//textarea[@id='optionB']")
	private WebElement q3optionB;
	
	@FindBy(xpath = "//textarea[@id='optionC']")
	private WebElement q3optionc;
	
	@FindBy(xpath = "//textarea[@id='optionD']")
	private WebElement q3optiond;
	
	@FindBy(xpath = "(//p[@class='w-full'])[1]")
	private WebElement savemcqq3;
	
	@FindBy(xpath = "(//p[text()='+ Add questions'])[2]")  //if possible need to write try catch block
	private WebElement addquestiontf;
	
	
	@FindBy(xpath = "//div[text()='TF']")
	private WebElement addtf;
	
	@FindBy(xpath = "//p[text()='Proceed']")
	private WebElement proceedtf;
	
	@FindBy(xpath = "//div[text()='Type your question here']")
	private WebElement tfq1;
	
	@FindBy(xpath = "//div[@class='ql-editor ql-blank']")
	private WebElement typetfq1;
	
	@FindBy(xpath = "(//p[@class='w-full'])[2]")
	private WebElement saveandanothertfq1;
	
	@FindBy(xpath = "//div[@class='ql-editor ql-blank']")
	private WebElement tfq2;
	
	@FindBy(xpath = "(//p[@class='w-full'])[2]")
	private WebElement saveandanothertfq2;
	
	@FindBy(xpath = "//div[@class='ql-editor ql-blank']")
	private WebElement tfq3;
	
    @FindBy(xpath = "(//p[@class='w-full'])[1]")
	private WebElement savetfq3;
    
    @FindBy(xpath = "(//p[text()='+ Add questions'])[2]")  //if possible need to write try catch block
    private WebElement addquestionsaq;
    
    @FindBy(xpath = "//div[text()='SAQ']")
    private WebElement addsaq;
    
    @FindBy(xpath = "//p[text()='Proceed']")
    private WebElement proceedsaq;
    
    @FindBy(xpath = "//div[text()='Type your question here']")
    private WebElement saqq1;
    
    @FindBy(xpath = "//div[@class='ql-editor ql-blank']")
    private WebElement typesaqq1;
    
    
    @FindBy(xpath = "//div[text()='Add necessary instructions for the candidate here...']")
    private WebElement saqinstructionq1;
    
    @FindBy(xpath = "(//div[@class='ql-editor ql-blank'])[1]")
    private WebElement typesaqinstructionssaqq1;
    
    @FindBy(xpath = "//p[text()='Save']")
    private WebElement savesaqq1;
    
    public void clickassessment()
    {
    	this.assessments.click();
    }
    public void clickaddassessments()
    {
    	this.addassessments.click();
    }
    public void setfoldername(String fn)
    {
    	this.foldername.sendKeys(fn);
    }
    public void clickcreateassessment()
    {
    	this.createassessment.click();
    }
    public void clickopenfolder()
    {
    	this.openfolder.click();
    }
    public void clickaddquestionmcq()
    {
    	this.addquestionsmcq.click();
    }
    public void clickproceedmcq()
    {
    	this.proceedmcq.click();
    }
    
    //First MCQ question
    
    public void clickmcqquestion1()
    {
    	this.mcqquestion1.click();
    }
    
    public void setmcqquestion1(String mcqq1)
    {
    	this.typemcqq1.sendKeys(mcqq1);
    }
    public void setmcqq1optA(String mcqq1optA)
    {
    	this.q1optionA.sendKeys(mcqq1optA);
    }
    public void setmcqq1optB(String mcqq1optB)
    {
    	this.q1optionB.sendKeys(mcqq1optB);
    }
    public void setmcqq1optC(String mcqq1optC)
    {
    	this.q1optionc.sendKeys(mcqq1optC);
    }
    public void setmcqq1optD(String mcqq1optD)
    {
    	this.q1optiond.sendKeys(mcqq1optD);
    }
    public void clicksaveandanothermcqq1()
    {
    	this.saveandanothermcqq1.click();
    }
    
    //Second MCQ question
    
    public void setmcqquestion2(String mcqq2)
    {
    	this.mcqquestion2.sendKeys(mcqq2);
    }
    public void setmcqq2optA(String mcqq2optA)
    {
    	this.q2optionA.sendKeys(mcqq2optA);
    }
    
    public void setmcqq2optB(String mcqq2optB)
    {
    	this.q2optionB.sendKeys(mcqq2optB);
    }
    public void setmcqq2optC(String mcqq2optC)
    {
    	this.q2optionc.sendKeys(mcqq2optC);
    }
    public void setmcqq2optD(String mcqq2optD)
    {
    	this.q2optiond.sendKeys(mcqq2optD);
    }
    public void clicksaveandanothermcqq2()
    {
    	this.saveandanothermcqq2.click();
    }
	
    
    //Third MCQ Question
    
    public void setmcqquestion3(String mcqq3)
    {
    	this.mcqquestion3.sendKeys(mcqq3);
    }
    public void setmcqq3optA(String mcqq3optA)
    {
    	this.q3optionA.sendKeys(mcqq3optA);
    }
    
    public void setmcqq3optB(String mcqq3optB)
    {
    	this.q3optionB.sendKeys(mcqq3optB);
    }
    public void setmcqq3optC(String mcqq3optC)
    {
    	this.q3optionc.sendKeys(mcqq3optC);
    }
    public void setmcqq3optD(String mcqq3optD)
    {
    	this.q3optiond.sendKeys(mcqq3optD);
    }
    public void clicksavemcq3()
    {
    	this.savemcqq3.click();
    }
    
    //True or False question
    
    public void clickaddquestiontf()
    {
    	this.addquestiontf.click();
    }
    public void clickaddtf()
    {
    	this.addtf.click();
    }
    public void clickproceedtf()
    {
    	this.proceedtf.click();
    }
    
    //First true or false question
    
    public void clicktfq1()
    {
    	this.tfq1.click();
    }
    
    public void settfq1(String tfq1)
    {
    	this.typetfq1.sendKeys(tfq1);
    }
    public void clicksaveandanothertfq1()
    {
    	this.saveandanothertfq1.click();
    }
    
    //Second true or false question
    public void settfq2(String tfq2)
    {
    	this.tfq2.sendKeys(tfq2);
    }
    
    public void clicksaveandanothertfq2()
    {
    	this.saveandanothertfq2.click();
    }
    
  //Third true or false question
    public void settfq3(String tfq3)
    {
    	this.tfq3.sendKeys(tfq3);
    }
    public void clicksavetfq3()
    {
    	this.savetfq3.click();
    }
    
    //SAQ question
    public void clickaddquestionsaq()
    {
    	this.addquestionsaq.click();
    }
    
    public void clickaddsaq()
    {
    	this.addsaq.click();
    }
    
    public void clickproceedsaq()
    {
    	this.proceedsaq.click();
    }
	
    //First SAQ Question
    
    public void clicksaqq1()
    {
    	this.saqq1.click();
    }
    public void setsaqq1(String saqq1)
    {
    	this.typesaqq1.sendKeys(saqq1);
    }
    
    public void clicksaqinstructionssaqq1()
    {
    	this.saqinstructionq1.click();
    }
    public void setinstructionssaqq1(String instsaqq1)
    {
    	this.typesaqinstructionssaqq1.sendKeys(instsaqq1);
    }
    
    public void clicksavesaqq1()
    {
    	this.savesaqq1.click();
    }
    
    public void skillassessment(String fn ,
    		String mcqq1 ,String mcqq1optA ,String mcqq1optB ,String mcqq1optC ,String mcqq1optD ,
    		String mcqq2 ,String mcqq2optA ,String mcqq2optB ,String mcqq2optC ,String mcqq2optD,
    		String mcqq3 ,String mcqq3optA ,String mcqq3optB ,String mcqq3optC ,String mcqq3optD ,
    		String tfq1 ,String tfq2,String tfq3,
    		String saqq1 , String instsaqq1)
    {
    	
    	this.assessments.click();
    	this.addassessments.click();
    	this.foldername.sendKeys(fn);
    	this.createassessment.click();
    	this.openfolder.click();
    	this.addquestionsmcq.click();
    	this.proceedmcq.click();
    	
    	//First MCQ Question
    	this.mcqquestion1.click();
    	this.typemcqq1.sendKeys(mcqq1);
    	this.q1optionA.sendKeys(mcqq1optA);
    	this.q1optionB.sendKeys(mcqq1optB);
    	this.q1optionc.sendKeys(mcqq1optC);
    	this.q1optiond.sendKeys(mcqq1optD);
    	this.saveandanothermcqq1.click();
    	
    	//Second MCQ Question
    	this.mcqquestion2.sendKeys(mcqq2);
    	this.q2optionA.sendKeys(mcqq2optA);
    	this.q2optionB.sendKeys(mcqq2optB);
    	this.q2optionc.sendKeys(mcqq2optC);
    	this.q2optiond.sendKeys(mcqq2optD);
    	this.saveandanothermcqq2.click();
    	
    	//Third MCQ Question
    	this.mcqquestion3.sendKeys(mcqq3);
    	this.q3optionA.sendKeys(mcqq3optA);
    	this.q3optionB.sendKeys(mcqq3optB);
    	this.q3optionc.sendKeys(mcqq3optC);
    	this.q3optiond.sendKeys(mcqq3optD);
    	this.savemcqq3.click();
    	
    	this.addquestiontf.click();
    	this.addtf.click();
    	this.proceedtf.click();
    	
    	//First TF Question
    	this.tfq1.click();
    	this.typetfq1.sendKeys(tfq1);
    	this.saveandanothertfq1.click();
    	
    	//Second TF Question
    	this.tfq2.sendKeys(tfq2);
    	this.saveandanothertfq2.click();
    	
    	//Third TF Question
    	this.tfq3.sendKeys(tfq3);
    	this.savetfq3.click();
    	
    	
    	this.addquestionsaq.click();
    	this.addsaq.click();
    	this.proceedsaq.click();
    	
    	
    	//First SAQ Question
    	this.saqq1.click();
    	this.typesaqq1.sendKeys(saqq1);
    	this.saqinstructionq1.click();
    	this.typesaqinstructionssaqq1.sendKeys(instsaqq1);
    	this.savesaqq1.click();
    }
	
	
    public skillassessment_pageNew(WebDriver driver) {
		//initiialises the webelement
	PageFactory.initElements(driver, this);
	actionutil=new webactionutil(driver);
	}
	
	
	
	
	
}
