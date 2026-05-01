package com.languageFun.constructors;

public class Metro {
	Metro(){
		System.out.println("Metro Constructor no-arg");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Metro Main method started");
		
		System.out.println("Metro Main method Ended");

	}

}

class Metro1 extends Metro{
	
	Metro1(){
		System.out.println("Metro1 Constructor no-arg");
	}
	public static void main(String[] args) {
		System.out.println("Metro1 Main method started");
		Metro m = new Metro1();
//		Metro1 m1 = new Metro1();
		System.out.println("Metro1 Main method Ended");
		
	}
	
}
