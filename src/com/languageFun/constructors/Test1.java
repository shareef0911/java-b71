package com.languageFun.constructors;

public class Test1 {
	
	//method is for reusability the code
	//if we declare any returning or void for methods
	void Test1() {
		System.out.println("Method called!");
	}
	//the constructor is for the creation of object
	Test1(){
		System.out.println("Constructor called!");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test1 t = new Test1();
		t.Test1();
	}

}
