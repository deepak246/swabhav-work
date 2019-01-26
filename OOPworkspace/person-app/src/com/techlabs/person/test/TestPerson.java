package com.techlabs.person.test;

import com.techlabs.person.*;

public class TestPerson {

	public static void main(String[] args) {
		Person p1 = new Person("Deepak", 20, GenderType.MALE, 180f, 70f);
		Person p2 = new Person("Alia", 25, GenderType.FEMALE);

		printDetails(p1);
		printDetails(p2);
		p1.doWorkout();
		
		printDetails(p1);
	}

	public static void printDetails(Person p) {
		System.out.println("Name=" + p.getName() + " Age=" + p.getAge() + " Gender=" + p.getGender() + " Height="
				+ p.getHeight() + " Weight=" + p.getWeight()+" Category="+p.classifyBMI());;
	}

}
