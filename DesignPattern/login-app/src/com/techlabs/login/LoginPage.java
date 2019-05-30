package com.techlabs.login;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LoginPage extends JFrame implements ActionListener{
	private JButton SUBMIT;
	private JPanel panel;
	private JLabel label1, label2;
	private JTextField text1, text2;
	private WelcomePage welcomePage;

	public LoginPage() {
		
		label1 = new JLabel();
		label1.setText("Username:");
		text1 = new JTextField(15);

		label2 = new JLabel();
		label2.setText("Password:");
		text2 = new JPasswordField(15);

		SUBMIT = new JButton("SUBMIT");

		panel = new JPanel(new GridLayout(3, 1));
		panel.add(label1);
		panel.add(text1);
		panel.add(label2);
		panel.add(text2);
		panel.add(SUBMIT);
		add(panel, BorderLayout.CENTER);
		SUBMIT.addActionListener(this);
		setTitle("LOGIN FORM");
		//setVisible(true);
	}

	public JButton getSUBMIT() {
		return SUBMIT;
	}

	public JPanel getPanel() {
		return panel;
	}

	public JLabel getLabel1() {
		return label1;
	}

	public JLabel getLabel2() {
		return label2;
	}

	public JTextField getText1() {
		return text1;
	}

	public JTextField getText2() {
		return text2;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String value1 = text1.getText();
		String value2 = text2.getText();
		if (value1.equals("deepak") && value2.equals("123")) {
			WelcomePage page = new WelcomePage();
			page.setVisible(true);
			JLabel label = new JLabel("Welcome:" + value1);
			page.getContentPane().add(label);
		} else {
			System.out.println("enter the valid username and password");
			JOptionPane.showMessageDialog(this, "Incorrect login or password", "Error", 
					JOptionPane.ERROR_MESSAGE);
		}
	}
}
