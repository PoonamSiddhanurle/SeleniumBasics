package excelSheet;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Exnew {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
	FileInputStream abc=new FileInputStream("D:\\Homework\\Book1.xlsx");
	//String value = WorkbookFactory.create(abc).getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue(); 
	//System.out.println(value);
	String value1 = WorkbookFactory.create(abc).getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue(); 
	System.out.println(value1);
	}

}
