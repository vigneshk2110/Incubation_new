package zCoins;

public interface ZuInterface {
	
	default int exhangeRate() {
		return 2;
		
	}
	
	default double commissionRate() {
		return 0.15;		
	}
	
	void approveUsers();
	
	void viewTransactions();
	
	void allocateZID();	

}
