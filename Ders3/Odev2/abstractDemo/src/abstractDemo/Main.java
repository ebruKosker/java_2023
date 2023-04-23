package abstractDemo;

public class Main {

	public static void main(String[] args) {
		
		CustomerManager customerManageer=new CustomerManager();
		customerManageer.databaseManager=new SqlServerDatabaseManager();
		customerManageer.getCustomers();
	}

}
