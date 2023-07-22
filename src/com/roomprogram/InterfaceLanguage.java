package com.roomprogram;

interface Language {
	String getName(String name);
}

class ProgrammingLanguage implements Language {
	public String getName(String name) {
		return "Java";
	}

}

public class InterfaceLanguage {

	public static void main(String[] args) {
		ProgrammingLanguage lan = new ProgrammingLanguage();
		System.out.println(lan.getName("a"));
	}
}
