package assertJ;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

import model.user;

public class test {
	@Test
	public void a_few_simple_assertions() {
		assertThat("The Lord of the Rings").as("Hello")
										   .isNotNull()   
	                                       .startsWith("The") 
	                                       .contains("Lord") 
	                                       .endsWith("Rings"); 
	}
	
	@Test
	public void testObj() {
		user u = new user("DungVipPro", 23);
		assertThat(u.getAge()).as("check age")
							  .isEqualTo(23);
	}
	
	@Test
	public void testExpected() {
		user u1 = new user("DungVipPro", 23);
		user u2 = new user("DungDepTrai", 23);
		assertThat(u1).as("check age").overridingErrorMessage("Loi o day ne").isEqualTo(u1);
		assertThat(u1).withFailMessage("Loi o day ne").isEqualTo(u2);
	}
}
