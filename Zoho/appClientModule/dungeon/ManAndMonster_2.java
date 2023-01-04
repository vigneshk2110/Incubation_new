package dungeon;

import java.util.Scanner;

public class ManAndMonster_2 {
	
//	MAN && MONSTER

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
		
		System.out.println("Please enter the Row & column of the Monster in the Dungeon");
		int rowMonster = scan.nextInt();		
		int columnMonster = scan.nextInt();
//		Monster Object Addition
		ObjectPosition monster = new ObjectPosition(rowMonster, columnMonster, "Monster");
		d = d.addObject(monster);
		
		
//		Dungeon Print
		d.print();
				
		
		int manAndGoldDis = d.shortDistance(man,gold);
//		System.out.println(manAndGoldDis + "--- Man & Gold");
		int monsterAndGoldDis = d.shortDistance(monster,gold);
//		System.out.println(monsterAndGoldDis + "--- Monster & Gold");
		
		if (manAndGoldDis<=monsterAndGoldDis) {
			System.out.println(manAndGoldDis + " Units Distance");
		} else {
			System.out.println("No Possible Solution");
		}
	}

}


//Dungeon d = new Dungeon(5, 4);
//ObjectPosition man = new ObjectPosition(1, 3, "Man");
//ObjectPosition gold = new ObjectPosition(3, 4, "Gold");
//d = d.addObject(man);
//d = d.addObject(gold);
//ObjectPosition monster = new ObjectPosition(5, 1, "Monster");
//d = d.addObject(monster);
