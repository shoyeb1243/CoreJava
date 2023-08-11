package Array_Program;

import java.util.Arrays;

public class Array_1D_Ex1 {

	public static void main(String[] args) {
	int a[]= {1,2,3,4,5,7,6,9,8};
	Arrays.sort(a);
	for(int i=a.length-1;i>=0;--i) {
		System.out.println(a[i]);
	}

	}

}
