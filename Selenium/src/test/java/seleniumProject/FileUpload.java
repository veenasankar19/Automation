package seleniumProject;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class FileUpload extends Base {
	public void fileUploadUsingSendKeys() {
		//fileUploadUsingSendKeys is done using mouse actions
		
		driver.navigate().to("https://demo.guru99.com/test/upload/");
		//src/test/java--Shown In--Project explorer
		//Before doing this the file to be uploaded should be copied and pasted to the "resources" folder 
		//To copy the path for line 13; Press Shift and Right Click on File in resources folder--Choose "Copy as Path"
		WebElement uploadButton = driver.findElement(By.xpath("//input[@id='uploadfile_0']"));
		uploadButton.sendKeys("C:\\Users\\VEENA S\\git\\Automation\\Selenium\\src\\test\\resources\\Selenium Test Sample.pdf"); //to transfer data "file" to element "uploadButton"
		WebElement clickCheckBox = driver.findElement(By.xpath("//input[@id='terms']"));
		clickCheckBox.click();
		WebElement submitButton = driver.findElement(By.xpath("//button[@id='submitbutton']"));
		submitButton.click();
	}
	public void fileUploadUsingRobot() throws AWTException {
		//fileUploadUsingRobot method is done with keypoard actions
		driver.navigate().to("https://www.ilovepdf.com/pdf_to_word");
		WebElement upload = driver.findElement(By.id("pickfiles"));
		upload.click();
		//StringSelection is the class provided by Robot class used to retrive file from given path; similar to sendKeys with mouse
		StringSelection selection =  new StringSelection("C:\\Users\\VEENA S\\git\\Automation\\Selenium\\src\\test\\resources\\Selenium Test Sample.pdf");
		//using set contents method, file selection object is set to clipboard
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null);
		Robot robot= new Robot(); //robot class for keyboard actions
		//For handling the operating time and no error occur
		robot.delay(2500); //time 2500ms is given to open the window is handled using delay method
        robot.keyPress (KeyEvent.VK_ENTER);
        robot.keyRelease (KeyEvent.VK_ENTER);
		robot.keyPress (KeyEvent.VK_CONTROL);
		robot.keyPress (KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);	
	}

	public static void main(String[] args) {
		FileUpload fup = new FileUpload(); 
		fup.browserInitializer();
		fup.fileUploadUsingSendKeys(); //initially error will be thrown. To remove that, surround with Try Catch
		try {
			fup.fileUploadUsingRobot();
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
