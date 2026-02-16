package polimorfizm.copy.copy;

class DatabaseManager{
	
	public void addDatabase(IDatabase database) {
		database.add();
	}
}

public class Main {

	public static void main(String[] args) {

		DatabaseManager dbManager = new DatabaseManager();
		
		dbManager.addDatabase(new MysqlDatabase());
		
		dbManager.addDatabase(new Oracle());
				
	}

}
