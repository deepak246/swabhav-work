package com.techlabs.inventory;

import java.util.*;
import com.techlabs.guitar.*;

public class Inventory {
	private List guitars;
	
	public Inventory() {
		guitars = new LinkedList();
	}
	
	public void addGuitar(String serialNumber, double price, Builder builder, 
			String model, Type type, Wood backWood, Wood topWood) {
		GuitarSpec spec = new GuitarSpec(builder, model, type, backWood, topWood);
		Guitar guitar = new Guitar(serialNumber, price, spec);
		guitars.add(guitar);
	}
	public Guitar getGuitar(String serialNumber) {
		for(Iterator i = guitars.iterator(); i.hasNext(); ) {
			Guitar guitar = (Guitar)i.next();
			if(guitar.getSerialNumber().equals(serialNumber)) {
				return guitar;
			}
		}
		return null;
	}
	
	public List search(GuitarSpec searchSpec) {
		List matchingGuitars = new LinkedList();
		for(Iterator i = guitars.iterator(); i.hasNext(); ) {
			Guitar guitar = (Guitar)i.next();
			
			if(guitar.getSpec().matches(searchSpec)) {
				matchingGuitars.add(guitar);
			}
		}
		return matchingGuitars;
	}	
}
