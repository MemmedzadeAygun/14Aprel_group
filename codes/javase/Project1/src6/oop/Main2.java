package oop;

public class Main2 {
	public static void main(String[] args) {
		Account account = new Account(300);
		System.out.println(account.add(50));
		System.out.println(account.withDraw(200));
		System.out.println(account.getBalance());
		
		NewAccount newAccount = new NewAccount(100);
		newAccount.add(0);
		
	}
}
