package com.techlabs.isp.violation.test;

import com.techlabs.isp.violation.IWorker;
import com.techlabs.isp.violation.Manager;
import com.techlabs.isp.violation.Robot;

public class TestWorker {

	public static void main(String[] args) {
		atTheWorkStation(new Robot());
		atTheWorkStation(new Manager());
		atTheCafeteria(new Manager());
		atTheCafeteria(new Robot());
		
	}
	
	public static void atTheWorkStation(IWorker w) {
		System.out.println("At workstation");
		w.startWork();
		w.stopWork();
	}

	public static void atTheCafeteria(IWorker w) {
		System.out.println("At cafeteria");
		w.startEat();
		w.stopEat();
	}
}
