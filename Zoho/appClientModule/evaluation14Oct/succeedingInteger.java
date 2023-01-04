package evaluation14Oct;

import java.util.Arrays;
import java.util.Scanner;

public class succeedingInteger {

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

		sucInt(array);
	}

	private static void sucInt(int[] array) {
		int num = 0;
		for (int i = 0; i < array.length; i++) {
			num = num*10;
			num = num+array[i];
		}

		int[] newArray = new int[digitCount(++num)];

		for (int i = newArray.length-1; i >=0 ; i--) {
			newArray[i] = num%10;
			num = num/10;
		}

		System.out.println(Arrays.toString(newArray));
	}

	private static int digitCount(int x) {
		int count = 0;

		while (x>0) {
			count++;
			x = x/10;			
		}
		return count;	

	}

}
