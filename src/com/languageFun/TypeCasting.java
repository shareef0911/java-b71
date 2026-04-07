package com.languageFun;


public class TypeCasting {
	
	double d1 = 9087654321.546876543;
	
	int i1 = (int) d1;
	float f1 = (float) d1;
	long l1 = (long) d1;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TypeCasting t1 = new TypeCasting();
		System.out.println("Double no : "+t1.d1);
		System.out.println("Int No : "+t1.i1);
		System.out.println("Float No : "+t1.f1);
		System.out.println("Long No : "+t1.l1);
	}

}
