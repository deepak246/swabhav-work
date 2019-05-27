package com.techlabs.tictactoe.unittest;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

import com.techlabs.tictactoe.Board;
import com.techlabs.tictactoe.MarkType;
import com.techlabs.tictactoe.ResultAnalyzer;
import com.techlabs.tictactoe.ResultType;

public class TestResultAnalyzer {
	
	@Test
	public void checkResultIsCorrectOrNot() {
		Board board = new Board();
		board.setBoardPosition(0, MarkType.X);
		board.setBoardPosition(2, MarkType.X);
		board.setBoardPosition(1, MarkType.X);
		ResultAnalyzer result = new ResultAnalyzer(board);
		ResultType actual = result.checkResult(MarkType.X);
		ResultType expected = ResultType.WIN;
		assertEquals(expected, actual);
	}
}
