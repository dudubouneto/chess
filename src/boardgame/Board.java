package boardgame;

public class Board {
	
	private int rows;
	private int columns;
	
	private Piece[][] pieces;

	public Board(int rows, int columns) {
		//Condições de existência
		if(rows < 1 || columns < 1) {
			throw new BoardException("Erro criando tabuleiro! É necessário que haja pelo menos 1 linha E 1 coluna...");
		}
		this.rows = rows;
		this.columns = columns;
		pieces = new Piece[rows][columns];
	}

	public int getRows() {
		return rows;
	}
	/*
	protected void setRows(int rows) {
		this.rows = rows;
	}
	*/

	public int getColumns() {
		return columns;
	}
	/*
	protected void setColumns(int columns) {
		this.columns = columns;
	}
	*/
	
	public Piece piece(int row, int column) {
		if (!positionExists(row, column)) {
			throw new BoardException("Posição não existe no tabuleiro");
		}
		return pieces[row][column];
	}
	
	public Piece piece(Position position) {
		//Tratamento de exceções
		if (!positionExists(position)) {
			throw new BoardException("Posição não existe no tabuleiro");
		}
		return pieces[position.getRow()][position.getColumn()];
	}
	
	public void placePiece(Piece piece, Position position) {
		//Tratamento de exceções
		if (thereIsAPiece(position)) {
			throw new BoardException("Já existe uma peça ali (" + position + ")");
		}
		pieces[position.getRow()][position.getColumn()] = piece;
		piece.position = position;
	}
	/************ EXCEÇõES ************/
	//Funções que verificam existência da posição
	private boolean positionExists(int row, int column) {
		boolean ret;
		if ((row >= rows || column >= columns) || (row < 0 || column < 0)) {
			ret = false;
		}
		else {
			ret = true;
		}
		return ret;
	}
	
	public boolean positionExists(Position position) {
		return positionExists(position.getRow(), position.getColumn());
	}
	
	//Verifica se a posição está ocupada por uma peça
	public boolean thereIsAPiece(int row, int column) {
		if (!positionExists(row, column)) {
			throw new BoardException("Posição não existe no tabuleiro");
		}
		boolean tiap;
		if (pieces[row][column] == null) {
			tiap = true;
		}
		else {
			tiap = false;
		}
		return tiap;
	}
	/* Solução que faz reuso do código
	public boolean thereIsAPiece(Position position) {
		return thereIsAPiece(position.getRow(), position.getColumn());
	}
	*/
	//Solução "inteligente"
	public boolean thereIsAPiece(Position position) {
		if (!positionExists(position)) {
			throw new BoardException("Posição não existe no tabuleiro");
		}
		return piece(position) != null;
	}
	
	
	
}
