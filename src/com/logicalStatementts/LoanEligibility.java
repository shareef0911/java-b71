package com.logicalStatementts;

import java.util.Scanner;

public class LoanEligibility {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Name : ");
		String name = sc.next();
		
		System.out.println("Welcome Mr."+name);
		
		System.out.println("Enter Your Age : ");
		byte age = sc.nextByte();
		
		if(age >= 21 && age <=55) {
			System.out.println("Enter your Salary :");
			double salary = sc.nextDouble();
			if(salary >= 500000) {
				System.out.println("Enter Your Credit Score :");
				int cibil = sc.nextInt();
				if(cibil >= 730) {
					System.out.println("Eligible For Loan !!");
				}else {
					System.out.println("Rejected due to poor credit history !!");
				}
			}
			else {
				System.out.println("Your Application is Rejected Due To Low Income!!");
			}
		}
		else {
			System.out.println("Your Application is Rejected Due To Age !!");
		}
		sc.close();
	}

}
