package com.techlabs.tictactoe.unittest;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

import com.techlabs.tictactoe.Board;
import com.techlabs.tictactoe.MarkType;

public class TestBoard {
	
	@Test
	public void shouldBeSettingBoardPosition3WithCellValueX() {
		Board board = new Board();
		board.setBoardPosition(3,MarkType.X);
		MarkType actual = board.getBoardPosition(3);
		MarkType expected = MarkType.X;
		assertEquals(expected, actual);
	}
	
	@Test
	public void checkingIfBoardIsGettingFull() {
		Board board = new Board();
		board.setBoardPosition(1, MarkType.X);
		board.setBoardPosition(2, MarkType.X);
		board.setBoardPosition(3, MarkType.X);
		board.setBoardPosition(4, MarkType.X);
		board.setBoardPosition(5, MarkType.X);
		board.setBoardPosition(6, MarkType.X);
		board.setBoardPosition(7, MarkType.X);
		board.setBoardPosition(8, MarkType.X);
		board.setBoardPosition(0, MarkType.X);
		boolean actual = board.checkIfBoardIsFull();
		boolean expected = true;
		assertEquals(actual,expected);
	}
	
	
}
