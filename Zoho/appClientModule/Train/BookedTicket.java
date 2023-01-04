package Train;

public class BookedTicket extends passengerDetails
{
	void showTicket()
	{
		System.out.print("Pnr\tName\tAge\tSeatno\tGender\tFare\tBerth\n");
		for(int i=0;i<Name.length;i++)
		{	
			if(Fare[i]!=0 && Gender[i]!="null")
			{
				System.out.print(Pnr[i]+"\t"+Name[i]+"\t"+Age[i]+"\t"+Seatno[i]+"\t"+Gender[i]+"\t"+Fare[i]+"\t"+Berth[i]+"\n");
			}
		}
	}
}