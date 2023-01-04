package DungeonRajesh;

public class Level1 extends Shortest {
    int row,column,adventureX,adventureY,goldX,goldY;
    int[][] matrix;
    Level1(int row,int column,int adventureX,int adventureY,int goldX,int goldY)
    {
    	this.row=row;
    	this.column=column;
    	this.adventureX=adventureX;
    	this.adventureY=adventureY;
    	this.goldX=goldX;
    	this.goldY=goldY;
    	matrix = new int[row][column];
    	for(int i=0;i<row;i++)
    	{
    		for(int j=0;j<column;j++)
    		{
    			matrix[i][j]=1;
    		}
    	}
    }
    int find()
    {
    	return findShortest(matrix, adventureX, adventureY, goldX, goldY);
    }

}
