package com.languageFun.constructors;

public class SavingsAccount extends Account{
	double balance;
	
	

	SavingsAccount(long accountNumber,double balance){
		super(accountNumber);
		this.balance = balance;
		System.out.println("Balance : "+balance);
		
		
	}
	public static void main(String[] args) {
		SavingsAccount sa = new SavingsAccount(198210100139770l,700000.00);
	}

}
