package Train;

import java.util.*;
class Irctc
{
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		int a=0;
		do
		{
			System.out.println("Enter the option as 1.AvailableTicket 2.BookTicket 3.CancelTicket 4.BookedTicket  5.Exit");
			a=scan.nextInt();
			switch(a)
			{
			case 1:
				AvailableTicket At=new AvailableTicket();
				At.showDetails();
				break;
			case 2:
				BookTicket Bt=new BookTicket();
				Bt.BookTickets();
				break;
			case 3:
				Ctickect cT=new Ctickect();
				cT.showDetails();
				break;
			case 4:
				BookedTicket Bdt1=new BookedTicket();
				Bdt1.showTicket();
				break;

			}
		}
		while(a>=1 && a<=4);

		System.out.println("Thank You!!!");
	}
}




