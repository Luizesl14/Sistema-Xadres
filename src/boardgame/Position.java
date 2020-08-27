package boardgame;

public class Position {
     private int row;
     private int column;
     
     public Position(int row, int column) { // Construtor
    	 this.row = row;
    	 this.column = column;
     }

	public int getRow() {                   // Getters & Setters
		return row;
	}

	public void setRow(int row) {
		this.row = row;
	}

	public int getColumn() {
		return column;
	}

	public void setColumn(int column) {
		this.column = column;
	}
	                                       // Methodo toString
	@Override
	public String toString() {
		return row + ", " + column;
	}
}
