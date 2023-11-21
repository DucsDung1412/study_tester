package ktLab2;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class JunitAnnotationsExample {

	private JunitAnnotationsExample createTestSubject() {
		return new JunitAnnotationsExample();
	}
	
	private ArrayList<String> list;

	@BeforeClass
	public static void m1() throws Exception {
		System.out.println("Using @BeforeClass, excuted before all test cases");
	}

	@Before
	public void m2() {
		list = new ArrayList<String>();
		System.out.println("Using @Before anotations, excuted before each test cases");
	}

	@AfterClass
	public static void m3() throws Exception {
		System.out.println("Using @AfterClass, excuted after all test cases");
	}
	
	@After
	public void m4() {
		list.clear();;
		System.out.println("Using @After anotations, excuted after each test cases");
	}


	@Test
	public void m5() {
		list.add("test");
		assertFalse(list.isEmpty());
		assertEquals(1, list.size());
	}

	@Ignore
	public void m6() {
		System.out.println("Using @Ignore, this excution is ignore");
	}

	@Test(timeout = 10)
	public void m7() {
		System.out.println("Using @Test(timeout), it can be used to enfore timeout in JUnit4 test case");
	}

	@Test(expected = NoSuchMethodException.class)
	public void m8() {
		System.out.println("Using @Test(expected), it will check for specified exception during its excution");
	}

//	@MethodRef(name = "main", signature = "([QString;)V")
	@Test
	public void testMain() throws Exception {
		String[] args = new String[] { "" };

		TestRunner.main(args);
	}
}
