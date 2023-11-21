package main;

import static org.junit.Assert.assertEquals;

import javax.annotation.processing.Generated;

import org.junit.Test;

@Generated(value = "org.junit-tools-1.1.0")
public class TestJUnitTest {

	private TestJUnit createTestSubject() {
		return new TestJUnit();
	}

//	@MethodRef(name = "main", signature = "([QString;)V")
	@Test
	public void testMain() throws Exception {
		String str = "I am DungVipPro";

		// default test
		assertEquals("I am DungVipPro 1", str);
	}
}