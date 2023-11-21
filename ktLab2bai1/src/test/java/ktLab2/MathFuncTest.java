package ktLab2;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;

public class MathFuncTest{
	private MathFunc math;
	
	private MathFunc createTestSubject() {
		return new MathFunc();
	}

	@Before
	public void init() {
		math = new MathFunc();
	}
	
	@After
	public void tearDown() {
		math = null;
	}
	
	@Test
	public void calls() {
		assertEquals(0, math.getCalls());
		
		math.factorial(1);
		assertEquals(1, math.getCalls());
		
		math.factorial(1);
		assertEquals(2, math.getCalls());
	}

	@Test
	public void testFactorial() {
		assertTrue(math.factorial(0) == 1);
		assertTrue(math.factorial(1) == 1);
		assertTrue(math.factorial(5) == 120);
	}
	
	@Test (expected = IllegalArgumentException.class)
	public void factorialNagative(){
		math.factorial(-1);
	}
	
	@Test
	public void plus() {
		assertEquals(3, math.plus(1, 1));
	}

	@Ignore
	@Test
	public void todo() {
		assertTrue(math.plus(1, 1) == 3);
		assertEquals(3, math.plus(1, 1));
	}

	@Test
	public void testMain() throws Exception {
		String[] args = new String[] { "" };
		JUnitCore junit = new JUnitCore();
		Result result = junit.run(MathFuncTest.class);
		System.out.println("run tests: " + result.getRunCount());
		System.out.println("failed tests: " + result.getFailureCount());
		System.out.println("ignored tests: " + result.getIgnoreCount());
		System.out.println("success: " + result.wasSuccessful());

		// default test
		MathFunc.main(args);
	}
}