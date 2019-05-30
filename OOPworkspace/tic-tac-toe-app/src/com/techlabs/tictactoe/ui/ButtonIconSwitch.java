package com.techlabs.tictactoe.ui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import com.techlabs.tictactoe.Board;
import com.techlabs.tictactoe.Game;
import com.techlabs.tictactoe.MarkType;
import com.techlabs.tictactoe.Player;
import com.techlabs.tictactoe.ResultAnalyzer;
import com.techlabs.tictactoe.ResultType;

public class ButtonIconSwitch implements ActionListener {

	private MainFrame frame;
	private int counter = 0;
	private String name1,name2;
	private Game game;
	
	public ButtonIconSwitch(MainFrame frame,String player1, String player2) {
		this.frame = frame;
		Board board = new Board();
		ResultAnalyzer result = new ResultAnalyzer(board);
		Player player[] = new Player[2];
		player[0] = new Player(player1,MarkType.X);
		player[1] = new Player(player2,MarkType.O);
		game = new Game(board,result,player);
		this.name1 = player1;
		this.name2 = player2;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == frame.getOne()) {
			placeRelevantMark(frame.getOne());
			game.play(0);
			frame.getStatus().setText("Status: "+game.getGameStatus());
			disableAllButtonsIfWin();
		}
		if(e.getSource() == frame.getTwo()) {
			placeRelevantMark(frame.getTwo());
			game.play(1);
			frame.getStatus().setText("Status: "+game.getGameStatus());
			disableAllButtonsIfWin();
		}
		if(e.getSource() == frame.getThree()) {
			placeRelevantMark(frame.getThree());
			game.play(2);
			frame.getStatus().setText("Status: "+game.getGameStatus());
			disableAllButtonsIfWin();
		}
		if(e.getSource() == frame.getFour()) {
			placeRelevantMark(frame.getFour());
			game.play(3);
			frame.getStatus().setText("Status: "+game.getGameStatus());
			disableAllButtonsIfWin();
		}
		if(e.getSource() == frame.getFive()) {
			placeRelevantMark(frame.getFive());
			game.play(4);
			frame.getStatus().setText("Status: "+game.getGameStatus());
			disableAllButtonsIfWin();
		}
		if(e.getSource() == frame.getSix()) {
			placeRelevantMark(frame.getSix());
			game.play(5);
			frame.getStatus().setText("Status: "+game.getGameStatus());
			disableAllButtonsIfWin();
		}
		if(e.getSource() == frame.getSeven()) {
			placeRelevantMark(frame.getSeven());
			game.play(6);
			frame.getStatus().setText("Status: "+game.getGameStatus());
			disableAllButtonsIfWin();
		}
		if(e.getSource() == frame.getEight()) {
			placeRelevantMark(frame.getEight());
			game.play(7);
			frame.getStatus().setText("Status: "+game.getGameStatus());
			disableAllButtonsIfWin();
		}
		if(e.getSource() == frame.getNine()) {
			placeRelevantMark(frame.getNine());
			game.play(8);
			frame.getStatus().setText("Status: "+game.getGameStatus());
			disableAllButtonsIfWin();
		}
	}
	
	public void placeRelevantMark(JButton btn) {
		if(game.getPlayerIndex()==0) {
			btn.setText("X");
			btn.setEnabled(false);
			frame.getPlayerName().setText("Player: "+name2);
			frame.getMark().setText("Mark: O");
		}
		if(game.getPlayerIndex()==1) {
			btn.setText("O");
			btn.setEnabled(false);
			frame.getPlayerName().setText("Player: "+name1);
			frame.getMark().setText("Mark: X");
		}
		counter++;
	}
	
	public void disableAllButtonsIfWin() {
		if(game.getGameStatus() == ResultType.WIN) {
			frame.getOne().setEnabled(false);
			frame.getTwo().setEnabled(false);
			frame.getThree().setEnabled(false);
			frame.getFour().setEnabled(false);
			frame.getFive().setEnabled(false);
			frame.getSix().setEnabled(false);
			frame.getSeven().setEnabled(false);
			frame.getEight().setEnabled(false);
			frame.getNine().setEnabled(false);
		}
	}

}
