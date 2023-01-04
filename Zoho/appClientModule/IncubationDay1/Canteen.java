package IncubationDay1;

public class Canteen {

	public static void main(String[] args) {
		
		Student stud1 = new Student();
		
		System.out.println(stud1.name);
		
		System.out.println(stud1.getDepositAmt());
			
		stud1.purchase(100);
		
		System.out.println(stud1.getDepositAmt());
		
	}
}
