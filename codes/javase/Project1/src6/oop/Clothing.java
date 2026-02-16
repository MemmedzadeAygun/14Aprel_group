package oop;

public class Clothing implements Product{

	@Override
	public void add() {
		
		System.out.println("Clothing added successfully...");
	}

	@Override
	public void delete() {
		System.out.println("Clothing delete successfully...");
		
	}

	@Override
	public void update() {
		System.out.println("Clothing update successfully..");
	}

	@Override
	public String get() {
		return "Clothing get successfully...";
	}
}
