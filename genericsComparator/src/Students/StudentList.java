package Students;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class StudentList {

	public static void main(String[] args) {
		Student s1 = new Student("Vicky", 12, 178, 'A', 99);
		Student s2 = new Student("venky", 13, 168, 'B', 99);
		Student s3 = new Student("Monkey", 10, 172, 'A', 92);
		Student s4 = new Student("Abbay", 12, 171, 'B', 98);
		Student s5 = new Student("Suresh", 16, 178, 'C', 97);

		ArrayList<Student> stArrayList = new ArrayList<>();
		stArrayList.add(s1);
		stArrayList.add(s2);
		stArrayList.add(s3);
		stArrayList.add(s4);
		stArrayList.add(s5);

		System.out.println("Sorting by Age");
		Collections.sort(stArrayList, new AgeCompare());

		for (Student student : stArrayList) {
			student.print();
		}


		//		System.out.println();
		//		System.out.println("Sorting by Name");
		//		Collections.sort(stArrayList, new NameCompare());
		//
		//		for (Student student : stArrayList) {
		//			student.print();
		//		}
		//		
		//		System.out.println();
		//		System.out.println("Sorting by Marks");
		//		Collections.sort(stArrayList, new AverageMarksCompare());
		//
		//		for (Student student : stArrayList) {
		//			student.print();
		//		}
		//		
		//		
		//		System.out.println();
		//		System.out.println("Sorting by Height");
		//		Collections.sort(stArrayList, new HeightCompare());
		//
		//		for (Student student : stArrayList) {
		//			student.print();
		//		}
		//		
		//		System.out.println();
		//		System.out.println("Sorting by Rank");
		//		Collections.sort(stArrayList, new RankCompare());
		//
		//		for (Student student : stArrayList) {
		//			student.print();
		//		}
		//

		//		Comparator<Student> cm1=Comparator.comparing(Student::getName);  
		//		Collections.sort(stArrayList,cm1);  
		//
		//		System.out.println();
		//		System.out.println("Sorting by Attendance Order");
		//
		//		for (Student student : stArrayList) {
		//			student.print();
		//		}

		//		Comparator<Student> cm2=Comparator.comparing(Student::getAge);  
		//		Collections.sort(stArrayList,cm2);  
		//
		//		System.out.println();
		//		System.out.println("Sorting by Age");
		//
		//
		//		for (Student student : stArrayList) {
		//			student.print();
		//		}
		//
		//		Comparator<Student> cm3=Comparator.comparing(Student::getAverageMarks);  
		//		Collections.sort(stArrayList,cm3);  
		//
		//		System.out.println();
		//		System.out.println("Sorting by Marks");
		//
		//
		//		for (Student student : stArrayList) {
		//			student.print();
		//		}
		//
		//		Comparator<Student> cm4 =Comparator.comparing(Student::getHeight);  
		//		Collections.sort(stArrayList,cm4);  
		//
		//		System.out.println();
		//		System.out.println("Sorting by Height");
		//
		//		for (Student student : stArrayList) {
		//			student.print();
		//		}
		//
		//		Comparator<Student> cm5 =Comparator.comparing(Student::getRank);  
		//		Collections.sort(stArrayList,cm5);  
		//
		//		System.out.println();
		//		System.out.println("Sorting by Rank");
		//
		//		for (Student student : stArrayList) {
		//			student.print();
		//		}
	}
}