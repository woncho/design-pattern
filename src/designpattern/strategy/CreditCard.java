package designpattern.strategy;

public class CreditCard implements PaymentStrategy {
	
	private String name;
	private String number;
	private String expiryDate;
	
	public CreditCard(String name, String number, String expiryDate) {
		this.name = name;
		this.number = number;
		this.expiryDate = expiryDate;
	}
	@Override
	public void pay(double amount) {
		System.out.println(amount + " is paid by CreditCard.");
	}
}
