import java.util.ArrayList;
import java.util.List;


public class ScrumBoard {

	private List<UserStory> toDo = new ArrayList<UserStory>();
	private List<UserStory> doing = new ArrayList<UserStory>();
	private List<UserStory> done = new ArrayList<UserStory>();
	
	
	
	public void addUserStory(UserStory userstory) {
		// TODO Auto-generated method stub
		this.toDo.add(userstory);
		
	}



	public Object getTodoStory(int index) {
		// TODO Auto-generated method stub
		return this.toDo.get(index);
	}



	public void moveToDoingFromtodo(UserStory userstory) {
		// TODO Auto-generated method stub
		for(UserStory story : this.toDo)
		{
			if(userstory.equals(story))
			{
				this.doing.add(story);
			}
		}
	}



	public void moveToDoneFromDoing(UserStory userstory) {
		// TODO Auto-generated method stub
		for(UserStory story : this.doing)
		{
			if(userstory.equals(story))
			{
				this.done.add(story);
			}
		}
	}



	public Object getDoingStory(int index) {
		// TODO Auto-generated method stub
		return this.doing.get(index);
	}

	public Object getDoneStory(int index) {
		// TODO Auto-generated method stub
		return this.done.get(index);
	}

}
