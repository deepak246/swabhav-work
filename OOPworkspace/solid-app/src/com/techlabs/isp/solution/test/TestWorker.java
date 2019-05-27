package com.techlabs.isp.solution.test;

import com.techlabs.isp.solution.IEatable;
import com.techlabs.isp.solution.IWorkable;
import com.techlabs.isp.solution.Manager;
import com.techlabs.isp.solution.Robot;

public class TestWorker {

	public static void main(String[] args) {
		atTheWorkStation(new Robot());
		atTheWorkStation(new Manager());
		atTheCafeteria(new Manager());
		
	}
	
	public static void atTheWorkStation(IWorkable w) {
		System.out.println("At workstation");
		w.startWork();
		w.stopWork();
	}

	public static void atTheCafeteria(IEatable e) {
		System.out.println("At cafeteria");
		e.startEat();
		e.stopEat();
	}
}
