
public class Person {

	private String name;
	private int age;
	private String gender;
	private Role role;
	private Task tasktobeDone;

	public Person(String name, int age, String gender, Role role) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.role = role;
	}

	public String getName() {
		// TODO Auto-generated method stub
		return this.name;
	}

	public Role getRole() {
		// TODO Auto-generated method stub
		return this.role;
	}

	public void assignTask(Task task) {
		// TODO Auto-generated method stub
		this.tasktobeDone = task;
	}
	

}
