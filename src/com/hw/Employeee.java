package com.hw;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import ControlStatement.ifStatement;

class Employee9 {
	private int id;
	private String name;
	private String mail;
	private double salary;
	private String deportment;

	public Employee9(int id, String name, String mail, double salary, String deportment) {
		super();
		this.id = id;
		this.name = name;
		this.mail = mail;
		this.salary = salary;
		this.deportment = deportment;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getDeportment() {
		return deportment;
	}

	public void setDeportment(String deportment) {
		this.deportment = deportment;
	}

	public static void main(String[] args) {

	}

	public void setSalary1(double salary) {
		this.salary = salary;

	}

	@Override
	public String toString() {
		return "Employee9 [id=" + id + ", name=" + name + ", mail=" + mail + ", salary=" + salary + ", deportment="
				+ deportment + "]";
	}

}

public class Employeee {
	public static void main(String[] args) {
		List<Employee9> employee9s = Arrays.asList(new Employee9(101, "SilentBoy", "silent1243@gmail.com", 100d, "IT"),
				new Employee9(102, "Shoyeb", "soyeb1243@gmail.com", 200d, "IT"),
				new Employee9(103, "Ayaz", "ayaz1243@gmail.com", 300d, "Medical"),
				new Employee9(104, "Ansarul", "ansarul1243@gmail.com", 400d, "Medical"),
				new Employee9(105, "Abu", "abu1243@gmail.com", 100d, "BCA"),
				new Employee9(106, "Tufail", "tufail1243@gmail.com", 200d, "BCA"),
				new Employee9(107, "AbuZar", "abuzar1243@gmail.com", 400d, "MCA"),
				new Employee9(108, "Sufiyan", "sufiyan1243@gmail.com", 500d, "MCA"),
				new Employee9(109, "Rahul", "rahul1243@gmail.com", 100d, "BA"),
				new Employee9(110, "Amit", "amit1243@gmail.com", 200d, "BA"));
		System.out.println("old data");
		employee9s.forEach(System.out::println);
		System.out.println("new data");

		employee9s.stream().map(e -> {
			if (e.getDeportment().equals("IT")) {
				e.setSalary(e.getSalary() + (e.getSalary() * 0.1));
			}
			if(e.getDeportment().equals("Medical")) {
				e.setSalary(e.getSalary()+(e.getSalary()* 0.7));
			}
			if(e.getDeportment().equals("BCA")) {
				e.setSalary(e.getSalary()+(e.getSalary()* 0.5));	
			}
			if(e.getDeportment().equals("MCA")) {
				e.setSalary(e.getSalary()+(e.getSalary()* 0.3));
			}
			if(e.getDeportment().equals("BA")) {
				e.setSalary(e.getSalary()+(e.getSalary()* 0.2));
			}
			return e;

		}).collect(Collectors.toList()).forEach(e -> System.out.println(e));
	}
	}