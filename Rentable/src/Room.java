
public class Room implements Rentable{

	// public variables
	double dailyRate;
	String description;

	
	// constructor 
	public Room(String description, double dailyRate) {
		this.description = description;
		this.dailyRate = dailyRate;

	}


	//implementing the interface
	public double getDailyRate() {
		return dailyRate;
	}

	
	public String getDescription() {
		return description;
	}

	@Override
	public double getPrice(double days) {
		return days * dailyRate;
	}
}
