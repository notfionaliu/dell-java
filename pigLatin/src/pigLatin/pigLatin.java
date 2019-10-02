package pigLatin;

import java.util.Scanner;

public class pigLatin {

public static void main(String[] args) {
	
	System.out.println("Give me a word, any word!");
	Scanner scan = new Scanner(System.in);
	String input = scan.nextLine();
	scan.close();
	
	String latin = translate(input);
	System.out.println(input + " in pig latin is " + latin);

	
}
	public static String translate(String word) {
		char first = word.charAt(0);
		String firstChar = String.valueOf(first);
		String latin = null;
		if ( firstChar.equals("a") || firstChar.equals("e") || firstChar.equals("i") || firstChar.equals("o") || firstChar.equals("u")) {
			latin = word.concat("yay");
		}
		else {
			if(word.contains("a") || word.contains("e") || word.contains("i") || word.contains("o") || word.contains("u")) {
				latin = word.substring(1);
				latin = latin.concat(firstChar);
				latin = latin.concat("ay");
				
			}
			else {
				latin = word.concat("kay");
			}

				}
		return latin;
	}
}
	
	
