package test;

import javax.annotation.processing.Generated;

import org.junit.Test;

@Generated(value = "org.junit-tools-1.1.0")
public class testTest {

	private test createTestSubject() {
		return new test();
	}

//	@MethodRef(name = "h1", signature = "()QString;")
	@Test
	public void testH1() throws Exception {
		test testSubject;
		String result;

		// default test
		testSubject = createTestSubject();
		result = testSubject.h1();
	}

//	@MethodRef(name = "h2", signature = "()QString;")
	@Test
	public void testH2() throws Exception {
		test testSubject;
		String result;

		// default test
		testSubject = createTestSubject();
		result = testSubject.h2();
	}

//	@MethodRef(name = "main", signature = "([QString;)V")
	@Test
	public void testMain() throws Exception {
		String[] args = new String[] { "" };

		// default test
		test.main(args);
	}
}