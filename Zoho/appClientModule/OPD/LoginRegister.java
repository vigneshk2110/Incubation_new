package OPD;

import java.util.*;
public class LoginRegister {
	static Scanner in=new Scanner(System.in);
	static void login() throws Exception {
		System.out.println("Enter the id");
		int pat_id=in.nextInt();
		if(DB.verify(pat_id)) {
			System.out.println("Enter In-Time : ");
			String pat_inTime=in.next();
			DB.update(pat_id,pat_inTime);
			DB.display1(pat_id);
			TreatMentTime.Calculation(pat_id,pat_inTime);
			HospitalMain.mainFunction();
		}
		else {
			System.out.println("---Create new Account---");
			System.out.println("Enter the patient name");
			String pat_name = in.next();
			System.out.println("Enter Entry-time");
			String pat_inTime=in.next();
			DB.register(pat_name,pat_inTime);
			int id=DB.registerPat_id();
			DB.display1(id);
			TreatMentTime.Calculation(id,pat_inTime);
			HospitalMain.mainFunction();
		}
	}

}