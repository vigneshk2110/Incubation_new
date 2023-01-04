package oopsConcepts;

public class Rectangle {

	int height;
	int width;

	public Rectangle(int height, int width) {
		this.height = height;
		this.width = width;
	}

	public void display() {
		System.out.println("Height & Width of the rectangle is " + height + "," + width);
	}
}
