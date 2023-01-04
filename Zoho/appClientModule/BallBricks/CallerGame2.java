package BallBricks;

public class CallerGame2 extends GameBoard {


	CallerGame2(int column, int row) {
		super(column, row);
	}

	public static void main(String[] args) {
		
		CallerGame2 cg2 = new CallerGame2(7, 7);
		cg2.injectBrick();
		cg2.display();
		playGame(cg2);

	}

	private static void playGame(CallerGame2 cg2) {
		int [] zeroPosition = findZeroPositio(cg2);
		
	}

	private static int[] findZeroPositio(CallerGame2 cg2) {
		int []zeroPosition = {0,0};
		
		
		return null;
	}

	
	
	

}
