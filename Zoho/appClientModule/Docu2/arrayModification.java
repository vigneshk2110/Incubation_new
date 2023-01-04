package Docu2;

import java.util.Scanner;

public class arrayModification {
	static Scanner s = new Scanner(System.in);
	private static int[] takeInput()
	{
		System.out.println("Enter the size of the array:");
		int n = s.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=s.nextInt();
		}
	return arr;
	}
	public static void main(String[] args) 
	{
		int[] arr = takeInput();
		for(int i=0;i<arr.length-2;i++)
		{
			if(arr[i]==arr[i+1])
			{
				arr[i]=2*arr[i];
				arr[i+1]=0;
			}
		}	
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length-1-i;j++)
			{
				if(arr[j]==0 && arr[j+1]>0)
				{
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		 }
		for(int i:arr)
		{
			System.out.print(i+" ");
		}

	}

}
