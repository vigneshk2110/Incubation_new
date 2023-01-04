package dungeon;

public class DeadlyPits {

	public static void main(String[] args) {
		Dungeon d = new Dungeon(5, 5);
		ObjectPosition man = new ObjectPosition(5, 1, "Man");
		ObjectPosition gold = new ObjectPosition(1, 4, "Gold");
		d = d.addObject(man);
		d = d.addObject(gold);
		ObjectPosition pit1 = new ObjectPosition(2, 2, "Pit");
		ObjectPosition pit2 = new ObjectPosition(4, 1, "Pit");
		ObjectPosition pit3 = new ObjectPosition(3, 5, "Pit");
		d = d.addObject(pit1);
		d = d.addObject(pit2);
		d = d.addObject(pit3);
		d.print();
		
		int manGoldPits = d.disManGoldPits(man, gold,pit1,pit2,pit3);
		

	}

}
