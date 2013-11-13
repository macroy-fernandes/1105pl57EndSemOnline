import java.util.ArrayList;
import java.util.List;


public class Project {

	private String name;
	private String techUsed;
	private Team team;
	private List<UserStory> backlog = new ArrayList<UserStory>();
	private List<Sprint> sprints = new ArrayList<Sprint>();
	public Project(String name, String techUsed) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.techUsed = techUsed;
	}

	public void assignTeam(Team team1) {
		// TODO Auto-generated method stub
		this.team = team1;
		this.team.assignProject(this);
	}

	public void addBacklog(UserStory userstory) {
		// TODO Auto-generated method stub
		this.backlog.add(userstory);
	}

	public void addSprint(Sprint sprint1) {
		// TODO Auto-generated method stub
		this.sprints.add(sprint1);
	}

	public String getName() {
		// TODO Auto-generated method stub
		return this.name;
	}

	public String getTechUsed() {
		// TODO Auto-generated method stub
		return this.techUsed;
	}

	public Team getTeam() {
		// TODO Auto-generated method stub
		return this.team;
	}

}
