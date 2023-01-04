package assistingMethods;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class passwordMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);		
		System.out.println("pass");
		String password  = sc.next();
		
		System.out.println(validatePassword(password));

	}
	
	
	protected static boolean validatePassword(String pass) {

		if (pass.length()<8) {
			return false;
		}

		String regex = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!#%?<>&*])(?=\\S+$).{8,20}$";
		
		Pattern p = Pattern.compile(regex);
		Matcher matcher = p.matcher(pass);
		return matcher.find();
		
		
	}

	protected static boolean validatePassword1(String pass) {

		if (pass.length()<8) {
			return false;
		}

		String pattern1="[a-z]";
		String pattern2="[A-Z]";
		String pattern3="[0-9]";
		String pattern4="\u0020";
		String pattern5="[!#%?<>&*]";
		int total=0;
		for(int i=1;i<=5;i++) {
			String pattern = null;
			switch(i) {
			case 1:
				pattern=pattern1;
				break;
			case 2:
				pattern=pattern2;
				break;
			case 3:
				pattern=pattern3;
				break;
			case 4:
				pattern=pattern4;
				break;

			case 5:
				pattern=pattern5;
				break;
			}
			Pattern p =Pattern.compile(pattern);
			Matcher m=p.matcher(pass);
			int count=0;
			while(m.find()) {
				if(m.group().equals(" ")) {
					return false;
				}
				count+=1;
				
				if(count==2) {
					total+=count;
					break;
				}	
			}
		}
		if(total==8) {
			return true;
		}
		else {
			return false;
		}
	}
}
