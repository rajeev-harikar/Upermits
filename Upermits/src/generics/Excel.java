package generics;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel {
	
	public static String getCellValue(String xl,String sheet,int r,int c) throws EncryptedDocumentException, InvalidFormatException, IOException
	{
		FileInputStream fis=new FileInputStream(xl);
		Workbook wb = WorkbookFactory.create(fis); 
		Cell cell=wb.getSheet(sheet).getRow(r).getCell(c);
		String cellvalue=cell.getStringCellValue();
		return cellvalue;
	}
	
	
	public static int rowCount(String xl,String sheet) throws EncryptedDocumentException, InvalidFormatException, IOException
	{
		FileInputStream fis=new FileInputStream(xl);
		Workbook wb = WorkbookFactory.create(fis);
		int rowCount = wb.getSheet(sheet).getLastRowNum();
		return rowCount;
	}

}
