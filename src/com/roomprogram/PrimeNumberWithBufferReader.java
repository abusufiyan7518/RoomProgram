package com.roomprogram;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class PrimeNumberWithBufferReader {

	public static void main(String[] args) throws IOException, NumberFormatException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter your name");
		 int value=Integer.parseInt(br.readLine());
		//int value = br.read();
		System.out.println("Welcome " + value);

		for (int num = 2; value < 100; num++) {
			boolean isPrime = true;
			for (int i = 2; i < value; i++) {
				if (value % i == 0) {
					isPrime = false;
					break;
				}
			}
			if (isPrime) {
				System.out.println(num + "");
			}
		}

	}
}
