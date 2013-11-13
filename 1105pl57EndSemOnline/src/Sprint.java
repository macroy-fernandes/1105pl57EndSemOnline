import java.util.ArrayList;
import java.util.List;


public class Sprint {

	private List<UserStory> userstories = new ArrayList<UserStory>();
	private int days;
	public Sprint(int days) {
		// TODO Auto-generated constructor stub
		this.days = days;
	}
	public void addUserStory(UserStory userstory) {
		// TODO Auto-generated method stub
		userstories.add(userstory);
		
	}

}
