package chess;

import boardgame.Board;

public class ChessMatch {

	public Board board;
	
	public ChessMatch() {
		board = new Board(8, 8);
	}
	
	public ChessPiece[][] getPieces() {
		ChessPiece[][] matPieces = new ChessPiece[board.getRows()][board.getColumns()];

		for (int i = 1; i < board.getRows(); i++) {
			for (int j = 1; j < board.getColumns(); j++) {
				matPieces[i][j] = (ChessPiece) board.piece(i, j);
			}
		}
		
		return matPieces;
	}
	
	
}
