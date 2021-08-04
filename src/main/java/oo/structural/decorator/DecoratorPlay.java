package oo.structural.decorator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DecoratorPlay {
	public static void main(String[] args) throws Exception {
		Subject realSubject = new RealSubject();

		// TODO complete Decorator
		Subject decorator = realSubject; // new Decorator(realSubject);
		codClient(decorator);

		// 2 Decorator: unmodifiableList
		List<String> list = new ArrayList<>(Arrays.asList("a", "b"));
		// TODO: wrap with a Decorator that forbids all changes to the list
		// (add/remove)
		List<String> newList = list;
		newList.add("new Element"); // must throw exception
		System.out.println("List : " + newList);
	}

	private static void codClient(Subject subject) {
		System.out.println("client code: before calling method A");
		subject.methodA();
		System.out.println("client code: after calling method A");
	}
}
