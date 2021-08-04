package oo.behavioral.visitor;

import oo.behavioral.visitor.model.ExternalProduct;
import oo.behavioral.visitor.model.RegularProduct;

public interface ProductVisitor {

	void visit(RegularProduct product);

	void visit(ExternalProduct product);
	
}
