package com.oops1;
//1) method signature must be same 
//note : method signature means method name + agruments Same except void
//2) method return type must be same
//Note : parent class method return type and child class method return type same
class TestDemo21{
	void method1() {
		System.out.println("TestDemo21 Method1()");
	}
	void method12() {
		System.out.println("TestDemo21 Method1()");
	}
}
//class TestDemo22{
//	
//}
public class TestDemo2 extends TestDemo21{
	void method1() {
		System.out.println("TestDemo2 Method1()");
	}
	void method12() {
		System.out.println("TestDemo21 Method1()");
	}

	public static void main(String[] args) {
		
	}

}
