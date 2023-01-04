package Problems;


/*Pangram or not.*/

public class PangramOrNot {

	public static void main(String[] args) {
		String str1 = "Bawds jog, flick quartz, vex nymph";
		String str = "Waltz, bad nymph, for quick jigs vex.";
		pangramOrNot(str);
		pangramOrNot(str1);
		
		str = "Sphinx of black quartz, judge my vow.";
		pangramOrNot(str);
		
		str = "Shhhhhskrrrrrrrrrrroooooooooooooommmmmmmmmmmma";
		pangramOrNot(str);
		
		str = "Shha";
		pangramOrNot(str);
	}

	private static void pangramOrNot(String str) {
		int [] boolArray = new int[26];
		
		if (str.length()<26) {
			System.out.println("OOps, not a Pangram");
			return;
		}
		
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) >= 65 && str.charAt(i) <= 90 ||  str.charAt(i) >= 97 && str.charAt(i) <= 122 ) {
				if (str.charAt(i) >= 65 && str.charAt(i) <= 90 ) {
					boolArray[str.charAt(i) - 65] = 1;
				}
				
				if (str.charAt(i) >= 97 && str.charAt(i) <= 122 ) {
					boolArray[str.charAt(i) - 97] = 1;
				}
			}
		}
		
		for (int i = 0; i < boolArray.length; i++) {
			if (boolArray[i] == 0) {
				System.out.println("OOps, not a Pangram");
				return;
			}
		}
		System.out.println("Its a Pangram");
	}
}
