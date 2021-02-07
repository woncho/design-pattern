package designpattern.observer;

public class ObserverDemo {
	public static void main(String[] args) {
		
		ConcreteSubject subject = new ConcreteSubject();
		
		BinaryObserver bo = new BinaryObserver(subject);
		subject.add(bo);
		
		HexaObserver ho = new HexaObserver(subject);
		subject.add(ho);
		
		OctalObserver oo = new OctalObserver(subject);
		subject.add(oo);
		
		subject.setState(10);
		subject.notifyAllObserver();
	}
	
}
