
public class CarLotProgram {

	public static void main(String[] args) {
		
		
		// instantiate a few different vehicles 
		

		
		Vehicle vehicleOne = new Vehicle("R2D2", "Toyota", "Civic", 15000);
		Truck truckOne = new Truck("Queen", "BigHumm", "Jeep", "JeepHummer", 40522);
		Car carOne = new Car("Big", 60, "Mini", "beetle", "good", 213495);
		
		// establish capacity for the lots
		// capacity is defined by the size of the arrays
		Vehicle[] arrayOne = new Vehicle[6];
		Vehicle[] arrayTwo = new Vehicle[9];
		
		// instantiate 2 different car lots
		
		CarLot one = new CarLot("one", arrayOne);
		CarLot two = new CarLot("two", arrayTwo);
		
		
	}
}

// to do
// list methods to Truck and Car 