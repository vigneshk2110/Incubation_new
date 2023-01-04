package recursion;

import java.util.Arrays;

public class Merge2Arrays {

	static int k = 0;

	public static void main(String[] args) {
		int []a = {12, 14, 14};
		int []b = {13, 15,17, 18};
		int []c = new int [a.length + b.length];

		System.out.println(Arrays.toString(merge(a,b,c,0,0)));
		//merge(a,b,c,0,0);
		//System.out.println(Arrays.toString(c));
	}

	private static int[] merge(int[] a, int[] b,int[] c, int aIndex, int bIndex) {
		if (aIndex >= a.length  && bIndex >= b.length) {
			return c;
		}
		//if (aIndex < a.length  && bIndex < b.length) {

		if (bIndex >= b.length  && aIndex != a.length) {
			c[k++] = a[aIndex];
			merge(a, b, c, aIndex+1, bIndex);
		} 
		else if (aIndex >= a.length && bIndex != b.length) {
			c[k++] = b[bIndex];
			merge(a, b, c, aIndex, bIndex+1);
		}
		else if(a[aIndex]<=b[bIndex]) {
			c[k++] = a[aIndex];
			merge(a, b, c, aIndex+1, bIndex);
		}
		else {
			c[k++] = b[bIndex];
			merge(a, b, c, aIndex, bIndex+1);
		}

		return c;
	}
}
