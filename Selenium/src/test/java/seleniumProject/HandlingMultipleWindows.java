package seleniumProject;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HandlingMultipleWindows extends Base {
public void handleMultipleWindows() {
		driver.navigate().to("https://demo.guru99.com/popup.php");
		String firstHandleID = driver.getWindowHandle(); //to get the current window Handle ID which is a uniue value
		WebElement handle1 = driver.findElement(By.xpath("//a[text()='Click Here']"));
		handle1.click(); //to click on specified webelement stored in handle1
		
		Set<String> handleids = driver.getWindowHandles(); //set is used instead of list because this is unique
		System.out.println(handleids);
		
		//Iterator interface can be any collection (set/list) used for iterating. It is stored in the variable values.
		Iterator<String>values=handleids.iterator();
		while(values.hasNext())
		{
			String current_id=values.next();  //.next helps to move to next id if there are multiple ids. If the hadle id is not the first handle id then only the code will execute.
			if(!current_id.equals(firstHandleID)) //If current id is not the browser id of current tab.
			{
				driver.switchTo().window(current_id);
				WebElement email_fld=driver.findElement(By.xpath("//input[@name='emailid']")); //located Email ID textbox
				email_fld.sendKeys("abc@gmail.com"); //set values to Email ID textbox
				WebElement submit_fld=driver.findElement(By.xpath("//input[@name='btnLogin']")); //located button
				submit_fld.click(); //clicked the button
				driver.switchTo().defaultContent(); //control goes to first tab
			}
		}
	}

	public static void main(String[] args) {
		HandlingMultipleWindows	windows = new HandlingMultipleWindows();
		windows.browserInitializer();
		windows.handleMultipleWindows();
	}
}
