package Doc4;

import java.util.Arrays;

public class MagicalString12 {


	public static void main(String[] args) {

		System.out.println(magicString(19) + " is the no of occurence of 1");
	}

	private static int magicString(int n) {

		if (n<=0) {
			return 0;
		}

		if (n<=3) {
			return 1;
		}

		int [] data = new int [n];
		data[0] = 1;
		data[1] = 2;
		data[2] = 2;

		int count = 1;
		int digitCount = 3;
		int i = 2;
		int j = 2;
		int num = 1;

		arrayTraverse:
			while (i<n) {


				frequency:
					for (int k =0; k < data[j]; k++) {

						if (i+1==data.length) {
							break arrayTraverse;
						}
						digitCount++;
						data[++i] = num;
						if (num == 1) {
							count++;
						}
					}
				num = data[i] == 1? 2:1 ;
				j++;
			}

		System.out.println(Arrays.toString(data));
		for (int k = 0; k < data.length; k++) {
			System.out.print(data[k]);
		}
		System.out.println();
		System.out.println(digitCount + " ---> Digit Count");
		return count;
	}
}
