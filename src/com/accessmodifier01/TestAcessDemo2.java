package com.accessmodifier01;

public class TestAcessDemo2 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		acessing default varaibles and methods in within package
		TestDemo1 t1 = new TestDemo1();
		t1.name1 = "Baji";
		t1.age1 = 22;
		t1.method2();
		TestDemo1 t2 = new TestDemo1();
		t2.name2 = "Baji";
		t2.age2 = 22;
		t2.method3();
		
		TestDemo1 t3 = new TestDemo1();
		t3.name3 = "Baji";
		t3.age3 = 22;
		t3.method4();
		
		
		
//		this are private varaibles and method we can acess only in within class
//		t.method1();
//		System.out.println(t.name);
//		System.out.println(t.age);
	}

}
