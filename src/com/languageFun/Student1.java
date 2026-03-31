package com.languageFun;

public class Student1 {
	int s_id;
	String s_name;
	int marks;
	
	void method1() {
		s_id = 1;
		s_name = "Baji Shareef";
		marks = 55;
		method2();
	}
	
	void method2() {
		System.out.println("Student ID : "+ s_id);
		System.out.println("Student Mark : "+ s_name);
		System.out.println("Student Mark : "+ marks);
		System.out.println();
	}

	public static void main(String[] args) {
		Student1 s = new Student1();
		s.method1();
	}

}
