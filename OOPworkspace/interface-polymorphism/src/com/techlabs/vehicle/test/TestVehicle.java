package com.techlabs.vehicle.test;

import com.techlabs.vehicle.Bike;
import com.techlabs.vehicle.Car;
import com.techlabs.vehicle.IMoveable;
import com.techlabs.vehicle.Truck;

public class TestVehicle {

	public static void main(String[] args) {
		IMoveable imArray[] = new IMoveable[3];
		imArray[0] = new Truck();
		imArray[1] = new Car();
		imArray[2] = new Bike();
		startRace(imArray);
	}

	public static void startRace(IMoveable[] vehicles) {
		System.out.println("Race is starting");
		for (IMoveable vehicle : vehicles) {
			vehicle.move();
		}
		System.out.println("Race has ended");

	}

}
