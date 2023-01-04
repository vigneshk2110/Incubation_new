package Doc4;

import java.util.*;
public class LargeNumArray {
	public static void main(String args[]) {
		Scanner in=new Scanner(System.in);
		System.out.print("Enter no of digits :");
		int n=in.nextInt();
		System.out.println("Enter the element");
		String[] num=new String[n];
		for(int i=0;i<n;i++) {
			int s=in.nextInt();
			num[i]=Integer.toString(s);
		}
		LargeNumArray obj=new LargeNumArray();
		System.out.println(obj.arrange(num, n));
	in.close();}
		String arrange(String arr[],int n){
			String temp;
			String s="";
			for(int i=0;i<n;i++) {
				for(int j=i+1;j<n;j++) {
					String ij=arr[i]+arr[j];
					String ji=arr[j]+arr[i];
					if(Integer.parseInt(ij)<Integer.parseInt(ji)) {
						temp=arr[i];
						arr[i]=arr[j];
						arr[j]=temp;
					}
				}s+=arr[i];
			}
		return s;
		}
}