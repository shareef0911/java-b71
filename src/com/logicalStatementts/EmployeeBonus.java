package com.logicalStatementts;

import java.util.Scanner;

public class EmployeeBonus {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Name : ");
		String name = sc.next();

		System.out.println("Mr." + name);

		System.out.println("Enter Your Expericence : ");
		byte expericence = sc.nextByte();

		if (expericence > 1) {
			System.out.println("Your Experince : " + expericence);

			System.out.println("Enter Your Attedence in Percentage");
			double percen = sc.nextDouble();
			System.out.println("Enter Performance in (1-5)");
			byte rate = sc.nextByte();
			if (percen >= 95 && rate == 5) {
				System.out.println("High Attedence and excellent performance bonus awarded !!");
			}
			else if (percen >= 95 && rate > 2 && rate < 5) {
				System.out.println("High Attedence and Medium performance bonus awarded !!");
			}
			else if (percen >= 85 && percen <= 94 && rate == 5 ) {
				System.out.println("Medium Attedence High Performance  bonus awarded !!");
			} 
			else if (percen >= 85 && percen <= 94 && rate > 2 && rate < 5 ) {
				System.out.println(" Medium Attedence Medium Performance  bonus awarded !!");
			} else if (percen >= 75 && percen <= 84) {
				System.out.println("Basic bonus awarded !!");
			}
			else {
				System.out.println("Your Attedence to low ,No Bonus maybe reduce bonus ");
			}
		} else {
			System.out.println("Basic Bonus Approved !!");
		}
		sc.close();
	}

}
