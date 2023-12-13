package cyou.lositha.springehcacheexample.printingExample.service;

import com.itextpdf.text.*;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import cyou.lositha.springehcacheexample.employeeCrud.dao.EmployeeRepository;
import cyou.lositha.springehcacheexample.employeeCrud.entity.Employee;
import org.springframework.stereotype.Service;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;

@Service
public class PrintingCheckService {
    private final EmployeeRepository employeeDao;

    public PrintingCheckService(EmployeeRepository employeeDao) {
        this.employeeDao = employeeDao;
    }

    public ByteArrayInputStream createPDF() throws DocumentException {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        Document document = new Document(PageSize.A4, 15, 15, 45, 30);
        PdfWriter.getInstance(document, out);
        document.open();
        Font mainFont = FontFactory.getFont("Arial", 10, BaseColor.BLACK);

        Paragraph paragraph = new Paragraph("All EmployeePdfAndExcel", mainFont);
        paragraph.setAlignment(Element.ALIGN_CENTER);
        paragraph.setIndentationLeft(50);
        paragraph.setIndentationRight(50);
        paragraph.setSpacingAfter(10);
        document.add(paragraph);

        PdfPTable table = new PdfPTable(4);// column amount
        table.setWidthPercentage(100);
        table.setSpacingBefore(10f);
        table.setSpacingAfter(10);

        Font tableHeader = FontFactory.getFont("Arial", 10, BaseColor.BLACK);

        float[] columnWidths = { 2f, 2f, 2f, 2f };
        table.setWidths(columnWidths);

        PdfPCell name = new PdfPCell(new Paragraph("name", tableHeader));
        pdfCellHeaderCommonStyle(name);
        table.addCell(name);

        PdfPCell email = new PdfPCell(new Paragraph("email", tableHeader));
        pdfCellHeaderCommonStyle(email);
        table.addCell(email);

        PdfPCell mobile = new PdfPCell(new Paragraph("mobile", tableHeader));
        pdfCellHeaderCommonStyle(mobile);
        table.addCell(mobile);

        PdfPCell address = new PdfPCell(new Paragraph("address", tableHeader));
        pdfCellHeaderCommonStyle(address);
        table.addCell(address);

        for (Employee employee : employeeDao.findAll()) {
            PdfPCell nameValue = new PdfPCell(new Paragraph(employee.getName(), tableHeader));
            pdfCellBodyCommonStyle(nameValue);
            table.addCell(nameValue);

            PdfPCell emailValue = new PdfPCell(new Paragraph(employee.getEmail(), tableHeader));
            pdfCellBodyCommonStyle(emailValue);
            table.addCell(emailValue);

            PdfPCell mobileValue = new PdfPCell(new Paragraph(employee.getMobile(), tableHeader));
            pdfCellBodyCommonStyle(mobileValue);
            table.addCell(mobileValue);

            PdfPCell addressValue = new PdfPCell(new Paragraph(employee.getAddress(), tableHeader));
            pdfCellBodyCommonStyle(addressValue);
            table.addCell(addressValue);
        }

        document.add(table);
        document.close();
        return new ByteArrayInputStream(out.toByteArray());
    }

    private void pdfCellHeaderCommonStyle(PdfPCell pdfPCell) {
        pdfPCell.setBorderColor(BaseColor.BLACK);
        pdfPCell.setPaddingLeft(10);
        pdfPCell.setHorizontalAlignment(Element.ALIGN_CENTER);
        pdfPCell.setVerticalAlignment(Element.ALIGN_CENTER);
        pdfPCell.setBackgroundColor(BaseColor.DARK_GRAY);
        pdfPCell.setExtraParagraphSpace(5f);
    }

    private void pdfCellBodyCommonStyle(PdfPCell pdfPCell) {
        pdfPCell.setBorderColor(BaseColor.BLACK);
        pdfPCell.setPaddingLeft(10);
        pdfPCell.setHorizontalAlignment(Element.ALIGN_CENTER);
        pdfPCell.setVerticalAlignment(Element.ALIGN_CENTER);
        pdfPCell.setBackgroundColor(BaseColor.WHITE);
        pdfPCell.setExtraParagraphSpace(5f);
    }

}
