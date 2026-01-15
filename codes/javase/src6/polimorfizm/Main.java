package polimorfizm;

public class Main {
	
	public static void doIt(Animal animal) {
		animal.makeSound();
	}
	

	public static void main(String[] args) {
	
		/*Animal animal = new Animal("Animal");
		Cat cat = new Cat("Tom");
		Horse horse = new Horse("Qarabas");
		
		animal.makeSound();
		cat.makeSound();
		horse.makeSound();*/
		
		Animal animal = new Cat("Tom");
//		animal.makeSound();
		
//		Animal cat = new Horse("Qarabas");
		
		doIt(new Cat("Tom"));
		doIt(new Horse("Qarabas"));
	}

}
