package com.techlabs.tictactoe;

public class Player {
	
	private MarkType mark;
	private String name;
	
	public Player(String name, MarkType mark) {
		this.name = name;
		this.mark = mark;
	}
	
	public String getName() {
		return name;
	}
	
	public MarkType getMark() {
		return mark;
	}
	
}
