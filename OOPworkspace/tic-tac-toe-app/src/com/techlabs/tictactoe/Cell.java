package com.techlabs.tictactoe;

public class Cell {
	private MarkType mark;
	public Cell() {
		this.mark = MarkType.EMPTY;
	}
	
	public void setCellValue(MarkType mark) {
		this.mark = mark;
	}
	
	public MarkType getCellValue() {
		return mark;
	}
	
	public boolean checkIfCellAlreadyMarked() {
		if(mark == MarkType.EMPTY)
			return false;
		return true;
	}
}
