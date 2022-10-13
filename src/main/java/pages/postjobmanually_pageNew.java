package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generic.webactionutil;

public class postjobmanually_pageNew {
	 webactionutil actionutil;
	 
	 
	 @FindBy(xpath = "//a[text()='Jobs & Applicants']")
	 private WebElement jobsandapplications;
	 
	 @FindBy(xpath = "//div[text()='+ Add Job'] ")  //must change the xpath when applcation is unstable  //div[@class='hidden md:flex']
	 private WebElement newjob;
	 
	 @FindBy(xpath = "//p[text()='Manual']")
	 private WebElement manual;
	 
	 @FindBy(xpath = "//input[@name='jobtitle']")
	 private WebElement jobtitle;
	 
	 @FindBy(xpath = "//input[@name='location']")
	 private WebElement location;
	 
	 @FindBy(xpath = "(//span[text()='Select'])[1]")
	 private WebElement employmenttypedropdown;
	 
	 @FindBy(xpath = "//span[text()='Full-time']")    //Can change Employment Type
	 private WebElement employmenttype;
	 
	 @FindBy(xpath = "//input[@name='no_of_openings']")
	 private WebElement totalopenings;
	 
	 @FindBy(xpath = "(//span[text()='Select'])[1]")
	 private WebElement experiencedropdown;
	 
	 @FindBy(xpath = "//span[text()='1 - 2 years']")   //can change experience
	 private WebElement experience;
	 
	 @FindBy(xpath = "(//input[@type='text'])[1]")
	 private WebElement fromsalary;
	 
	 @FindBy(xpath = "(//input[@type='text'])[2]")
	 private WebElement tosalary;
	 
	 @FindBy(xpath = "//span[text()='Select']")
	 private WebElement monthlyoranuallydropdown;
	 
	 @FindBy(xpath = "//span[text()='Monthly']")  //can change to Anually
	 private WebElement monthly;
	 
	 @FindBy(xpath = "//div[@class='ql-editor ql-blank']")
	 private WebElement jobdescription;
	 
	 @FindBy(xpath = "//p[text()='Import key skills from your job description']")
	 private WebElement addskillsfromjobdescription;
	 
	 @FindBy(xpath = "(//div[@class='p-radiobutton-box'])[1]")
	 private WebElement jobscreeningstages;
	 
	 @FindBy(xpath = "//div[text()='Next']")
	 private WebElement next1;
	 
	 @FindBy(xpath = "(//div[text()='Select...'])[1]")
	 private WebElement cvscreeningassigneedropdown;
	 
	 @FindBy(xpath = "(//div[@class='p-checkbox-box'])[1]")  //can change the name
	 private WebElement cvscreeningassignedto;
	 
	 @FindBy(xpath = "(//div[text()='Select...'])[1]")
	 private WebElement skillassessmentassigneedropdown;
	 
	 @FindBy(xpath = "(//div[@class='p-checkbox-box'])[2]")
	 private WebElement skillassesassignedto;
	 
	 @FindBy(xpath = "//input[@name='skill_assesment_day']")
	 private WebElement skillassessmenttobecompleted;
	 
	 @FindBy(xpath = "(//p[text()='Add'])[1]")
	 private WebElement addskillassquest;
	 
	 @FindBy(xpath = "//p[text()='Select']")   //must change the xpath when application is stable
	 private WebElement skillassessmentfolder;
	 
	 @FindBy(xpath = "//p[text()='Save']")
	 private WebElement saveskillass;
	 
	 @FindBy(xpath = "//*[@id=\"App-root\"]/div[7]/div/div/div/div[2]/div/div[2]/div[3]/div[2]/div[2]/div[1]/div/div[1]/div/div/div/div[1]/div")
	 private WebElement mcqquesdropdown;
	 
	 @FindBy(xpath = "(//div[text()='3'])[2]")
	 private WebElement totalmcqquest;
	 
	 @FindBy(xpath = "//*[@id=\"App-root\"]/div[7]/div/div/div/div[2]/div/div[2]/div[3]/div[2]/div[2]/div[2]/div/div[1]/div/div/div/div[1]")
	 private WebElement tfquesdropdown;
	 
	 @FindBy(xpath = "//*[@id=\"react-select-16-option-3\"]")   //*[@id="react-select-16-option-3"]
	 private WebElement totaltfquest;
	 
	 @FindBy(xpath = "(//div[@class='react-select-sm__indicator react-select-sm__dropdown-indicator css-tlfecz-indicatorContainer'])[6]")
	 private WebElement saqquesdropdown;
	 
	 @FindBy(xpath = "//div[text()='1']")
	 private WebElement totalsaqquest;
	 
	 @FindBy(xpath = "(//div[text()='Select...'])[1]")
	 private WebElement psyassigneedropdown;
	 
	 @FindBy(xpath = "(//div[@class='p-checkbox-box'])[2]")     //can change the name
	 private WebElement psyassessassignedto;
	 
	 @FindBy(xpath = "//input[@class='p-inputtext p-component']")
	 private WebElement psyassessmenttobecompleted;
	 
	 @FindBy(xpath = "(//p[text()='Add'])[2]")
	 private WebElement addpsyassquest;
	 
	 @FindBy(xpath = "(//p[text()='Select'])[1]")
	 private WebElement psyassessmentfolder;
	 
	 @FindBy(xpath = "//p[text()='Save']")
	 private WebElement savepsyass;
	 
	 @FindBy(xpath = "//div[text()='questions']")
	 private WebElement psyquestdropdown;
	 
	 @FindBy(xpath = "(//div[text()='3'])[6]")
	 private WebElement totalpsyassessquest;
	 
	 @FindBy(xpath = "//div[text()='Select...']")
	 private WebElement interviewassigneedropdown;
	 
	 @FindBy(xpath = "(//div[@class='p-checkbox-box'])[2]")
	 private WebElement interviewassignedto;
	 
	 @FindBy(xpath = "//div[text()='Select...']")
	 private WebElement hrassigneedropdown;
	 
	 @FindBy(xpath = "(//div[@class='p-checkbox-box'])[2]")
	 private WebElement hrassignedto;
	 
	 @FindBy(xpath = "//div[text()='Next']")
	 private WebElement next2;
	 
	 @FindBy(xpath = "//div[text()='Post Job']")
	 private WebElement postjob;
	 
	 public void clickjobsandapplication()
	 {
		 this.jobsandapplications.click();
	 }
	 public void clicknewjob()
	 {
		 this.newjob.click();
	 }
	 public void clickmanual()
	 {
		 this.manual.click();
	 }
	 public void setjobtitle(String jt)
	 {
		 this.jobtitle.sendKeys(jt);
	 }
	 public void setlocation(String loc)
	 {
		 this.location.sendKeys(loc);
	 }
	 public void clickemploymenttypedropdown()
	 {
		 this.employmenttypedropdown.click();
	 }
	 public void clickemploymenttype()
	 {
		 this.employmenttype.click();
	 }
	 public void settotalopenings(String openings)
	 {
		 this.totalopenings.sendKeys(openings);
	 }
	 public void clickexperiencedropdown()
	 {
		 this.experiencedropdown.click();
	 }
	 public void clickexperience()
	 {
		 this.experience.click();
	 }
	 public void setfromsalary(String fs)
	 {
		 this.fromsalary.sendKeys(fs);
	 }
	 public void settosalary(String ts)
	 {
		 this.tosalary.sendKeys(ts);
	 }
	 public void clickmonthlyoranuallydropdown()
	 {
		 this.monthlyoranuallydropdown.click();
	 }
	 public void clickmonthly()
	 {
		 this.monthly.click();
	 }
	 public void setjobdescription(String jd)
	 {
		 this.jobdescription.sendKeys(jd);
	 }
	 public void clickaddskillsfromjobdescription()
	 {
		 this.addskillsfromjobdescription.click();
	 }
	 public void clickjobscreeningstages()
	 {
		 this.jobscreeningstages.click();
	 }
	 public void clicknext1()
	 {
		 this.next1.click();
	 }
	 public void clickcvscreenassignreedrpdown()
	 {
		 this.cvscreeningassigneedropdown.click();
	 }
	 public void clickcvscreeningassignedto()
	 {
		 this.cvscreeningassignedto.click();
	 }
	 public void clickskillassessmentassigneedropdown()
	 {
		 this.skillassessmentassigneedropdown.click();
	 }
	 public void clickskillassessassignedtodo()
	 {
		 this.skillassesassignedto.click();
	 }
	 public void setskillassesstobecompleted(String satbc)
	 {
		 this.skillassessmenttobecompleted.sendKeys(satbc);
	 }
	 public void clickaddskillassquest()
	 {
		 this.addskillassquest.click();
	 }
	 public void clickskillassessmentfolder()
	 {
		 this.skillassessmentfolder.click();
	 }
	 public void clicksaveskillass()
	 {
		 this.saveskillass.click();
	 }
	 public void clickmcqquestdropdown()
	 {
		 this.mcqquesdropdown.click();
	 }
	 public void clicktotalmcqquest()
	 {
		 this.totalmcqquest.click();
	 }
	 public void clicktfquestdropdown()
	 {
		 this.tfquesdropdown.click();
	 }
	 public void clicktotaltfquest()
	 {
		 this.totaltfquest.click();
	 }
	 public void clicksaqquestdropdown()
	 {
		 this.saqquesdropdown.click();
	 }
	 public void clicksaqquest()
	 {
		 this.totalsaqquest.click();
	 }
	 public void clickpsyassigneedropdown()
	 {
		 this.psyassigneedropdown.click();
	 }
	 public void clickpsyassignedtodo()
	 {
		 this.psyassessassignedto.click();
	 }
	 public void setpsytobecompleted(String psytbc)
	 {
		 this.psyassessmenttobecompleted.click();
	 }
	 public void clickaddpsyquest()
	 {
		 this.addpsyassquest.click();
	 }
	 public void clickpsyassessfolder()
	 {
		 this.psyassessmentfolder.click();
	 }
	 public void clicksavepsyass()
	 {
		 this.savepsyass.click();
	 }
	 public void clickpsyquestdropdown()
	 {
		 this.psyquestdropdown.click();
	 }
	 public void clicktotalpsyquest()
	 {
		 this.totalpsyassessquest.click();
	 }
	 public void clickinterviewassigneedropdown()
	 {
		 this.interviewassigneedropdown.click();
	 }
	 
	 public void clickinterviewassignedto()
	 {
		 this.interviewassignedto.click();
	 }
	 public void clickhrassigneedropdown()
	 {
		 this.hrassigneedropdown.click();
	 }
	 public void clickhrassignedto()
	 {
		 this.hrassignedto.click();
	 }
	 public void clicknext2()
	 {
		 this.next2.click();
	 }
	 public void clickpostjob()
	 {
		 this.postjob.click();
	 }
	 
	 public void postjobmanually(String jt, String loc, String openings, String fs, String ts, String jd,
			 String satbc , String psytbc)
	 {
		 this.jobsandapplications.click();
		 this.newjob.click();
		 this.manual.click();
		 this.jobtitle.sendKeys(jt);
		 this.location.sendKeys(loc);
		 this.employmenttypedropdown.click();
		 this.employmenttype.click();
		 this.totalopenings.sendKeys(openings);
		 this.experiencedropdown.click();
		 this.experience.click();
		 this.fromsalary.sendKeys(fs);
		 this.tosalary.sendKeys(ts);
		 this.monthlyoranuallydropdown.click();
		 this.monthly.click();
		 this.jobdescription.sendKeys(jd);
		 this.addskillsfromjobdescription.click();
		 this.jobscreeningstages.click();
		 this.next1.click();
		 this.cvscreeningassigneedropdown.click();
		 this.cvscreeningassignedto.click();
		 this.skillassessmentassigneedropdown.click();
		 this.skillassesassignedto.click();
		 this.skillassessmenttobecompleted.sendKeys(satbc);
		 this.addskillassquest.click();
		 this.skillassessmentfolder.click();
		 this.saveskillass.click();
		 this.mcqquesdropdown.click();
		 this.totalmcqquest.click();
		 this.tfquesdropdown.click();
		 this.totaltfquest.click();
		 this.saqquesdropdown.click();
		 this.totalsaqquest.click();
		 this.psyassigneedropdown.click();
		 this.psyassessassignedto.click();
		 this.psyassessmenttobecompleted.sendKeys(psytbc);
		 this.addpsyassquest.click();
		 this.psyassessmentfolder.click();
		 this.savepsyass.click();
		 this.psyquestdropdown.click();
		 this.totalpsyassessquest.click();
		 this.interviewassigneedropdown.click();
		 this.interviewassignedto.click();
		 this.hrassigneedropdown.click();
		 this.hrassignedto.click();
		 this.next2.click();
		 this.postjob.click();
	 }
	 
	 public  postjobmanually_pageNew(WebDriver driver) {
	   		//initiialises the webelement
	   	PageFactory.initElements(driver, this);
	   	actionutil=new webactionutil(driver);
	   	}
	 
	 
	 
	 
	 
}
