package com.techlabs.memento;

import java.util.ArrayList;
import java.util.List;

public class CareTaker {
	private List<Memento> history;
	private int currentState = -1;

	public CareTaker() {
		history = new ArrayList<Memento>();
	}

	public void addMemento(Memento m) {
		history.add(m);
		currentState = history.size() - 1;
	}

	public Memento getMemento(int index) {
		return history.get(index);
	}

	public Memento undo() {
		System.out.println("Undoing state...");
		if (currentState <= 0) {
			currentState = 0;
			return getMemento(currentState);
		}
		currentState--;
		return getMemento(currentState);
	}

	public Memento redo() {
		System.out.println("Redoing state...");
		if (currentState >= history.size() - 1) {
			currentState = history.size() - 1;
			return getMemento(currentState);
		}
		currentState++;
		return getMemento(currentState);
	}

}
