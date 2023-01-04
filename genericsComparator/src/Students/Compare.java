package Students;

import java.util.Comparator;

public class Compare{
	
}

class AgeCompare implements Comparator<Student> {


	@Override
	public int compare(Student o1, Student o2) {
		
		if (o1.getAge()<o2.getAge()) {
			return 1;
		}
		else if (o1.getAge()>o2.getAge()) {
			return -1;
		}
		return 0;
	}

}

class HeightCompare implements Comparator<Student> {


	@Override
	public int compare(Student o1, Student o2) {

		if (o1.getHeight()<o2.getHeight()) {
			return 1;
		}
		else if (o1.getHeight()>o2.getHeight()) {
			return -1;
		}
		return 0;
	}

}

class AverageMarksCompare implements Comparator<Student> {


	@Override
	public int compare(Student o1, Student o2) {

		if (o1.getAverageMarks()<o2.getAverageMarks()) {
			return 1;
		}
		else if (o1.getAverageMarks()>o2.getAverageMarks()) {
			return -1;
		}
		return 0;
	}

}

class RankCompare implements Comparator<Student> {


	@Override
	public int compare(Student o1, Student o2) {

		if (o1.getRank()<o2.getRank()) {
			return -1;
		}
		else if (o1.getRank()>o2.getRank()) {
			return 1;
		}
		return 0;
	}

}

class NameCompare implements Comparator<Student> {


	@Override
	public int compare(Student o1, Student o2) {
		
		return (o1.getName().compareTo(o2.getName()));
	}

}
