package vn.DungVipPro.ktLab7;

import org.junit.Before;
import org.testng.Assert;
import org.testng.ITest;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Factory;
import org.testng.annotations.Test;

public class testFactory implements ITest{
	private String param;
	
	public testFactory(String param) {
		this.param = param;
	}

	@Override
	public String getTestName() {
		return getClass().getSimpleName() + " - "  + param;
	}
	
	@BeforeSuite
	public void f1() {
		System.out.println("before");
	}
	
	@AfterClass
	public void f2() {
		System.out.println("afeter");
	}
	
	@Factory
	public static Object[] create() {
		System.out.println("asd");
		return new Object[]{new testFactory("TestNG"), new testFactory("Reports")};
	}
	
	@Test
	public void f() {
		System.out.println(this.param);
		  if(this.param.equals("Reports")) {
			  Assert.assertTrue(false);
		  }
	}
}
