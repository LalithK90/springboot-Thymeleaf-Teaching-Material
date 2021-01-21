package lk.lalithk90.springbootthymelaf.printingExample.controller;



import com.itextpdf.text.DocumentException;
import lk.lalithk90.springbootthymelaf.printingExample.service.PrintingCheckService;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.method.annotation.MvcUriComponentsBuilder;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpServlet;

@Controller
public class PrintingCheckController extends HttpServlet {
    private final PrintingCheckService printingCheckService;

    public PrintingCheckController(PrintingCheckService printingCheckService) {
        this.printingCheckService = printingCheckService;
    }

    //When scr called file will send to
    @GetMapping(value = "/file", produces = MediaType.APPLICATION_PDF_VALUE)
    public ResponseEntity<InputStreamResource> citiesReport() throws DocumentException {
        var headers = new HttpHeaders();
        headers.add("Content-Disposition", "inline; filename=citiesreport.pdf");

        return ResponseEntity
                .ok()
                .headers(headers)
                .contentType(MediaType.APPLICATION_PDF)
                .body(new InputStreamResource(printingCheckService.createPDF()));
    }

    @GetMapping("/fileView")
    public String fileRequest(Model model) {
        model.addAttribute("pdfFile",
                MvcUriComponentsBuilder
                        .fromMethodName(PrintingCheckController.class, "citiesReport")
                        .toUriString());
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
