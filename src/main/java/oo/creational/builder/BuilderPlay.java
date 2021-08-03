package oo.creational.builder;

public class BuilderPlay {

	public static void main(String[] args) {
		Customer customer = new Customer.Builder()
			.withLabel("Label1") 
			// TODO set name	
			// TODO set address
			// TODO set phone (must create a with...() method)
			// TODO set Address
			.build();
		
		System.out.println("Customer name: " + customer.getName());
		System.out.println("Customer address: " + customer.getAddress().getStreetName());
		
		// 2
		String s = new StringBuilder()
			.toString();
	}
}
