package com.techlabs.tictactoe.ui;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MainFrame extends JFrame {
	
	private JFrame frame;
	private JButton one,two,three,four,five,six,seven,eight,nine;
	private JLabel status,playerName,mark; 
	private ButtonIconSwitch btnSwitch;
	
	public MainFrame(String player1, String player2) {
		
		setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
		setTitle("Tic Tac Toe");
		btnSwitch = new ButtonIconSwitch(this,player1,player2);
		status = new JLabel("Status: Play");
		playerName = new JLabel("player: "+player1);
		mark = new JLabel("Mark : X");
		one = new JButton("1");
		two = new JButton("2");
		three = new JButton("3");
		four = new JButton("4");
		five = new JButton("5");
		six = new JButton("6");
		seven = new JButton("7");
		eight = new JButton("8");
		nine = new JButton("9");
		
		one.addActionListener(btnSwitch);
		two.addActionListener(btnSwitch);
		three.addActionListener(btnSwitch);
		four.addActionListener(btnSwitch);
		five.addActionListener(btnSwitch);
		six.addActionListener(btnSwitch);
		seven.addActionListener(btnSwitch);
		eight.addActionListener(btnSwitch);
		nine.addActionListener(btnSwitch);
		
		add(status);
		add(playerName);
		add(mark);
		add(one);
		add(two);
		add(three);
		add(four);
		add(five);
		add(six);
		add(seven);
		add(eight);
		add(nine);
		
		setLayout(new GridLayout(4,1));
		setSize(500,500);
		setVisible(true);
	}

	public JFrame getFrame() {
		return frame;
	}

	public JButton getOne() {
		return one;
	}

	public JButton getTwo() {
		return two;
	}

	public JButton getThree() {
		return three;
	}

	public JButton getFour() {
		return four;
	}

	public JButton getFive() {
		return five;
	}

	public JButton getSix() {
		return six;
	}

	public JButton getSeven() {
		return seven;
	}

	public JButton getEight() {
		return eight;
	}

	public JButton getNine() {
		return nine;
	}

	public JLabel getStatus() {
		return status;
	}

	public JLabel getPlayerName() {
		return playerName;
	}

	public JLabel getMark() {
		return mark;
	}

	public ButtonIconSwitch getBtnSwitch() {
		return btnSwitch;
	}
	
}
