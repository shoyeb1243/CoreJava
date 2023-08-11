package com.hw;

public class NumberSawping {

	public static void main(String[] args) {
		int age=20;
		int weight=50;
		System.out.println("Age : "+age+"\nWight : "+weight);
		System.out.println("..................................");
		age=age+weight;
		 weight = age-weight;
age=age-weight;
System.out.println("age : "+age+"\nWeight : "+weight);
	}

}
