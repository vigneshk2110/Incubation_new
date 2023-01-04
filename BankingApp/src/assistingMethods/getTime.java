package assistingMethods;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import java.sql.Timestamp;    
import java.util.Date;

public class getTime {

	//	public static void main(String[] args) {
	//
	//		System.out.println(getTime());
	//
	//	}
	//
	//	private static String getTime() {
	//
	//		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
	//		LocalDateTime now = LocalDateTime.now();  
	//		//		   System.out.println(dtf.format(now));
	//		return dtf.format(now);  
	//	}

	public static void main(String args[]){    
		Date date = new Date();  
		Timestamp ts=new Timestamp(date.getTime());  
		System.out.println(ts);                     
	}    
} 


