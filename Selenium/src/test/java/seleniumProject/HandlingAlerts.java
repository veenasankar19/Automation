package seleniumProject;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HandlingAlerts extends Base {
	public void verifySimpleAlerts() {
		driver.navigate().to("https://demoqa.com/alerts");
		WebElement simpleAlertButton = driver.findElement(By.xpath("//button[@id='alertButton']"));
		simpleAlertButton.click();
		Alert simplealert = driver.switchTo().alert(); 
		System.out.println(simplealert.getText());
		simplealert.accept(); //to click on OK button of alert since In this case, only OK Button is present.
	}
	public void verifyConfirmAlerts() {
		driver.navigate().to("https://demoqa.com/alerts");
		WebElement confirmAlertButton = driver.findElement(By.xpath("//button[@id='confirmButton']"));
		confirmAlertButton.click();
		Alert confirmalert = driver.switchTo().alert();
		//confirmalert.accept(); //to click on OK Button of alert
		confirmalert.dismiss(); //to click on Cancel Button of alert
	}
	public void verifyPromptAlerts() {
		driver.navigate().to("https://demoqa.com/alerts");
		WebElement promptAlertButton = driver.findElement(By.xpath("//button[@id='promtButton']"));
		promptAlertButton.click();
		Alert promptalert = driver.switchTo().alert();
		promptalert.sendKeys("Veena");
		promptalert.accept();
	}

	public static void main(String[] args) {
		HandlingAlerts alerts = new HandlingAlerts();
		alerts.browserInitializer();
		//alerts.verifySimpleAlerts();
		//alerts.verifyConfirmAlerts();
		alerts.verifyPromptAlerts();
	}
}
