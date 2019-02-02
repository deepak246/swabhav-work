package com.techlabs.service;


import java.util.Random;

public class GameService {
	Random rand = new Random();
	private static int luckyNo = (int) (Math.random() * 100);
	private static int countAttempt = 0;
	

	public String checkStatus(int userGuess) {
		countAttempt++;
		if (userGuess == luckyNo) {
			return "correct";
		}
		if(userGuess>luckyNo) {
			return "high";
		}
		return "low";
	}
	public static int getCountAttempt() {
		return countAttempt;
	}
}
