
public class Condo implements Rentable{
	// public variables
	String description;
	double weeklyRate;

	
	//constructor
	public Condo(String description, double weeklyRate) {
		this.description = description;
		this.weeklyRate = weeklyRate;

	}
	

	// implementing the interface
	public String getDescription() {
		return description;
	}
	
	// condos are priced per week
	// the daily rate is the weeklyRate divided by 7
	public double getDailyRate() {
		double dailyCost = weeklyRate/7;
		return dailyCost;
	}
	
	// condos are priced per week 
	// but you can rent a condo for only a few days too
	// creating a double called dailyCost
	// cost is dailyCost * number of days rented
	public double getPrice(double days) {
		double dailyCost = weeklyRate/7;
		return dailyCost * days;
	}
	
	
}
