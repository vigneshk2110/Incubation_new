package test;

import java.util.Arrays;
import java.util.Scanner;

public class Q2FindOccurence {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter the String to find the Occurence");
		String str = scan.next();
		
		System.out.println(findOccurence(str));

	}

	private static String findOccurence(String str) {
		int [] occurenceCount = new int [26];

		for (int i = 0; i < str.length(); i++) {

			if (str.charAt(i)>= 65 && str.charAt(i)<= 90) {
				int element = str.charAt(i)-65;
				int count = occurenceCount[element];
				occurenceCount[element] = count+1;				
			}

			else if (str.charAt(i)>= 97 && str.charAt(i)<= 122) {
				int element = str.charAt(i)-97;
				int count = occurenceCount[element];
				occurenceCount[element] = count+1;		
			}

		}
		

		String newWord = "";

		for (int i = 0; i < str.length(); i++) {

			if (str.charAt(i)>= 65 && str.charAt(i)<= 90) {
				int element = str.charAt(i)-65;
				int count = occurenceCount[element];
				if (count>0) {
					newWord = newWord+ str.charAt(i)+"" + count;
					occurenceCount[element] = 0;
				}

			}

			else if (str.charAt(i)>= 97 && str.charAt(i)<= 122) {
				int element = str.charAt(i)-97;
				int count = occurenceCount[element];
				if (count>0) {
					newWord = newWord+ str.charAt(i)+"" + count;
					occurenceCount[element] = 0;
				}
			}
		}
		
		return newWord;

	}

}
