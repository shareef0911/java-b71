package com.languageFun;

public class Student {

	int stId;
	String stName;
	int stMarks;
	String stSubject = "Suplly Chain";
	


	void display() {
		System.out.println("Student Id : "+stId);
		System.out.println("Student Name : "+stName);
		System.out.println("Student Mark : "+stMarks);
		System.out.println("Student Subject : "+stSubject);
		System.out.println();
	}

	
	public static void main(String[] args) {
		Student s1 = new Student();
		s1.stId=1;
		s1.stName = "Baji";
		s1.stMarks = 45;
		s1.display();
		
		Student s2 = new Student();
		s2.stId=2;
		s2.stName = "Baji Shareef";
		s2.stMarks = 55;
		s2.display();
		
		Student s3 = new Student();
		s3.stId=3;
		s3.stName = "Hemanth";
		s3.stMarks = 45;
		s3.display();
		
		Student s4 = new Student();
		s4.stId=4;
		s4.stName = "Satya";
		s4.stMarks = 55;
		s4.display();
		
		Student s5 = new Student();
		s5.stId=5;
		s5.stName = "Ravi";
		s5.stMarks = 65;
		s5.display();
		

	}

}
