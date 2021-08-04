package oo.creational.singleton;

public class SingletonPlay {

	public static void businessCode() {
		Singleton s = new Singleton();

		// TODO transform the Singleton class in an actual singleton

		System.out.println("Singleton existing data: " + s.getData());
		System.out.println("Singleton instance : " + s);
		s.setData("data1");
	}

	public static void main(String[] args) {
		businessCode();
		businessCode();
	}

}
