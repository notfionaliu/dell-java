import java.time.LocalDateTime;

public class TimesheetEntry {

	private String projectName;
	private String task;
	private int id;
	private LocalDateTime startTime;
	private LocalDateTime endTime;
	boolean activeOnly;
	private static int nextID = 1;

//	Constructor:
//		Two arguments: String myProject and String myTask
//		Your constructor should:
//		Initialize member variables projectName and task
//		Initialize startTime to LocalDateTime.now()
//		Initialize id to the current value of NEXTID
//		Increment NEXTID
	
	public TimesheetEntry(String myProject, String myTask) {
		projectName = myProject;
		task = myTask;
		startTime = LocalDateTime.now();
		id = nextID;
		activeOnly = false;
		nextID++;
	}
	
//	Methods:
//		Getters for all five member variables (setters optional)

	String getProjectName() {
		return projectName;
	}
	
	String getTask() {
		return task;
	}
	
	int getId() {
		return id;
	}
	
	LocalDateTime getStartTime() {
		return startTime;
	}
	
	LocalDateTime getEndTime() {
		return endTime;
	}

//	Implement a method called updateEndTime():
//	If endTime has not been set, set it to LocalDateTime.now()
//	Otherwise, do nothing (for now)
	
	void updateEndTime() throws IllegalAccessException {

		if(this.endTime == null) {
			endTime = LocalDateTime.now();
		}
		else {
			throw new IllegalAccessException("rude");
		}

		

	}
}

