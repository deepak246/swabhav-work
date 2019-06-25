package com.techlabs.synchronous;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class UIThread extends JFrame implements ActionListener{
	private JButton alert, print;
	
	public UIThread() {
		alert = new JButton("alert");
		add(alert);
		alert.addActionListener(this);
		
		print = new JButton("print");
		add(print);
		print.addActionListener(this);
		
		setVisible(true);
		setLayout(new FlowLayout());
		setSize(600,560);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==alert) {
			JOptionPane.showMessageDialog(this, "hello!!!");
		}
		if(e.getSource()==print) {
			while(true) {
				DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");
				LocalDateTime now = LocalDateTime.now();
				System.out.println(dtf.format(now));  
			}
		}
	}
}
