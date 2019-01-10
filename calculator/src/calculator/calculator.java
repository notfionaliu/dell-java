package calculator;

import java.util.Scanner;

public class calculator {
	public static void main(String[] args) {
		System.out.println("Please enter your first number");
		Scanner scan = new Scanner(System.in);
		int i = scan.nextInt();
		System.out.println("Please enter your second number");
		int j = scan.nextInt();
		scan.close();
		int sum = add(i,j);
		int difference = subtract(i,j);
		int product = multiply(i,j);
		int quotient = divide(i,j);
		System.out.println(
				"The sum is " + sum + ". " +
				"The difference is " + difference + ". " +
				"The product is " + product + ". " +
				"The quotient is " + quotient + "."
		);		
	}
	
	public static int add(int a, int b) {
		return a + b;
	}
	public static int subtract(int a, int b) {
		return a - b;
	}
	public static int multiply(int a, int b) {
		return a * b;
	}
	public static int divide(int a, int b) {
		return a / b;
	}
}