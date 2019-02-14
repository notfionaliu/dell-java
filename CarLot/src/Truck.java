
public class Truck extends Vehicle {

	// truck has one field 
	// bed size
	String bedSize;
	
	//subclass has one constructor
	public Truck(String bedSize, String license, String make, String model, int price ) {

		super(license, make, model, price);

	}
	
}
