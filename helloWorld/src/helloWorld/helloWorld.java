package helloWorld;

import java.util.Scanner;

public class helloWorld {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("hello y'all");
		System.out.println("Hello I am bob who are you?");
		String input = sc.nextLine();
		System.out.println("Hello " + input + ", hope you are doing well!");
	}

}
