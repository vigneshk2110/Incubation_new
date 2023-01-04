package Doc4;

import java.util.Scanner;
public class LongestSubstring {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String:");
		String str = sc.nextLine();
		int size=str.length();
		System.out.println("Enter K:");
		int k = sc.nextInt();
		int freq[] = new int[size];
		for(int i=0;i<size;i++)
		{
			int count=0;
			for(int j=0;j<size;j++)
			{
				if(str.charAt(j)==str.charAt(i))
				{
					count++;
				}
			}
			freq[i]=count;
		}
		int len = size;
		boolean yes=true;
		int i;
		int time,times,start;
		time=1;
		ol:
			while(time<=size) {
				times=time;
				start=0;
				while(times>0) { 
					il:
						for( i=start;i<start+len;i++)
						{
							if(freq[i]<k) {
								yes=false;
								break ;
							}	
						}
				if(yes)
				{
					System.out.println(len);

					break ol;
				}
				start++;
				times--;
				yes=true;
				}
				len--;
				time++;
			}
	}
}