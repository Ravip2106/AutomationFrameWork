package DataDrivenFramework;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FetchDataFromExcelFile {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		//LoginCredential
		
		//create the object of FileinputStream
		FileInputStream f=new FileInputStream("./src/test/resources/TestData/LoginData.xlsx");
        //open the workbook in readable mode
		Workbook book = WorkbookFactory.create(f);
		
		//get the sheet
		Sheet sheet = book.getSheet("loginCredential");
		
		//get the row
		Row row = sheet.getRow(1);
		//get the cell
		Cell cell = row.getCell(0);
		//convert into string
		System.out.println(cell.getStringCellValue());
		
		//get the 2nd cell
		Cell password = row.getCell(1);
		System.out.println(password.getStringCellValue());
		
		
	}

}
