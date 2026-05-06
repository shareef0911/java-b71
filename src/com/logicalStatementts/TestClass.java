package com.logicalStatementts;

import java.util.Scanner;

public class TestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Age : ");
		byte age = sc.nextByte();
		
		if(age < 5) {
			System.out.println("You are kid !!");
		}
		else if(age < 12) {
			System.out.println("You are Kid !!");
		}
		else if(age <20) {
			System.out.println("You are teen !!");
		}
		else if(age <35) {
			System.out.println("You are Young !!");
		}
		else if (age < 60) {
			System.out.println("You are middle Aged !!");
		}
		else if(age < 128 && age > 60) {
			System.out.println("You are Old");
		}
//		else {
//			System.out.println("In");
//		}
		sc.close();

	}

}
