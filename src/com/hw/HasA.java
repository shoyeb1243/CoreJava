package com.hw;
interface Student{
	String name();
	int rollno();
}
class Student1 implements Student{
	public String name() {
		return "SilentBoy";
	}
	public int rollno() {
	return 105;
	}
}
public class HasA {
	public static void main(String[] args) {
	Student1 student1=new Student1();
	String student= student1.name();
	int student2= student1.rollno();
	System.out.println("Name->"+student+"\nRollNo->"+student2);
	}
}