
public class Task {

	private String taskToDo;
	private int hours;
	private UserStory userstory;

	public Task(String taskToDo, int hours) {
		// TODO Auto-generated constructor stub
		this.taskToDo = taskToDo;
		this.hours = hours;
	}

	public void addStory(UserStory story) {
		// TODO Auto-generated method stub
		this.userstory = story;
	}

}
