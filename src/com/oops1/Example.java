package com.oops1;

import java.util.Scanner;

public class Example {
	int number;

	public static void main(String[] args) {
//		System.out.println("Main method");
		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter Number :");
//		int number  = sc.nextInt();
		System.out.println("Enter a Number :");
		int a = sc.nextInt();
		System.out.println("Enter b Number :");
		int b = sc.nextInt();
		System.out.println("Enter c Number :");
		int c = sc.nextInt();
		sc.close();
		int number = 0;
		if (a > b) {
			if (a > c) {
				System.out.println("Larger Number is :" + a);
				number = a;
			} else {
				System.out.println("Larger number is :" + c);
				number = c;
			}
		} else {
			if (b > c) {
				System.out.println("Larger number is : " + b);
				number = b;
			} else {
				System.out.println("Larger number is : " + c);
				number = c;
			}

		}

		if (number % 2 == 0) {
			System.out.println("The given Number isEven");
		} else {
			System.out.println("The given Number is Odd");
		}
//		else 
//			System.out.println("Hii1");
//		
//		System.out.println("Main method");

	}

}
