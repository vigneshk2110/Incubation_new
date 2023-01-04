package DungeonRajesh;

public class Shortest {

	public static int findShortest(int[][] mat, int sX, int sY, int dX, int dY) {

		int row = mat.length;
		int column= mat[0].length;
		boolean[][] visited = new boolean[row][column];
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<column;j++)
			{
				if(mat[i][j]==0)
					visited[i][j]=true;
				else
					visited[i][j]=false;

			}
		}
		return visitutil(mat,sX,sY,dX,dY,visited,Integer.MAX_VALUE,0);

	}

	public static int visitutil(int[][] mat, int sX, int sY, int dX, int dY, boolean[][] visited, int shortest,int distance) {
		if(mat[sX][sY]==0 || mat[dX][dY]==0 || !isvalid(mat,sX,sY,visited))
			return Integer.MAX_VALUE;
		if(sX==dX && dY==sY)
			return  Math.min(shortest, distance);
		visited[sX][sY]=true;
		if(isvalid(mat, sX+1, sY, visited))
			shortest = visitutil(mat, sX+1, sY, dX, dY, visited, shortest, distance+1);
		if(isvalid(mat, sX, sY+1, visited))
			shortest = visitutil(mat, sX, sY+1, dX, dY, visited, shortest, distance+1);
		if(isvalid(mat, sX-1, sY, visited))
			shortest = visitutil(mat, sX-1, sY, dX, dY, visited, shortest, distance+1);
		if(isvalid(mat, sX, sY-1,  visited))
			shortest = visitutil(mat, sX, sY-1, dX, dY, visited, shortest, distance+1);
		visited[sX][sY]=false;
		return shortest;

	}

	public static boolean isvalid(int[][] mat, int sX, int sY, boolean[][] visited) {
		if(sX>=0 && sX<mat.length && sY>=0 && sY<mat[0].length && mat[sX][sY]==1 && !visited[sX][sY])
			return true;
		return false;
	}

}