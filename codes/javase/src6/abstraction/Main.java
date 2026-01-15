package abstraction;

public class Main {

	public static void main(String[] args) {
//		AbstractDatabase db = new AbstractDatabase();
//		db.update();
		
		AbstractDatabase abstractDb = new MysqlDatabase();
		abstractDb.add();
		abstractDb.update();
		abstractDb.get();
		abstractDb.a = 12;
		
		AbstractDatabase abstractDb2 = new PostgreSqlDatabase();
		abstractDb2.add();
		abstractDb2.update();
		abstractDb2.get();
		
	}

}
