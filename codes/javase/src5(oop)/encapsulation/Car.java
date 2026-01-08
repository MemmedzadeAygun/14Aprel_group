package encapsulation;

public class Car {
	private String color;
	private Integer speed;
	private String model;
	private Integer doors;
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public String getColor() {
		return this.color;
	}
	
	public void setSpeed(Integer speed) {
		this.speed = speed;
	}
	
	public Integer getSpeed() {
		return this.speed;
	}
	
	public void setModel(String model) {
		this.model = model;
	}
	
	public String getModel() {
		return this.model;
	}
	
	public void setDoors(Integer doors) {
		if (doors == 2 || doors == 4) {
			this.doors = doors;			
		}else {
			System.out.println("Qapi sayi yalniz 2 ve ya 4 ola biler...");
		}
		
	}
	
	public Integer getDoors() {
		return this.doors;
	}
}
