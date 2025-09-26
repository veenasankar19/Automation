package testScript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestNGBase {
	public WebDriver driver; //driver is the object of the interface "WebDriver"
	
	@BeforeMethod //driver should be invoked before each test case is executed
	public void browserInitializer() { 
		driver = new ChromeDriver(); 
		driver.get("https://www.saucedemo.com/v1/"); // the link to test the given site is given in driver.get
		driver.manage().window().maximize(); 
	}
	
	@AfterMethod //after executing the test cases,the browser should be closed
	public void quitAndClose() { 
		driver.close();
		driver.quit();
	}
}
