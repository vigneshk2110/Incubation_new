package exercises;

import java.util.ArrayList;
import java.util.Collections;

public class Student implements Comparable<Student> {
	
	private String name;
	private int marks;
	
	
	private Student(String name, int marks) {
		this.name = name;
		this.marks = marks;
	}

	@Override
	public int compareTo(Student o) {
		if (this.marks<o.marks) {
			return -10;
		}
		else if (this.marks>o.marks) {
			return 10000;
		}
		else {
			return 0;
		}
		
		
		
		
//		return -(this.marks-o.marks);
//		return -(this.name.compareTo(o.name));
	}
	
	public static void main(String[] args) {
		
		Student s1 = new Student("Bill", 99);
		Student s2 = new Student("Rose", 100);
		Student s3 = new Student("Babe", 98);
		Student s4 = new Student("Shamsu", 91);
		Student s5 = new Student("Joe", 90);
		
		ArrayList<Student> stdArray = new ArrayList<Student>();
		stdArray.add(s1);
		stdArray.add(s2);
		stdArray.add(s3);
		stdArray.add(s4);
		stdArray.add(s5);
		
		for (Student student : stdArray) {
			System.out.println(student.name + " " + student.marks);
		}
		
		Collections.sort(stdArray);
		System.out.println("\nAfter Sort");
		
		for (Student student : stdArray) {
			System.out.println(student.name + " " + student.marks);
		}
		
		Collections.reverse(stdArray);
		System.out.println("\nAfter Reverse");
		
		for (Student student : stdArray) {
			System.out.println(student.name + " " + student.marks);
		}
		
	}
	

}
