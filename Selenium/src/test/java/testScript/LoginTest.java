package testScript;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class LoginTest extends TestNGBase {
	@Test
	public void verifyWhetherUserisLoggedInWithValidCredentials() throws IOException {
		String usernameValue=ExcelUtility.getStringData(1, 0, "LoginPage");  //Data Driven Approach to fetch data from Excel sheet
		String passwordValue=ExcelUtility.getStringData(1, 1, "LoginPage");
		
		WebElement username = driver.findElement(By.xpath("//input[@id='user-name']"));
		username.sendKeys(usernameValue); //the value from excel is passed to the username textbox
		WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
		password.sendKeys(passwordValue);
		WebElement login = driver.findElement(By.xpath("//input[@id='login-button']"));
		login.click();
	}

}
