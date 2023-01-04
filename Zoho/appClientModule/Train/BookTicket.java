package Train;

import java.util.Scanner;

public class BookTicket extends passengerDetails
{
	static  int pvalue=1;
	static  int pnr=1;
	static int count=0;
	static int seno=1;
	static BookTicket obj=new BookTicket();
	Scanner newScan = new Scanner(System.in);
	
	void BookTickets()
	{
		
		System.out.println("Enter how many ticket you want to book");
		int n=newScan.nextInt();
		if(n+seno<=11)
		{
			for(int i=0;i<n;i++)
			{

				Pnr[count]=pvalue;
				newScan.nextLine();
				System.out.println("Enter the Passenger Name");
				String na=newScan.nextLine();
				Name[count]=na;
				System.out.println("Enter the Passenger Age");
				int ag=newScan.nextInt();
				Age[count]=ag;
				if(ag>5)
					Seatno[count]=seno++;
				else 
					Seatno[count]=0;
				System.out.println("Enter the Passenger Gender");
				String gen=newScan.next();
				Gender[count]=gen;
				if(ag>5)
					Fare[count]=400;
				else
					Fare[count]=200;

				if(seno>7 && seno<=9)
				{
					Berth[count]="RAC";
					--Rac;
					--erac;
				}
				else if(seno>9 && seno<=11)
				{
					Berth[count]="WL";
					Seatno[count]=0;
					--wl;
					--ewl;
				}
				boolean check=false;
				if(totalseat>0)
				{
					if(ag>=60)
					{
						check=lower!=0?true:false;
						if(check==true)
						{
							Berth[count]="Lower";
							--lower;
							--totalseat;
						}
						else
						{
							System.out.println("No Lower Available");
							obj.berthPreference(count);			 
						}
					}
					else
					{
						if(ag>5)
						{
							obj.berthPreference(count);
						}
						else
							Berth[count]="no Berth";
					}
				}
				++count;
			}
			++pvalue;
			System.out.println("Ticket Booked Sucessfully");
		}
		else
			System.out.println("No ticket available pls check the no of tickets");
	}
	void berthPreference(int count)
	{
		System.out.println("Enter the Berth Preference as 1.Lower 2.Middle 3.Upper ");
		int pref=newScan.nextInt();
		--totalseat;
		switch(pref)
		{
		case 1:
			obj.lowerBerth(count);
			break;
		case 2:
			obj.middleBerth(count);
			break;
		case 3:
			obj.upperBerth(count);
			break;

		}
	}
	void lowerBerth(int count)
	{
		if(lower!=0)
		{
			Berth[count]="Lower";
			--lower;
		}
		else
			obj.upperBerth(count);
	}
	void upperBerth(int count)
	{
		if(upper!=0)
		{
			Berth[count]="Upper";
			--upper;
		}
		else
			obj.middleBerth(count);
	}	
	void middleBerth(int count)
	{
		if(middle!=0)
		{
			Berth[count]="Middle";
			--middle;
		}
		else
			obj.lowerBerth(count);
	}
}
