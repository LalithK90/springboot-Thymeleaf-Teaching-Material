package cyou.lositha.springehcacheexample.final_class.util.service;

import org.springframework.mail.MailException;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.stereotype.Service;

@Service
public class EmailService {

  public void sendEmail(String receiverEmail, String subject, String message) throws MailException {
    SimpleMailMessage mailMessage = new SimpleMailMessage();

    try {
      mailMessage.setTo(receiverEmail);
      mailMessage.setFrom("-(Kela wela inne  - (not reply))");
      mailMessage.setSubject(subject);
      mailMessage.setText(message);

      // javaMailSender.send(mailMessage);
    } catch (Exception e) {
      System.out.println("Email Exception " + e.toString());
    }
  }

}
