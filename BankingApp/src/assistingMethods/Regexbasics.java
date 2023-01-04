package assistingMethods;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regexbasics {

	public static void main(String[] args) throws FileNotFoundException {
		
		File file = new File("C:\\Users\\Administrator\\Documents\\Test.txt");
		Scanner sc = new Scanner(file);
		boolean present = sc.hasNext();
		while(present)
		{
			String word = sc.nextLine();
			int i = word.lastIndexOf(":");
			String mobile = word.substring(i+2);
			
			Pattern p = Pattern.compile("(0|91)?[6-9][0-9]{9}");
			Matcher m = p.matcher(mobile);
			if(m.find())
				System.out.println(m.group()+"  is valid mobile no.");
			else
				System.out.println(mobile +"  is Invalid mobile no.");
			present = sc.hasNext();
		}
		
	}
}