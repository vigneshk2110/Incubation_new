package Train;

import java.util.Scanner;

public 
class Ctickect extends passengerDetails
{
	static Scanner sc=new Scanner(System.in);
	static void showDetails()
	{
		System.out.println("Welcome to the Cancellation Portal");
		System.out.println("Enter the Seat no to cancel");
		int cs=sc.nextInt();
		int Index=getIndex(cs);
		if(Age[Index]>5)
		{
			if(Rac<=3)
			{  
				int Index2=getsIndex("RAC");
				changeElement(Index,Index2);
				int Index3=interswap(Index2);
				++Rac;
				if(wl<=2)
				{
					String m="WL";
					int Index4=getsIndex(m);
					changeElement(Index3,Index4);
					interswap(Index4);
					++wl;
				}
			}
			else
				delint(Index);
		}
		else
			delint(Index);

	}
	static int getIndex(int cs)
	{
		int c=0;
		for(int i=0;i<Seatno.length;i++)
		{
			if(Seatno[i]==cs)
			{
				c=i;
				break;
			}
		}
		return c;
	}
	static int getsIndex(String s)
	{
		int d=0;
		for(int i=0;i<Seatno.length;i++)
		{
			if(Berth[i]==s)
			{
				d=i;
				break;
			}
			else
				d=0;
		}
		return d;
	}
	static void changeElement(int n,int n1)
	{
		Name[n]=Name[n1];
		Age[n]=Age[n1];
		Gender[n]=Gender[n1];
		Fare[n]=Fare[n1];
		Name[n1]="null";
		Age[n1]=0;
		Gender[n1]="null";
		Fare[n1]=0;
	}
	static int interswap(int Ind)
	{
		Fare[Ind]=400;

		String temp=Name[Ind];
		Name[Ind]=Name[Ind+1];
		Name[Ind+1]=temp;

		int temp1=Age[Ind];
		Age[Ind]=Age[Ind+1];
		Age[Ind+1]=temp1;

		String temp2=Gender[Ind];
		Gender[Ind]=Gender[Ind+1];
		Gender[Ind+1]=temp;

		return Ind+1;
	}
	static void delint(int n1)
	{
		Name[n1]="null";
		Age[n1]=0;
		Gender[n1]="null";
		Fare[n1]=0;

	}
}
