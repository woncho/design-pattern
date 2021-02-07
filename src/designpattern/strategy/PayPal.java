package designpattern.strategy;

public class PayPal implements PaymentStrategy {
	
	private String account;
	private String password;
	
	public PayPal(String account, String password) {
		this.account = account;
		this.password = password;
	}
	
	@Override
	public void pay(double amount) {
		System.out.println(amount + " is paid by PayPal.");
	}
}
