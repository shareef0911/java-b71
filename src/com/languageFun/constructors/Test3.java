package com.languageFun.constructors;
//the no-arg constructor is used for the developer to give default values instead of jvm
//if anyother constructor present in the class like only parameterized constructor we doesnot create without parameters 
public class Test3 {
	
	Test3(){
		System.out.println("NO-ARG Constructor called!");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test3 t = new Test3();
	}

}
