package snakeAndLadder;

import java.util.Random;

public class RandomNumGen {

	public static void main(String[] args) {

		Random roll = new Random();

		int value = roll.nextInt(6);
		value++;
		System.out.println(value);

	}

}
