
public class ParkingGarage extends Car{

	Car[] parkingSpots; //instantiate car array for parking spots
	// zero based indexing for parking spots
	
	public ParkingGarage(int capacity) {
		parkingSpots = new Car[capacity];
	}
	
	// input new Car class and spot
	// parks a car in that spot
	void park(Car car, int spot) {
		try {
			if(parkingSpots[spot] == null)
				parkingSpots[spot] = car;
			else
				System.out.println("there is a car already parked there.");
		}		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("that is not a spot");
			}
		
	}
	
	void vacate(int spot) {
		if(parkingSpots[spot] != null)
			parkingSpots[spot] = null;
		else
			System.out.println("That car is already empty");
			
	}
	
	void printInventory() {
		for(int i = 0; i < parkingSpots.length; i++ ) {
			if (parkingSpots[i] != null) {
				System.out.println("The spot number is " + i );
				System.out.println("The car's color is " + parkingSpots[i].getColor() + ". The license # is " + 
				parkingSpots[i].getLicense() + ". It is a " + parkingSpots[i].getMake() + " " + parkingSpots[i].getModel());

			}
		}
	}
	
}
