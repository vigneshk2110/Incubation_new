package recursion;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class SubSequence {

	public static void main(String[] args) {
		
		int [] arr = {2,3,5};
//		Set<Integer> answer = new HashSet<Integer>();
		ArrayList<Integer> answer = new ArrayList<Integer>();
		subSqnce(arr, answer, 0);

	}

	private static void subSqnce(int[] arr, ArrayList<Integer> answer, int index) {
		if (index == arr.length) {
			
			System.out.println(answer);
			return;
		}
		
		subSqnce(arr, answer, index+1);
		
		answer.add(arr[index]);
		
		subSqnce(arr, answer, index+1);
		
		answer.remove(answer.size()-1);
		
		return;
		
	}

}
