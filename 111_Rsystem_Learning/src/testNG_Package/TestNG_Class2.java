package testNG_Package;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG_Class2 {
	
	@Test
	public void test1() {
		System.out.println("Test 1");
	}
	
	@BeforeMethod
	public void BeforeMethod_() {
		System.out.println("Before Method");
	}
	
	@AfterMethod
	public void afterMethod_() {
		System.out.println("After Method");
	}
	
	@Test
	public void test2() {
		System.out.println("Test 2");
	}
	
	@BeforeTest
	public void before_test() {
		System.out.println("Before Test");
	}
	
	@AfterTest
	public void after_test1() {
		System.out.println("After Test");
	}
	
	@BeforeClass
	public void Before_Class() {
		System.out.println("Before class");
	}
	
	@BeforeSuite
	public void BeforeSuite() {
		System.out.println("Before Suite");
	}
	
	@AfterClass
	public void AfterClass() {
		System.out.println("After class");
	}
	
	@AfterSuite
	public void after_Suite() {
		System.out.println("After Suite");
	}

}
