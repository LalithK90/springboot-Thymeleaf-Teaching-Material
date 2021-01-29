package lk.lalithk90.springboot_thymelaf.pdfWithImage.service;

import com.itextpdf.text.*;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import lk.lalithk90.springboot_thymelaf.pdfAndExcel.repository.EmployeePdfAndExcelDao;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartUtils;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultPieDataset;
import org.springframework.stereotype.Service;

import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

@Service
public class PDFWithImageService {
    private final EmployeePdfAndExcelDao employeePdfAndExcelDao;

    public PDFWithImageService(EmployeePdfAndExcelDao employeePdfAndExcelDao) {
        this.employeePdfAndExcelDao = employeePdfAndExcelDao;
    }

    public List<Object[]> genderAndGenderCount() {
        System.out.println("size  " + employeePdfAndExcelDao.findByGenderAndCountByGenderAndGropByGender().size());
        employeePdfAndExcelDao.findByGenderAndCountByGenderAndGropByGender().forEach(x -> {
            System.out.println("type  " + x.getClass().getName());
            System.out.println(Arrays.toString(x));
        });
        //according to address
        employeePdfAndExcelDao.findByAddressAndCountByAddressOrderByAddress().forEach(x -> {
            System.out.println(Arrays.toString(x));
        });
        return employeePdfAndExcelDao.findByAddressAndCountByAddressOrderByAddress();
    }

    public void createPieChart(String path, List<Object[]> data) {
        DefaultPieDataset dataset = new DefaultPieDataset();
        for (Object[] objects : data) {
            dataset.setValue(objects[0].toString(), Double.parseDouble(objects[1].toString()));
        }
        JFreeChart chart = ChartFactory.createPieChart("Address Type Report", dataset, false, true, false);
        try {
            ChartUtils.saveChartAsJPEG(new File(path + "/pieChart.jpeg"), chart, 300, 300);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public ByteArrayInputStream createPDF() throws DocumentException, IOException {
        Document document;
        PdfWriter writer = null;

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        document = new Document(PageSize.A4, 15, 15, 45, 30);
        writer = PdfWriter.getInstance(document, out);
        document.open();
        Font mainFont = FontFactory.getFont("Arial", 10, BaseColor.BLACK);

        Paragraph paragraph = new Paragraph("PDF with Image", mainFont);
        paragraph.setAlignment(Element.ALIGN_CENTER);
        paragraph.setIndentationLeft(50);
        paragraph.setIndentationRight(50);
        paragraph.setSpacingAfter(10);

        PdfPTable table = new PdfPTable(4);//column amount
        table.setWidthPercentage(100);
        table.setSpacingBefore(10f);
        table.setSpacingAfter(10);

        Font tableHeader = FontFactory.getFont("Arial", 10, BaseColor.BLACK);

        float[] columnWidths = {2f, 2f, 2f, 2f};
        table.setWidths(columnWidths);

        PdfPCell address = new PdfPCell(new Paragraph("Address", tableHeader));
        pdfCellHeaderCommonStyle(address);
        table.addCell(address);

        PdfPCell count = new PdfPCell(new Paragraph("Count", tableHeader));
        pdfCellHeaderCommonStyle(count);
        table.addCell(count);

        List<Object[]> data = employeePdfAndExcelDao.findByAddressAndCountByAddressOrderByAddress();
        for (Object[] objects : data) {
            PdfPCell addressValue = new PdfPCell(new Paragraph(objects[0].toString(), tableHeader));
            pdfCellBodyCommonStyle(addressValue);
            table.addCell(addressValue);

            PdfPCell countValue = new PdfPCell(new Paragraph(objects[1].toString(), tableHeader));
            pdfCellBodyCommonStyle(countValue);
            table.addCell(countValue);
        }
        //create an image
        DefaultPieDataset dataset = new DefaultPieDataset();
        for (Object[] objects : data) {
            dataset.setValue(objects[0].toString(), Double.parseDouble(objects[1].toString()));
        }
        JFreeChart chart = ChartFactory.createPieChart("Address Type Report", dataset, false, true, false);

        //creating an Image data object
        int width = 300;
        int height = 300;
        //JFreeChart chart = getChart();
        BufferedImage bufferedImage = chart.createBufferedImage(width, height);
        Image image = Image.getInstance(writer, bufferedImage, 1.0f);
        image.setAlignment(Image.ALIGN_RIGHT);
        //image.setAbsolutePosition(450f, 10f);
        image.scalePercent(60, 50);
        document.add(image);

        document.add(paragraph);
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
