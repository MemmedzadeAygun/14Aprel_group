package polimorfizm.copy.copy;

public class MysqlDatabase implements IDatabase {

	@Override
	public void add() {
		System.out.println("Mysql elave edildi...");
	}

	@Override
	public void delete() {
		System.out.println("Mysql silindi...");
	}

	@Override
	public void update() {
		System.out.println("Mysql deyisdirildi...");
	}

	@Override
	public void get() {
		System.out.println("Mysql elde edildi...");
	}

}
