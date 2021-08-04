package oo.creational.singleton;

public class SingletonPlay {

	public static void main(String[] args) {

                // Example 1
		System.out.println("Singleton data: " + Singleton.getInstance().getData());
		Singleton.getInstance().setData("AAA");
		System.out.println("Singleton data: " + Singleton.getInstance().getData());
		Singleton.getInstance().setData("BBB");
		System.out.println("Singleton data: " + Singleton.getInstance().getData());

		// Example 2: an example of EAGER singleton in JDK.
		Runtime.getRuntime().totalMemory();
                // TODO explore this singleton. No solutions provided.
	}
}
