package oo.behavioral.visitor.model;

import oo.behavioral.visitor.ProductVisitor;

public class ExternalProduct implements Product {

	private final String name;
	private final long externalPrice;
	
	public ExternalProduct(String name, long externalPrice) {
		this.name = name;
		this.externalPrice = externalPrice;
	}

	@Override
	public void accept(ProductVisitor visitor) {
		visitor.visit(this);
	}

	public String getName() {
		return name + " (External)";
	}

	public long getExternalPrice() {
		return externalPrice;
	}
}
