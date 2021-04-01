package lk.lalithk90.springboot_thymelaf.final_class.util.test;


import lk.lalithk90.springboot_thymelaf.final_class.util.service.EmailService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

  private final EmailService emailService;

  public TestController(EmailService emailService) {
    this.emailService = emailService;
  }

  @GetMapping( "/message" )
  public void sendMailTo(@RequestParam( "message" ) String message) {
    String[] mails = {"asakahatapitiya@gmail.com"};
    /*{"nilangakrishan123@gmail.com",
        "hasi.munasinghe123@gmail.com",
        "masindunil@gmail.com",
        "tharaka19940106@gmail.com",
        "dulanjana73@gmail.com",
        "Sumudupereera@gmail.com",
        "Isuripiyumali@gmail.com",
        "sashisithara@gmail.com",
        "ssgamagedara@gmail.com",
        "Sanodya1998@gmail.com",
        "ywickramaarachchi.96@gmail.com",
        "sanimesha11@gmail.com",
        "sadanimalsh@gmail.com",
        "Tharindunuwa222@gmail.com",
        "malikarasadarisubasingha@gmail.com",
        "tharumuthu1234@gmail.com",
        "fprimalka@gmail.com",
        "malee.koshala@gmail.com",
        "airportprasad@gmail.com",
        "ssrabesundara92@gmail.com",
        "dulanindeewara@gmail.com",
        "ktghansamali@gmail.com",
        "jananianut@gmail.com"};*/
    System.out.println(message + "    message");
    for ( String mail : mails ) {
      emailService.sendEmail(mail, "Kela wela inne", message);

    }
  }
}
