package dpattern;

interface Toy{
	void play();
}

class Car implements Toy{

	@Override
	public void play() {
		System.out.println("Masin ile oynayirsan!");
	}
	
}

class Robot implements Toy{

	@Override
	public void play() {
		System.out.println("Robot ile oynayirsan!");
	}
	
}

class ToyFactor {
	public static Toy getToy(String type) {
		if (type.equalsIgnoreCase("car")) {
			return new Car();
		}else if(type.equalsIgnoreCase("robot")) {
			return new Robot();
		}
		return null;
	}
}

public class Main {
	public static void main(String[] args) {
		Toy toy1 = ToyFactor.getToy("robot");
		toy1.play();
	}
}
