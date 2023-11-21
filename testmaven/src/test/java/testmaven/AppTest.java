package testmaven;

import javax.annotation.Generated;

import org.junit.Test;

import junit.framework.TestCase;

@Generated(value = "org.junit-tools-1.1.0")
public class AppTest extends TestCase{
	
	public AppTest(String testName) {
		super(testName);
	}
	
	public void testApp() {
		assertTrue(true);
	}
	
	private App createTestSubject() {
		return new App();
	}

	@Test
	public void testIsEventNumber4() throws Exception {
		App demo1 = new App();
		boolean result = demo1.isEventNumber(4);
		assertTrue(result);
	}
	
	@Test
	public void testIsEventNumber2() throws Exception {
		App demo1 = new App();
		boolean result = demo1.isEventNumber(2);
		assertTrue(result);
	}

	@Test
	public void testMain() throws Exception {
		String[] args = new String[] { "" };

		// default test
		App.main(args);
	}
}