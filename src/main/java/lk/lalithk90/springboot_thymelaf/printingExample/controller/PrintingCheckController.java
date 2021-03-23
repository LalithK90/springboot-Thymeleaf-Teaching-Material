package lk.lalithk90.springboot_thymelaf.printingExample.controller;



import com.itextpdf.text.DocumentException;
import lk.lalithk90.springboot_thymelaf.employeeCrud.controller.EmployeeController;
import lk.lalithk90.springboot_thymelaf.printingExample.service.PrintingCheckService;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.method.annotation.MvcUriComponentsBuilder;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;

@Controller
public class PrintingCheckController extends HttpServlet {
    private final PrintingCheckService printingCheckService;

    public PrintingCheckController(PrintingCheckService printingCheckService) {
        this.printingCheckService = printingCheckService;
    }

    //When scr called file will send to
    @GetMapping(value = "/file/{id}", produces = MediaType.APPLICATION_PDF_VALUE)
    public ResponseEntity<InputStreamResource> citiesReport(@PathVariable("id") Integer id) throws DocumentException {
        var headers = new HttpHeaders();
        headers.add("Content-Disposition", "inline; filename=citiesreport.pdf");
        System.out.println("sdfsfs "+id);
        return ResponseEntity
                .ok()
                .headers(headers)
                .contentType(MediaType.APPLICATION_PDF)
                .body(new InputStreamResource(printingCheckService.createPDF()));
    }

    @GetMapping("/fileView")
    public String fileRequest(Model model, HttpServletRequest request) {
/*        model.addAttribute("pdfFile",
                MvcUriComponentsBuilder
                        .fromMethodName(PrintingCheckController.class, "citiesReport")
                        .toUriString());   */
        model.addAttribute("pdfFile","http://localhost:8080/file/4");

        System.out.println("Host = " + request.getServerName());
        System.out.println("Port = " + request.getServerPort());

        System.out.println(MvcUriComponentsBuilder
                               .fromMethodName(PrintingCheckController.class, "citiesReport", "1")
                               .toUriString());
        model.addAttribute("redirectUrl",MvcUriComponentsBuilder
            .fromMethodName(EmployeeController.class, "giveEmployeeAddForm","")
            .toUriString());
       // System.out.println("  full "+ fullPath);
        return "pdfSilentPrint/pdfSilentPrint";
    }

    @PostMapping("/filePrint")
    public String fileRequest(@RequestParam("name") String name, RedirectAttributes redirectAttributes) {
        System.out.println(name);
        redirectAttributes.addFlashAttribute("pdfFileOne",
                MvcUriComponentsBuilder
                        .fromMethodName(PrintingCheckController.class, "citiesReport")
                        .toUriString());
        return "redirect:/fileView";
    }


}
