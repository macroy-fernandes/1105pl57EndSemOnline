import java.util.ArrayList;
import java.util.List;


public class Team {

	private Person owner;
	private Person projectmanager;
	List <Person> teamMembers = new ArrayList<Person>();
	private int size;
	private int velocity;

	

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

	public void setProjectManager(Person person1) {
		// TODO Auto-generated method stub
		this.projectmanager = person1;
	}

	public void setTeamMember(Person person2) {
		// TODO Auto-generated method stub
		this.teamMembers.add(person2);
	}

}
