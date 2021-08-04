package oo.creational.builder;

public class BuilderPlay {

	public static void main(String[] args) {
		// Example 1
		Customer customer = new Customer.Builder()
			.withName("John Doe")
			.withLabel("Label1")
			.withAddress(new Address.Builder()
				.withStreetName("Viorele")
				.build())
			.build();
		
		System.out.println("Customer name: " + customer.getName());
		System.out.println("Customer address: " + customer.getAddress().getStreetName());
		
		// Example 2
		String s = new StringBuilder()
			.toString();

		// TODO explore the StringBuilder class. No solutions provided.
	}
}
