package DungeonRajesh;

import java.util.Scanner;

public class Main 
{
	private static void Level1(Scanner sc)
	{
		System.out.println("Dimension of the dungeon(Row x Column) : ") ;
		int row = sc.nextInt();
		int column = sc.nextInt();
		System.out.println("Position of the Adventurer : ");
		int adventurerX = sc.nextInt();
		int adventurerY = sc.nextInt();
		System.out.println("Position of the Gold : ");
		int goldX = sc.nextInt();
		int goldY = sc.nextInt();
		Level1 l1 = new Level1(row, column, adventurerX-1, adventurerY-1, goldX-1, goldY-1);
		System.out.println("The Minimum number of Steps : "+l1.find());
	}
	private static void Level2(Scanner sc)
	{
		System.out.println("Dimension of the dungeon(Row x Column) : ") ;
		int row = sc.nextInt();
		int column = sc.nextInt();
		System.out.println("Position of the Adventurer : ");
		int adventurerX = sc.nextInt();
		int adventurerY = sc.nextInt();
		System.out.println("Position of the Monster : ");
		int monsterX = sc.nextInt();
		int monsterY = sc.nextInt();
		System.out.println("Position of the Gold : ");
		int goldX = sc.nextInt();
		int goldY = sc.nextInt();
		Level2 l2 = new Level2(row, column, adventurerX-1, adventurerY-1,goldX-1, goldY-1,monsterX-1, monsterY-1);
		int distance = l2.find();
		if(distance != Integer.MAX_VALUE)
			System.out.println("The Minimum number of Steps : "+distance);
		else
			System.out.println("No possible Solution");
	}
	private static void Level3(Scanner sc)
	{
		System.out.println("Dimension of the dungeon(Row x Column) : ") ;
		int row = sc.nextInt();
		int column = sc.nextInt();
		System.out.println("Position of the Adventurer : ");
		int adventurerX = sc.nextInt();
		int adventurerY = sc.nextInt();
		System.out.println("Position of the Monster : ");
		int monsterX = sc.nextInt();
		int monsterY = sc.nextInt();
		System.out.println("Position of the Gold : ");
		int goldX = sc.nextInt();
		int goldY = sc.nextInt();
		Level3 l3 = new Level3(row, column, adventurerX-1, adventurerY-1,goldX-1, goldY-1 ,monsterX-1, monsterY-1);
		int distance = l3.find();
		if(distance != Integer.MAX_VALUE) {
			System.out.println("The Minimum number of Steps : "+distance);
			l3.findWithPath();	
		}
		else
			System.out.println("No possible Solution");

	}
	private static void Level4(Scanner sc)
	{
		System.out.println("Dimension of the dungeon(Row x Column) : ") ;
		int row = sc.nextInt();
		int column = sc.nextInt();
		System.out.println("Position of the Adventurer : ");
		int adventurerX = sc.nextInt();
		int adventurerY = sc.nextInt();
		System.out.println("Position of the Monster : ");
		int monsterX = sc.nextInt();
		int monsterY = sc.nextInt();
		System.out.println("Position of the Trigger : ");
		int triggerX = sc.nextInt();
		int triggerY = sc.nextInt();
		System.out.println("Position of the Gold : ");
		int goldX = sc.nextInt();
		int goldY = sc.nextInt();
		Level4 l4 = new Level4(row, column, adventurerX-1, adventurerY-1,goldX-1, goldY-1,monsterX-1, monsterY-1,triggerX-1,triggerY-1);
		System.out.println("The Minimum number of Steps : "+l4.find());	  
	}
	private static void Level5(Scanner sc)
	{
		System.out.println("Dimension of the dungeon(Row x Column) : ") ;
		int row = sc.nextInt();
		int column = sc.nextInt();
		System.out.println("Position of the Adventurer : ");
		int adventurerX = sc.nextInt();
		int adventurerY = sc.nextInt();
		System.out.println("Position of the Gold : ");
		int goldX = sc.nextInt();
		int goldY = sc.nextInt(); 
		System.out.println("Enter the number of Pits : ");
		int noOfPits = sc.nextInt();
		int[][] pitXYs = new int[noOfPits][2];
		for(int i=0;i<noOfPits;i++)
		{
			System.out.println("Position of Pit "+(i+1)+" : ");
			for(int j=0;j<2;j++)
			{
				pitXYs[i][j] = sc.nextInt()-1;
			}
		}
		Level5 l5 = new Level5(row, column, adventurerX-1, adventurerY-1, goldX-1, goldY-1, pitXYs);
		int distance = l5.find();
		if(distance!=Integer.MAX_VALUE)
			System.out.println("The Minimum number of Steps : "+distance);
		else
			System.out.println("No possible Solution");
	}
	private static void Level6(Scanner sc)
	{
		System.out.println("Dimension of the dungeon(Row x Column) : ") ;
		int row = sc.nextInt();
		int column = sc.nextInt();
		System.out.println("Position of the Adventurer : ");
		int adventurerX = sc.nextInt();
		int adventurerY = sc.nextInt();
		System.out.println("Position of the Monster : ");
		int monsterX = sc.nextInt();
		int monsterY = sc.nextInt();
		System.out.println("Position of the Gold : ");
		int goldX = sc.nextInt();
		int goldY = sc.nextInt(); 
		System.out.println("Enter the number of Pits : ");
		int noOfPits = sc.nextInt();
		int[][] pitXYs = new int[noOfPits][2];
		for(int i=0;i<noOfPits;i++)
		{
			System.out.println("Position of Pit "+(i+1)+" : ");
			for(int j=0;j<2;j++)
			{
				pitXYs[i][j] = sc.nextInt()-1;
			}
		}
		Level6 l6 = new Level6(row, column, adventurerX-1, adventurerY-1, monsterX-1, monsterY-1, goldX-1, goldY-1, pitXYs);
		int distance = l6.find();
		if(distance!=Integer.MAX_VALUE)
			System.out.println("The Minimum number of Steps : "+distance);
		else
			System.out.println("No possible Solution");
	}
	private static void Level7(Scanner sc)
	{
		System.out.println("Dimension of the dungeon(Row x Column) : ") ;
		int row = sc.nextInt();
		int column = sc.nextInt();
		System.out.println("Position of the Adventurer : ");
		int adventurerX = sc.nextInt();
		int adventurerY = sc.nextInt();
		System.out.println("Position of the Monster : ");
		int monsterX = sc.nextInt();
		int monsterY = sc.nextInt();
		System.out.println("Position of the Trigger : ");
		int triggerX = sc.nextInt();
		int triggerY = sc.nextInt();
		System.out.println("Position of the Gold : ");
		int goldX = sc.nextInt();
		int goldY = sc.nextInt(); 
		System.out.println("Enter the number of Pits : ");
		int noOfPits = sc.nextInt();
		int[][] pitXYs = new int[noOfPits][2];
		for(int i=0;i<noOfPits;i++)
		{
			System.out.println("Position of Pit "+(i+1)+" : ");
			for(int j=0;j<2;j++)
			{
				pitXYs[i][j] = sc.nextInt()-1;
			}
		}
		Level7 l7 = new Level7(row, column, adventurerX-1, adventurerY-1, monsterX-1, monsterY-1, goldX-1, goldY-1, triggerX-1, triggerY-1, pitXYs);
		int distance = l7.find();
		if(distance!=Integer.MAX_VALUE)
			System.out.println("The Minimum number of Steps : "+distance);
		else
			System.out.println("No possible Solution");
	}
	public static void main(String[] args) 
	{
		while(true)
		{
			System.out.println("DUNGEON GAME\n1.LEVEL 1\n2.LEVEL 2\n3.LEVEL 3\n4.LEVEL 4\n5.LEVEL 5\n6.LEVEL 6\n7.LEVEL 7\n8.EXIT");
			System.out.println("Enter your Choice : ");
			Scanner in = new Scanner(System.in);
			int level = in.nextInt();

			switch(level)
			{
			case 1:
				Level1(in);
				break;
			case 2:
				Level2(in);
				break;
			case 3:
				Level3(in);
				break;
			case 4:
				Level4(in);
				break;
			case 5:
				Level5(in);
				break;
			case 6:
				Level6(in);
				break;
			case 7:
				Level7(in);
				break;
			case 8:{
				in.close();
				return;
			}
			default:
				System.out.println("Enter Correct Choice : ");
			}
		}
	}
}
