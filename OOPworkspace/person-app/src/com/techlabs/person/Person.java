package com.techlabs.person;

public class Person {
	private final String name;
	private int age;
	private GenderType gender;
	private float height, weight;

	public Person(String name, int age, GenderType gender, float height, float weight) {
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.height = height;
		this.weight = weight;
	}

	public Person(String name, int age, GenderType gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.height = 5.5f;
		this.weight = 50f;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public GenderType getGender() {
		return gender;
	}

	public float getHeight() {
		return height;
	}

	public float getWeight() {
		return weight;
	}

	public void doWorkout() {
		this.weight = this.weight * 0.98f;
	}

	public void eat() {
		this.weight = this.weight * 1.05f;
		this.height = this.height * 1.01f;
	}
	public float calculateBMI() {
		return (this.weight/(this.height*this.height)); 
	}
	public String classifyBMI() {
		float bmi = calculateBMI();
		if(bmi < 18.5f)
			return "Underweight";
		if(bmi>=18.5f && bmi<=24.9f)
			return "Normal weight";
		if(bmi>=25f && bmi<=29.9f)
			return "Overweight";
		return "Obese";
	}

}
