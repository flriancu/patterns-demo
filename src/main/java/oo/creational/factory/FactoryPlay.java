package oo.creational.factory;

import java.util.List;

import javax.xml.parsers.DocumentBuilderFactory;

import oo.creational.factory.spi.FurnitureFactory;
import oo.creational.factory.valeni.ValeniFurnitureFactory;

public class FactoryPlay {

	public static void main(String[] args) {
		// Example 1
		FurnitureFactory factory = new ValeniFurnitureFactory();

		Distributor distributor = new Distributor(factory);

		List<Object> kitchen = distributor.getKitchenFurniture();
		
		System.out.println("Delivered items of furniture: " + kitchen);

		// Example 2
		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
		
		// TODO: explore how to use this class and how it's similar
		// to our furniture factory. No solutions provided.
	}
}
