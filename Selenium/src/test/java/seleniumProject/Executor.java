package seleniumProject;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class Executor extends Base {
	public void verifyJavascriptExecutor() {
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		WebElement showMessageButton=driver.findElement(By.xpath("//button[@id='button-one']")); 
//TypeCasting-converting the variable from one datatype to other
		JavascriptExecutor js = (JavascriptExecutor)driver; //Driver cannot execute javascript code. Driver can execute only java code. So it can be typecasted to javascript executer. 
		js.executeScript("arguments[0].click();", showMessageButton);
		js.executeScript("window.scrollBy(0,100)", "");
//js.executeScript("window.scrollBy(0,0)", "");		
		//js.executeScript("window.scrollBy(100,200)", ""); //scrollBy is Relative Scrolling - Cursor scrolls towards bottom(300px) from current position(200px). It need not start from 0. Scrolls the page relative to the current position.
		//js.executeScript("window.scrollTo(0,0)", "");       //scrollTo is Absolute Scrolling - Cursor scrolls the page to an exact coordinate, regardless of the current scroll position. 
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)", ""); //document.body.scrollHeight-to scroll till entire height of web application
		//js.executeScript("window.scrollTo(200,300)", ""); //horizontal scrolling
		System.out.println(js.executeScript("return window.pageYOffset")); // window.pageYOffset- gives the current pixel position of cursor
			}

	public static void main(String[] args) {
		Executor executor = new Executor();
		executor.browserInitializer();
		executor.verifyJavascriptExecutor();
	}

}
