package tests;

import java.io.IOException;

import utilities.Constants;
import utilities.ExcelUtilities;

public class Samtest {

	
	
	
	public static void main(String[] args) throws IOException {
		ExcelUtilities eu = new ExcelUtilities();
		eu.setExcelpath(Constants.Path_TestData+Constants.File_TestData, "sheet1");
		System.out.println(eu.numberofrows());
		
	}
	
}
