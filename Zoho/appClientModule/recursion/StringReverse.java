package recursion;

import java.util.Scanner;

public class StringReverse {
	static Scanner s = new Scanner(System.in);
	public static void main(String[] args) 
	{
		String str = s.nextLine();
		System.out.println(reverseWordsRecursive(str,0,str.length()-1));
	}
	private static String reverseWordsRecursive(String str,int si,int ei)
	{
		if(si>=ei)
		{
			return null;
		}
		String word="";
		int wordStart=0;
		int i,j;
		for(i=0;i<str.length();i++)
		{
			if(str.charAt(i)==' ')
			{
				int wordEnd=i-1;
				word="";
				for(j=wordStart;j<=wordEnd;j++)
				{
					word+=str.charAt(j);
				}
				break;
			}
		}
		wordStart=i+1;
		if(word.isEmpty())
		{
			return str;
		}
		return reverseWordsRecursive(str.substring(wordStart,str.length()),wordStart,str.length())+" "+word;
	}
}