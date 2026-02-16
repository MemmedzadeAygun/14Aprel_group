package abstraction;

public class PostgreSqlDatabase extends AbstractDatabase{

	@Override
	public void update() {
		System.out.println("PostgreSqlDatabase update edildi...");
	}

	@Override
	public void get() {
		System.out.println("PostgreSqlDatabase silindi...");
	}

}
