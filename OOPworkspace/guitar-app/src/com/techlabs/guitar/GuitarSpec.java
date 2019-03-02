package com.techlabs.guitar;

public class GuitarSpec {
	private String model; 
	private Type type;
	private Builder builder;
	private Wood backWood, topWood;

	public GuitarSpec(Builder builder, String model, 
			Type type, Wood backWood, Wood topWood) {
		this.builder = builder;
		this.model = model;
		this.type = type;
		this.backWood = backWood;
		this.topWood = topWood;
	}
	
	public String getModel() {
		return model;
	}

	public Type getType() {
		return type;
	}

	public Builder getBuilder() {
		return builder;
	}

	public Wood getBackWood() {
		return backWood;
	}

	public Wood getTopWood() {
		return topWood;
	}

}
