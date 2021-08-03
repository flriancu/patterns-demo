package oo.creational.factory.valeni;

import oo.creational.factory.spi.Chair;
import oo.creational.factory.spi.FurnitureFactory;
import oo.creational.factory.spi.Table;

public class ValeniFurnitureFactory implements FurnitureFactory {

	@Override
	public Chair createChair() {
		return new ValeniChair();
	}

	@Override
	public Table createTable() {
		return new ValeniTable();
	}

}
