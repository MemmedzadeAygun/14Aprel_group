package oop;

public class NewAccount implements BankAccount {

private double balance;
	

	public NewAccount(double balance) {
		super();
		this.balance = balance;
	}

	@Override
	public double add(int amount) {
//		balance += amount;
		balance = balance + amount;
		return balance;
	}

	@Override
	public double withDraw(int amount) {
		balance = balance - amount;
		return balance;
	}

	@Override
	public double getBalance() {
		return balance;
	}

}
