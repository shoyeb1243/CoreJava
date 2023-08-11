package com.hw;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import javax.security.auth.login.LoginContext;
class Emp1{
	private String name;
	private String password;
		
	}
public class Emp{
public static void main(String[] args) throws IOException {
	}
 void login() throws IOException {
Scanner scanner=new Scanner(System.in);
	System.out.println("Enter UserName");
	String name=scanner.nextLine();
		System.out.println("Enter PassWord");
		String password=scanner.nextLine();
		if(name.equals(password)) {
			System.out.println("Successfull");
		}
		else {
			String concat=name+password;
			System.out.println("Failed \n"+concat);
		}
		scanner.close();
	}
}