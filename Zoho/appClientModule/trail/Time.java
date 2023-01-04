package trail;

public class Time {

	public static void main(String[] args) {
		String sMillis = "1667369237969";
	    double dMillis = 0;

	    int days = 0;
	    int hours = 0;
	    int minutes = 0;
	    int seconds = 0;
	    int millis = 0;

	    String sTime;

	    try {
	        dMillis = Double.parseDouble(sMillis);
	    } catch (Exception e) {
	        System.out.println(e.getMessage());
	    }


	    seconds = (int)(dMillis / 1000) % 60;
	    millis = (int)(dMillis % 1000);

	    if (seconds > 0) {
	        minutes = (int)(dMillis / 1000 / 60) % 60;
	        if (minutes > 0) {
	            hours = (int)(dMillis / 1000 / 60 / 60) % 24;
	            if (hours > 0) {
	                days = (int)(dMillis / 1000 / 60 / 60 / 24);
	                if (days > 0) {
	                    sTime = days + " days " + hours + " hours " + minutes + " min " + seconds + " sec " + millis + " millisec";
	                } else {
	                    sTime = hours + " hours " + minutes + " min " + seconds + " sec " + millis + " millisec";
	                }
	            } else {
	                sTime = minutes + " min " + seconds + " sec " + millis + " millisec";
	            }
	        } else {
	            sTime = seconds + " sec " + millis + " millisec";
	        }
	    } else {
	        sTime = dMillis + " millisec";
	    }

	    System.out.println("time: " + sTime);

	}

}
