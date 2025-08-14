package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LocateID extends BaseAssignment {
	
	public void locate() {
	
		WebElement id1 = driver.findElement(By.id("single-input-field"));
		WebElement id2 = driver.findElement(By.id("button-one"));
		WebElement id3 = driver.findElement(By.id("value-a"));
		WebElement id4 = driver.findElement(By.id("value-b"));
	}

	public static void main(String[] args) {
		LocateID loc = new LocateID(); //object is created for class Locators
		loc.browserIn(); // method browserIn from parent class is called
	}

}
