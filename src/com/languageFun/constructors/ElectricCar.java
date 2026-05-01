package com.languageFun.constructors;

public class ElectricCar extends Car1{
	String battery;
	ElectricCar(){
		
	}
	ElectricCar(String battery,String brand,double price){
		super(brand,price);
		this.battery=battery;
		System.out.println("Battery : "+battery);
		
	}

	public static void main(String[] args) {
		ElectricCar ec = new ElectricCar("LG","KIA",9000000);
	}

}
