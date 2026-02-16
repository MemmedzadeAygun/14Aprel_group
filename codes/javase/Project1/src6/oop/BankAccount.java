package oop;

public interface BankAccount {

	double add(int amount);
	double withDraw(int amount);
	double getBalance();
	
	static void doIt() {
		System.out.println("Do it");
	}
}
