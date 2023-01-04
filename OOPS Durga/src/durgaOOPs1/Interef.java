package durgaOOPs1;

public interface Interef {

	void name();
	void name1();

	static void example() {
		System.out.println("This is an Example of static method implemented in Interface");
	}

	public default void example1() {
		System.out.println("This is an Example of Default method implemented in Interface");
	}


}
