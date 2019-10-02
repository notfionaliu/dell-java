
public class Tools implements Rentable{

	// public variables
	double hourlyRate;
	String description;

	
	// constructor
	public Tools(String description, double hourlyRate) {
		this.hourlyRate = hourlyRate;
		this.description = description;

	}
	

	// implementing the interface
	public String getDescription() {
		return description;
	}
	
	public double getDailyRate() {
		return hourlyRate * 24;
	}
	
	public double getPrice(double days) {
		double dailyRate = hourlyRate *24;
		return days * dailyRate;
	}
}
