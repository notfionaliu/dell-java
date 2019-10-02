import java.util.*;

public class Statistics {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a string");
		String stringInput = scan.nextLine();
		String[] stringInputArray = stringInput.split(",");
		int[] intArray = new int[stringInputArray.length];
		for(int i = 0; i < intArray.length; i++) {
			intArray[i] = Integer.parseInt(stringInputArray[i]);
		}
		int min = getMin(intArray);
		int max = getMax(intArray);
		int size = intArray.length;
		int average = getAverage(intArray);
		int sum = getSum(intArray);
		
		System.out.println("The min is " + min + " and the max is " + max );
		System.out.println("The array has " + size + " numbers. The average is " + average + " and the sum is " + sum);
	}
	
	static int getMin(int[] array) {
		int min = array[0];
		for(int i = 0; i < array.length; i++) {
			if(array[i] < min)
				min = array[i];
			else
				i++;
		}
		return min;
	}
	
	static int getMax(int[] array) {
		int max = array[0];
		for(int i = 0; i < array.length; i++) {
			if(array[i] > max)
				max = array[i];
			else
				i++;
		}
		return max;
	}
	
	static int getAverage(int[] array) {
		int sum = 0;
		for(int i = 0; i < array.length; i++) {
			sum = sum + array[i];
		}
		int average = sum / array.length;
		return average;
	}
	
	static int getSum(int[] array) {
		int sum = 0;
		for(int i = 0; i < array.length; i++) {
			sum = sum + array[i];
		}
		return sum;
	}
}
