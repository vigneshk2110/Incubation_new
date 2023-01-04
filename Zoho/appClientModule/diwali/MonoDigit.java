package diwali;

import java.util.Arrays;
import java.util.Scanner;

import Doc4.DigitCount;

public class MonoDigit {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("please enter the number");

		int num = scan.nextInt();

		System.out.println(digitMono(num));

		//		System.out.println(digitMono(3962));

	}

	private static boolean digitMono(int n) {

		int [] nums = new int [digitCount(n)];

		int i = nums.length -1;

		while (i>=0) {
			nums[i] = n%10;
			n = n/10;
			i--;
		}

		String num = "" + nums[0];

		for (int j = 1; j < nums.length; j+=2) {
			if (nums[j] == nums[0]) {
				num+=nums[0];
				j--;
			}
			else if ((nums[j] + nums[j+1] != nums[0] && nums[j] - nums[j+1] != nums[0]) && (nums[j+1] + nums[j] != nums[0] && nums[j+1] - nums[j] != nums[0] )) {
				return false;
			}
			else {
				num+=nums[0];
			}
		}		
		System.out.println(num);
		return true;
	}

	private static int digitCount(int num) {
		int count = 0;

		if (num == 0) {
			count = 1;
			System.out.println(count);
			return 1;
		}

		while(num>0) {
			count++;
			num = num/10;
		}
		//		System.out.println(count);
		return count;
	}
	
	

}
