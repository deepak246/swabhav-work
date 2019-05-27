package com.techlabs.tictactoe.unittest;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

import com.techlabs.tictactoe.Board;
import com.techlabs.tictactoe.Game;
import com.techlabs.tictactoe.MarkType;
import com.techlabs.tictactoe.Player;
import com.techlabs.tictactoe.ResultAnalyzer;

public class TestGame {

	@Test
	public void shouldBeSwitchingPlayerIndexCorrectly() {
		Board board = new Board();
		ResultAnalyzer result = new ResultAnalyzer(board);
		Player player[] = new Player[2];
		player[0] = new Player("A",MarkType.X);
		player[1] = new Player("B",MarkType.O);
		Game game = new Game(board,result,player);
		game.play(1);
		//game.play(2);
		int actual = game.getPlayerIndex();
		int expected = 1;
		assertEquals(actual,expected);
		
	}
}
