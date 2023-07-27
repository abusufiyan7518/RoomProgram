package com.roomprogram;

class Cycle {
	String startEngine() {
		return "Engine Start... ";
		
	}
}

class Bicycle extends Cycle {
	String startEngine()  {
		return "Starting car engine..\n"+super.startEngine();
	}
}

public class ExceptionHandlingExmpl7 {
	public static void main(String[] args) {
		Cycle car = new Bicycle();

			System.out.println(car.startEngine());
		
	}
}
