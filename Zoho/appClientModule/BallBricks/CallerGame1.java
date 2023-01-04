package BallBricks;

public class CallerGame1 extends GameBoard {

	CallerGame1(int column, int row) {
		super(column, row);
	}

	public static void main(String[] args) {
		
		CallerGame1 cg1 = new CallerGame1(7, 7);
//		GameBoard g1 = new GameBoard(7, 7);
//		cg1.display();  // Empty Board
		cg1.injectBrick();
		cg1.display();

	}
}
