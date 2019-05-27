package com.techlabs.tictactoe;

public class Board {
	
	//static int currentPlayer = 1;
	Cell cells[] = new Cell[9];	
	//private int position;
	
	public Board() {
		for(int i = 0; i < 9; i++) {
			cells[i] = new Cell();
		}
		System.out.println("board");
	}
	
	public void setBoardPosition(int position, MarkType mark) {
		//adjustIndex(position);
		//System.out.println(position);
		if(checkPositionValidity(position) == true) {
			cells[position].setCellValue(mark);
		}
	}
	
	private boolean checkPositionValidity(int position) {
		if(position >= 0 && position <= 8) {
			return true;
		}
		return false;
	}

	public MarkType getBoardPosition(int position) {
		//adjustIndex(position);
		return cells[position].getCellValue();
	}
	
	public void adjustIndex(int position) {
		 position = position - 1;
	}
	
	public boolean checkIfBoardIsFull() {
		int index;
		for(index = 0; index < 9; index++) {
			if(cells[index].getCellValue() != MarkType.EMPTY) {
				continue;
			}
			else {
				return false;
			}
		}
		return true;
	}
	
}
