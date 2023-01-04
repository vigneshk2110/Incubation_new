package test;

import java.util.Scanner;

public class Q1ReverseString {

	public static void main(String[] args) {


		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter the String to be Reversed");
		String str = scan.nextLine();

		System.out.println("Please select any one option from the below"
				+ "\n1.ODD"
				+ "\n2.EVEN");
		int num = scan.nextInt();

		System.out.println(reverseString(str,num));		

	}


	private static String reverseString(String str, int option) {
		
		String [] strArray = str.split(" ");
		
		
		if (option == 1) {				
			for (int i = 0; i < strArray.length; i++) {
				if (i%2 == 0) {
					strArray[i] = reverseWord(strArray[i]);
				}
			}

		}
		else {
			
			for (int i = 0; i < strArray.length; i++) {
				if (i%2 == 1) {
					strArray[i] = reverseWord(strArray[i]);
				}
			}
		}
		
		String returnString = "";
		
		for (String string : strArray) {
			returnString = returnString + " " + string;
		}
		
		return returnString;
				
	}

	private static String reverseWord(String str) {

		String newStr = "";

		for(int i = str.length()-1; i>=0; i--) {
			newStr+=(str.charAt(i));
		}
		return newStr;
	}


}
