package com.techlabs.asynchronous;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class UIAsynchronous extends JFrame implements ActionListener, Runnable{
	private JButton alert, print;
	
	public UIAsynchronous() {
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
			JOptionPane.showMessageDialog(this, "hello");
		}
		if(e.getSource()==print) {
			Thread t1 = new Thread(this);
			t1.start();
		}
	}

	@Override
	public void run() {
		while(true) {
			DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");
			LocalDateTime now = LocalDateTime.now();
			System.out.println(dtf.format(now));  
		}
	}
}
