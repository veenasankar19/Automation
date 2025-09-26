package seleniumProject;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HandlingActions extends Base {
	
	public void verifyRightClick() {
		//Code to right click on "Home" link
	WebElement rightClick = driver.findElement(By.xpath("//a[text()='Home']")); 
	Actions	action = new Actions(driver); //Actions is a built-in class. An object action is created for this class.
	action.contextClick(rightClick).build().perform(); 
	//rightClick is simulated after taking object action
	//contextClick method is always used to simulate rightClick
	//.build method is used for preparing the driver for performing the actions
	//perform method is used for executing the actions
	}
	
	public void verifyMouseHover() {
	   //Code to hover on "Input Form" link
	WebElement mousehover=driver.findElement(By.xpath("//a[contains(text(),'Input Form')]"));
	Actions action = new Actions(driver); //since action is local variable., there is no issue to use same name for variable
	action.moveToElement(mousehover).build().perform(); //moveToElement method is used for mouse hovering
	}
	public void verifyDragandDrop() {
		   //Code to drag and drop an element
	driver.navigate().to("https://demoqa.com/droppable");
	WebElement drag = driver.findElement(By.xpath("//div[@id='draggable']"));
	WebElement drop = driver.findElement(By.xpath("//div[@id='droppable']"));
	Actions action = new Actions(driver);
	action.dragAndDrop(drag, drop).build().perform();
	}
	
	public void verifyKeyboardAction() throws AWTException {
			//Code for keyboard actions like Ctrl C
	Robot robot = new Robot(); //Robot is an inbuilt JAVA CLASS (in Java AWT Package) like list class
	robot.keyPress(KeyEvent.VK_CONTROL); //VK-Virtual Key for identifying Ctrl key, KeyEvent is a class, keyPress is the method to press the mentioned key
	robot.keyPress(KeyEvent.VK_T); //VK_T is for identifying the key T
	robot.keyRelease(KeyEvent.VK_CONTROL); //to release control key
	robot.keyRelease(KeyEvent.VK_T); //to release control T
	}
	public static void main(String[] args) {
		HandlingActions actions = new HandlingActions();
		actions.browserInitializer();
		//actions.verifyRightClick();
		//actions.verifyMouseHover();
		//actions.verifyDragandDrop();
		try {
			actions.verifyKeyboardAction();
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
