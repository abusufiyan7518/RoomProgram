package com.roomprogram;

class Array {
	void doSomething() {
		System.out.println("Parent!");
		int[] arr = { 1, 2, 3 };
		System.out.println("Value at index 5: " + arr[5]);
	}
}

class ArrayNew extends Array {
	void doSomething() {
		System.out.println("Child!");
		try {
			super.doSomething();
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Caught Exception: " + e);
		}
	}
}

public class ExceptionHandlingExmpl5 {

	public static void main(String[] args) {

		Array objParent = new ArrayNew();
		objParent.doSomething();
	}

}
