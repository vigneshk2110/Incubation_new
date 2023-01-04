package oopsConcepts;

import java.util.Scanner;

public class RectangleArea extends Rectangle {

	public RectangleArea(int height, int width) {
		super(height, width);
	}
	
	public void display() {
		System.out.println((height * width));
	}
	

	public static RectangleArea read_Input() {
		Scanner s = new Scanner(System.in);
		System.out.println("Please enter the Height of the rectangle");
		int height = s.nextInt();
		System.out.println("Please enter the Width of the rectangle");
		int width = s.nextInt();
		
		RectangleArea rA = new RectangleArea(height, width);
		
		return rA;
		
	}
}
