package application;

import chess.ChessMatch;

public class Program {
	public static final String ANSI_BLACK_BACKGROUND = "\u001B[40m";
	public static final String ANSI_RESET = "\u001B[0m";
	
	public static void main(String[] args) {
		ChessMatch chessMatch = new ChessMatch();

		System.out.print(ANSI_BLACK_BACKGROUND);

		UI.printBoard(chessMatch.getPieces());

		// Voltando terminal pra cor normal
		System.out.print(ANSI_RESET);
	}

}
