package seleniumProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TableHandling extends Base  {
	
	public void verifyTables() {
		driver.navigate().to("https://money.rediff.com/indices/nse");
		
		WebElement table1 = driver.findElement(By.xpath("//table[@id='dataTable']")); //located table
		//System.out.println(table1.getText()); //print entire table
		WebElement row = driver.findElement(By.xpath("//table[@id='dataTable']/tbody/tr[3]")); //to locate 3rd row (count is started from 1 and not 0)
		System.out.println("\n"); //to add a blank line
		System.out.println(row.getText());
		WebElement column = driver.findElement(By.xpath("//table[@id='dataTable']/tbody/tr[3]/td[2]")); // to locate 2nd column value from 3rd row
		System.out.println(column.getText());
		
	}

	public static void main(String[] args) {
		TableHandling table = new TableHandling();
			table.browserInitializer();
			table.verifyTables();
	}
}