package com.languageFun.constructors;

public class Car1 extends Vehicle{
	double price;
	Car1(){
		
	}
	Car1(String brand,double price){
		super(brand);
		this.price = price;
		System.out.println("Car price : "+price);
	}

}
