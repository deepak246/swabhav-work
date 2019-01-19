package com.techlabs.codemagnets;

class Drumkit {
	boolean topHat = true;
	boolean snare = true;

	void playsnare() {
		System.out.println("bang bang ba-bang");
	}

	void playTopHat() {
		System.out.println("ding ding da-ding");
	}
}

public class DrumKitTestDrive {

	public static void main(String[] args) {
		Drumkit d = new Drumkit();
		d.playsnare();
		d.playTopHat();
		d.snare = false;
		if (d.snare == true) {
			d.playsnare();
		}

	}

}
