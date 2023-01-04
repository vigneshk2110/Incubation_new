package thread;

import javax.sql.rowset.Joinable;

public class main {

	public static void main(String[] args) {

		Son rajeshSon = new Son();
		rajeshSon.start();
		try {
			rajeshSon.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		rajeshSon.setPriority(10);
		System.out.println(rajeshSon.getName());
		rajeshSon.setName("Rajesh Method");
		
		System.out.println(rajeshSon.getName());
		
		
		Grandson jaggu = new Grandson();
		jaggu.start();
		jaggu.setPriority(1);
		

		for (int i = 1; i <= 50; i++) {

			System.out.println("Main Method -  Called - " + i);
		}
	}

}
