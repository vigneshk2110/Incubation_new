package recursion;

public class Print1 {
	
	static int count = 0;
	
	public static void main(String[] args) {
		print();

	}

	private static void print() {

		if (count == 5) {
			return;
		}
	
		
		count++;
		print();
		System.out.println(count--);
	

	}

}
