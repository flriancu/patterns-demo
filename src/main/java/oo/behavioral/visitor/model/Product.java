package oo.behavioral.visitor.model;

import oo.behavioral.visitor.ProductVisitor;

public interface Product {
	void accept(ProductVisitor visitor);
}
