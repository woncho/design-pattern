package designpattern.observer;

public class OctalObserver implements IObserver {

	ConcreteSubject subject;
	public OctalObserver(ConcreteSubject subject) {
		this.subject = subject;
	}
	
	@Override
	public void update() {
		int state = subject.getState();
		System.out.println("Octal: " + Integer.toOctalString(state));
	}
}
