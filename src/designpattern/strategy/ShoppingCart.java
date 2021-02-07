package designpattern.strategy;

import java.util.List;
import java.util.ArrayList;

public class ShoppingCart {
	List<Item> items;
	public ShoppingCart() {
		items = new ArrayList<Item>();
	}
	
	public void add(Item item) {
		items.add(item);
	}
	
	public void remove(Item item) {
		items.remove(item);
	}
	
	public double getTotal() {
		double total = 0;
		for(Item item: items) {
			total += item.getPrice();
		}
		return total;
	}
	public void pay(PaymentStrategy payment) {
		payment.pay(getTotal());
	}
}
