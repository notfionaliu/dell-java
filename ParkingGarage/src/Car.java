
public class Car {

//	fields
	
	String color;
	String license;
	String make;
	String model;
	
	public Car(String color, String license, String make, String model) {
		this.color = color;
		this.license = license;
		this.make = make;
		this.model = model;
		
	}
	
	String getColor() {
		return color;
	}
	
	String getLicense() {
		return license;
	}
	
	String getMake() {
		return make;
	}
	
	String getModel() {
		return model;
	}
}
