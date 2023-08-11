package Condiction_Program;

public class Fabno {

	public static void main(String[] args) {
		int a=1;
		int b=0;
		for(int i=0;i<=5;i++) {
			int c=a+b;
			b=a;
			a=c;
			System.out.println(c);
		}
	}

}
