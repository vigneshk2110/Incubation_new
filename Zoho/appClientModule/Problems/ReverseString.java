package Problems;

import java.util.Scanner;

/* reverse the string without reversing its individual words.
 */
public class ReverseString {

	public static void main(String[] args) {
		String s = "Vignesh.Kannan";
		String s1 = "i.like.this.program.very.much";
		String s2 = "= pqr.mno";
		
		Scanner scan = new Scanner(System.in);
		System.out.println("please enter a String to be reversed");
		
		s = scan.nextLine();

		reverse(s);
		System.out.println();
//		reverse(s1);
//		System.out.println();
//		reverse(s2);

	}

	private static void reverse(String s) {
		char [] strArr = s.toCharArray();

		int start = 0;
		int end = 0;

		for (int i = 0; i < strArr.length; i++) {
			if (strArr[i] == '.' || strArr[i] == ' ') {
				end = i-1;
				wordReverse(start, end, strArr);
				start = i+1;
			}
			if (i== strArr.length-1) {
				end = strArr.length-1;
				wordReverse(start, end, strArr);
			}
		}

		
		for (int i = strArr.length-1; i >=0; i--) {
			System.out.print(strArr[i]);
		}


	}


	private static void wordReverse(int i, int j, char[] wordArr) {
		while (i<j) {
			char temp = wordArr[i];
			wordArr[i] = wordArr[j];
			wordArr[j] = temp;

			i++;
			j--;
		}
	}

}
