package assistingMethods;

import java.util.Scanner;

public class EncryptPassword {

public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String acPwd1  = sc.next();
		String encryptedPass = "";

		for (int i = 0; i < acPwd1.length(); i++) {
			if (Character.isDigit(acPwd1.charAt(i))) {
				if (acPwd1.charAt(i) == '9') {
					encryptedPass+= '1';
				}
				else {
					encryptedPass+= (char)(acPwd1.charAt(i) +1);
				}
			}
			else if (Character.isLowerCase(acPwd1.charAt(i))) {
				if (acPwd1.charAt(i) == 'z') {
					encryptedPass+= 'a';
				}
				else {
					encryptedPass+= (char)(acPwd1.charAt(i) +1);
				}

			}
			else if (Character.isUpperCase(acPwd1.charAt(i))) {
				if (acPwd1.charAt(i) == 'Z') {
					encryptedPass+= 'A';
				}
				else {
					encryptedPass+= (char)(acPwd1.charAt(i) +1);
				}
			}

		}
		
		System.out.println(encryptedPass);

	}
}
