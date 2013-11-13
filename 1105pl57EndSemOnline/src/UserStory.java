import java.util.ArrayList;
import java.util.List;


public class UserStory {

	private int storyPoint;
	private int priority;
	private List<Task> tasks = new ArrayList<Task>();

	public UserStory(int storyPoint, int priority) {
		// TODO Auto-generated constructor stub
		
		this.storyPoint = storyPoint;
		this.priority = priority;
	}

	public void addTask(Task task) {
		// TODO Auto-generated method stub
		this.tasks.add(task);
		task.addStory(this);
	}

	public int getPoints() {
		// TODO Auto-generated method stub
		return this.storyPoint;
	}

}
