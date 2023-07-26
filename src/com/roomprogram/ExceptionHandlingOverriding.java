package com.roomprogram;

class Superclass {
	String doSomething() throws InterruptedException {
		System.out.println("SuperClass..");
		throw new InterruptedException("Interrupted!");
	}
}

class Subclass extends Superclass {
	String doSomething() throws InterruptedException {
		System.out.println("Subclass..");
		throw new InterruptedException("Subclass Interrupted!");
	}
}

public class ExceptionHandlingOverriding {
	public static void main(String[] args) throws InterruptedException {
		Superclass obj = new Subclass();
		try {
			obj.doSomething();

		} catch (InterruptedException e) {
			System.out.println("Caught Exception: " + e);
		}
	}
}
