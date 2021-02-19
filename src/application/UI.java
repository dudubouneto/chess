package application;

import chess.ChessPiece;
import chess.Color;

public class UI {

	public static final String ANSI_BLACK = "\u001B[30m";
	public static final String ANSI_RED = "\u001B[31m";
	public static final String ANSI_GREEN = "\u001B[32m";
	public static final String ANSI_YELLOW = "\u001B[33m";
	public static final String ANSI_BLUE = "\u001B[34m";
	public static final String ANSI_PURPLE = "\u001B[35m";
	public static final String ANSI_CYAN = "\u001B[36m";
	public static final String ANSI_WHITE = "\u001B[37m";

	public static final String ANSI_BLACK_BACKGROUND = "\u001B[40m";
	public static final String ANSI_RED_BACKGROUND = "\u001B[41m";
	public static final String ANSI_GREEN_BACKGROUND = "\u001B[42m";
	public static final String ANSI_YELLOW_BACKGROUND = "\u001B[43m";
	public static final String ANSI_BLUE_BACKGROUND = "\u001B[44m";
	public static final String ANSI_PURPLE_BACKGROUND = "\u001B[45m";
	public static final String ANSI_CYAN_BACKGROUND = "\u001B[46m";
	public static final String ANSI_WHITE_BACKGROUND = "\u001B[47m";

	public static final String ANSI_RESET = "\u001B[0m" + ANSI_BLACK_BACKGROUND;

	private static void printPiece(ChessPiece piece) {
		if (piece == null) {
			System.out.print(ANSI_WHITE + "-" + ANSI_RESET);
		} else {
			if (piece.getColor() == Color.WHITE) {
				System.out.print(ANSI_WHITE + piece + ANSI_RESET);
			} else {
				System.out.print(ANSI_YELLOW + piece + ANSI_RESET);
			}
		}

		System.out.print(" ");
	}

	public static void printBoard(ChessPiece[][] pieceMat) {
		for (int i = 0; i < pieceMat.length; i++) {
			// Printando a margem do tabuleiro
			System.out.print(ANSI_WHITE + (8 - i) + " " + ANSI_RESET);
			for (int j = 0; j < pieceMat.length; j++) {
				printPiece(pieceMat[i][j]);
			}
			// Pulando linha
			System.out.println();
		}
		// Margem inferior
		System.out.println(ANSI_WHITE + "  a b c d e f g h" + ANSI_RESET);
	}
}
