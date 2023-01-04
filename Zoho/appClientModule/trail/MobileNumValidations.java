package trail;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MobileNumValidations {

	public static void main(String[] args) throws FileNotFoundException {

		File f = new File("C:\\Users\\Administrator\\Desktop\\nums.txt");
		Scanner sc = new Scanner(f);
		while (sc.hasNext()) {
			String word = sc.next();
			int i = word.lastIndexOf(":");
			String mobNum = word.substring(i+1);
			Pattern p = Pattern.compile("(0|91)?[6-9][0-9]{9}");
			Matcher m =p.matcher(mobNum);

			if (m.find()) {
				System.out.println(m.group() + " - Valid");
			}
			else {
				System.out.println(mobNum + " - Not Valid");
			}
			
			sc.hasNext();
		}

//		String mobNum = "+91659558135";
//
//		Pattern p = Pattern.compile("(0|91)?[6-9][0-9]{9}");
//		Matcher m =p.matcher(mobNum);
//
//		if (m.find()) {
//			System.out.println(m.group() + " - Valid");
//		}
//		else {
//			System.out.println(mobNum + " - Not Valid");
//		}
	}
}
