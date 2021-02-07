package designpattern.observer;

import java.util.List;
import java.util.ArrayList;

public class ConcreteSubject implements ISubject {

	private List<IObserver> observers;
	private int state;
	
	public ConcreteSubject() {
		observers = new ArrayList<IObserver>();
	}
	@Override
	public void add(IObserver observer) {
		observers.add(observer);
	}

	@Override
	public void remove(IObserver observer) {
		observers.remove(observer);
		
	}

	@Override
	public void notifyAllObserver() {
		for(IObserver o: observers) {
			o.update();
		}
	}
	public int getState() {
		return state;
	}
	public void setState(int state) {
		this.state = state;
	}
	
	
}
