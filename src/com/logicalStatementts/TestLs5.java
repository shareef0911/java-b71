package com.logicalStatementts;

import java.util.Scanner;

public class TestLs5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String yn = "";
		do {
			System.out.println("Enter Number :");
			int num = sc.nextInt();
			
			if(num%3 == 0 && num%5 == 0) {
				System.out.println("FizzBuss");
			}
			else if(num%3 == 0){
				System.out.println("Fizz");
			}
			else if(num%5 == 0) {
				System.out.println("Buzz");
			}
			else {
				System.out.println("Enter Number is : "+num);
			}
			System.out.println("Do want to Continue  y for yes / n for no .. ?");
			yn = sc.next();
		}while(yn.equalsIgnoreCase("y"));

		sc.close();
	}

}
