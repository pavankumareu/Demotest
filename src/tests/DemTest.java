package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import utilities.TestNGListners;
@Listeners(TestNGListners.class)
public class DemTest {

	@Test
	public void tests()
	{

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.toolsqa.com/testng/testng-data-provider-excel/");
	}

}
