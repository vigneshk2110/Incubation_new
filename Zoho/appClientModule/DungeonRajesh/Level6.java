package DungeonRajesh;

public class Level6 extends Level5 {
    int monsterX,monsterY;
	Level6(int row, int column, int adventureX, int adventureY,int monsterX,int monsterY, int goldX, int goldY, int[][] pitXYs) {
		super(row, column, adventureX, adventureY, goldX, goldY, pitXYs);
		this.monsterX=monsterX;
		this.monsterY=monsterY;
		for(int i=0;i<pitXYs.length;i++)
	   	 {
	   			matrix[pitXYs[i][0]][pitXYs[i][1]]=0;
	   		 }
	}
	int find()
    {
		int adventurerDistance = findShortest(matrix, adventureX, adventureY, goldX, goldY);
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
    	return Integer.MAX_VALUE;
    	
    }
	}
	

