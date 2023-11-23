package vn.DungVipPro.testSelenium;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.AfterTest;

public class TestClass {
//	Before
	@BeforeTest
	public void beforeTest() {
		System.out.println("Test: Before Test");
	}	
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("Test: Before Class");
	}
	
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("Test: Before Method");
  }
  
  @BeforeMethod
  public static void staticbeforeMethod() {
	  System.out.println("Test: static Before Method");
  }
  
  @Parameters({"param"})
  @BeforeMethod
  public static void beforeMethodWithParameter(String s) {
	  System.out.println("Test: static Before Method " + s);
  }

//  Test
  @Test
  public void f1() {
	  System.out.println("Test f1: TestNG level1 testing");
  }
  
  @Test
  public void f2() {
	  System.out.println("Test f1: TestNG level2 testing");
  }
  
  
// After
  @AfterMethod
  public void afterMethod() {
	  System.out.println("Test: After Method");
  }
  
  @AfterClass
  public void afterClass() {
	  System.out.println("Test: After Class");
  }
  
  @AfterTest
  public void afterTest() {
	  System.out.println("Test: After Test");
  }
}
