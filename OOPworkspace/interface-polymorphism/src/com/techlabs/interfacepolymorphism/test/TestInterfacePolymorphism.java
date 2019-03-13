package com.techlabs.interfacepolymorphism.test;

import com.techlabs.interfacepolymorphism.Boy;
import com.techlabs.interfacepolymorphism.IEmotionable;
import com.techlabs.interfacepolymorphism.IMannerable;
import com.techlabs.interfacepolymorphism.Man;

public class TestInterfacePolymorphism {

	public static void main(String[] args) {
		Man man = new Man();
		Boy boy = new Boy();
		atTheParty(man);
		atTheParty(boy);
		//atTheMovies(man);
		atTheMovies(boy);
		
	}
	public static void atTheMovies(IEmotionable obj) {
		System.out.println("At the Movies");
		obj.cry();
		obj.laugh();
	}
	public static void atTheParty(IMannerable obj) {
		System.out.println("At the Party");
		obj.wish();
		obj.depart();
	}
}
