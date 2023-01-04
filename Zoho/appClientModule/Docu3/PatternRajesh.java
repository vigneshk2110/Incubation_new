
package Docu3;

import java.util.*;

public class PatternRajesh {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("String1:");
		String str1 = sc.nextLine();
		char array[] = str1.toCharArray();
		for(int i=0;i<str1.length();i++)
		{
			int p=str1.length()/2;
			for(int j=0;j<str1.length();j++)
			{
				if(j>=str1.length()-i-1)
				{
					if(p>=str1.length()) {
						System.out.print(str1.charAt(p%str1.length()));
						p++;
					}
					else
					{System.out.print(str1.charAt(p));
					p++;
					}
				}
				else
					System.out.print("  ");
			}
			System.out.println();

		}

	}
}
