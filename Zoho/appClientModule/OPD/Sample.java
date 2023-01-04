package OPD;

//import java.time.LocalTime;
//import java.time.format.DateTimeFormatter;

public class Sample {

	//	public static void main(String[] args) {
	//		type2();
	//
	//	}
	//
	//	static void type2() {
	//
	//		DateTimeFormatter df = DateTimeFormatter.ofPattern("HH:mm");
	//		LocalTime lt = LocalTime.parse("23:55");
	//
	//		System.out.println(df.format(lt.plusMinutes(20)));
	//
	//
	////		String time=df.format(lt.plusMinutes(10));
	////		System.out.println(time);
	//	}

	public static void main(String[] args) {

		int i = 0;
		while(i<100){
			 int random = (int)(Math.random() * 11 );
			i++;
			System.out.println(random);
		}
	}

}
