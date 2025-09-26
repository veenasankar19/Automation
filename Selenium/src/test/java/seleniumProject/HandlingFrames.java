package seleniumProject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HandlingFrames extends Base {
	public void handleFrames() {
		driver.navigate().to("https://demoqa.com/frames");
		List<WebElement> totalframes = driver.findElements(By.tagName("iframe")); //totalframes is a variable, findElements give a list of WebElements. Hence List<> should be used. 
		System.out.println(totalframes); //to get the details of frames (ad/ext document) in the website 
		System.out.println(totalframes.size()); //to print the total number of frames in list
		
		//switchTo method is used to change the focus of driver from 1 point of frame to other OR to another window of same application
		//cannot feel the differences mde by switchTo method
		driver.switchTo().frame(1); //frame(1) means if the index is 1
		//driver.switchTo().frame("frame1"); //will not get o/p since name is absent
		driver.switchTo().parentFrame(); //to change focus to the immediate iframe tag above
		
		WebElement iframe1 = driver.findElement(By.xpath("//iframe[@id='frame1']"));
		driver.switchTo().frame(iframe1);
		
		WebElement iframeElement = driver.findElement(By.xpath("//h1[@id='sampleHeading']"));
		System.out.println(iframeElement.getText());
		
		driver.switchTo().defaultContent(); //defaultContent - to redirect/release the driver focus pointer to previously focused point
	}

	
	public static void main(String[] args) {
		HandlingFrames frames = new HandlingFrames();
		frames.browserInitializer();
		frames.handleFrames();

	}

}
