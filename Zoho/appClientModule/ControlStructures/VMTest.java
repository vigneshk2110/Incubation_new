package ControlStructures;

import java.util.ArrayList;

public class VMTest {

	public static void main(String[] args) {
		name();name();name();name();
		ArrayList<Integer> nums = new ArrayList<>();

		int i = 0;

		while (true) {
			nums.add(i);
			if (i >1000) {
				nums = new ArrayList<>();
				i = 0;
			}
			i++;
			
		}

	}

	public static void name() {
		ArrayList<Integer> nums = new ArrayList<>();

		int i = 0;

		while (true) {
			nums.add(i);
			if (i >1000) {
				nums = new ArrayList<>();
				i = 0;
			}
			i++;
		}
	}

}
