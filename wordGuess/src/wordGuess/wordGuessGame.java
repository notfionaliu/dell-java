package wordGuess;

import java.util.*; //import it all 
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;


public class wordGuessGame {

	public static void main(String [] args) {
//		game logic will go here 
		
		ArrayList<String> array = new ArrayList<String>(); // create a second arrayList for FileReader
		// i had an impossible time figuring out how Java would be able to access the text file
		
		try {
			BufferedReader in = new BufferedReader(new FileReader("src/words.txt"));
			String sCurrentLine;
		
			while((sCurrentLine = in.readLine()) != null) {
				array.add(sCurrentLine);
			}
			in.close();
		} catch (FileNotFoundException e) {
			System.out.println("File was not found");
		} catch (IOException e) {
			System.out.println("IOException");
			// error handling for this to come
		}
		
		int randomNumber = randomNumberGen(array);
		
		// a few things to keep track of
		// word is from the text file
		// hiddenWord is the word, but in dashes
		// lettersArray is the ArrayList of letters the user has already guessed
		String word = array.get(randomNumber);
		String hiddenWord = hiddenString(word);
		ArrayList<String> lettersArray = new ArrayList<>();
		

		Scanner scan = new Scanner(System.in); // instantiate a scanner class for user input
		
		boolean complete = true;  // boolean value checks whether or not we close the game
		
		// start game code 
		System.out.println("Game begins!");
		System.out.println(hiddenWord);
		while(complete != false) {
			System.out.println("Guess a letter ... lowercase only");
			//only display previous letters if there are values in the Array
			if (lettersArray.size() != 0) {
				System.out.println("You have already guessed these letters: " + lettersArray.toString()); 
			}
			String input = scan.nextLine();
			if (input.length() == 1 ) {
				char letter = input.charAt(0);
				// future versions of this would prevent users from trying the same letter twice
				lettersArray.add(String.valueOf(letter));
				hiddenWord = newHiddenString(letter, word, hiddenWord);
				System.out.println(hiddenWord);
				complete = checkComplete(word, hiddenWord);
			} else
				System.out.println("INVALID INPUT. Please enter only one letter. ");

		}
		
	}
	
	// randomNumberGenerator class receives a list
	// size of the arrayList is the upper bound of the class
	// uses the Random class to create a random number that is smaller than the size of the ArrayList
	public static int randomNumberGen(ArrayList<String> list) {
		Random randomNumberGenerator = new Random();
		int bound = list.size();
		int randomNum = randomNumberGenerator.nextInt(bound);
		return randomNum;
	}
	
	public static String hiddenString(String string) {
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < string.length(); i++) {
			sb.append("-");
		}
		return sb.toString();
	}
	
	public static String newHiddenString(char letter, String word, String hiddenString) {
		StringBuilder sb = new StringBuilder(hiddenString);
		for(int i = 0; i < word.length(); i++) {
			if(word.charAt(i) == letter) {
				sb.setCharAt(i, letter);
			}
		}
		return sb.toString(); // this is the new "hiddenWord" 
	}
	
	public static boolean checkComplete(String word, String hiddenWord) {
		if (word.equals(hiddenWord)) {
			System.out.println("Success! game complete!");
			return false;
		}

		else
			return true;
			
	}
	
}
