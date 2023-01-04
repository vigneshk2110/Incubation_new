package zCoins;

import java.sql.SQLException;

public interface UserInterface {

	void registerUser();

	void viewTransaction();

	void deposit();

	void withdraw();

	void convertCurrency();

	void transferZcoins();

	void passWordChange();

}
