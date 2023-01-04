package Evaluation;

public class PatternNums {

	public static void main(String[] args) {
		patternNums(4);
	}

	private static void patternNums(int n) {
		
		int rows = 0;
		int num = 1;
		
		while (rows<n) {
			int column = rows + 1;
			
			while (column>0) {
				System.out.print(num++);
				column--;
				if (rows>0 && column>0) {
					System.out.print("*");
				}
			}
			
			System.out.println();			
			rows++;
		}
		
		rows = n;
		while (rows>0) {
			int column = rows;
			num = ((rows*(rows-1))/2)+1;
			
			while (column>0) {
				System.out.print(num++);
				column--;
				if (rows>0 && column>0) {
					System.out.print("*");
				}
			}
			System.out.println();			
			rows--;
		}
		
	}

}
