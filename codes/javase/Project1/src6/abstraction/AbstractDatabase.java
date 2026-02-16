package abstraction;

public abstract class AbstractDatabase {
	int a;

	public void add() {
		System.out.println("Elave edildi...");
	}
	
	public void delete() {
		System.out.println("Elment silindi...");
	}
	
	public abstract void update();
	
	public abstract void get();
}
