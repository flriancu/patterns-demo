package oo.behavioral.visitor.model;

import oo.behavioral.visitor.ProductVisitor;

public class ExternalProduct implements Product {

	private final String name;
	private final long price;
	
	public ExternalProduct(String name, long price) {
		this.name = name;
		this.price = price;
	}

	@Override
	public void accept(ProductVisitor visitor) {
		visitor.visit(this);
	}

	public String getName() {
		return name + " (External)";
	}

	public long getExternalPrice() {
		return price;
	}
}
