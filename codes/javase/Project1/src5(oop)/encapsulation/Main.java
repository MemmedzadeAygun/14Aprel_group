package encapsulation;

public class Main {
	public static void main(String[] args) {
		Car car1 = new Car();
		/*car1.color = "Red";
		car1.speed = 80;
		car1.doors = 4;
		car1.model = "Porshe"; */
		
		car1.setColor("Red");
		car1.setModel("Porshe");
		car1.setDoors(2);
		car1.setSpeed(120);
		
		System.out.println(car1.getColor());
		System.out.println(car1.getModel());
		System.out.println(car1.getDoors());
		System.out.println(car1.getSpeed());
		
		/*System.out.println(car1.color);
		System.out.println(car1.model);
		System.out.println(car1.speed);
		System.out.println(car1.doors);*/
	}
}
