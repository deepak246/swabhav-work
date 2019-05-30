package com.techlabs.tictactoe;

public class Game {
	private Board board;
	private ResultAnalyzer result;
	private Player player[];
	private int playerIndex;
	ResultType gameStatus;
	
	public Game(Board board, ResultAnalyzer result, Player player[]) {
		this.board = board;
		this.result = result;
		this.player = player;
		playerIndex = 0;
	}
	
	public Board getBoard() {
		return board;
	}

	public ResultAnalyzer getResult() {
		return result;
	}

	public Player[] getPlayer() {
		return player;
	}
	
	public ResultType getGameStatus() {
		return gameStatus;
	}
	
	public int getPlayerIndex() {
		return playerIndex;
	}

	public void play(int position) { 
		if(playerIndex == 0) {
			board.setBoardPosition(position, player[playerIndex].getMark());
			gameStatus = result.checkResult(player[playerIndex].getMark());
			playerIndex = 1;
			return;
		}
		if(playerIndex == 1) {
			board.setBoardPosition(position, player[playerIndex].getMark());
			gameStatus = result.checkResult(player[playerIndex].getMark());
			playerIndex = 0;
		}
	}
	/*
	private void switchPlayerIndex(int playerIndex) {
		if(playerIndex == 0) {
			playerIndex = 1;
			return;
		}
		playerIndex = 0;			
	}
	*/
}