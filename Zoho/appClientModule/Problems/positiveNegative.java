package Problems;

import java.util.*;

public class positiveNegative {

	public static void main(String[] args) {

//		int [] arr = {1, -1, 3, 2, -7, -5, 11, 6 , -4};
//		sortArray(arr);
		
		Scanner scan = new Scanner(System.in);
		System.out.println("please enter the size of the Array");

		int size = scan.nextInt();
		if (size<0) {
			System.out.println("Size can't be negative, please enter a +ve number");
			size = scan.nextInt();
		}
		int [] unsortedArray = new int[size] ;

		for (int i = 0; i < unsortedArray.length; i++) {
			System.out.println("please enter value for index " +i);
			int index = scan.nextInt();

			unsortedArray[i] = index;

		}
		System.out.println("Unsorted Array : "  + Arrays.toString(unsortedArray));
		System.out.print("Sorted Array : " );
		sortArray(unsortedArray);
	}

	private static void sortArray(int[] array) {
		
		int positiveIndex=0;

		for(int i=0;i<array.length;i++)
		{
			if(array[i]>=0)
			{
				if (i>0) {
					positiveIndex++;	
				}

				
				for(int j=i;j>positiveIndex;j--)
				{
					int temp = array[j];
					array[j]=array[j-1];
					array[j-1]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(array));
	}
}
