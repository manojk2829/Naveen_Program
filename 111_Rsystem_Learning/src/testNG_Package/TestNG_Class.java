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

public class TestNG_Class {
	
	
	@Test(groups={"test1","test2"})
	public void test1() {
		System.out.println("Test 1");
	}
	
	@Test(groups={"test4"})
	public void test4() {
		System.out.println("Test 4");
	}
	
	@Test(groups={"test1"})
	public void test3() {
		System.out.println("Test 3");
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
}
