package testScript;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGAnnotations {
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Before Method");
	}	
	@BeforeTest
	public void beforeTest() {
		System.out.println("Before Test");
	}	
	@BeforeClass
	public void beforeClass() {
		System.out.println("Before Class");
	}	
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("Before Suite");
	}
	@Test  //to mention that the method testCase() is a testcase. This is not a preparation or destruction.
	public void testCase() {
		System.out.println("Test Cases");
	}	
//After Method/Test/Class/Suite is to destroy everything initialized in Before Method/Test/Class/Suite to save the space in web driver
	@AfterMethod
	public void afterMethod() {
		System.out.println("After Method");		
	}
	@AfterTest
	public void afterTest() {
		System.out.println("After Test");		
	}
	@AfterClass
	public void afterClass() {
		System.out.println("After Class");		
	}
	@AfterSuite
	public void afterSuite() {
		System.out.println("After Suite");		
	}
}
