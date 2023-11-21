package test;

import static org.junit.Assert.*;

import org.junit.Test;

import main.JunitMessage;

public class AirthematicTest {
	private String mess = "DungVipPro";
	
	public AirthematicTest index() {
		return new AirthematicTest();
	}
	
	JunitMessage message = new JunitMessage(mess);

	@Test(expected = Exception.class)
	public void testPrintMessage() {
		System.out.println("DungVipPro JUnit Message exceptions is printing");
		message.printMessage();
	}

	@Test
	public void testPrintHiMessage() {
		mess = "Hi " + mess;
		System.out.println("DungVipPro JUnit Message is priting");
		assertEquals(mess, message.printHiMessage());
	}

}
