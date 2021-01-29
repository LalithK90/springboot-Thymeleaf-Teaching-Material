package lk.lalithk90.springboot_thymelaf.pdfWithImage.controller;

import com.itextpdf.text.DocumentException;
import lk.lalithk90.springboot_thymelaf.pdfWithImage.service.PDFWithImageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.ServletContext;
import java.io.IOException;
import java.util.List;

@Controller
public class PDFWithImageController {
    @Autowired
    ServletContext servletContext;
    private final PDFWithImageService pdfWithImageService;

    public PDFWithImageController(PDFWithImageService pdfWithImageService) {
        this.pdfWithImageService = pdfWithImageService;
    }

    @GetMapping("/pdfWithImage")
    public String createImage(){
        pdfWithImageService.genderAndGenderCount();
        return "pdfWithImage/pdfWithImage";
    }

    @GetMapping("/generateImage")
    public String viewImage(){
        List<Object[]> data = pdfWithImageService.genderAndGenderCount();
        String path = servletContext.getRealPath("/");
        pdfWithImageService.createPieChart(path,data);

        return "pdfWithImage/pdfWithImage";
    }

    @GetMapping(value = "/pdfWithImageFile", produces = MediaType.APPLICATION_PDF_VALUE)
    public ResponseEntity<InputStreamResource> citiesReport() throws DocumentException, IOException {
        var headers = new HttpHeaders();
        headers.add("Content-Disposition", "inline; filename=citiesreport.pdf");

        return ResponseEntity
                .ok()
                .headers(headers)
                .contentType(MediaType.APPLICATION_PDF)
                .body(new InputStreamResource(pdfWithImageService.createPDF()));
    }
}
