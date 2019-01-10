package rockPaperScissors;

import java.util.Scanner;
import java.util.Random;

public class rockPaperScissors {
	public static void main(String[] args) {
		System.out.println("What's your hand?");
		Scanner scan = new Scanner(System.in);
		String userInput = scan.nextLine();
		scan.close();
		String computer = shoot();
		String winner = returnWinner(userInput, computer);
		if (winner == "tie") {
			System.out.println("It's a tie!");
		}
		else
			System.out.println("The winner is " + winner );
	}
	
	public static String shoot() {
		Random randNumberGenerator = new Random();
		int randNum = randNumberGenerator.nextInt(3);
		String output = null;
		if (randNum == 0) {
			output = "rock";
		}
		if (randNum == 1) {
			output = "paper";
		}
		if (randNum == 2) {
			output = "scissor";
		}
		return output;
	}
	
	public static String returnWinner(String user, String computer) {
		String output = null;
		
		if (user == computer)
			output = "tie";
		if (user == "rock") {
			if (computer == "paper") {
				output = "computer";
			}
			else
				output = "user";
			}
		if (user == "paper") {
			if (computer == "rock") {
				output = "computer";
			}
			else
				output = "user";
		}
		if (user == "scissor") {
			if (computer == "rock") {
				output = "computer";
			}
			else
				output = "user";
		}
		return output;
	}

}
