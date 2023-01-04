package OPD;
import java.util.*;
public class HospitalMain {
	static Scanner in=new Scanner(System.in);
	public static void main(String[] args) throws Exception {
		DB.createDb();
		DB.createTable();
		DB.createTable2();
		mainFunction();
	}
	public static void mainFunction() throws Exception {
		System.out.println("1.Entry\n2.viewPatient\n0.Exit");
		int entry=in.nextInt();
		switch(entry) {
		case 1:
			LoginRegister.login();
			break;
		case 2:
			DB.display();
			break;
		case 0:
			System.out.println("Thanks for visiting....visit again");
			break;
		default:
			System.out.println("Enter another value");
			mainFunction();
			break;
		}
	}
}