package com.logicalStatementts;

import java.util.Scanner;

public class TestLs3 {
	
;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Char : ");
		char ch = sc.next().charAt(0);


		if (ch >= 'a' && ch <='z' || ch >= 'A' && ch <= 'Z') {
			System.out.println("Alphabet");
		}
		else if (ch <= '9' && ch >= '0') {
			System.out.println("Number");
		}
		else {
			System.out.println("Special Character");
		}
		sc.close();
	}
	

}
