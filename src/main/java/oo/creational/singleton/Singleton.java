package oo.creational.singleton;

public class Singleton {

	public Singleton() {
		System.out.println("Creating singleton instance");
	}

	private String data;

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

}
