package com.techlabs.factorymethod;

public class AudiFactory implements IAutoFactory {

	private static AudiFactory instance = new AudiFactory();
	
	private AudiFactory() {
		
	}
	
	public static AudiFactory getInstance() {
		return instance;
	}
	
	@Override
	public IAutomobile make() {
		return new Audi();
	}

}
