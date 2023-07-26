package com.roomprogram;

class Parent {
	String show() throws ArithmeticException {
		System.out.println("Parent!");
		throw new ArithmeticException("Arithematic Exception:");
	}
}

class Child extends Parent {
	String show() throws ArithmeticException {
		
		System.out.println("Child!");
		throw new ArithmeticException("Child Arithematic Exception:");
		
	}
}

public class ExceptionHandlingOverridingeExmpl3 {
	public static void main(String[] args) {
		Parent obj = new Child();
		try {
			obj.show();
		} catch (ArithmeticException e) {
			System.out.println("Caught Exception: " + e.getMessage());
		}
	}
}

