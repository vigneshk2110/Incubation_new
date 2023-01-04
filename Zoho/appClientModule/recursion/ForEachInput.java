package recursion;

import java.util.Arrays;
import java.util.Scanner;

public class ForEachInput {
	
	
	public static void main(String[] args) {
		int [] arr = new int[5];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the elements");
		
		int k = 0;
		
		for (int i : arr) {
			
			arr[k++] = sc.nextInt();
		}
		
		System.out.println(Arrays.toString(arr));
 	}
}
