package oop2;

public class Computer extends Object {

	public String model;
	public int year;

	public Computer(String model, int year) {
		super();
		this.model = model;
		this.year = year;
	}

	@Override
	public String toString() {
		return "Computer [model=" + model + ", year=" + year + "]";
	}

	@Override
	public boolean equals(Object obj) {
		
		Computer that = null;
		
		if (obj instanceof Computer) {
			that = (Computer) obj;
		}


		if (this.model.equals(that.model) && this.year == that.year) {
			return true;
		} else {
			return false;
		}
	}
}
