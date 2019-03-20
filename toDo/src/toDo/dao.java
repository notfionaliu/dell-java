package toDo;

import java.util.*;

public class dao {

	public static ArrayList<toDoItem> database;
	
	public dao() {
		database = new ArrayList<>();
	}
	
	static void update() {
	 // figure out how to update 	
	}
	
	static void add(String id, String description) {
		toDoItem item = new toDoItem(id, description);
		database.add(item);
		System.out.println("[Item added]");
	}
	
	static void delete(toDoItem item) {
		database.remove(item);
		System.out.println("[Item deleted]");
		
	}
	
	static ArrayList<toDoItem> list(boolean flag){
		ArrayList<toDoItem> newdb = new ArrayList<>();
		
		
	}
}
