package com.languageFun.constructors;

public class Account {

	long accountNumber;
	
	Account(){
		
	}
	
	Account(long accountNumber){
		this.accountNumber =accountNumber;
		System.out.println("Account Number : "+accountNumber);
	}

}
