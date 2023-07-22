package com.roomprogram;

public class SwapWithoutThirdVariable {

	public static void main(String[] args) {
		int swap1 = 10;
		int swap2 = 20;
		System.out.println("Before Swapping......\n"+"swap1 = " + swap1+"\nswap2 = " + swap2);
		
		swap1 = swap1 + swap2;
		swap2 = swap1 - swap2;
		swap1 = swap1 - swap2;
		System.out.println("After Swappping.....\n"+"swap1 = " + swap1+"\nswap2 = " + swap2);
	}
}
