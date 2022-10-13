package generic;


import java.text.SimpleDateFormat;

import java.util.Date;
import java.util.Properties;

import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;


import org.apache.commons.mail.EmailException;


public class Mail {



public static void sendmail() throws EmailException {
	// Create object of Property file
			Properties props = new Properties();

			// this will set host of server- you can change based on your requirement 
			props.put("mail.smtp.host", "smtp.office365.com");

			// set the port of socket factory 
			props.put("mail.smtp.socketFactory.port", "587");

			// set socket factory
			props.put("mail.smtp.socketFactory.class","javax.net.ssl.SSLSocketFactory");

			// set the authentication to true
			props.put("mail.smtp.auth", "true");

			props.put("mail.smtp.starttls.enable", "true");
			
			// set the port of SMTP server
			props.put("mail.smtp.port", "587");

			// This will handle the complete authentication
			Session session = Session.getDefaultInstance(props,

					new javax.mail.Authenticator() {

						protected PasswordAuthentication getPasswordAuthentication() {

						return new PasswordAuthentication("abhishek@aptagrim.com", "merforballari@123!");

						}

					});

			try {

				Date date = new Date();
				SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy kk:mm:ss");
				String formattedDate = sdf.format(date);
				// Create object of MimeMessage class
				Message message = new MimeMessage(session);

				// Set the from address
				message.setFrom(new InternetAddress("abhishek@aptagrim.com"));

				// Set the recipient address
				//message.setRecipients(Message.RecipientType.TO,InternetAddress.parse("swastik@aptagrim.com"));
				//message.setRecipients(Message.RecipientType.TO,InternetAddress.parse("sairam@aptagrim.com"));
				//message.setRecipients(Message.RecipientType.TO,InternetAddress.parse("pratik@aptagrim.com"));
				//message.setRecipients(Message.RecipientType.TO,InternetAddress.parse("lalitha.baswaraju@aptagrim.com"));
				message.setRecipients(Message.RecipientType.TO,InternetAddress.parse("nidhin@aptagrim.com"));
				
	                        // Add the subject link
				message.setSubject("AptaHR Automation Report"+" "+formattedDate);

				// Create object to add multimedia type content
				BodyPart messageBodyPart1 = new MimeBodyPart();

				// Set the body of email
				messageBodyPart1.setText("Automation Report");

				// Create another object to add another content
				MimeBodyPart messageBodyPart2 = new MimeBodyPart();

				// Mention the file which you want to send
				
				
				String filename = "AutomationReport.html";
				
				//message.setSentDate(new Date());	
				
			
				// Create data source and pass the filename
				DataSource source = new FileDataSource(filename);

				// set the handler
				messageBodyPart2.setDataHandler(new DataHandler(source));

				// set the file
				SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy kk.mm.ss");
				messageBodyPart2.setFileName(filename +" "+ dateFormat.format(new Date())+".html");

				// Create object of MimeMultipart class
				Multipart multipart = new MimeMultipart();

				// add body part 1
				multipart.addBodyPart(messageBodyPart2);

				// add body part 2
				multipart.addBodyPart(messageBodyPart1);

				// set the content
				message.setContent(multipart);

				// finally send the email
				Transport.send(message);

				System.out.println("=====Email Sent=====");

			} catch (MessagingException e) {

				throw new RuntimeException(e);

			}

		}

 
}