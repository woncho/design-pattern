package designpattern.strategy;

public class StrategyDemo {
	public static void main(String[] args) {
		ShoppingCart cart = new ShoppingCart();
		Item item1 = new Item("Mac Book Pro", 1000.00);
		Item item2 = new Item("IMac", 2000.00);
		
		cart.add(item1);
		cart.add(item2);
		
		cart.pay(new CreditCard("user1","1233455060605","12/21"));
		cart.pay(new PayPal("user1","password"));
		
	}
}
