package com.languageFun.constructors;
//to reduce the every time intiliazation
public class TestDemo2 {
	int cid;
	String name;
	int age;
	long phone;
	TestDemo2(int id,String na,int a,long ph){
		cid = id;
		name = na;
		age =a;
		phone = ph;
		
	}
	void show() {
		System.out.println("Player id : "+cid);
		System.out.println("Player Name : "+name);
		System.out.println("Player Age : "+age);
		System.out.println("Player Mobile NO : "+phone);
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("---------Main Method Started-----------");
		TestDemo2 t = new TestDemo2(1,"Baji",22,9876543210l);
		t.show();
		TestDemo2 t1 = new TestDemo2(2,"hemanth",22,8765432109l);
		t1.show();
		TestDemo2 t2 = new TestDemo2(3,"satya",23,7890654321l);
		t2.show();

		System.out.println("---------main method Ended-----------");

	}

}
