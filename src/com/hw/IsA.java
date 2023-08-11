package com.hw;
abstract class Human{
	abstract String heart();
	abstract String brain();
	abstract String kidney();
}
class Human1 extends Human{
	String heart() {
		return "Dil";
	}
	String brain() {
		return "Dimag";
	}
	String kidney() {
		return "Gurda";
	}
}
public class IsA {

	public static void main(String[] args) {
		Human1 human1=new Human1();
		String human= human1.heart();
	String human2=human1.brain();
	String human3=human1.kidney();
		System.out.println("Heart->"+human+"\nBrain->"+human2+"\nKidney->"+human3);
	}

}
