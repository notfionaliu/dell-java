package toDo;

public class toDoItem {

	public String id;
	public String description;
	public boolean flag;
	// flag is true if done
	// flag is false if !done
	
	
	// constructor 
	// user inputs id, description, and flag
	public toDoItem(String id, String description) {
		id = this.id;
		description = this.description;
		flag = false;
	}
	
	String getItemId() {
		return id;
	}
	
	String getDescription() {
		return description;
	}
	
	boolean getFlag() {
		return flag;
	}

}
