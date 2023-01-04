package Docu3;

import java.util.*;

public class SumhugeNums {
	
//	Given 2 huge numbers as separate digits, 
//	store them in array and process them and calculate the sum of 2 numbers and 
//	store the result in an array and print the sum.

	public static void main(String[] args) {
//		int [] num1 = {9,2,8,1,3,5,6,7,3,1,1,6};
//		int [] num2 = {7,8,4,6,2,1,9,9,7};
		
		Scanner scan = new Scanner(System.in);
		System.out.println("please enter the size of the Array");

		int size = scan.nextInt();
		if (size<0) {
			System.out.println("Size can't be negative, please enter a +ve number");
			size = scan.nextInt();
		}
		int [] array = new int[size] ;

		for (int i = 0; i < array.length; i++) {
			System.out.println("please enter value for index " +i);
			int index = scan.nextInt();

			array[i] = index;

		}
		
		System.out.println("please enter the size of the Array");

		int size1 = scan.nextInt();
		if (size<0) {
			System.out.println("Size can't be negative, please enter a +ve number");
			size = scan.nextInt();
		}
		int [] array1 = new int[size1] ;

		for (int i = 0; i < array1.length; i++) {
			System.out.println("please enter value for index " +i);
			int index = scan.nextInt();

			array1[i] = index;

		}

		int []result =  sumHugeNums(array, array1);

		for (int j = result.length-1; j>=0 ; j-- ) {
			System.out.print(result[j] + " ");
		}
	}

	private static int [] sumHugeNums(int[] num1, int[] num2){
		int n1 = num1.length-1;
		int n2 = num2.length-1;
		
		int size;
		if((Math.abs(n1-n2))<=1 && ((num1[0] + num2[0]) > 9)  ) {
			size = Math.max((n1+1), (n2+1)) +1 ;
		}
		else {
			size = Math.max((n2+1), (n1+1));
		}

		int []sumArray = new int[size];
		int carry = 0;
		int i = 0;

		while(n1 >= 0 || n2 >= 0 && i < sumArray.length-1) {
			int digit = 0;
			if(n1 >= 0) {
				digit = digit + num1[n1]%10;
				n1--;
			}
			
			if(n2 >= 0) {
				digit =digit +  num2[n2]%10;
				n2--;
			}
			int unitDigit = (digit + carry) %10;
			sumArray[i++] = unitDigit;
			carry = ( digit + carry) / 10;
			
		}
		if (carry!=0) {
			sumArray[i] = carry;
		}
		System.out.println(Arrays.toString(sumArray));
		return sumArray;
	}
}
