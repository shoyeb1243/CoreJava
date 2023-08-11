package com.hw;

import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] args) {
int args1=0;
Scanner scanner=new Scanner(System.in);
System.out.println("Enter No");
int i=scanner.nextInt();
 for(i=0;i<=100;i++) {
	 for(int j=2;j<=i-1;j++) {
		 if(i%j==0) {
			 args1=args1+1;
		 }
	 }
	 if(args1==0) {
		 System.out.println(i);
	 }
	 else {
		 args1=0;
	 }
 }
	}

}
