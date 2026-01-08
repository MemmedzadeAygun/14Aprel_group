package polimorfizm.copy.copy;

public class Oracle implements IDatabase{

	@Override
	public void add() {
		System.out.println("Oracle elave edildi...");
	}

	@Override
	public void delete() {
		System.out.println("Oracle silindi...");
	}

	@Override
	public void update() {
		System.out.println("Oracle deyisdirildi...");
	}

	@Override
	public void get() {
		System.out.println("Oracle elde edildi...");
	}

}
