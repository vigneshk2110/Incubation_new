package DungeonRajesh;

public class Level2 extends Level1 {
	int monsterX,monsterY;

	Level2(int row, int column, int adventureX, int adventureY, int goldX, int goldY,int monsterX,int monsterY) {
		super(row, column, adventureX, adventureY, goldX, goldY);
		this.monsterX=monsterX;
		this.monsterX=monsterY;
		}
    int find()
    {
    	int adventurerDistance = findShortest(matrix, adventureX, adventureY, goldX, goldY);
    	int monsterDistance = findShortest(matrix, monsterX, monsterY, goldX, goldY);
    	if( adventurerDistance <= monsterDistance)
    		return adventurerDistance;
    	return Integer.MAX_VALUE;
    	
    }
	

}
