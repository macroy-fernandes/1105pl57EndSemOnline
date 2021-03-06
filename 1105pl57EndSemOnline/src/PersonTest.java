import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class PersonTest {

	Person person,person1,person2,person3;
	Role owner,projectManager,teamMember;
	@Before
	public void setUp() throws Exception {
		owner = new Owner();
		projectManager = new ProjectManager();
		teamMember = new TeamMember();
		person = new Person("Macroy",23,"male",owner);
		
		person1 = new Person("Munib",23,"male",projectManager);
		
		person2 = new Person("Irfan",23,"male",teamMember);
		
	//	person3 = new Person("Macroy",23,"male",owner);
		
		
	}

	@Test
	public void personTest() {
		assertEquals("owner",((Owner) owner).getType());
		assertEquals("Macroy",person.getName());
		assertTrue(owner.equals(person.getRole()));
		
		
		assertEquals("Team member",((TeamMember) teamMember).getType());
		assertEquals("Irfan",person2.getName());
		assertTrue(teamMember.equals(person2.getRole()));
		
	}

}
