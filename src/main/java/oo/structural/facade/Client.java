package oo.structural.facade;

import oo.structural.facade.system.customer.Customer;
import oo.structural.facade.system.customer.CustomerRegistration;
import oo.structural.facade.system.customer.CustomerRepository;
import oo.structural.facade.system.customer.NotificationService;

public class Client {
	private CustomerRepository repository;
	private CustomerRegistration registration;
	private NotificationService notification;

	public void registerCustomer(Customer customer) {
		if (repository.getCustomerByEmail(customer.getEmail()) == null) {
			registration.registerCustomer(customer);
			notification.sendActivationLink(customer);
		} else {
			throw new IllegalArgumentException("Customer already registered with email '" + customer.getEmail() + "'");
		}
	}

	public static void main(String[] args) {
		Client client = new Client();
		// setup client
		// client depends of a lot on internal components -- looots of COUPLING
		client.repository = new CustomerRepository();
		client.registration = new CustomerRegistration();
		client.notification = new NotificationService();

		// TODO: have client depend only on a facade. Move collaborations between internal components IN that Facadade.
		
		//the actual operation to invoke
		client.registerCustomer(new Customer("John Doe", "john.doe@pentagon.us"));
	}
}
