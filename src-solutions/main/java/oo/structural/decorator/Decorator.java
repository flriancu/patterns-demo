package oo.structural.decorator;

public class Decorator implements Subject {

	private final Subject delegate;
	
	public Decorator(Subject delegate) {
		this.delegate = delegate;
	}

	@Override
	public void methodA() {
		System.out.println("Decorator: before method A");
		delegate.methodA();
		System.out.println("Decorator: after method A");
	}

	
	@Override
	public void methodB() {
		System.out.println("Decorator: before method B");
		delegate.methodB();
		System.out.println("Decorator: after method B");
	}

}
