package tests;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import utilities.ExcelUtils;
import utilities.TestNGListners;
@Listeners(TestNGListners.class)
public class DataProviderTest2 {
	
	
	@DataProvider(name ="Authentications")

	  public static Object[][] Credentials() throws IOException {
		
		Object[][] testObjArray = ExcelUtils.getTableArray("path", "sheet");
		return testObjArray;

	        // The number of times data is repeated, test will be executed the same no. of times

	        // Here it will execute two times

	       // return new Object[][] { { "testuser_1", "Test@123" }, { "testuser_1", "Test@123" }};

	  }
	
	@Test(dataProvider = "Authentications")

	  public void test(String sUsername, String sPassword) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.toolsqa.com/testng/testng-data-provider-excel/");

	      System.out.println(sUsername + " "+ sPassword) ;

	  }
	
//	@TEST
//	PUBLIC VOID FAILCASE()
//	{
//		ASSERT.ASSERTEQUALS(TRUE, FALSE);
//	}

}
