package methods;

public class Holiday {

	private String name;
	private int day;
	private String month;


	public Holiday(String name, int day, String month) {
		this.name = name;
		this.day = day;
		this.month = month;
	}
	

	public boolean inSameMonth(Holiday h2) {
		return this.month == h2.month;
	}


	public static double avgDate(Holiday[] array) {
		double sum = 0;
		for (int i = 0; i < array.length; i++) {
			sum = sum + array[i].day;
		}
		return sum/array.length;
	}

}
