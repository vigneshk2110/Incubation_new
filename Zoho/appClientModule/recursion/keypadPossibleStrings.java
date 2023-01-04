package recursion;

import java.util.Scanner;

public class keypadPossibleStrings {

	public static void main(String[] args) {
		
		
		Scanner s = new Scanner(System.in);
		System.out.println("Please enter any number");
		int n=s.nextInt();
		String[] possibleStrings = keypad(n);
		int count = 0;
		for(String i:possibleStrings)
		{
			count++;
			System.out.println(i);
		}
		System.out.println(count);
	}

	public static String[] keypad(int n){
		if(n==0 || n==1)
		{
			String[] possibleStrings=new String[1];
			possibleStrings[0]="";
			return possibleStrings;
		}
		
		String[] smallOutput=keypad(n/10);
		
		String numsKey[]={"","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
		int length = smallOutput.length;
		
		String lastNumString=numsKey[n%10-1];
		String[] possibleStrings=new String[length*lastNumString.length()];

		int k=0;
		for(int i=0;i<smallOutput.length;i++)
		{
			String str=smallOutput[i];
			for(int j=0;j<lastNumString.length();j++)
			{
				char ch=lastNumString.charAt(j);
				possibleStrings[k++]=str+""+ch;
			}
		}
		return possibleStrings;
	}
}