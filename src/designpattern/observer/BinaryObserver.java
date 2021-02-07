package designpattern.observer;

public class BinaryObserver implements IObserver {
	
	private ConcreteSubject subject;
	public BinaryObserver(ConcreteSubject subject) {
		this.subject = subject;
	}
	
	@Override
	public void update() {
		int state = subject.getState();
		System.out.println("Binary: " + Integer.toBinaryString(state));
	}
}
