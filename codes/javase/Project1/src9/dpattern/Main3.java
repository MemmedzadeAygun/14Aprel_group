package dpattern;

interface PaymentStrategy{
	void pay(int amount);
}

class CardPayment implements PaymentStrategy{

	@Override
	public void pay(int amount) {
		System.out.println("Cart ile odenis " + amount + " AZN");
	}
	
}

class CashPayment implements PaymentStrategy{

	@Override
	public void pay(int amount) {
		System.out.println("Nagd ile odenis " + amount + " AZN");
	}
	
}

class PaymentContext{
	private PaymentStrategy strategy;
	
	public void setStrategy(PaymentStrategy strategy) {
		this.strategy = strategy;
	}
	
	public void pay(int amount) {
		strategy.pay(amount);
	}
}

public class Main3 {
	public static void main(String[] args) {
		PaymentContext context = new PaymentContext();
		
		context.setStrategy(new CardPayment());
		context.pay(50);
		
		context.setStrategy(new CashPayment());
		context.pay(100);
	}
}
