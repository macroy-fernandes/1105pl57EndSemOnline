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
		if(this.getPoints()+userstory.getPoints()<20)
			userstories.add(userstory);
		else
			System.out.println("maximum velocity reached");
	}
	private int getPoints() {
		// TODO Auto-generated method stub
		int points=0;
		for(UserStory s: userstories)
		{
			points+=s.getPoints();
		}
		return points;
	}

}
