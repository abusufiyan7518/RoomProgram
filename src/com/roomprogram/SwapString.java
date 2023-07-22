package com.roomprogram;

public class SwapString {

	public static void main(String[] args) {
		String str1 = "Error404";
		String str2 = "Xoyp_404";
		System.out.println("Before Swapping.......\n"+"str1:" + str1+"\nstr2:" + str2);
		
		StringBuilder sBuilder = new StringBuilder(str1);
		sBuilder.append(str2);
		StringBuilder sBuilder2 = new StringBuilder(str2);
		sBuilder2.append(str1);

		str1 = sBuilder.substring(str2.length());
		str2 = sBuilder2.substring(str1.length());
		System.out.println("After Swapping........\n"+"str1=" + str1+"\nstr2=" + str2);
	}
}
