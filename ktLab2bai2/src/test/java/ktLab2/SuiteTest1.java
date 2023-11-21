package ktLab2;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;

public class SuiteTest1{
	private String string = "DungVipPro";
	
	JunitMessage junitMessage = new JunitMessage(string);
	
	@Test(expected = ArithmeticException.class)
	public void testJunitMessage() {
		System.out.println("Junit Message is priting ");
		junitMessage.printMessage();
	}
	
	@Test
	public void testJunitHiMessage() {
		string = "Hi " + string;
		assertEquals(string, junitMessage.printHiMessage());
	}
}