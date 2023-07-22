package com.roomprogram;

class Vehicle {
	String brand;

	Vehicle(String brand) {
		this.brand = brand;
	}

	void display() {
		System.out.println("Brand:" + brand);
	}
}

class Car extends Vehicle {
	String model;

	Car(String brand, String model) {
		super(brand);
		this.model = model;
	}

	void display() {
		super.display();
		System.out.println("Model:" + model);
	}
}

public class MainCar {

	public static void main(String[] args) {
		Car c = new Car("Huraccan", "Lamborghini");
		Car c1 = new Car("Zx10R", "Ninja");
		c.display();
		c1.display();
	}

}
