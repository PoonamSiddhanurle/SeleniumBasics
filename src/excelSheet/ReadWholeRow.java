package excelSheet;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadWholeRow {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
	FileInputStream abc=new FileInputStream("D:\\Homework\\Book1.xlsx");
	Sheet mySheet = WorkbookFactory.create(abc).getSheet("Sheet1");
	//read whole row data
	//start=0, end=2
	for(int i=0; i<=2; i++)
	{
		String value = mySheet.getRow(0).getCell(i).getStringCellValue();
		System.out.print(" "+value);
	}
	System.out.println();
	//read whole column data
	//start=0, end=3
	for(int i=0;i<=3;i++)
	{
		String value = mySheet.getRow(i).getCell(0).getStringCellValue();
		System.out.println(" "+value);
	}
	//System.out.println();
	}

}
