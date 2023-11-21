package test;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ErrorCollector;

public class ErrorCollectorExample {
	@Rule
	public ErrorCollector error = new ErrorCollector();
	
	@Test
	public void example() {
		error.addError(new Throwable("There is an error in frist line"));
		error.addError(new Throwable("There is an error in second line"));
		
		System.out.println("Hello");
		try {
			assertTrue("A" == "B");
		} catch (Exception e) {
			error.addError(e);
		}
		System.out.println("World");
	}
}
