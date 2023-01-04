package recursion;

import java.util.ArrayList;

public class SubSeq {
	static int k = 0;
	public static void main(String[] args) {
//		possibleSubsequence("abc", "");
		
		String s1 = "wxyz";
		String formed = "";
		System.out.println(subWithList(s1,formed));

	}

	

	private static ArrayList<String> subWithList(String s1, String formed) {
		if (s1.length() == 0) {
			ArrayList<String> list= new ArrayList<String>();
			list.add(formed);
			return list;
		}
		
		char ch = s1.charAt(0);
		
		ArrayList<String> one = subWithList(s1.substring(1), formed+ch);
		ArrayList<String> two = subWithList(s1.substring(1), formed);
		
		 one.addAll(two);
		 
		 return one;
		
	}



	private static void sub(String original, String answer) {
		if (original.length() == 0) {
			System.out.println(answer);
			return;
		}
		
		char ch = original.charAt(0);
		sub(original.substring(1), answer + ch);
		sub(original.substring(1), answer);
		
		
	}

	private static void possibleSubsequence(String unProcessed, String p) {

		if (unProcessed.isEmpty()) {
			System.out.println(p);
			return;
		}
		
		char ch = unProcessed.charAt(0);
		
		possibleSubsequence(unProcessed.substring(1), p+ch);
		possibleSubsequence(unProcessed.substring(1), p);
		
	}

}
