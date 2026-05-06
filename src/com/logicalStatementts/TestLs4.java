package com.logicalStatementts;

import java.util.Scanner;

public class TestLs4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String yn = "";
		do {
			System.out.println("Enter Number between (1-7) :");
			byte num = sc.nextByte();
			switch(num) {
			case 1 -> System.out.println("Monday !!");
			case 2 -> System.out.println("Thuesday !!");
			case 3 -> System.out.println("Wensday !!");
			case 4 -> System.out.println("thursday !!");
			case 5 -> System.out.println("friday !!");
			case 6 -> System.out.println("Saturday !!");
			case 7 -> System.out.println("Sunday !!");
			default -> System.out.println("Invalid Number Entered !!");
			}
			System.out.println("Do want to Continue  y for yes / n for no .. ?");
			yn = sc.next();
		}while(yn.equalsIgnoreCase("y"));
		sc.close();

	}

}
