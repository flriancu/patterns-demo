package oo.creational.factory;

import java.util.ArrayList;
import java.util.List;

import oo.creational.factory.spi.FurnitureFactory;

public class Distributor {

	private final FurnitureFactory factory;

	public Distributor(FurnitureFactory factory) {
		this.factory = factory;
	}

	public List<Object> getKitchenFurniture() {
		List<Object> itemsOfFurniture = new ArrayList<>();

		itemsOfFurniture.add(factory.createTable());
		for (int i = 0; i < 4; i++) {
			itemsOfFurniture.add(factory.createChair());
		}

		return itemsOfFurniture;
	}
	
}
