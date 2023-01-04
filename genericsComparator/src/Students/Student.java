package Students;

import java.util.Objects;

public class Student {
	
	private String name;
	private int age;
	private int height;
	private char rank;
	private int averageMarks;
	
	
	public Student(String name, int age, int height, char rank, int averageMarks) {
		super();
		this.name = name;
		this.age = age;
		this.height = height;
		this.rank = rank;
		this.averageMarks = averageMarks;
	}

	public String getName() {
		return name;
	}


	public int getAge() {
		return age;
	}


	public int getHeight() {
		return height;
	}


	public char getRank() {
		return rank;
	}


	public int getAverageMarks() {
		return averageMarks;
	}


	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", height=" + height + ", rank=" + rank + ", averageMarks="
				+ averageMarks + "]";
	}


	@Override
	public int hashCode() {
		return Objects.hash(age, averageMarks, height, name, rank);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return age == other.age && averageMarks == other.averageMarks && height == other.height
				&& Objects.equals(name, other.name) && rank == other.rank;
	}


	public void print() {
		System.out.println(this.name+ "\t" + this.age+ "\t" + this.height+ "\t" + this.averageMarks+ "\t" + this.rank+ "\t");
		
	}

}
