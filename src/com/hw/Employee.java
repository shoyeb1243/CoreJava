package com.hw;

final class Employee1 {
	private final String pancardno;

	Employee1(String pancardno) {
		this.pancardno = pancardno;
	}

	public String getPancardno() {
		return pancardno;
	}

}

public class Employee {
	public static void main(String[] args) {
		Employee1 employee1 = new Employee1("OJSPS5627G");
		String string = employee1.getPancardno();
		System.out.println("Pancard No : " + string);
	}

}
