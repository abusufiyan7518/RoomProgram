package com.roomprogram;

class Superclass {
	String doSomething() {
		return "SuperClass..Interrupted!";
	}
}

class Subclass extends Superclass {
	String doSomething() {
		return "Subclass Interrupted!\n"+super.doSomething();
	}
}

public class ExceptionHandlingOverriding {
	public static void main(String[] args) {
		Superclass obj = new Subclass();

		System.out.println(obj.doSomething());

	}
}
