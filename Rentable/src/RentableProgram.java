import java.util.*;

public class RentableProgram {
	public static void main(String[] args) {
		
		// creating a few rooms, condos, and tools
		Room roomA = new Room("This room has dinosaurs", 55.503 );
		Room roomB = new Room("This room is just ok", 105.23);
		Room roomC = new Room("This room is expensive AF", 50.640);
		
		Condo condoA = new Condo("This condo has a weird smell", 500.00);
		Condo condoB = new Condo("This condo is made of nail clippings", 1000.54);
		Condo condoC = new Condo("This condo is in outer space", 700.56);
		
		Tools toolA = new Tools("Tool Tool Tool", 699);
		Tools toolB = new Tools("Screwdriver Screwdriver Screwdriver", 70);
		Tools toolC = new Tools("butts butts butts", 493);
		
		// create an arraylist 
		ArrayList<Rentable> rentableArray= new ArrayList<Rentable>();
		
		// adding all the objects to the Array
		rentableArray.add(roomA);
		rentableArray.add(roomB);
		rentableArray.add(roomC);
		rentableArray.add(condoA);
		rentableArray.add(condoB);
		rentableArray.add(condoC);
		rentableArray.add(toolA);
		rentableArray.add(toolB);
		rentableArray.add(toolC);
		
		Scanner scan = new Scanner(System.in);
		for(int i = 0; i < rentableArray.size(); i++) {
			System.out.println("[ROOM " + (i+1)+"] " + rentableArray.get(i).getDescription());
			System.out.println("daily rate is " + rentableArray.get(i).getDailyRate());
			System.out.println("How many days are you renting this for?");
			double days = scan.nextDouble();
			System.out.println("For " + days + " days, it will cost $" + rentableArray.get(i).getPrice(days));
			System.out.println(" ");
		
		}
	}

	
	
}
