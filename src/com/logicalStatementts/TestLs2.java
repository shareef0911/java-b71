package com.logicalStatementts;

import java.util.Scanner;

public class TestLs2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Number : ");
		double number1 = sc.nextDouble();
		System.out.println("Enter Secound Number : ");
		double number2 = sc.nextDouble();
		System.out.println("Enter Arthematic Operation : ");
		String  operator = sc.next();
		String add = "+";
		String sub = "-";
		String mul ="*";
		String div = "/";
		
		if (operator.equals(add)) {
			double sum = number1 + number2;
			System.out.println("Sum of Two Number :"+sum);
		}
		else if (operator.equals(sub)) {
			double sub1 = number1 - number2;
			System.out.println("Subtraction of Two Number : "+sub1);
		}
		else if (operator.equals(mul)) {
			double mul1 = number1 * number2;
			System.out.println("Product of Two Number : "+mul1);
		}
		else if (operator.equals(div)) {
			double div1 = number1 / number2;
			System.out.println("Dvision of two Number : "+div1);
		}
		else {
			System.out.println("Invalid Operator");
		}
		sc.close();
		
	}

}
