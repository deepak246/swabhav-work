package com.techlabs.guitar.test;

import java.util.Iterator;
import java.util.List;

import com.techlabs.guitar.Builder;
import com.techlabs.guitar.Guitar;
import com.techlabs.guitar.GuitarSpec;
import com.techlabs.guitar.Type;
import com.techlabs.guitar.Wood;
import com.techlabs.inventory.Inventory;

public class FindGuitarTester {

	public static void main(String[] args) {
		Inventory inventory = new Inventory();
		initializeInventory(inventory);
		
		GuitarSpec whatErinLikes = new GuitarSpec(Builder.FENDER, "Stratocastor",
				Type.ELECTRIC, Wood.ALDER, Wood.ALDER);
		List matchingGuitars = inventory.search(whatErinLikes);
		
		if(!matchingGuitars.isEmpty()) {
			System.out.println("Erin, you might like these guitars:");
			for(Iterator i = matchingGuitars.iterator(); i.hasNext(); ) {
				Guitar guitar = (Guitar)i.next();
				GuitarSpec spec = guitar.getSpec();
				System.out.println("We have a "+spec.getBuilder() +" "+spec.getModel()
						+" "+spec.getType()+" guitar:\n "+spec.getBackWood()+
						" back and sides,\n "+spec.getTopWood()+" top.\n "
								+ "You can have it for $"+guitar.getPrice()+" \n----");
			}
		}
		if(matchingGuitars.isEmpty()) {
			System.out.println("sorry, we have nothing for you");
		}
	}
	public static void initializeInventory(Inventory inventory) {
		inventory.addGuitar("101", 1500, Builder.FENDER, "Stratocastor",
				Type.ELECTRIC, Wood.ALDER, Wood.ALDER);
	}
}
