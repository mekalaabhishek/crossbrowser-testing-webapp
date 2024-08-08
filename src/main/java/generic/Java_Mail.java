package generic;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import org.apache.commons.mail.*;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.Test;

public class Java_Mail extends Basetest {
	
    public static void sendmail() throws EmailException {
    	
    	
  
		
		
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy kk:mm:ss");
        String formattedDate = sdf.format(date);
        
        // Create the attachment
        EmailAttachment attachment = new EmailAttachment();
        attachment.setPath("Report Path");
        attachment.setDisposition(EmailAttachment.ATTACHMENT);
        attachment.setDescription("CrossBrowser" + " " + formattedDate + ".html");
        attachment.setName("CrossBrowser");

        // Create the email message
        HtmlEmail email = new HtmlEmail();
        email.setHostName("Hostname");     
        email.setSmtpPort(465);
        email.setAuthenticator(new DefaultAuthenticator("Email", "Password"));
        email.setSSLOnConnect(true);
        email.setFrom("from email");
        email.setSubject("CB_Automation Report" + " " + formattedDate);
        
        Set<String> uniqueBrowsersUsed = new HashSet<>(browserList);
        String browsersUsed = String.join(", ", uniqueBrowsersUsed);
        
        String emailBody = "<html>"
                + "<body>"
                + "<h3>Cross Browser Automation Report</h3>"
                + "<p><strong>Total Scripts: </strong>" + totalTestScripts + "</p>"
                + "<p><strong>Pass: </strong>" + P_Percentage + "%</p>"
                + "<p><strong>Fail: </strong>" + F_Percentage + "%</p>"
                + "<p><strong>Passed Scripts: </strong>" + P_Scrips + "</p>"
                + "<p><strong>Failed Scripts: </strong>" + F_Scripts + "</p>"
                + "<p><strong>Browsers Used: </strong>" + browsersUsed + "</p>"
                + emailTable
                + "<h4>Script Details if failed:</h4>"
                + detailedResults
                + "<p>Please find the attachment for the detailed report...</p>"
                + "</body>"
                + "</html>";

        email.setHtmlMsg(emailBody);

        email.addTo("To email ID");
       
      
        // Add the attachment
        email.attach(attachment);

        // Send the email
        
        	email.send();
		
        
        System.out.println("Check your Email Buddy");
    	
}}