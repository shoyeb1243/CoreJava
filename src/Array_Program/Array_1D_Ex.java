package Array_Program;

public class Array_1D_Ex {

	public static void main(String[] args) {
	int a[]= {1,2,4,5};
	int s=a.length+1;
	int b=(s*(s+1)/2);
	int sum=0;
	for(int i=0;i<a.length;i++) {
		sum =sum+ a[i];
	}
		int missing=(b-sum);
		System.out.println(missing);

	}

}
