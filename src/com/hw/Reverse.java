package com.hw;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter No:");
		int number= scanner.nextInt();
		int rev=0;
		while (number!=0) {
			int value=number%10;
			rev =rev * 10+ value;
			number /=10;
		}
		System.out.println("Reverse No :"+rev);
	}

}
