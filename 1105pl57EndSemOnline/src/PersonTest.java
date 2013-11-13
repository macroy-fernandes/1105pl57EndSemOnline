import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class PersonTest {

	Person person;
	Role owner;
	@Before
	public void setUp() throws Exception {
		owner = new Owner();
		person = new Person("Macroy",23,"male",owner);
		
		
	}

	@Test
	public void personTest() {
		assertEquals("owner",((Owner) owner).getType());
		assertEquals("Macroy",person.getName());
		assertTrue(owner.equals(person.getRole()));
		
	}

}
