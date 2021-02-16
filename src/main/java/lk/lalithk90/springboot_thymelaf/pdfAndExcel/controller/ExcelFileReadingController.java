package lk.lalithk90.springboot_thymelaf.pdfAndExcel.controller;

import lk.lalithk90.springboot_thymelaf.pdfAndExcel.entity.EmployeePdfAndExcel;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.io.IOException;
@Controller
@RequestMapping("/excelFileReading")
public class ExcelFileReadingController {
  @PostMapping( "/cidcrdsis" )
  public String saveResult(@ModelAttribute EmployeePdfAndExcel employeePdfAndExcel) throws IOException {
    //todo 1. need to find applicant using nic

    // 2. result get and convert to upper case and validate
    // 3. before save need to check result already entered or not
    // 4. if applicant pass all test he or she was eligible to interview two
    int i = 0;
    //Creates a workbook object from the uploaded excelfile
    HSSFWorkbook workbook = new HSSFWorkbook(employeePdfAndExcel.getMultipartFile().getInputStream());
    //Creates a worksheet object representing the first sheet
    HSSFSheet worksheet = workbook.getSheetAt(0);
    //Reads the data in excel file until last row is encountered
    while ( i < worksheet.getLastRowNum() ) {
      //Creates an object for the Candidate  Model
      EmployeePdfAndExcel employeePdfAndExcelOne = new EmployeePdfAndExcel();
      //Creates an object representing a single row in excel
      HSSFRow row = worksheet.getRow(i++);
      //Sets the Read data to the model class
/*      candidate.setCandidateId((int) row.getCell(0).getNumericCellValue());
      candidate.setName(row.getCell(1).getStringCellValue());
      candidate.setAddress(row.getCell(2).getStringCellValue());
      candidate.setEmailId(row.getCell(3).getStringCellValue());
      candidate.setPinCode((int) row.getCell(4).getNumericCellValue());
      candidate.setAboutCandidate(row.getCell(5).getStringCellValue());
      */
      //Sends the model object to service layer for validation,
      //data processing and then to persist
      //iCandidateService.saveCandidate(candidate);
    }
    return "redirect:/interviewManage/cidcrdsis";
  }
}
