import java.util.ArrayList;
import java.util.List;


public class Team {

	private Person owner;
	private Person projectmanager;
	List <Person> teamMembers = new ArrayList<Person>();
	private int size;
	private int velocity;
	private Project project;

	

	public Team(int size, int velocity) {
		// TODO Auto-generated constructor stub
		this.size = size;
		this.velocity = velocity;
	}

	public Person getOwner() {
		// TODO Auto-generated method stub
		return this.owner;
	}

	public Person getProjectManager() {
		// TODO Auto-generated method stub
		return this.projectmanager;
	}

	public void setOwner(Person person) {
		// TODO Auto-generated method stub
	//	System.out.println(person.getName());
		this.owner = person;
		
	}

	public void setProjectManager(Person manager) {
		// TODO Auto-generated method stub
		this.projectmanager = manager;
	}

	public void setTeamMember(Person member) {
		// TODO Auto-generated method stub
		this.teamMembers.add(member);
	}

	public void assignTask(Person member, Task task) {
		// TODO Auto-generated method stub
		
		for(Person m : teamMembers)
		{
			if(m.equals(member))
				m.assignTask(task);
		}
		
	}

	public void assignProject(Project project) {
		// TODO Auto-generated method stub
		this.project = project;
	}

	public Project getProject() {
		// TODO Auto-generated method stub
		return this.project;
	}

}
