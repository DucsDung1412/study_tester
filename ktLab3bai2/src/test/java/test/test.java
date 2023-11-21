package test;

import static org.junit.Assert.*;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import main.Person;

public class test {

	public test index() {
		return new test();
	}
	
	@Rule
	public ExpectedException exception = ExpectedException.none();
	
	@Test
	public void testPerson() {
		exception.expect(IllegalArgumentException.class);
		new Person("DungVipPro", -1);
	}

	@Test(expected = Exception.class)
	public void testException() {
		new Person("Haha Hihi", -100);
	}
	
	@Test
	public void testTryCatch() {
		try {
			new Person("Ao ma Canada", -999);
			fail("Should have thrown an IllegalArgumentException because age is invalid");
		} catch (Exception e) {

		}
	}
}
