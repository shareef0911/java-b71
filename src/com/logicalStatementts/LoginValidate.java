package com.logicalStatementts;

import java.util.Scanner;

public class LoginValidate {

	public static void main(String[] args) {

		Scanner sc =new Scanner(System.in);
		String userName = "baji";
		String password = "Baji123";
		
		System.out.println("Enter userName :");
		String readUser = sc.nextLine();
		System.out.println("Enter Password :");
		String readPassword = sc.nextLine();
		
		if (userName.equals(readUser) && password.equals(readPassword)) {
			System.out.println("Successfully Login !!");
		}
		else {
			System.out.println("Invalid Credintails !!");
	
		}
		sc.close();
	}

}
