package Problems;

public class Power {

	public static void main(String[] args) {
		int x = 2;
		int y = -3;

		double result = pow(x,y);

		System.out.println(result);

	}

	private static double pow(int x, int y) {

		if (y==0) {
			return 1;
		}
		if (y>0) {
			return x*pow(x, y-1);
		} 

		return pow(x, y+1)/x;
	}
}
