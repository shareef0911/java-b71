package com.languageFun.constructors;
//this is not good approach 
// the data is not store in object 
// then what is the purpose of class
public class TestDemo1 {
	int cid;
	String name;
	int age;
	long phone;
//	TestDemo1(){
//		System.out.println("Indian Player : ");
//	}
	TestDemo1(int id,String na,int a,long ph){
		System.out.println("-----Parameterized Constructor Called!------");
		System.out.println("Player id : "+id);
		System.out.println("Player Name : "+na);
		System.out.println("Player Age : "+a);
		System.out.println("Player Mobile NO : "+ph);
		System.out.println("-----Parameterized constructor is closed!-----");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("---------Main Method Started-----------");
		TestDemo1 t = new TestDemo1(1,"Baji",22,9876543210l);
		TestDemo1 t1 = new TestDemo1(2,"hemanth",22,8765432109l);
		TestDemo1 t2 = new TestDemo1(3,"satya",23,7890654321l);

		System.out.println("---------main method Ended-----------");
	}

}
