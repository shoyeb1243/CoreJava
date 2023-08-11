package Condiction_Program;
class Box{
	void dog() {
		System.out.println("tufail");
	}
}
class Cat extends Box{
	void disp() {
		System.out.println("ayaz");
	}
}
class Rat extends Cat{
	void main() {
		System.out.println("shoyeb");
	}
}
class Lion  extends Rat{
	void m1() {
		System.out.println("ashif");
	}
}
public class Multilevel {
	public static void main(String[] args) {
		
	
	Lion s=new Lion();
	s.m1();
	s.main();
	s.disp();
	
	
	}
}
