package diwali;

import java.util.Scanner;

public class ThirdLargeEle {

	public static void main(String[] args) {
//				int	a[] = {2,4,1,3,5};
//		int	a[] = {3,5,7,9,11,13};
		Scanner scan = new Scanner(System.in);

		System.out.println("please enter the size of the Array");

		int size = scan.nextInt();
		if (size<0) {
			System.out.println("Size can't be negative, please enter a +ve number");
			size = scan.nextInt();
		}
		int [] a = new int[size] ;

		System.out.println("please enter value for each index ");
		
		for (int i = 0; i < a.length; i++) {
			
			int index = scan.nextInt();

			a[i] = index;
		}
		
		thirdLargestElement(a);
	}

	private static void thirdLargestElement(int[] a) {
		int largest = Integer.MIN_VALUE;
		int secondLargest = Integer.MIN_VALUE;
		int thirdLargest = Integer.MIN_VALUE;
		int i = 0; 

		//		while (i<a.length) {
		//			if (a[i]>thirdLargest && a[i]>secondLargest && a[i]>largest ) {
		//				thirdLargest = secondLargest;
		//				secondLargest = largest;
		//				largest = a[i];
		//			}
		//			if (a[i]>thirdLargest && a[i]>secondLargest && a[i]<largest ) {
		//				thirdLargest = secondLargest;
		//				secondLargest = a[i];
		//			}
		//			if (a[i]>thirdLargest && a[i]<secondLargest && a[i]<largest ) {
		//				thirdLargest = a[i];
		//			}
		//			i++;
		//		}
		//		System.out.println(thirdLargest);
		while (i<a.length) {
			if (a[i]>thirdLargest) 
			{
				if (a[i]>secondLargest) 
				{
					if (a[i]>largest) 
					{
						thirdLargest = secondLargest;
						secondLargest = largest;
						largest = a[i];
					}
					else 
					{
						thirdLargest = secondLargest;
						secondLargest = a[i];
					}
				}
				else 
				{
					thirdLargest = a[i];
				}
			}
			i++;
		}

		System.out.println(thirdLargest);

	}


}


