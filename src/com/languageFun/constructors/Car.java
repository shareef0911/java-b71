package com.languageFun.constructors;

public class Car {
	String brand;
	int price;
	Car(){
		brand = "LG";
		price = 15000;
	}
	void display() {
		System.out.println("Brand Name : "+brand);
		System.out.println("Price : "+price);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c = new Car();
		c.display();
		

	}

}
