import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class TeamTest {

	Team team1;
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
	
		team1 = new Team(5,20);
		team1.setOwner(person);
		team1.setProjectManager(person1);
		//team1.setTeamMember(person2);
		
	}

	@Test
	public void teamTest() {
	
		System.out.println(team1.getOwner().getName());
		assertTrue(person.equals(team1.getOwner()));
		assertTrue(person1.equals(team1.getProjectManager()));
		//assertTrue(person2.equals(team.get()));
		//List<Person> = List<Person> team1.get 
	}

}
