package com.techlabs.instruments;

public enum Type {
	ACOUSTIC, ELECTRIC;
	
	@Override
	public String toString() {
		switch(this) {
		case ACOUSTIC: 
			return "acoustic";
		case ELECTRIC: 
			return "electric";
		}
		return "unspecified";
	}
}
