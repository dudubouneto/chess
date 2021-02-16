package application;

import chess.ChessPiece;

public class UI {

	
	private static void printPiece(ChessPiece piece) {
		if (piece == null) {
			System.out.print("- ");
		}
		else {
			System.out.print(piece + " ");
		}
	}
	
	public static void printBoard (ChessPiece[][] pieceMat) {
		for (int i = 0; i < pieceMat.length; i++) {
			//Printando a margem do tabuleiro
			System.out.print(8 - i + " ");
			for (int j = 0; j < pieceMat.length; j++) {
				printPiece(pieceMat[i][j]);
			}
			//Pulando linha
			System.out.println();
		}
		//Margem inferior
		System.out.println("  a b c d e f g h");
	}
}
