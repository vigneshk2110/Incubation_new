package assistingMethods;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailMain {

	public static void main(String[] args) {

		System.out.println(validate("vignesh@gmail.cm"));

	}

	public static boolean validate(String emailStr) {
		String regex = "^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$";
		Pattern p = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
		Matcher matcher = p.matcher(emailStr);
		return matcher.find();
	}

}
