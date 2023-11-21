package fpoly;

import org.testng.annotations.Test;

public class groupExamples {
	@Test(groups = { "Regresstion", "Smoke Test" })
	public void testMethod1() {
		System.out.println("Test One");
	}

	@Test(groups = { "Regresstion" })
	public void testMethod2() {
		System.out.println("Test Two");
	}

	@Test(groups = { "Smoke Test" })
	public void testMethod3() {
		System.out.println("Test Three");
	}
	
	@Test(groups = { "Regresstion" })
	public void testMethod4() {
		System.out.println("Test Four");
	}

}
