package Condiction_Program;
class Boy{
	void main() {
		System.out.println("hyeee");
	}
}
class A1 extends Boy{
	void disp() {
		System.out.println("byeee");
	}
}
class B1 extends Boy{
	void display() {
		System.out.println("hello");
	}
}
class C1 extends Boy{
	void show() {
		System.out.println("i m shoyeb");
	}
}
public class Hiracical {
	public static void main(String[] args) {
		C1 s =new C1();
		A1 r=new A1();
		r.disp();
		r.main();
		s.show();
		
		
	}

}
