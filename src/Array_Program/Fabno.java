package Array_Program;

public class Fabno {
	public static void main(String[] args) {
int a=1;int b=0;
for(int i=1;i<=10;i++) {
	int c=a+b;
	b=a;
	a=c;
	System.out.println(c);
}

	}

}
