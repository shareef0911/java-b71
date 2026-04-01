package com.languageFun;

public class Bank {
	static int acc_no = 0;
	String name;
	long balance;
	
	{
		acc_no = acc_no + 1;
		
		
	}
	
	void display() {
		System.out.println("Account No : " + acc_no);
		System.out.println("Account Holder : "+ name);
		System.out.println("Balance : "+ balance);
		System.out.println();
	}

	public static void main(String[] args) {
		Bank b1 = new Bank();
		b1.name = "Baji";
		b1.balance = 50000;
		b1.display();
		
		Bank b2 = new Bank();
		b2.name = "Hemanth";
		b2.balance = 60000;
		b2.display();


	}

}
