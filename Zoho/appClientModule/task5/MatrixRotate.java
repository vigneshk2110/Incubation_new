package task5;

public class MatrixRotate {

	public static void main(String[] args) {
		int arr[][] = { { 1, 2, 3, 4 },
				{ 5, 6, 7, 8 },
				{ 9, 10, 11, 12 },
				{ 13, 14, 15, 16 } };
		rotate90Clockwise(arr);
		printMatrix(arr);

	}

	private static void rotate90Clockwise(int[][] arr) {
		
//		Transposing the Matrix - Converting Rows into Columns
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr[0].length; j++) {
				int temp = arr[i][j];
				arr[i][j] = arr[j][i];
				arr[j][i] = temp;
			}
		}
		
		
//		Reversing the Rows
		
		for (int i = 0; i < arr.length; i++) {
			int start = 0, end = arr[i].length-1;
			while (start<end) {
				int temp = arr[i][start];
				 arr[i][start] = arr[i][end];
				 arr[i][end] = temp;
				 start++;
				 end--;
			}
		}
		
		
	}

	private static void printMatrix(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				System.out.print(arr[i][j] + " " );
			}
			System.out.println();
		}
		
	}

}
