package Problems;

public class Pathfinder {

    private int[][] matrix;
    private int matrixLenghtI;
    private int matrixLenghtJ;

    public Pathfinder(int[][] matrix, int matrixLenghtI, int matrixLenghtJ) {
        this.matrix = matrix;
        this.matrixLenghtI = matrixLenghtI;
        this.matrixLenghtJ = matrixLenghtJ;
    }

    public static void main(String[] args) {

        int matrixLenghtI = 6;
        int matrixLenghtJ = 5;

        int[][] matrix1 = { { 3, 13, 15, 28, 30 }, { 40, 51, 52, 29, 30 }, { 28, 10, 53, 54, 54 },
                { 53, 12, 55, 53, 60 }, { 70, 62, 56, 20, 80 }, { 80, 81, 90, 95, 100 } };

        int[][] matrix2 = { { 5, 13, 2, 5, 2 }, { 58, 24, 32, 3, 24 }, { 2, 7, 33, 1, 7 }, { 45, 40, 37, 24, 70 },
                { 47, 34, 12, 25, 2 }, { 52, 56, 68, 76, 100 } };

        Pathfinder finder1 = new Pathfinder(matrix1, matrixLenghtI, matrixLenghtJ);
        finder1.run();

        Pathfinder finder2 = new Pathfinder(matrix2, matrixLenghtI, matrixLenghtJ);
        finder2.run();
    }

    private void run() {
        int i = 0;
        int j = 0;

        System.out.print("(" + i + "," + j + ")");
        System.out.println("\nLength: " + find(i, j));
    }

    private int find(int i, int j) {
        int value = matrix[i][j];
        int[] next = { i, j };

        int smallestNeighbour = 101;
        if (i > 0 && matrix[i - 1][j] > value) {
            smallestNeighbour = matrix[i - 1][j];
            next[0] = i - 1;
            next[1] = j;
        }
        if (j > 0 && matrix[i][j - 1] < smallestNeighbour && matrix[i][j - 1] > value) {
            smallestNeighbour = matrix[i][j - 1];
            next[0] = i;
            next[1] = j - 1;
        }
        if (i < matrixLenghtI - 1 && matrix[i + 1][j] < smallestNeighbour && matrix[i + 1][j] > value) {
            smallestNeighbour = matrix[i + 1][j];
            next[0] = i + 1;
            next[1] = j;
        }
        if (j < matrixLenghtJ - 1 && matrix[i][j + 1] < smallestNeighbour && matrix[i][j + 1] > value) {
            smallestNeighbour = matrix[i][j + 1];
            next[0] = i;
            next[1] = j + 1;
        }

        System.out.print("->(" + next[0] + "," + next[1] + ")");

        if (i == matrixLenghtI - 1 && j == matrixLenghtJ - 1)
            return 1;

        return find(next[0], next[1]) + 1;
    }
}