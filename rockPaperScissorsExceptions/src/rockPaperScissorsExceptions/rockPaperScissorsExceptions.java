package rockPaperScissorsExceptions;
import java.util.*;
import java.util.Scanner;
import java.util.Random;

public class rockPaperScissorsExceptions {
	public static void main(String[] args) {
		
		boolean checkContinue = true;
		while(checkContinue) {
			try{ 
				System.out.println("What's your hand? (rock paper scissor)");
				Scanner scan = new Scanner(System.in);
				String userInput = scan.nextLine();
				checkInput(userInput);
				checkContinue = false; //valid input, exit the loop
				scan.close();
				String computer = shoot();
				System.out.println("Computer's hand is: " + computer); 
				String winner = returnWinner(userInput, computer);
				
				if (winner == "tie") {
					System.out.println("It's a tie!");
				}
				else
					System.out.println("The winner is " + winner );
			} catch(NoSuchElementException e) {
				System.out.println("You need to input 'rock, paper, or scissor'");
			}
		}
	}
		
	public static void checkInput(String input) {
		if(!(input.equals("rock") || input.equals("paper") || input.equals("scissor")))
			throw new NoSuchElementException();
	}
	//
//	method randomly chooses a number between 1 and 3
//	method returns a String of a corresponding output 
	
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
		
		if (user.equals(computer))
			output = "tie";
		else if (user.equals("rock")) {
			if (computer.equals("paper")) {
				output = "computer";
			}
			else
				output = "user";
			}
		else if (user.equals("paper")) {
			if (computer.equals("rock")) {
				output = "computer";
			}
			else
				output = "user";
		}
		else if (user.equals("scissor")){
			if (computer.equals("rock")) {
				output = "computer";
			}
			else
				output = "user";
		}
		System.out.println(output);
		return output;
	}

}
