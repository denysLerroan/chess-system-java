package boardgame;

public class Piece {

	protected Position position;
	private Board board;
	
	public Piece(Board board) {
		this.board = board;
		position = null; //Nao ha necessidade de declarar position aqui, pois, por padrao o java ja adiciona automaticamente
	}

	protected Board getBoard() {
		return board;
	}
	
	
	
	
}
