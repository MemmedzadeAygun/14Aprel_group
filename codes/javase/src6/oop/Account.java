package oop;

public class Account implements BankAccount{
	private double balance;
	

	public Account(double balance) {
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
		if (balance > amount) {
			balance = balance - amount;
		}else {
			System.out.println("Balansinizda kifayet qeder vesait yoxdur....");
		}
		return balance;
	}

	@Override
	public double getBalance() {
		return balance;
	}
	

}
