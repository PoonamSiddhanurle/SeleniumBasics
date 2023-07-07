package excelSheet;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Ex3 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
	FileInputStream myfile=new FileInputStream("D:\\Homework\\Book1.xlsx");
	Sheet mySheet = WorkbookFactory.create(myfile).getSheet("Sheet1");
	Row myRow = mySheet.getRow(0);
	Cell myCell = myRow.getCell(0);
	CellType mycellType = myCell.getCellType();
	System.out.println("Data type is "+mycellType);
	System.out.println(myCell.getStringCellValue());
	}

}
