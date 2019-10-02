
public class CarLot {

	String name;
	Vehicle[] vehicles;
	private int counter = 0;
	
	
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
		vehicles[counter] = vehicle;
		counter++;
		System.out.println(vehicle.make + " " + vehicle.model + " was added");
	}
	
	
	void list() {
		System.out.println("The car lot " + name +" has " + counter + " cars. ");
		
		for(int i = 0; i < counter; i++) {
			System.out.println(vehicles[i].list());
		}
	}
	
}
