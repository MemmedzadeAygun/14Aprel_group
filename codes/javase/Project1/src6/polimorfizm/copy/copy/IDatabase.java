package polimorfizm.copy.copy;

public interface IDatabase {	
	
	public static final int b = 0;
	
	void add();
	void delete();
	void update();
	abstract void get();
}
