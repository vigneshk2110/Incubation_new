package Train;

public class AvailableTicket extends passengerDetails
{
	void showDetails()
	{
		System.out.println("No of Lower Available :"+lower);
		System.out.println("No of middle Available:"+middle);
		System.out.println("No of upper Available :"+upper);
		System.out.println("No of RAC Available   :"+erac);
		System.out.println("No of WL Available    :"+ewl);

	}
}