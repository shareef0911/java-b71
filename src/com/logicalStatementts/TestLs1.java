package com.logicalStatementts;

import java.util.Scanner;

public class TestLs1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Number : ");
		double number1 = sc.nextDouble();
		System.out.println("Enter Second  Number : ");
		double number2 = sc.nextDouble();
		System.out.println("Enter Third Number : ");
		double number3 = sc.nextDouble();
		if (number1 == number2  && number2== number3) {
			System.out.println("The Numbers Are Equal !!");
		}
		else if (number1 > number2 && number1 > number3) {
			System.out.println("The Largest Number : "+number1);
		}
		else if (number2 > number1 && number2 > number3) {
			System.out.println("The Largest Number : "+number2);
		}else {
			System.out.println("The Largest Number : "+number3);
		}
		sc.close();
	}

}
