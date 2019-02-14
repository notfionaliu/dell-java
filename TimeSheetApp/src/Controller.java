

	import java.util.List;

	public class Controller {

		/* Member variables */
		
	    Timesheet timesheet;
	    ConsoleUtils consoleUtils;
	    
	    /* Constructor */
	    
	    public Controller(){
	        this.timesheet = new Timesheet();
	        this.consoleUtils = new ConsoleUtils();
	    }
	    
	    /* Methods */

		/*
		 * Runs the program
		 */
	    public void start() {

	        consoleUtils.printHelp(); // Print the action menu

	        boolean quit = false;
	        while(!quit) {

				// Prompt the user for input, collect input, parse into parts
	            String input = consoleUtils.promptString("> ");
	            String[] actionParts = input.split(" ");
	            String action = actionParts[0].trim(); // Primary action

				// Figure out what to do depending on the user's primary action
	            if (action.equals("add")) {
//	            	When the user inputs add, the program should prompt them to enter a project name, 
//	            	then a task description. 
//	            	The program will use these to create a new timesheet entry and add it to the timesheet.
//	            	Try-catch: The project name entered by the user must be one word only

	            	//Collect project name and task description from the user
	            	processAddAction();
	            	

	            } else if (action.equals("delete")) {
//	            	When the user inputs delete ID, the program should remove the TimesheetEntry
//	            	with the specified id from the Timesheet

	                processDeleteAction(actionParts);

	            } else if (action.equals("stop")) {

	                processStopAction(actionParts);

	            } else if (action.equals("list")) {

	                processListAction(actionParts);

	            } else if (action.equals("quit")) {
	            	
	            	System.out.println("You have quit.");
	            	quit = true;
	            	
	            } else if (action.equals("help")) {

//	            	When the user enters help, the program should display the menu of actions.
//	            	call the appropriate ConsoleUtils method to display the menu of actions.
	            	consoleUtils.printHelp();

	            } else if(action.length() == 0 ){
	            
	                // do nothing.
	            }
	            else {
	            	System.out.println("Invalid input");
	            }
	            
	                
	            } 
	        }

	    

		/*
		 * The user requested that a given TimesheetEntry be stopped (marked as complete)
		 * This method conveys that request to the Timesheet
		 */
	    public void processStopAction(String[] actionParts){

	        if(actionParts.length > 2){
	            consoleUtils.error("Too many inputs to stop command");
	            return;
	        }

	        int idParts = Integer.parseInt(actionParts[1]);
	        TimesheetEntry entry = timesheet.get(idParts);
	        System.out.println("[Entry " + idParts + " has been stopped]");
	        timesheet.stop(entry);
	    }

		/*
		 * The user requested that a given TimesheetEntry be deleted
		 * This method conveys that request to the Timesheet
		 */
	    public void processDeleteAction(String[] actionParts){

	        if(actionParts.length > 2){
	            consoleUtils.error("Too many inputs to delete command");
	            return;
	        }

	        int id = Integer.parseInt(actionParts[1]);
			TimesheetEntry entry = timesheet.get(id);
			System.out.println("[Entry " + id + " has been deleted]");
			timesheet.delete(entry);
	    }

		/*
		 * The user wants to view a list of timesheet entries
		 * This method conveys that request to the Timesheet,
		 * along with any special options (active-only, filter by project name)
		 */
	    public void processListAction(String[] actionParts){
	    
	        if(actionParts.length > 3){
	            consoleUtils.error("Too many inputs to list command");
	            return;
	        }
	        else {
	        	if(actionParts.length == 1) {
		        	List<TimesheetEntry> entries = timesheet.list(false, null);
		        	consoleUtils.printList(entries);	
	        	}
	        	if(actionParts.length == 2) {
	        		if(actionParts[1].contains("-a")) {
	        			List<TimesheetEntry> entries = timesheet.list(true, null);
	        			consoleUtils.printList(entries);
	        		}
	        		else {
	        			List<TimesheetEntry> entries = timesheet.list(false, actionParts[1]);
	        			consoleUtils.printList(entries);
	        		}
	        	}
//	        	need to handle edge cases for this 
//	        	come back to it later
	        	if(actionParts.length == 3) {
	        		if(actionParts[1].contains("-a") || actionParts[2].contains("-a")) {
	        			boolean activeOnly = true;
	        			if(actionParts[1].equals("-a")) {
	        				List<TimesheetEntry> entries = timesheet.list(activeOnly, actionParts[2]);
	        				consoleUtils.printList(entries);
	        			}
	        			else {
	        				List<TimesheetEntry> entries = timesheet.list(activeOnly, actionParts[1]);
	        				consoleUtils.printList(entries);
	        			}
	        		
	        		}

	        	}
        	
	        	}
	        }

	    

		/*
		 * The user wants to add a new entry to the Timesheet
		 * This method conveys that request to the Timesheet, along with
		 * the specified project name and task description 
		 */
	    public void processAddAction() {
	    	
	    	boolean validInput = false;
    	    while(!validInput) {
    	    	String project = consoleUtils.promptString("Project Name (one word only):");
    	    	String [] words = project.split(" ");
    	    	if ((words.length == 1) && !(project == null)) {
    	    		String description = consoleUtils.promptString("Task:");
    		        timesheet.add(project, description);
    		        validInput = true;
    	    	}
    	    	else
    	    		System.out.println("Project name is invalid");
    	    		
    	    	
    	    }

	    }

	    }
	

