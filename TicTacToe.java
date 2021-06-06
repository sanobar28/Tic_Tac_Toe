package com;

import java.util.*;

public class TicTacToe {

	static String[] board;
	static String turn;

	/**
	 * @ UC-1 to create and print board
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
	 * Decide who will play first
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

	}

}