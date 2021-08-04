package oo.structural.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

import oo.structural.decorator.RealSubject;
import oo.structural.decorator.Subject;

public class DynamicProxyPlay {

	public static void main(String[] args) throws Exception {
		Subject realSubject = new RealSubject();

		// TODO create a Dynamic Proxy to fake a Subject, using DynamicProxyInvocationHandler
		Subject proxy = realSubject; 

		codClient(proxy);
	}

	private static void codClient(Subject subject) {
		System.out.println("Cod client: Inainte de a apela metoda A");
		subject.methodA();
		System.out.println("Cod client: Dupa apelarea metodei A");
	}
	
	public class DynamicProxyInvocationHandler implements InvocationHandler {

		private final Subject target;
		
		public DynamicProxyInvocationHandler(Subject target) {
			this.target = target;
		}

		@Override
		public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
			System.out.println("DynamicProxy: inainte de apelul metodei '" + method.getName()+"'");
			Object result = method.invoke(target, args);
			System.out.println("DynamicProxy: dupa apelul metodei '" + method.getName()+"'. Intorc '"+result+"'");
			return result;
		}

	}
	
}
