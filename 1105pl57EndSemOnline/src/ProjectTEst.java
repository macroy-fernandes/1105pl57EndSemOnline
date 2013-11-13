import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class ProjectTEst {

	Project project;
	
	Team team1;
	Person person,person1,person2,person3;
	Role owner,projectManager,teamMember;
	
	Sprint sprint1;
	UserStory userstory,userstory1;
	Task task,task1;
	@Before
	public void setUp() throws Exception {
		project = new Project("Student Attendance System","JSP");
		
		sprint1 = new Sprint(5);
		
		userstory = new UserStory(10,8);
		userstory1 = new UserStory(8,5);
		
		task = new Task("Design Interface",8);
		task1 = new Task("Design Database",8);
		
		userstory.addTask(task);
		userstory.addTask(task1);
		
		
		
		owner = new Owner();
		projectManager = new ProjectManager();
		teamMember = new TeamMember();
		person = new Person("Macroy",23,"male",owner);
		
		person1 = new Person("Munib",23,"male",projectManager);
		
		person2 = new Person("Irfan",23,"male",teamMember);
	
		team1 = new Team(5,20);
		team1.setOwner(person);
		team1.setProjectManager(person1);
		team1.setTeamMember(person2);
	
		sprint1.addUserStory(userstory);
		sprint1.addUserStory(userstory1);
		
		
		project.assignTeam(team1);
		project.addBacklog(userstory);
		project.addSprint(sprint1);
		
		project.getTeam().assignTask(person2,task);
	}

	@Test
	public void test() {
		
		
		assertEquals("Student Attendance System",project.getName());
		assertEquals("JSP",project.getTechUsed());
		assertTrue(task.equals(person2.getTask()));
		assertTrue(team1.equals(project.getTeam()));
		assertTrue(project.equals(team1.getProject()));
		
	}

}
