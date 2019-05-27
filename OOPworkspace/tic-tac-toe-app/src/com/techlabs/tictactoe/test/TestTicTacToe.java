package com.techlabs.tictactoe.test;

import com.techlabs.tictactoe.Board;
import com.techlabs.tictactoe.Game;
import com.techlabs.tictactoe.MarkType;
import com.techlabs.tictactoe.Player;
import com.techlabs.tictactoe.ResultAnalyzer;

public class TestTicTacToe {

	public static void main(String[] args) {
		Board board = new Board();
		ResultAnalyzer result = new ResultAnalyzer(board);
		Player player[] = new Player[2];
		player[0] = new Player("A",MarkType.X);
		player[1] = new Player("B",MarkType.O);
		Game game = new Game(board,result,player);
		game.play(0);
		game.play(1);
		game.play(2);
		game.play(4);
		game.play(3);
		game.play(6);
		game.play(5);
		game.play(8);
		game.play(7);
		System.out.println("Game status:"+game.getGameStatus());
	}

}
