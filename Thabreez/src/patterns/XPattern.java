package patterns;
import java.util.*;
public class XPattern {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Size :");
		int n = scan.nextInt();
		patternX1(n);
		System.out.println();
		patternX2(n);
		
	}
	public static void patternX1(int n) {
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(i==j) {
					System.out.print((j+1)+" ");
				}
				else if(n==i+j+1) {
					System.out.print((i+1)+" ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
	public static void patternX2(int n) {
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(i==j) {
					System.out.print((i+1)+" ");
				}
				else if(n==i+j+1) {
					System.out.print((j+1)+" ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}

}