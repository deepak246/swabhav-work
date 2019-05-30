package com.techlabs.window;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class CommonObserver implements ActionListener{
	private Window frame;
	public CommonObserver(Window frame) {
		this.frame = frame;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == frame.getRed()) {
			frame.getContentPane().setBackground(Color.RED);
			//notifyObserver(red);
		}
		if(e.getSource() == frame.getBlue()) {
			frame.getContentPane().setBackground(Color.BLUE);
			//notifyObserver(blue);
		}
		System.out.println("Button "+ e.getActionCommand() +" clicked");
	}
}
