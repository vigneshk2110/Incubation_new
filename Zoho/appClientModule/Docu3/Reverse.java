package Docu3;

import java.util.*;

public class Reverse {
//	RECURSION - Reverse
	public static void main(String[] args) {

		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("String1:");
		String str1 = sc.nextLine();
		char array[] = str1.toCharArray();
		int start=0;

		for(int i=0;i<str1.length();i++)
		{
			if(array[i]==' ')
			{
				reverse(array,start,i-1);
				start=i+1;
			}
		}
		reverse(array,start,str1.length()-1);
		reverse(array,0,str1.length()-1);
		//System.out.println(Arrays.toString(array));
		System.out.println(new String(array));
		sc.close();
	}
	static void reverse(char[] ch,int start,int end)
	{

		if(start>=end)
			return;
		char temp = ch[start];
		ch[start] = ch[end];
		ch[end] = temp;
		reverse(ch,start+1,end-1);

	}


}

