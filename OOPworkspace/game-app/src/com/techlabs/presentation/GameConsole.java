package com.techlabs.presentation;

import java.util.*;

import com.techlabs.service.GameService;

public class GameConsole {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		GameService gs = new GameService();
		String status;
		do {
			System.out.println("Guess number in range 1-100");
			int userGuess = sc.nextInt();
			status = gs.checkStatus(userGuess);
			System.out.println("Entered guess is " + status);
		} while (!status.equalsIgnoreCase("correct"));
		System.out.println("You required " + GameService.getCountAttempt() + " attempts");
	}

}
