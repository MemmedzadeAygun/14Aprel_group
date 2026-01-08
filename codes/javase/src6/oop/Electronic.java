package oop;

public class Electronic implements Product, BankAccount{

	@Override
	public void add() {
		
		System.out.println("Electronic added successfully...");
	}

	@Override
	public void delete() {
		System.out.println("Electronic delete successfully...");
		
	}

	@Override
	public void update() {
		System.out.println("Electronic update successfully..");
	}

	@Override
	public String get() {
		return "Electronic get successfully...";
	}

	@Override
	public double add(int amount) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double withDraw(int amount) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double getBalance() {
		// TODO Auto-generated method stub
		return 0;
	}

}
