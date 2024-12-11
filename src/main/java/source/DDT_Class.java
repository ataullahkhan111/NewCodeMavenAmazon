package source;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.util.NumberToTextConverter;

public class DDT_Class {


	public void newDDT() throws EncryptedDocumentException, IOException
	{
		
	FileInputStream f1 = new FileInputStream("C:\\Users\\ASUS\\eclipse-workspace\\SeleniumAmazonProject\\src\\main\\java\\source\\DataInSheet");
		Workbook w1 = WorkbookFactory.create(f1);
		String Un = NumberToTextConverter.toText(w1.getSheet("login").getRow(1).getCell(0).getNumericCellValue());
		String pwd =  w1.getSheet("login").getRow(1).getCell(1).getStringCellValue();

	}
	
	
}
