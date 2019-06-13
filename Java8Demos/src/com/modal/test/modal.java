package com.modal.test;

public class modal {
	private String name; //person name
	private float salary;//person salary
	private int number;//filter demo

	public modal(String name, float salary, int number) {
		super();
		this.name = name;
		this.salary = salary;
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	@Override
	public String toString() {
		return "modal [name=" + name + ", salary=" + salary + ", number=" + number + "]";
	}

}
