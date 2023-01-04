package DungeonRajesh;

public class Level7 extends Level6 {
	int triggerX,triggerY;
	Level7(int row, int column, int adventureX, int adventureY, int monsterX, int monsterY, int goldX, int goldY,int triggerX,
			int triggerY,int[][] pitXYs) {
		super(row, column, adventureX, adventureY, monsterX, monsterY, goldX, goldY, pitXYs);
		this.triggerX=triggerX;
		this.triggerY=triggerY;
	}
	int find()
    {
		int adventurerDistance = findShortest(matrix, adventureX, adventureY, goldX, goldY);
    	int adventurerToTrigger = findShortest(matrix, adventureX, adventureY, triggerX, triggerY);
    	int triggerToGold = findShortest(matrix, triggerX, triggerY, goldX, goldY);
    	System.out.println(triggerToGold);
    	for(int i=0;i<row;i++)
    	{
    		for(int j=0;j<column;j++)
    		{
    			matrix[i][j]=1;
    		}
    	}
    	int monsterDistance = findShortest(matrix, monsterX, monsterY, goldX, goldY);
    	if( adventurerDistance <= monsterDistance)
    		return adventurerDistance;
    	else {
    		return (adventurerToTrigger+triggerToGold);
    		 }
    	
    }

}
