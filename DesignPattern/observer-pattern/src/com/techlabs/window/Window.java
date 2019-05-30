package com.techlabs.window;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Window extends JFrame{
	private JButton red, blue;
	private CommonObserver co;
	
	public Window() {
		
		co = new CommonObserver(this);
		
		red = new JButton("red");
		add(red);
		red.addActionListener(co);
		
		blue = new JButton("blue");
		add(blue);
		blue.addActionListener(co);
		
		
		getContentPane().setBackground(Color.YELLOW);
		setLayout(new FlowLayout());
		setSize(1024, 768);
		setTitle("Change to appropriate color on click");
		setVisible(true);
	}
	/*
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == red) {
			getContentPane().setBackground(Color.RED);
			//notifyObserver(red);
		}
		if(e.getSource() == blue) {
			getContentPane().setBackground(Color.BLUE);
			//notifyObserver(blue);
		}
	}
	*/
	public JButton getRed() {
		return red;
	}

	public JButton getBlue() {
		return blue;
	}
}
