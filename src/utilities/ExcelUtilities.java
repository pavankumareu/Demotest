package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtilities {
	File f;
	FileInputStream fis ;
	public static XSSFWorkbook wb ;
	public static XSSFSheet sh ;
	FileOutputStream fos;
	
	public void setExcelpath(String Excelpath, String sheet) throws IOException
	{
		
		f= new File(Excelpath);
		fis= new FileInputStream(f);
		wb = new XSSFWorkbook(fis);
		sh= wb.getSheet(sheet);
		
		fos = new FileOutputStream(f);
	}
	
	public int numberofrows()
	{
		int size;
		size = sh.getFirstRowNum();
		return size;
	}
	
	public String getCellData(int r, int c)
	{
		
		String data = sh.getRow(r).getCell(c).getStringCellValue();
		
		return data;
		
		
	}

	public void setCellData(int r, int c, String result) throws IOException
	{
		
		sh.getRow(r).getCell(c).setCellValue(result);
		wb.write(fos);
	}
	
	
}
