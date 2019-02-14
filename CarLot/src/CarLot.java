
public class CarLot {

	String name;
	Vehicle[] vehicles;
	
	
	// constructor 
	public CarLot(String name, Vehicle[] vehicles) {
		this.name = name;
		this.vehicles = vehicles;
	}
	
	// getter and setter methods 
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void setCars(Vehicle[] vehicle) {
		this.vehicles = vehicle;
	}


	
	void add(Vehicle vehicle) {
		int length = vehicles.length;
		int newLength = length+1;
		vehicles[newLength] = vehicle;
	}
	
	
	void list() {
		System.out.println("The car lot has " + vehicles.length + " cars. ");
		
		for(int i = 0; i < vehicles.length; i++) {
			System.out.println(vehicles[i].list());
		}
	}
	
}
