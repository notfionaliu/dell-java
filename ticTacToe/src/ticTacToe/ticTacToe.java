package ticTacToe;

import java.util.*;

public class ticTacToe {

	public static void main(String[] args) {
		String rowString;
		String colString;
		int row;
		int col;
		String player = "X"; // player is initialized to be player X
		boolean win = false; // game starts with no winner
		
		Scanner scan = new Scanner(System.in);
		String grid[][] = new String[3][3];

		System.out.println("Let's play TicTacToe!");

		
		while (win != true) {
			System.out.println("Player " + player + " enter a row (0-2)") ;
			rowString = scan.nextLine();
			row = Integer.parseInt(rowString);
			System.out.println("Player " + player + " enter a column (0-2)");
			colString = scan.nextLine();
			col = Integer.parseInt(colString);
			if (checkGrid(grid,row,col) == true) {
				grid[row][col] = player;
				toString(grid);
				player = switchPlayer(player);
			}
			else
				System.out.println("that space is taken, try again!");
		}
		scan.close();
	}
	
//	Prints the current grid 
	static void toString(String array[][]) {
		
		for(int i = 0; i <= 2; i++) {
			for(int j = 0; j <=2; j++){
				System.out.print(array[i][j]);
			}
			System.out.println("");
		}
	}
	
//	Checks if the [row][col] space has been taken 
//	Returns true if the space is gucci
//	returns false if the space is !gucci
	static boolean checkGrid(String array[][], int row, int col) {
		if (array[row][col] == null)
			return true;
		else
			return false;
	}
	
//	Switches player
	static String switchPlayer(String player) {
		if (player.equals("X")){
			player = "O";
		}
		else
			player="X";
		return player;
	}
	
//	sees if there is a winner 
//	returns true if 3 in a row
//	returns false if no winner 
	static Boolean checkWinner(String array[][]) {
		int xCountRow = 0;
		int oCountRow = 0;
		int xCountCol = 0;
		int oCountCol = 0;
		for(int i = 0; i <= 2; i++) {
			if(array[i][0].equals("X")) {
				xCountRow++;
			}
			if(array[i][0].equals("O")) {
				oCountRow++;
			}
		}
		
		for(int j = 0; j <=2; j++) {
			if(array[0][j].equals("X")) {
				xCountCol++;
			}
			if(array[0][j].equals("0")) {
				oCountCol++;
			}
		}
		
		
		
		if (xCountRow == 2 || oCountRow == 2 || xCountCol == 2 || oCountCol == 2) {
			return true;
		}
		else
			return false;
	}

	
}
