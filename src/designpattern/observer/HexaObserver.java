package designpattern.observer;

public class HexaObserver implements IObserver {

	ConcreteSubject subject;
	
	public HexaObserver(ConcreteSubject subject) {
		this.subject = subject;
	}
	
	@Override
	public void update() {
		int state = subject.getState();
		System.out.println("Hexa: " + Integer.toHexString(state));
	}
	
}
