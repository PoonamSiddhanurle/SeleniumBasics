package excelSheet;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelEg1 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
	//create object of fileInput String
		FileInputStream myfile=new FileInputStream("D:\\Homework\\Book1.xlsx");
		//create object of WorkBook factory 
		
		//String value = WorkbookFactory.create(myfile).getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
		//System.out.println(value);
		
		//String value1=WorkbookFactory.create(myfile).getSheet("Sheet1").getRow(0).getCell(1).getStringCellValue();
		//System.out.println(value1);
		
		double value2=WorkbookFactory.create(myfile).getSheet("Sheet1").getRow(1).getCell(0).getNumericCellValue();
		System.out.println(value2);
		
		//boolean value3 = WorkbookFactory.create(myfile).getSheet("Sheet1").getRow(1).getCell(1).getBooleanCellValue();
		//System.out.println(value3);
	}

}
