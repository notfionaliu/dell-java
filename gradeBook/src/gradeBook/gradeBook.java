//Your program should ask the user to input the total number of students in the gradebook.
//Your program should ask the user to input each student's name, and a list of grades for that student (as a comma-separated string).
//Your program should print out each student's name and the average grade for that student.
//Guidelines:
//
//Your program should store the students and the associated grades (as a comma-seperated string) in a Map<String,String>
//Your program should compute the average grade for each student, and create a new Map<String,Double> that stores the students and their corresponding grade average.
//Use the Map<String,Double> that contains the students and their average grade to retrieve and print out the results.
//When implementing your solution, use helper methods and include comments in your code.
package gradeBook;
import java.util.*;

public class gradeBook {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("How many students are in your gradebook?");
		int studentCount = Integer.parseInt(scan.nextLine());
		HashMap<String,String> teacherInput = new HashMap<String,String>();
		HashMap<String, Double> gradebook = new HashMap<String, Double>();
		
//		boolean continueFlag = true;

		for (int i = 0; i< studentCount; i++) {
//			ask user for student's names 
			int counter = i + 1;
			System.out.println("What is the student's name? (" + counter + " of " + studentCount + ")");
			String name = scan.nextLine();
//			ask user for student's grades 
//			String
			System.out.println("What are the student's grades? (use a comma to separate)");
			String gradesString = scan.nextLine();
			Double average = getAverage(gradesString);
//			
//			input these values to the hashmap
			
			//Your program should store the students and the associated grades (as a comma-seperated string) in a Map<String,String>
			teacherInput.put(name, gradesString);
			//Your program should compute the average grade for each student, and create a new Map<String,Double> that stores the students and their corresponding grade average.
			gradebook.put(name, average);
		
			
//			System.out.println("done? y/n");
//			String answer = scan.nextLine();
//			if(answer.equals("y") || answer.equals("Y"))
//				continueFlag = false;
		}
		
		for (int i = 0; i < gradebook.size(); i++) {
			Double currentName = gradebook.get(i);
			Double currentAverage = gradebook.get(currentName);
			System.out.println(currentName + "'s average grade is " + currentAverage);
		}
	}
	
//	Converts a string of numbers and computes the average
	static Double getAverage(String stringofNumbers) {
		double sum = 0;
		String[] stringArrayofNumbers = stringofNumbers.split(",");
		double[] doubleArray = new double[stringArrayofNumbers.length];
		for(int i = 0; i < doubleArray.length; i++) {
			doubleArray[i] = Integer.parseInt(stringArrayofNumbers[i]);
			sum = sum + doubleArray[i];
		}
		double average = sum / doubleArray.length;
		return average;
	}
	
	
	
}
