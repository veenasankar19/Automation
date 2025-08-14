package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LocateXPath extends BaseAssignment {
	
	public void locate() {
		
		//Locating buttons using relative XPath
		WebElement element1 = driver.findElement(By.xpath("//button[text()='Show Message']")); //Button Show Message
		WebElement element2 = driver.findElement(By.xpath("//button[text()='Get Total']")); //Button Get Total
		WebElement element3 = driver.findElement(By.xpath("//button[text()='Submit form']")); // Button Submit form
		WebElement element4 = driver.findElement(By.xpath("//button[text()='Get First Selected']")); //Button Get First Selected
		WebElement element5 = driver.findElement(By.xpath("//button[text()='Get All Selected']")); //Button Get All Selected
		
		//Locating labels using relative XPath
		WebElement element6 = driver.findElement(By.xpath("//input[@id='single-input-field']")); //Attribute id of Label Single Input Field
		WebElement element7 = driver.findElement(By.xpath("//input[@id='message-one']")); //Attribute id of label Your Message :
		WebElement element8 = driver.findElement(By.xpath("//input[@id='value-a']")); //Attribute id of label Enter value A
		WebElement element9 = driver.findElement(By.xpath("//input[@id='validationCustom03'")); //Attribute id of label validationCustom03
		WebElement element10 = driver.findElement(By.xpath("//input[@id='multi-select-field']")); //Attribute id of select listbox
	}

	public static void main(String[] args) {
		LocateXPath loc = new LocateXPath(); //object is created for class LocateXPath
		loc.browserIn(); // method browserIn from parent class is called
	}
}
