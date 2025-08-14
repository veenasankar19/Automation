package Assignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseAssignment {
	
	public WebDriver driver;  // interface "WebDriver" and object "driver"
	
	 public void browserIn() { //method 'browserIn' to load the site and maximize window
		 driver = new ChromeDriver(); //implemented class Chrome is called
		 driver.get("https://selenium.qabible.in/index.php"); 
		 driver.manage().window().maximize();
	 }
	 
	 public void quitClose() { //method 'quitClose' to quit and close the chrome
		 driver.quit();
		 driver.close();
	 }
	

	public static void main(String[] args) {
		BaseAssignment base = new BaseAssignment();  // object base is created for Base class
		base.browserIn(); // method is called
		base.quitClose(); // method is called
	}

}
