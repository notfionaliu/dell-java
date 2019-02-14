
public class Vehicle {
	String license;
	String make;
	String model;
	int price;
	
	// constructor to make new vehicles
	public Vehicle(String license, String make, String model, int price) {
		this.license = license;
		this.make = make;
		this.model = model;
		this.price = price;
	}
	
	// Getter methods
	String getLicense() {
		return license;
	}
	
	String getMake() {
		return make;
	}
	
	String getModel() {
		return model;
	}
	
	int getPrice() {
		return price;
	}

	// method to print description
	
	String list() {
	return "The license number is " + license + ". It is a " + make + " " + model + " that costs $" + price;
	}

}
