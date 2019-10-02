
public class Car extends Vehicle {

	// two fields 
	String type;
	int doors;
	
	// constructor
	
	public Car(String type, int doors, String license, String make, String model, int price) {
		super(license, make, model, price);
	}


}
