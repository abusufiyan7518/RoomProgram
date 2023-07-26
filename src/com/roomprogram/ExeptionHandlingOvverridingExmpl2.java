package com.roomprogram;
//without Throws exception
class Shape {
	String calculateArea() {
		return "Calculating area ofn a shape!";
	}
}

class Circle extends Shape {
	double radius;

	Circle(double radius) {
		this.radius = radius;
	}

	String calculateArea() {
		System.out.println("Calculating area of Circle.");
		double area = radius * radius;
		return "Area of circle: " + area;
	}
}

class Rectangle extends Shape {
	double length;
	double width;

	Rectangle(double length, double width) {
		this.length = length;
		this.width = width;
	}

	String calculateArea() {
		System.out.println("Calculating Area of Rectangle.");
		double area = length * width;
		return "Area of the Rectangle: " + area;
	}
}

public class ExeptionHandlingOvverridingExmpl2 {

	public static void main(String[] args) {
		Shape shape = new Circle(5.0);
		Shape shapeNew = new Rectangle(4.0, 6.0);
		System.out.println(shape.calculateArea());
		System.out.println(shapeNew.calculateArea());
	}
}
