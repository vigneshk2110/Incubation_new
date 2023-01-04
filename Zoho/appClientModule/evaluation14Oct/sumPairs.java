package evaluation14Oct;
import java.util.*;

public class sumPairs {


	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("please enter the size of the Array");

		int size = scan.nextInt();
		if (size<0) {
			System.out.println("Size can't be negative, please enter a +ve number");
			size = scan.nextInt();
		}
		int [] array = new int[size] ;

		System.out.println("please enter value for each index of the array");

		for (int i = 0; i < array.length; i++) {

			array[i] = scan.nextInt();

		}

		System.out.println("please enter the sum to pair the elements of the Array");
		int sum = scan.nextInt();
		pairSumX(array, sum);
	}


	private static void pairSumX(int[] input, int sum) {
		int count =0;

		for(int i = 0; i<input.length-1; i++) {
			for(int j = i+1; j<input.length; j++) {
				if(input[i] + input[j] == sum) {
					System.out.println(input[i] + "," + input[j]);
					count++;
				}
			}
		}

		System.out.println(count +" - pairs \nsum = " + sum);
	}

}
