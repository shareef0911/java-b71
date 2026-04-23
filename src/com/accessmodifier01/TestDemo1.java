package com.accessmodifier01;

public class TestDemo1 {
	//declare private variable and method
	private String name;
	private int age;
	private static int num =1234;
	private void method1() {
		System.out.println("This is Private Method!");
		System.out.println("Name : "+name);
		System.out.println("Age : "+age);
		System.out.println("Num : "+num);
	}
	String name1;
	int age1;
	static int num1 =1234;
	void method2() {
		System.out.println("This is Default Method!");
		System.out.println("Name1 : "+name1);
		System.out.println("Age1 : "+age1);
		System.out.println("Num : "+num1);
	}
	
	protected String name2;
	protected int age2;
	protected static int num2 =1234;
	protected void method3() {
		System.out.println("This is Protected Method!");
		System.out.println("Name2 : "+name2);
		System.out.println("Age2 : "+age2);
		System.out.println("Num : "+num2);
	}
	
	
	public String name3;
	public int age3;
	public static int num3 =1234;
	public void method4() {
		System.out.println("This is public Method!");
		System.out.println("Name3 : "+name3);
		System.out.println("Age3 : "+age3);
		System.out.println("Num : "+num3);
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//acess private varaibles and method in witthin class
		TestDemo1 t = new TestDemo1();
		t.name = "Baji";
		t.age = 22;
		t.method1();
		//acess default varaibles and method in witthin class
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

	}

}
