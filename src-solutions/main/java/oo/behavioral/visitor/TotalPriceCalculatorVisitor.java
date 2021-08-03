package oo.behavioral.visitor;

import oo.behavioral.visitor.model.ExternalProduct;
import oo.behavioral.visitor.model.RegularProduct;

public class TotalPriceCalculatorVisitor implements ProductVisitor {

	private long sum = 0;

	@Override
	public void visit(RegularProduct product) {
		sum += product.getPrice();
	}

	@Override
	public void visit(ExternalProduct product) {
		sum += product.getExternalPrice();
	}
	
	public long getTotal() {
		return sum;
	}

}
