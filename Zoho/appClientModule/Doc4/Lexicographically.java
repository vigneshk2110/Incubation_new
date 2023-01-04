package Doc4;

import java.io.*;

public class Lexicographically {

	// Java program for the above approach

	public static void main(String[] args)
	{

		// Given string S
		String S = "cbacdcbc";

		// Function Call
		System.out.println(removeDuplicateLetters(S));

	}
	// Function that finds lexicographically
	// smallest string after removing the
	// duplicates from the given string
	public	static String removeDuplicateLetters(String s)
	{

		// Stores the frequency of characters
		int[] cnt = new int[26];

		// Mark visited characters
		int[] vis = new int[26];

		int n = s.length();

		// Stores count of each character
		for(int i = 0; i < n; i++) {
			cnt[s.charAt(i) - 'a']++;
		}

		// Stores the resultant string
		String res = "";

		for(int i = 0; i < n; i++)
		{

			// Decrease the count of
			// current character
			cnt[s.charAt(i) - 'a']--;

			// If character is not already
			// in answer
			if (vis[s.charAt(i) - 'a'] == 0)
			{

				// Last character > S[i]
				// and its count > 0
				int size = res.length();
				while (size > 0 && res.charAt(size - 1) > s.charAt(i) && cnt[res.charAt(size - 1) - 'a'] > 0) {

					// Mark letter unvisited
					vis[res.charAt(size - 1) - 'a'] = 0;
					res = res.substring(0, size - 1);
					size--;
				}

				// Add s[i] in res and
				// mark it visited
				res += s.charAt(i);
				vis[s.charAt(i) - 'a'] = 1;
			}
		}

		// Return the resultant string
		return res;
	}

	// Driver Code

}
