package com.languageFun;

public class Student1 {
	int s_id;
	String s_name;
	int marks;
	
	static void method1() {
		Student1 s1 = new Student1();
		s1.s_id = 1;
		s1.s_name = "Baji Shareef";
		s1.marks = 55;
		s1.method2();
		
		Student1 s2 = new Student1();
		s2.s_id = 2;
		s2.s_name = "Hemanth";
		s2.marks = 75;
		s2.method2();
		
		Student1 s3 = new Student1();
		s3.s_id = 3;
		s3.s_name = "Shareef";
		s3.marks = 65;
		s3.method2();
	}
	
	void method2() {
		System.out.println("Student ID : "+ s_id);
		System.out.println("Student Mark : "+ s_name);
		System.out.println("Student Mark : "+ marks);
		System.out.println();
	}

	public static void main(String[] args) {
		method1();
	}

}
