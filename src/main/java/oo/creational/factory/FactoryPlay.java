package oo.creational.factory;

import java.util.List;

import javax.xml.parsers.DocumentBuilderFactory;

import oo.creational.factory.spi.FurnitureFactory;
import oo.creational.factory.valeni.ValeniFurnitureFactory;

public class FactoryPlay {

	public static void main(String[] args) {
		FurnitureFactory factory = new ValeniFurnitureFactory();

		Distributor distributor = new Distributor(factory);

		List<Object> kitchen = distributor.getKitchenFurniture();
		
		// TODO: create another product

		System.out.println("Delivered tables: " + kitchen);

		// 2
		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
		
		
	}
}
