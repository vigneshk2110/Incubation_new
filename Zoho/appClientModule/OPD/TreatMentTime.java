package OPD;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class TreatMentTime {
	static void Calculation(int pat_id,String pat_inTime) throws Exception {
		int medicalProfession=10;
		int pharmacyTime=5;
		int min=2;
		int max=20;
		int dT=(int)(Math.random()*(max-min+1)+min);
		String doctorTime=dT+" min";
		int totalConsultantTime=medicalProfession+pharmacyTime+dT;
		String outtime = dateTime(pat_inTime,totalConsultantTime);
		int t=totalConsultantTime-25;
		if(t<0)
			t=0;

		if(DB.verify2(pat_id)) {
			DB.update2(pat_id,doctorTime,outtime,t);
		}
		else {
			DB.register2(pat_id,doctorTime,outtime,t);
		}
		DB.display(pat_id);
		if(t>0) 
			System.out.println("Sorry,Takes yours time");
		HospitalMain.mainFunction();
	}
	static String dateTime(String pat_inTime,int totalConsultantTime) {
		DateTimeFormatter df=DateTimeFormatter.ofPattern("HH:mm");
		LocalTime lt=LocalTime.parse(pat_inTime);
		String outTime=df.format(lt.plusMinutes(totalConsultantTime));
		return outTime;
	}
}