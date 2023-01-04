package DungeonRajesh;

public class Level4 extends Level2
{
int triggerX,triggerY;
	Level4(int row, int column, int adventureX, int adventureY, int goldX, int goldY, int monsterX, int monsterY,int triggerX,int triggerY) {
		super(row, column, adventureX, adventureY, goldX, goldY, monsterX, monsterY);
		this.monsterX=monsterX;
		this.monsterY=monsterY;
		this.triggerX=triggerX;
		this.triggerY=triggerY;
	}
	int find()
    {
    	int adventurerDistance = findShortest(matrix, adventureX, adventureY, goldX, goldY);
    	int monsterDistance = findShortest(matrix, monsterX, monsterY, goldX, goldY);
    	int adventurerToTrigger = findShortest(matrix, adventureX, adventureY, triggerX, triggerY);
    	int triggerToGold = findShortest(matrix, triggerX, triggerY, goldX, goldY);
    	if( adventurerDistance <= monsterDistance)
    		return adventurerDistance;
    	else {
    		return (adventurerToTrigger+triggerToGold);
    		 }
    }
}


