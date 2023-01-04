package methods;

public class HolidayMain {

	public static void main(String[] args) {
		Holiday h = new Holiday("New Year's Day", 1, "January");
		Holiday h1 = new Holiday("Pongal", 14, "January");
		Holiday h2 = new Holiday("Republic Day", 26, "January");
		Holiday h3 = new Holiday("Ugadi", 13, "April");
		Holiday h4 = new Holiday("Good Friday", 15, "April");
		Holiday h5 = new Holiday("Holi", 18, "March");
		Holiday h6 = new Holiday("May Day", 1, "May");
		Holiday h7 = new Holiday("Bakrid", 9, "July");
		Holiday h8 = new Holiday("Independence Day", 4, "July");
	
		boolean result = h1.inSameMonth(h2);
		System.out.println(result);
		
		Holiday [] array = {h1,h2,h,h3};
 		
		double average = Holiday.avgDate(array);
		System.out.println(average);
		
		Holiday idcHoliday = new Holiday("independence day", 4, "july");
	}

}
