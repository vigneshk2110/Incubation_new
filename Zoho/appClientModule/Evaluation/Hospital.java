package Evaluation;

import java.util.Scanner;

public class Hospital {

	public static void main(String[] args) {
//		int [] cases = {1,2,3,1,4,5,2,3,6};
//		int noOfDays = 3;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("please enter No of days to check the Max off");

		int size = scan.nextInt();
		if (size<0) {
			System.out.println("Size can't be negative, please enter a +ve number");
			size = scan.nextInt();
		}
		int [] array = new int[size] ;

		for (int i = 0; i < array.length; i++) {
			System.out.println("please enter the No of patients on day " + (i +1));
			int index = scan.nextInt();

			array[i] = index;
		}
		
		
		System.out.println("please enter the No of days of Treatment for each patient");
		int noOfDays = scan.nextInt();
		
		
		
		maxNumTreated(array,noOfDays);

	}

	private static void maxNumTreated(int[] cases, int noOfDays) {
		int max = 0;
		
		int noOfpatient = cases[0];
		int day = 0;
		
		for (int i = 1; i < cases.length; i++) {
			if (i<=2) {
				noOfpatient = noOfpatient+cases[i];
				if (max<noOfpatient) {
					max = noOfpatient;
					day = i;
				}
			}
			
			if (i>2) {
				noOfpatient = noOfpatient+cases[i] - cases[i-3];
				if (max<=noOfpatient) {
					max = noOfpatient;
					day = i;
				}
			}
		}
		
		System.out.println(max + " --- No of patients Treated at the max");
		System.out.println("They were treated on day " + (day+1));
	}
}
