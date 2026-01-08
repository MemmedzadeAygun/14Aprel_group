package polimorfizm;

public class Horse extends Animal{

	public Horse(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void makeSound() {
		System.out.println(getName() + " kisneyir...");
	}
}
