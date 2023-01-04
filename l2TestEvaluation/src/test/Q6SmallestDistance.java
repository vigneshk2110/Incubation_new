package test;

import java.util.ArrayList;
import java.util.Scanner;

public class Q6SmallestDistance {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter the Text");
		String text = scan.nextLine();
		System.out.println("Please enter the Word0");
		String word0 = scan.nextLine();
		System.out.println("Please enter the Word1");
		String word1 = scan.nextLine();
		
		
		System.out.println(smallestDistance(text,word0,word1));

	}

	private static int smallestDistance(String text, String word0, String word1) {
		
		text = text.toLowerCase();
		
		word0 = word0.toLowerCase();
		word1 = word1.toLowerCase();
		
		int minDistance = Integer.MAX_VALUE;
		text = text.replace(',', ' ');
		text = text.replace('.', ' ');
		text = text.replace('!', ' ');
		text = text.replace('-', ' ');
		
		String [] textArray = text.split(" ");
		
		ArrayList<String> strArray = new ArrayList<>();
		
		for (String string : textArray) {
			strArray.add(string);
		}
		
		if (!(strArray.contains(word1) && strArray.contains(word0))) {
			return -1;
		}
		
		int startIndex = 0;
		int endIndex = textArray.length-1;
		
		while (startIndex<endIndex) {
			
			for (int i = startIndex; i < endIndex; i++) {
				
				
				
				if (word0.equals(textArray[i])  ) {
					
					
					inner:
					for (int j = endIndex; j > i; j--) {
						if (word1.equals(textArray[j])) {
							if (minDistance>=(j-i)) {
								minDistance = j-i;
								endIndex = j-1;
								break inner;
							}
						}
					}
				}
				startIndex = i+1;
			}
		}
		return minDistance-1;
			
	}

}
