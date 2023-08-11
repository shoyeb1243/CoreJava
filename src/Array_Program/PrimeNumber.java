package Array_Program;

public class PrimeNumber {

	public static void main(String[] args) {
	int tamp=0;
	for(int i=1;i<=100;i++) {
		for(int j=2;j<=i-1;j++) {
			if(i%j==0) {
				tamp=tamp+1;
			}
		}
		if(tamp==0) {
			System.out.println(i);
		}
		else {
			tamp=0;
		}
	}

	}

}
