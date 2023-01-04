package evaluation14Oct;

import java.util.Scanner;

public class MaxProdTrip {

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
		
		maxProdTrip(array);
	}

	private static void maxProdTrip(int[] array) {
		int maxProd = array[0] * array[1] * array[2];
		int maxi = 0, maxj = 0,maxk = 0;
		
		for (int i = 0; i < array.length-2; i++) {
			for (int j = i+1; j < array.length-1; j++) {
				for (int k = j+1; k < array.length; k++) {
					
					if (maxProd < array[i] * array[j] * array[k]) {
						maxProd = array[i] * array[j] * array[k] ;
						maxi = array[i]; maxj =array[j]; maxk = array[k];
						
					}
				}
			}
		}
		System.out.println(maxProd + " is the Max product of the triplet - " + maxi + "," + maxj + "," + maxk + ",");
		
		
	}

}
