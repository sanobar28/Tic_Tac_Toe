package com;

import java.util.*;

public class TicTacToe {

	static String[] board;
	static String turn;

	/**
	 * @ Method to create and print board
	 */
	static void printBoard() {
		System.out.println("|---|---|---|");
		System.out.println("| " + board[0] + " | " + board[1] + " | " + board[2] + " |");
		System.out.println("|-----------|");
		System.out.println("| " + board[3] + " | " + board[4] + " | " + board[5] + " |");
		System.out.println("|-----------|");
		System.out.println("| " + board[6] + " | " + board[7] + " | " + board[8] + " |");
		System.out.println("|---|---|---|");
	}
	
	/**
	 * Method to check winner  
	 * @return
	 */
	 static String checkWinner()
	    {
	        for (int a = 0; a < 8; a++) {
	            String line = null;
	  
	            switch (a) {
	            case 0:
	                line = board[0] + board[1] + board[2];
	                break;
	            case 1:
	                line = board[3] + board[4] + board[5];
	                break;
	            case 2:
	                line = board[6] + board[7] + board[8];
	                break;
	            case 3:
	                line = board[0] + board[3] + board[6];
	                break;
	            case 4:
	                line = board[1] + board[4] + board[7];
	                break;
	            case 5:
	                line = board[2] + board[5] + board[8];
	                break;
	            case 6:
	                line = board[0] + board[4] + board[8];
	                break;
	            case 7:
	                line = board[2] + board[4] + board[6];
	                break;
	            }
	            //For X winner
	            if (line.equals("XXX")) {
	                return "X";
	            }
	              
	            // For O winner
	            else if (line.equals("OOO")) {
	                return "O";
	            }
	        }
	          
	        for (int a = 0; a < 9; a++) {
	            if (Arrays.asList(board).contains(
	                    String.valueOf(a + 1))) {
	                break;
	            }
	            else if (a == 8) {
	                return "draw";
	            }
	        }
	  
	       // To enter the X Or O at the exact place on board.
	        System.out.println(
	            turn + "'s turn; enter a slot number to place "
	            + turn + " in:");
	        return null;
	    }
	 
	
	

	/**
	 * Decide who will play first and take user position
	 * @param args
	 */

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		board = new String[9];
		turn = "X";
		String winner = null;

		for (int a = 0; a < 9; a++) {
			board[a] = String.valueOf(a + 1);
		}

		System.out.println("Welcome to Tic Tac Toe Game.");
		printBoard();

		System.out.println("X will play first. Enter a slot number to place X in:");
		
		// logic to take user position
		while (winner == null) {
            int numInput;
          
            try {
                numInput = in.nextInt();
                if (!(numInput > 0 && numInput <= 9)) {
                    System.out.println(
                        "Invalid input; re-enter slot number:");
                    continue;
                }
            }
            catch (InputMismatchException e) {
                System.out.println(
                    "Invalid input; re-enter slot number:");
                continue;
            }

		}

	}
	
}