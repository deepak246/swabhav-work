package com.techlabs.tictactoe.unittest;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

import com.techlabs.tictactoe.Cell;
import com.techlabs.tictactoe.MarkType;

public class TestCell {

	@Test
	public void shouldBeSettingCellWithMarkTypeX() {
		Cell cell = new Cell();	
		cell.setCellValue(MarkType.X);
		MarkType actual = cell.getCellValue();
		MarkType expected = MarkType.X;
		assertEquals(expected, actual);
	}
	
	@Test
	public void cellShouldBeEmptyInitially() {
		Cell cell = new Cell();
		MarkType actual = cell.getCellValue();
		MarkType expected = MarkType.EMPTY;
		assertEquals(expected, actual);
	}
	
	@Test
	public void shouldReturnTrueIfCellAlreadyMarked() {
		Cell cell = new Cell();
		cell.setCellValue(MarkType.X);
		boolean actual = cell.checkIfCellAlreadyMarked();
		boolean expected = true;
		assertEquals(expected, actual);
	}
}
