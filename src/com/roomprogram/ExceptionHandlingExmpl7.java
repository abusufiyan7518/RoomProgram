package com.roomprogram;

class Cycle {
	String startEngine() throws Exception {
		System.out.println("Engine Start... ");
		throw new Exception("Engine failed to start !");

	}
}

class Bicycle extends Cycle {
	String startEngine() throws Exception {
		System.out.println("Starting car engine..");
		return super.startEngine();
	}
}

public class ExceptionHandlingExmpl7 {
	public static void main(String[] args) {
		Cycle car = new Bicycle();
		try {
			car.startEngine();
		} catch (Exception e) {
			System.out.println("Caught Exception: " + e.getMessage());
		}
	}
}
