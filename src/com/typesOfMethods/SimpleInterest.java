package com.typesOfMethods;

import java.util.Scanner;

public class SimpleInterest {
	
	void calculate(double p,double r,double t) {
		double si = (p*r*t)/100;
		double total = si + p;
		System.out.println("Principle Amount : "+p);
		System.out.println("Interest For 100 : "+r);
		System.out.println("Time in Months : "+t);
		System.out.println("Interest Amount : "+si);
		System.out.println("Total Amount : "+total);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Principle Amount : ");
		double p = sc.nextDouble();
		System.out.println("Enter Interest in percentage : ");
		double r = sc.nextDouble();
		System.out.println("Enter Time in Months");
		double t = sc.nextDouble();
		
		SimpleInterest s = new SimpleInterest();
		
		s.calculate(p, r, t);
		sc.close();
		

	}

}
