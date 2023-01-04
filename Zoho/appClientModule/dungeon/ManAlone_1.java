package dungeon;

import java.util.Scanner;

public class ManAlone_1 {
	
//	MAN Alone

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter the No of Rows & No of Columns in the Dungeon");
		int rows = scan.nextInt();
		int column = scan.nextInt();
//		Dungeon Creation
		Dungeon d = new Dungeon(rows, column);
		
		System.out.println("Please enter the Row & column of the Man in the Dungeon");
		int rowMan = scan.nextInt();		
		int columnMan = scan.nextInt();
//		Man Object Addition
		ObjectPosition man = new ObjectPosition(rowMan, columnMan, "Man");
		d = d.addObject(man);
		
		
		System.out.println("Please enter the Row & column of the Gold in the Dungeon");
		int rowGold = scan.nextInt();		
		int columnGold = scan.nextInt();
//		Gold Object Addition
		ObjectPosition gold = new ObjectPosition(rowGold, columnGold, "Gold");
		d = d.addObject(gold);
//		Dungeon Print
		d.print();
//		Distance Calculated
		int dis = d.shortDistance(man,gold);
		System.out.println("\n" + dis + " units distance");
		
	}
}


//Dungeon d = new Dungeon(5, 4);
//ObjectPosition man = new ObjectPosition(5, 1, "Man");
//ObjectPosition gold = new ObjectPosition(1, 4, "Gold");
//d = d.addObject(man);
//d = d.addObject(gold);
