import java.time.LocalDate;

public class LicenseProgram extends DriversLicense {
//	one main method and one main method only
	public static void main(String[] args) {
//		creating first license
		DriversLicense d1 = new DriversLicense();
		d1.firstName = "Dinosaur";
		d1.lastName = "Nuggets";
		d1.dateOfBirth = LocalDate.of(1995, 10, 10);
		d1.height = 176;
		d1.gender = "Female";
		
//		creating second license
		DriversLicense d2 = new DriversLicense();
		d2.firstName = "Howza";
		d2.lastName = "Mama";
		d2.dateOfBirth = LocalDate.of(1994, 9, 11);
		d2.height = 180;
		d2.gender = "Male";
		
//		creating third license
		DriversLicense d3 = new DriversLicense();
		d3.firstName = "Bubble";
		d3.lastName = "Butts";
		d3.dateOfBirth = LocalDate.of(1967, 12, 11);
		d3.height = 160;
		d3.gender = "Male";
		
//		Print the full name and age of each license 
		System.out.println("First license's full name is " + d1.getFullName());
		System.out.println("First license's age is " + d1.getAge());
		System.out.println("Second license's full name is " + d2.getFullName());
		System.out.println("Second license's age is " + d2.getAge());
		System.out.println("Third license's full name is " + d3.getFullName());
		System.out.println("Third license's age is " + d3.getAge());
	}
}
