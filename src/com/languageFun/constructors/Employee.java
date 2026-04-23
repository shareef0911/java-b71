package com.languageFun.constructors;

public class Employee {
	
	int sid;
	String name;
	String college;
	long phone;
	
	Employee(){
		this(101);
		System.out.println("NO-ARG Constructor");
	}
	Employee(int sid){
		this (sid,"Unkown");
		System.out.println("1 arg Constructor");
	}
	Employee(int sid, String name){
		this(sid,name,"VVIT");
		System.out.println("2 arg Constructor");
	}
	Employee(int sid, String name,String college){
		this(sid,name,college,9999999999l);
		System.out.println("3 arg Constructor");
	}
	Employee(int sid,String name,String college,long phone){
		this.sid = sid;
		this.name = name;
		this.college = college;
		this.phone = phone;
		System.out.println("Full Constructor");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e = new  Employee();
		e.display();
		Employee e1 = new  Employee(102,"Baji");
		e1.display();
		Employee e2 = new  Employee(103,"Hemanth","SRKIT");
		e2.display();
		Employee e3 = new  Employee(103,"Hemanth","Vcube",9876543210l);
		e3.display();

	}
	void display() {
		System.out.println("Student ID : "+sid);
		System.out.println("Student Name : "+name);
		System.out.println("College Name : "+college);
		System.out.println("Student Phone Number : "+phone);
		System.out.println("-------------------------------------------");
	}

}
