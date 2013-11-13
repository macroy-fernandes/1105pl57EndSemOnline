import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class ScrumBoardTest {

	ScrumBoard scrumBoard;
	
	Project project;
	
	Team team1;
	Person person,person1,person2,person3;
	Role owner,projectManager,teamMember;
	
	Sprint sprint1;
	UserStory userstory,userstory1;
	Task task,task1;
	
	@Before
	public void setUp() throws Exception {
		scrumBoard = new ScrumBoard();
		
		sprint1 = new Sprint(5);
		
		userstory = new UserStory(10,8);
		userstory1 = new UserStory(8,5);
		
		task = new Task("Design Interface",8);
		task1 = new Task("Design Database",8);
		
		userstory.addTask(task);
		userstory.addTask(task1);
		
		sprint1.addUserStory(userstory);
		sprint1.addUserStory(userstory1);
		
		
		scrumBoard.addUserStory(userstory);
		scrumBoard.addUserStory(userstory1);
		
		scrumBoard.moveToDoingFromtodo(userstory);
		scrumBoard.moveToDoneFromDoing(userstory);
		
		
	}

	@Test
	public void test() {
		
		assertTrue(userstory.equals(scrumBoard.getTodoStory(0)));
		assertTrue(userstory.equals(scrumBoard.getDoingStory(0)));
		assertTrue(userstory.equals(scrumBoard.getDoneStory(0)));
	}

}
