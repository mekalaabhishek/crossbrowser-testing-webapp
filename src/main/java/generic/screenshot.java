package generic;


import java.io.IOException;


import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class screenshot {
	public static String capture(WebDriver driver) throws IOException
    {
      /* File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
       //File Dest = new File("src/../screenshot/" + System.currentTimeMillis()+ ".png");
       
       File Dest = new File("screenshot.png");
       
       String errflpath = Dest.getAbsolutePath();
       FileUtils.copyFile(scrFile, Dest);
   	   System.out.println(errflpath);
   	   return errflpath;*/
		TakesScreenshot newScreen = (TakesScreenshot) driver;
	    String scnShot = newScreen.getScreenshotAs(OutputType.BASE64);
	    return "data:image/jpg;base64, " + scnShot ;
	}
}
