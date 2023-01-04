package DungeonRajesh;

public class Level3 extends Level2 {

	Level3(int row, int column, int adventureX, int adventureY, int goldX, int goldY, int monsterX, int monsterY) {
		super(row, column, adventureX, adventureY, goldX, goldY, monsterX, monsterY);
	}
	void printRowRight(int start,int end,int constant)
	{
		for(int i=start;i<end;i++)
			System.out.print("("+(constant+1)+","+(i+1)+")->");
		System.out.print("("+(constant+1)+","+(end+1)+")");
	}
    void printColumnDown(int start,int end,int constant)
	{
		for(int i=start;i<end;i++)
			System.out.print("("+(i+1)+","+(constant+1)+")->");
		System.out.print("("+(end+1)+","+(constant+1)+")");
	}
    void printRowLeft(int start,int end,int constant)
	{
		for(int i=start;i>end;i--)
			System.out.print("("+(constant+1)+","+(i+1)+")->");
		System.out.print("("+(constant+1)+","+(end+1)+")");
	}
	void printColumnUp(int start,int end,int constant)
	{
		for(int i=start;i<end;i--)
			System.out.print("("+(i+1)+","+(constant+1)+")->");
		System.out.print("("+(end+1)+","+(constant+1)+")");
	}
	void findWithPath()
	{
		if(adventureX < goldX)
		{
			if(adventureY < goldY)
			{
				printRowRight(adventureY,goldY,adventureX);
				System.out.print("->");
				printColumnDown(adventureX+1,goldX,goldY);
			}
			else if(adventureY > goldY)
			{
				printColumnDown(adventureX,goldX,adventureY);
				System.out.print("->");
				printRowLeft(adventureY-1, goldY,goldX);
			}
			else 
			{
				printColumnDown(adventureX,goldX,adventureY);
			}
		}
		else if(adventureX > goldX)
		{
			if(adventureY < goldY)
			{
				printRowRight(adventureY,goldY,adventureX);
				System.out.print("->");
				printColumnUp(adventureX-1, goldX,goldY);
			}
			else if(adventureY > goldY)
			{
				printColumnUp(adventureX, goldX,adventureY);
				System.out.print("->");
				printRowLeft(adventureY-1, goldY,goldX);
			}
			else 
			{
				printColumnUp(adventureX, goldX,goldY);
			}
		}
		else
		{
			if(adventureY < goldY)
			{
				printRowRight(adventureY,goldY,adventureX);
			}
			else if(adventureY > goldY)
			{
				printRowLeft(adventureY, goldY,goldX);
			}
			else 
			{
				System.out.println("("+adventureX+","+adventureY+")");
			}
		}
	}

}
