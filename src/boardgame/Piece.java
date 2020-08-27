package boardgame;

public class Piece {
   protected Position position;
   private Board board;
   
   public Piece(Board board) {
	   this.board = board;
	   position = null;
	   
   }


   protected void getBoard(Board board) {
	this.board = board;
   }
   
}
