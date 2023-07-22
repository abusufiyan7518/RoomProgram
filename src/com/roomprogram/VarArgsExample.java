package com.roomprogram;

public class VarArgsExample {

	int multiply(int a, int b) {
		return a * b;
	}

	int multiply(int a, int b, int c) {
		return a * b * c;
	}

	int multiply(int... ar) {
		return 45;
	}

	public static void main(String[] args) {
		VarArgsExample vargs = new VarArgsExample();
		System.out.println(vargs.multiply(1));
		System.out.println(vargs.multiply());
		System.out.println(vargs.multiply(1, 4));
		System.out.println(vargs.multiply(2, 2, 2));
		System.out.println(vargs.multiply(1, 4, 5, 2));

	}

}
