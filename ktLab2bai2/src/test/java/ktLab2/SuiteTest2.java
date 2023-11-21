package ktLab2;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;

public class SuiteTest2{
	@Test
	public void createName() {
		String string1 = "C";
		String string2 = "C";
		
		assertEquals(string1, string2);
	}
}