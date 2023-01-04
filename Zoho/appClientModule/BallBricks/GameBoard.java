package BallBricks;

import java.util.Arrays;
import java.util.Scanner;

public class GameBoard {
	//	private int column;
	//	private int row;
	private  static String [][] gameBoard;
	private static int ballCount = 3;


	GameBoard(int column, int row) {
		GameBoard.gameBoard = new String[row][column];
		fillBoard();
	}

	private void fillBoard() {
		for (int i = 0; i < gameBoard.length; i++) {
			for (int j = 0; j < gameBoard[i].length; j++) {
				if (i == 0 || j==0 || j == gameBoard.length-1) {
					gameBoard[i][j] = " W ";
				}
				else if (i == gameBoard.length-1 && j != gameBoard.length/2) {
					gameBoard[i][j] = " G ";
				}
				else if (i == gameBoard.length-1 && j == gameBoard.length/2) {
					gameBoard[i][j] = " 0 ";
				}
				else {
					gameBoard[i][j] = "   ";
				}

			}
		}

	}

	public void display() {
		System.out.println();
		for (int i = 0; i < gameBoard.length; i++) {
			for (int j = 0; j < gameBoard[i].length; j++) {
				System.out.print(gameBoard[i][j]);
			}
			System.out.println();
		}
		System.out.println("\n BallCount is " + ballCount);

	}

	public void injectBrick() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter the No of Bricks you want to Inject into the Board");
		int noOfBricks = scan.nextInt();
		for (int i = 0; i < noOfBricks; i++) {
			System.out.println("Please enter the Row , Column & the Brick value with a Space between each other");
			int row = scan.nextInt();
			int column = scan.nextInt();
			String brick = scan.next();
			System.out.println("Do you want to Proceed? Y/N");
			String option = scan.next();
			if (option.equals("y")|| option.equals("Y")) {


				if (brick.length()<2) {
					brick = " "+ brick +" ";
				}
				if (brick.length()<3) {
					brick =  brick +" ";
				}
				gameBoard[row][column] = brick;
			}
			else {
				i--;
			}
		}
		this.display();
	}

	//	public static void injectBricks(GameBoard g2) {
	//		Scanner scan = new Scanner(System.in);
	//		System.out.println("Please enter the No of Bricks you want to Inject into the Board");
	//		int noOfBricks = scan.nextInt();
	//		for (int i = 0; i < noOfBricks; i++) {
	//			System.out.println("Please enter the Row , Column & the Brick value with a Space between each other");
	//			int row = scan.nextInt();
	//			int column = scan.nextInt();
	//			String brick = scan.next();
	//			System.out.println("Do you want to Proceed? Y/N");
	//			String option = scan.next();
	//			if (option.equals("y")|| option.equals("Y")) {
	//				
	//			
	//			if (brick.length()<2) {
	//				brick = " "+ brick +" ";
	//			}
	//			if (brick.length()<3) {
	//				brick =  brick +" ";
	//			}
	//			g2[row][column] = brick;
	//			}
	//			else {
	//				i--;
	//			}
	//		}
	//		this.display();
	//		
	//	}

	public static String[][] getGameBoard() {
		return gameBoard;
	}

	public static int getRow() {
		return gameBoard.length;
	}

	public static int getColumn() {
		return gameBoard[0].length;
	}

	public static int getBallCount() {
		return ballCount;
	}

	public static void injectBricks(String[][] gameBoard2) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter the No of Bricks you want to Inject into the Board");
		int noOfBricks = scan.nextInt();
		for (int i = 0; i < noOfBricks; i++) {
			System.out.println("Please enter the Row , Column & the Brick value with a Space between each other");
			int row = scan.nextInt();
			int column = scan.nextInt();
			String brick = scan.next();
			System.out.println("Do you want to Proceed? Y/N");
			String option = scan.next();
			if (option.equals("y")|| option.equals("Y")) {


				if (brick.length()<2) {
					brick = " "+ brick +" ";
				}
				if (brick.length()<3) {
					brick =  brick +" ";
				}
				gameBoard2[row][column] = brick;
			}
			else {
				i--;
			}
		}

	}

	public void play(String[][] gameBoard2) {
		int []zeroAt = findZero(gameBoard2);
		//		System.out.println(Arrays.toString(zeroAt));
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter any one option. (ST/LD/RD)");
		String direction = scan.next();
		if (direction.equals("ST" ) || direction.equals("st")) {
			outer:
				for (int i = zeroAt[0], j = zeroAt[1]; i >= 0; i--) {
					if (gameBoard2[i][j].equals(" 1 ")) {
						gameBoard2[i][j] = "   ";
						break outer;
					}
				}
		}
		else if (direction.equals("LD" ) || direction.equals("ld")) {

			int i = zeroAt[0], j = zeroAt[1];
			outer1:
				while (i>=0 && j>=0) {
					if (i != 0 && j == 0) {
						inner:
							for (int j2 = 1; j2 < zeroAt.length; j2++) {
								if (gameBoard2[i][j2].equals(" 1 ")) {
									gameBoard2[i][j2] = "   ";
									gameBoard2[zeroAt.length-1][j2] = " 0 ";
									gameBoard2[zeroAt[0]][zeroAt[1]] = " G ";
									ballCount--;
									break outer1;
								}
								if (j2 == zeroAt.length-1) {
									ballCount--;
									break outer1;
								}
							}
					}
					else if (gameBoard2[i][j].equals(" 1 ")) {
						gameBoard2[i][j] = "   ";
						gameBoard2[gameBoard2.length-1][j] = " 0 ";
						gameBoard2[zeroAt[0]][zeroAt[1]] = " G ";
						ballCount--;
						break outer1;
					}
				i--; j--;
				}
		}
		display();
	}



	public int[] findZero(String[][] gameBoardStrings) {
		int []zeroAt = new int [2];
		outer:
			for (int i = 0; i < gameBoardStrings.length; i++) {
				for (int j = 0; j < gameBoardStrings[i].length; j++) {
					if (gameBoardStrings[i][j].equals(" 0 ")) {
						zeroAt[0] = i;
						zeroAt[1] = j;
						break outer;
					}
				}
			}
		return zeroAt;
	}
	//
	//	private int[] findZero(GameBoard gameBoard2) {
	//		int []zeroAt = {0,0};
	//		for (int i = 0; i < GameBoard.row; i++) {
	//			for (int j = 0; j < GameBoard.column; j++) {
	//				if (this.[i][j]) {
	//					
	//				}
	//			}
	//		}
	//		
	//		return zeroAt;
	//	}

	//	public void injectBrick() {
	//		Scanner scan = new Scanner(System.in);
	//		System.out.println("Please enter the Row , Column & the Brick value with a Space between each other");
	//		int row = scan.nextInt();
	//		int column = scan.nextInt();
	//		int brick = scan.nextInt(); 
	//		String brickValue = String.valueOf(brick) + " ";
	//		gameBoard[row][column] = brickValue;
	//	}
	//	
	//	public void injectBricks(int row, int column, int brick) {
	//		gameBoard[row][column] = String.valueOf(brick) + " ";
	//	}

}
