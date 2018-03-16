package com.fb.services;

import javax.annotation.Resource;
import javax.ejb.Stateless;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
@Stateless
public class EmailService {
//	@Resource(name = "java:jboss/mail/Custom")
	/*private Session session;

	public void send(String addresses, String topic, String textMessage) {

		try {
			Message message = new MimeMessage(session);
			// message.setRecipients(Message.RecipientType.TO,
			// InternetAddress.parse(addresses));
			message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(addresses));
			message.setSubject(topic);
			message.setText(textMessage);

			Transport.send(message);
		} catch (MessagingException e) {
			e.printStackTrace();
			System.out.println("\n\n\nMail not send...........!!!!!!!!!!!!!!!!!!!!!!!");
		}
	}*/


}
