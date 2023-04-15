package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {
	
	private static XSSFSheet ExcelWSheet;

	private static XSSFWorkbook ExcelWBook;

	private static XSSFCell Cell;

	private static XSSFRow Row;
	
	public static Object[][] getTableArray(String FilePath, String SheetName) throws IOException
	{
		String[][] tabArray = null;
		
		
		File f = new File("E:\\TestData.xlsx");
		FileInputStream fis = new FileInputStream(f);
		
		ExcelWBook = new XSSFWorkbook(fis);
		
		ExcelWSheet = ExcelWBook.getSheet("sheet1");
		
		int trows;
		int tcols;
		
		
		
		trows = ExcelWSheet.getLastRowNum();
		tcols =2;
		tabArray =new String[trows][tcols];
		int ci, cj;
		ci =0;
		
		for(int i= 1 ;i<=trows;i++, ci++ )
		{
			cj=0;
			
			for(int j =1;j<=tcols;j++, cj++)
			{
				
				tabArray[ci][cj] = ExcelWSheet.getRow(i).getCell(j).getStringCellValue();
				System.out.println(tabArray[ci][cj]);
			}
		}
		
				
		return tabArray;
		
	}

}
