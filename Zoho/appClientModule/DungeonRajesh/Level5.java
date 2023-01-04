package DungeonRajesh;

public class Level5 extends Level1 {
	int[][] pits;
	Level5(int row, int column, int adventureX, int adventureY, int goldX, int goldY,int[][] pitXYs) {
		super(row, column, adventureX, adventureY, goldX, goldY);
		for(int i=0;i<pitXYs.length;i++)
	   	 {
	   			matrix[pitXYs[i][0]][pitXYs[i][1]]=0;
	   		 }
}
	int find()
    {
		return findShortest(matrix, adventureX, adventureY, goldX, goldY);
    }
}
	
