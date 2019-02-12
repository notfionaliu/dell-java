import java.time.LocalDate;
import java.util.*;

public class Timesheet{
	private ArrayList<TimesheetEntry> database;

	//	Constructor:
//		No arguments
//		Your constructor should:
//		Initialize database to a new ArrayList<>
	
	public Timesheet(){
		database = new ArrayList<>();
	}
	
	
//	Methods
//	add method
//	creates a new TimesheetEntry and adds it to the Timesheet database
	public void add(String name, String task) {
		TimesheetEntry entry = new TimesheetEntry(name,task);
		database.add(entry);
		System.out.println("[Entry added]");
	}
	

	
//	return the timesheet entry value with that ID
	public TimesheetEntry get(int id) {
		for(int i = 0; i < database.size(); i++) {
			if (database.get(i).getId() == id) {
				return database.get(i);
		}
		}
		return null;

	}
	
//	returns a list of the the entries that are in the database
	public ArrayList<TimesheetEntry> list(boolean activeOnly, String projectName) {
		ArrayList<TimesheetEntry> temp = new ArrayList<>();
//		case 1
//		@param non-active projects, no project name
//		user enters list only
		if(!activeOnly && (projectName == null)) {
		return database;
		}
		else{
//			case 2
//			@param active only projects
//			user enters list -a
			if ((activeOnly) && (projectName == null)) {
			for(int i = 0; i < database.size(); i++) {
				if(database.get(i).getEndTime() == null)
					temp.add(database.get(i));
				}
			}
//			case 3
//			@param activeOnly is false and projectName exists
//			user enters list [project]
			else if (!(projectName == null) && !(activeOnly)) {
			for(int i = 0; i < database.size(); i++) {
				if(database.get(i).getProjectName().equals(projectName))
					temp.add(database.get(i));
			}
			}
//			case 4
//			@param activeOnly is true and projectName exists
//			user enters list [project] -a
			else if ((activeOnly) && !(projectName == null)) {
				for(int i = 0; i < database.size(); i++) {
					if((database.get(i).getEndTime() == null) && (database.get(i).getProjectName().equals(projectName)))
						temp.add(database.get(i));
				}
			}
			return temp;
		}
	}
	
	public void delete(TimesheetEntry entry) {
		database.remove(entry);
	}
	
//	Update the end time
	public void stop(TimesheetEntry entry) {
		try{
			entry.updateEndTime();
		} catch(IllegalAccessException e) {
			System.out.println("This entry has already been stopped");
		}
		
	}
}
