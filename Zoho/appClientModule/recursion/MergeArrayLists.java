package recursion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class MergeArrayLists implements Comparator<Integer>{

	public static void main(String[] args) {
		ArrayList<Integer> a1 = new ArrayList<Integer>();
		a1.add(1);
		a1.add(21);
		a1.add(13);
		a1.add(14);
		a1.add(12);
		a1.add(15);
		ArrayList<Integer> a2 = new ArrayList<Integer>();
		a2.add(112);
		a2.add(1212);
		a2.add(12412);
		a2.add(12312);
		a2.add(12512);
		
		a1.addAll(a2);
		
		Collections.sort(a1 , new MergeArrayLists());
		
		System.out.println(a1);
	}

	@Override
	public int compare(Integer o1, Integer o2) {
		return (-o1+o2);
	}

}
