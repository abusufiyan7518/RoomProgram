package com.roomprogram;

class Parent {
	String show() {
		int a=10,b=0,c=a/b;
		System.out.println("Parent!");
		return "Arithematic Exception:";
	}
}

class Child extends Parent {
	String show()  {
		int a=0,b=0,c=a/b;
		return "Child Arithematic Exception:\n"+super.show();
		
	}
}

public class ExceptionHandlingOverridingeExmpl3 {
	public static void main(String[] args) {
		Parent obj = new Child();
			System.out.println(obj.show());
		
	}
}

