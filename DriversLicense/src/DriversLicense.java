import java.time.LocalDate;
import java.time.Period;


public class DriversLicense {

	//fields 
	String firstName;
	String lastName;
	LocalDate dateOfBirth;
	int height;
	String gender;
	
	//method declaration
	// Your DriversLicense class should have a getFullName() 
	//method that returns the full name by concatenating the first name and the last name attributes.
	public String getFullName() {
		String fullName = firstName.concat(" " + lastName);
		return fullName;
	}
	
//	Your DriversLicenseclass should have a getAge() method that returns the age by based on the DOB attribute.
	public int getAge() {
		LocalDate today = LocalDate.now();
		Period period = Period.between(dateOfBirth, today);
		int age = period.getYears();
		return age;	
	}
}
